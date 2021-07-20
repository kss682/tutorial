-- 1. To get the total number of customers for each region [RegionCode, CustomerCount]
	select RegionCode, count(1) as CustomerCount from customermaster group by RegionCode;
    -- To list top 3 regions with highest count
		select RegionCode, count(1) as CustomerCount from customermaster group by RegionCode order by CustomerCount desc limit 3;

-- 2. To get the total number of orders for each customer id [CustomerId, OrderCount]
	select CustomerId, count(OrderId) as OrderCount from orderreg group by CustomerId order by OrderCount desc;

-- 3. To get the total sales value for each customer id [CustomerId, SalesValue]
	select CustomerId, ROUND(sum(GrandTotal),2) as SalesValue from invoice group by CustomerId order by SalesValue desc;
    
-- 4. To get the total sales value for each customer for the year 2005.
	select CustomerId, ROUND(sum(GrandTotal),2) as SalesValue from invoice where InvoiceDt like '2005%' group by CustomerId;
    
-- 5. To get the list of orders with its customer information [OrderId, OrderDate, CustomerId, CustomerName, RegionCode]
	select org.OrderId, org.OrderDate, org.CustomerId, cm.ShortName as CustomerName, cm.RegionCode 
		from (orderreg org inner join customermaster cm on org.CustomerId = cm.CustomerId);

-- 6. To get the list of all invoices with their order information [InvoiceId, InvoiceDate, InvoiceTotal, OrderId, OrderDate]
	select iv.InvoiceId, iv.InvoiceDt as InvoiceDate, InvoiceTotal, iv.OrderId, og.OrderDate  
		from (invoice iv inner join orderreg og on iv.OrderId = og.OrderId);

-- 7. To get the list of all invoices with their payment information [InvoiceId, InvoiceDate, InvoiceTotal, PaidAmount, OutstandingAmount]
	select iv.InvoiceId, iv.InvoiceDt as InvoiceDate, iv.InvoiceTotal, pt.PaidAmount, pt.OutstandingAmount
		from (invoice iv inner join payments pt on iv.InvoiceId = pt.InvoiceId);

-- 8. To get the list of the orders for the year 2006 with their customer information [OrderId, OrderDate, CustomerId, CustName, RegionCode]
	select og.OrderId, og.OrderDate, cm.CustomerId, cm.ShortName as CustName, cm.RegionCode
		from (orderreg og inner join customermaster cm on og.CustomerId = cm.CustomerId and year(og.OrderDate)=2006);

-- 9. Item with or without order information [ItemNo, LstPrice, MarketingFactor, Rate, Qty, Total]
	select pm.ItemNo, pm.ListPrice, pm.MarketingFactor, oi.Rate, oi.Qty, oi.Total
		from (productmaster pm left join orderitems oi on pm.ItemNo=oi.ItemNo);

-- 10. Customers with or without order information [CustomerId, CustName, RegionCode, OrderId, OrderDate]
	select cm.CustomerId, cm.ShortName as CustName, cm.RegionCode, og.OrderId, og.OrderDate
		from (customermaster cm left join orderreg og on cm.CustomerId=og.CustomerId);
        
-- 11. Total number of order for each region. (RegionCode, OrderCount)
	select cm.RegionCode, count(og.OrderId) as OrderCount from
		(customermaster cm inner join orderreg og on cm.CustomerId=og.CustomerId) group by cm.RegionCode;

-- 12. Total invoice value for each region (RegionCode, InvoiceValue)
	select cm.RegionCode, ROUND(SUM(iv.InvoiceTotal), 2) as InvoiceValue from 
		(customermaster cm inner join invoice iv on cm.CustomerId=iv.CustomerId) group by cm.RegionCode;
