-- 1. To get the list of custormers in the database
	-- To list CustomerId of customers
    select CustomerId from customermaster;
	-- To list ShortName of customers
    select ShortName from customermaster;
    -- To list all details of customers
    select * from customermaster;

-- 2. To get the list of orders in the database
	-- To list OrderId of orders;
    select OrderId from orderreg;

-- 3. To get the list of regions in the database
	select distinct RegionCode from customermaster;
    
-- 4. To get the list of orders for customer 1631
	select OrderId, OrderDate, OrderType from orderreg where CustomerId=1631;

-- 5. To get the list of customers in the region BA, CH, MU, PU
	select CustomerId, ShortName from customermaster where RegionCode in ('BA', 'CH', 'MU', 'PU');

-- 6. To get the list of orders for the year 2005
	select OrderId, CustomerId, OrderType from orderreg where YEAR(OrderDate) = 2005;

-- 7. To get the list of invoices for the year 2005 and for the customer 961
	select * from invoice where CustomerId = 961 and YEAR(InvoiceDt)=2005;

-- 8. To get the list of customers whose name begins with T
	select * from customermaster where ShortName like 'T%';
    
-- 9. To get the list of invoices either for customer 1631 or for the month March 2005
	select * from invoice where CustomerId=1631 or InvoiceDt like '2005-03%';
    
-- 10. To get the total number of customers in the database
	select count(CustomerId) from customermaster;

-- 11. To get the total number of orders for the customer 1631 for the year 2006
	select count(OrderId) from orderreg where CustomerId=1631 and OrderDate like '2006%';
    
-- 12. To get the total order value for the database
	select ROUND(sum(Total),2) as total_order_value from orderitems;
    
-- 13. To get the total sales value of the database for the customer 961
	select CustomerId, InvoiceTotal, SalesTax, GrandTotal from invoice where customerId=961;

-- 14. To get the total outstanding amount in the database
	select ROUND(sum(OutstandingAmount), 2) as total_outstanding_amnt from payments;
