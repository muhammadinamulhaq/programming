SELECT e.emp_no, count(t.title), e.hire_date
FROM employees AS e
INNER JOIN titles AS t USING(emp_no)
WHERE EXTRACT(YEAR FROM hire_date) > 1991
GROUP BY e.emp_no
HAVING count(t.title) > 2;

-- select emp_no, count(title) from titles
-- group by emp_no
-- having count(title) > 2;

-- select * from employees as e
-- inner join titles as t using(emp_no)
-- order by e.emp_no;