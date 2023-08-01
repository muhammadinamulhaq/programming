SELECT e.emp_no, count(d.dept_no) FROM employees AS e
INNER JOIN dept_emp AS d ON e.emp_no = d.emp_no
GROUP BY e.emp_no
HAVING count(d.dept_no) > 1
ORDER BY e.emp_no; 