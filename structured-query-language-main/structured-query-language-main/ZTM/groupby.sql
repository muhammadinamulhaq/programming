SELECT de.dept_no, d.dept_name, COUNT(e.emp_no) AS "# of employees" FROM employees AS e
INNER JOIN dept_emp AS de ON e.emp_no = de.emp_no
INNER JOIN departments AS d ON de.dept_no = d.dept_no
GROUP BY de.dept_no, d.dept_name
ORDER BY d.dept_name, COUNT(e.emp_no);