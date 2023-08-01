SELECT a.emp_no, concat(a.first_name, ' ', a.last_name) AS "Name", b.salary, c.title, c.from_date
FROM employees AS a
INNER JOIN salaries AS b ON a.emp_no = b.emp_no
INNER JOIN titles AS c 
    ON c.emp_no = a.emp_no 
    AND (b.from_date = c.from_date 
    OR c.from_date = (b.from_date + INTERVAL '2 days'))
ORDER BY a.emp_no;