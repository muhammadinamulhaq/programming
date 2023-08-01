SELECT count(orderid) FROM orders
WHERE customerid IN (7888, 1082, 12808, 9623);

SELECT * FROM orders;

SELECT count(customerid) FROM customers
WHERE zip::TEXT LIKE '%2%';

SELECT count(customerid) FROM customers
WHERE zip::TEXT LIKE '2_1%';

SELECT COALESCE(state, 'No state') AS "State" FROM customers
WHERE phone::TEXT LIKE '302%';