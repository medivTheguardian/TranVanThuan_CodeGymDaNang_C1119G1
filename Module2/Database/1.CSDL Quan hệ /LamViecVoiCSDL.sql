SELECT * FROM classicmodels.customers;
SELECT * FROM classicmodels.customers where customerName='Atelier jon';
select*from customers where customerName like '%A%';
select*from customers where city = 'NYC' and customerName like '%D%';
select*from customers where city in ('Nantes', 'Las Vegas', 'Warszawa', 'NYC');
select*from orders;
select*from orders where orderNumber between 10100 and 10110;
select*from orders where orderDate <= '2003-03-03' and status like 'shipped';