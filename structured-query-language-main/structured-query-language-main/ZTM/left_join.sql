SELECT a.emp_no, 
       concat(a.first_name, ' ', a.last_name), 
       b.salary, 
       COALESCE(c.title, 'no title change') AS "Title", 
       COALESCE(c.from_date::TEXT, '-') AS "title taken on"
FROM employees AS a
INNER JOIN salaries AS b ON a.emp_no = b.emp_no
LEFT JOIN titles AS c ON a.emp_no = c.emp_no AND (b.from_date = c.from_date OR (b.from_date + INTERVAL '2 days') = c.from_date)
ORDER BY a.emp_no;