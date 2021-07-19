FROM mysql:8.0

ENV MYSQL_ROOT_PASSWORD=root

COPY /SalesForce/salesorder_customermaster.sql /docker-entrypoint-initdb.d
COPY /SalesForce/salesorder_invoice.sql /docker-entrypoint-initdb.d
COPY /SalesForce/salesorder_orderitems.sql /docker-entrypoint-initdb.d
COPY /SalesForce/salesorder_orderreg.sql /docker-entrypoint-initdb.d
COPY /SalesForce/salesorder_payments.sql /docker-entrypoint-initdb.d
COPY /SalesForce/salesorder_productmaster.sql /docker-entrypoint-initdb.d
#COPY SalesForce/salesorder_orderitems.sql /docker-entrypoint-initdb.d/

