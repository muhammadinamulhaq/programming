SELECT e.emp_no, count(s.salary) AS "Salary Changes" 
FROM employees AS e
INNER JOIN salaries AS s USING(emp_no)
INNER JOIN dept_emp AS d USING(emp_no)
WHERE d.dept_no = 'd005'
GROUP BY e.emp_no
HAVING count(s.salary) > 15;

-- SELECT e.emp_no, count(s.from_date) as "amount of raises"
-- FROM employees as e
-- JOIN salaries as s USING(emp_no)
-- JOIN dept_emp AS de USING(emp_no)
-- WHERE de.dept_no = 'd005'
-- GROUP BY e.emp_no
-- HAVING count(s.from_date) > 15
-- ORDER BY e.emp_no;