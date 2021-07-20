-- 1. Customer information with their invoice and payment information [CustomerId, CustName, RegionCode, InvoiceId, InvoiceTotal, PaidAmount, OutstandingAmount]
	select cm.CustomerId, cm.ShortName as CustName, cm.RegionCode, iv.InvoiceId, iv.InvoiceTotal, pt.PaidAmount, pt.OutstandingAmount 
		from (customermaster cm inner join invoice iv on cm.CustomerId=iv.CustomerId inner join payments pt on pt.InvoiceId=iv.InvoiceId);

-- 2. Customer information with their orders, with or without invoice and payment information 
-- [CustomerId, CustName, RegionCode, OrderId, OrderDate, InvoiceId, InvoiceTotal, PaidAmount, OutstandingAmount]
	select cm.CustomerId, cm.ShortName as CustName, cm.RegionCode, og.OrderId, og.OrderDate, iv.InvoiceId, iv.InvoiceTotal, pt.PaidAmount, pt.OutstandingAmount
		from (customermaster cm 
			  inner join orderreg og on cm.CustomerId=og.CustomerId 
			  left join invoice iv on iv.OrderId=og.OrderId
              left join payments pt on pt.InvoiceId=iv.InvoiceId);

-- 3. Orders with its item information [OrderId, OrderDate, ItemNo, ListPrice, MarketingFactor, Rate, Qty, Total]
	select og.OrderId, og.OrderDate, pm.ItemNo, pm.ListPrice, pm.MarketingFactor, oi.Rate, oi.Qty, oi.Total 
		from (orderreg og
			inner join orderitems oi on og.OrderId=oi.OrderId
			inner join productmaster pm on oi.ItemNo=pm.ItemNo
        );

-- 4. Total order value for each customer [CustomerId, CustName, OrderValue]
	select cm.CustomerId, cm.ShortName as CustName, ROUND(SUM(oi.Total), 2) as OrderValue
		from (customermaster cm
			inner join orderreg og on cm.CustomerId=og.CustomerId
            inner join orderitems oi on oi.OrderId=og.OrderId
        )
        group by cm.CustomerId, cm.ShortName;

-- 5. Total order value, invoice value, collections value for each customer [CustomerId, CustomerName, OrderValue, InvoiceValue, CollectionsValue]
	select cm.CustomerId, cm.ShortName as CustomerName, temp1.OrderValue, temp2.InvoiceValue, temp2.CollectionsValue  
		from (customermaster cm
			inner join
			(select og.CustomerId, ROUND(SUM(oi.Total), 2) as OrderValue from orderreg og inner join orderitems oi on og.OrderId=oi.OrderId group by og.CustomerId) temp1
            on cm.CustomerId=temp1.CustomerId
            inner join
            (select iv.CustomerId, ROUND(SUM(iv.GrandTotal), 2) as InvoiceValue, ROUND(SUM(pt.PaidAmount), 2) as CollectionsValue from invoice iv inner join
				payments pt on iv.InvoiceId=pt.InvoiceId group by iv.CustomerId
			) temp2 
            on cm.CustomerId=temp2.CustomerId
        );

-- 6. Monthly Sales Report for the year 2006. [MonthName, InvoiceValue]
	select MonthName(InvoiceDt) as MonthName, ROUND(SUM(InvoiceTotal), 2) as InvoiceValue from invoice where InvoiceDt like '2006%' 
		group by MonthName order by 
				(case MonthName 
					WHEN "January" THEN 1
                    WHEN "February" THEN 2
                    WHEN "March" Then 3
					WHEN "April" Then 4
                    WHEN "May" Then 5
                    WHEN "June" Then 6
                    WHEN "July" Then 7
                    WHEN "August" Then 8
                    WHEN "September" Then 9
                    WHEN "October" Then 10
                    WHEN "November" Then 11
                    WHEN "December" Then 12
				end
                );

-- 7. Yearly Sales Report for the customer 1631 [Year, InvoiceValue]
	select Year(InvoiceDt) as YR, Round(Sum(InvoiceTotal), 2) as InvoiceValue from invoice where CustomerId=1631 group by Year(InvoiceDt) order by Year(InvoiceDt);

-- 8. Region with the highest collections value [RegionCode, CollectionsValue]
	select cm.RegionCode, Round(SUM(temp1.CollectionsValue),2) as CollectionsValue from
		(customermaster cm
        inner join
        (select iv.CustomerId, Round(Sum(pt.PaidAmount), 2) as CollectionsValue from invoice iv inner join payments pt 
			on iv.InvoiceId=pt.InvoiceId group by iv.CustomerId
		) temp1
		on cm.CustomerId=temp1.CustomerId
        ) 
        group by cm.RegionCode order by CollectionsValue desc limit 1;

-- 9. To get the list of orders for the customer PRS using subquery
	select * from orderreg where CustomerId in (select CustomerId from customermaster where ShortName = 'PRS');

-- 10.Total number of orders for each customer in the database using subquery.	
	select cm.ShortName as CustomerName, temp1.OrderCount
		from (customermaster cm
			inner join
            (select CustomerId, count(1) as OrderCount from orderreg group by CustomerId) temp1
		) order by temp1.OrderCount desc;

-- 11. Customers with their sale value and collection value using subquery
	select cm.ShortName as CustomerName, temp1.SaleValue, temp1.CollectionsValue
		from (customermaster cm
			inner join
            (select iv.CustomerId, Round(Sum(iv.InvoiceTotal), 2) as SaleValue, Round(Sum(pt.PaidAmount), 2) as CollectionsValue
				from invoice iv inner join payments pt on iv.InvoiceId=pt.InvoiceId group by iv.CustomerId) temp1
			on cm.CustomerId=temp1.CustomerId
        );

-- 12. Orders for the customers belonging to the region 'BA' using subquery.
	select * from orderreg where CustomerId = ANY(select CustomerId from customermaster where RegionCode='BA');
    
-- 13. To check the list of items that do not have order [ItemNo, ListPrice, MarketingFactor]
	select ItemNo, ListPrice, MarketingFactor
		from productmaster pm
        WHERE not exists (select * from orderitems oi where oi.ItemNo=pm.ItemNo);

-- 14. Order total for each region in the database using joins.
	select cm.RegionCode, Round(Sum(oi.Total), 2) as OrderTotal
		from (customermaster cm
			inner join orderreg og 
            on cm.CustomerId=og.CustomerId
            inner join orderitems oi
            on oi.OrderId=og.OrderId
        ) group by cm.RegionCode order by OrderTotal desc;