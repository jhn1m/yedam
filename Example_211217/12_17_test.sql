SELECT employee_id, first_name, email, salary
FROM employees
WHERE salary BETWEEN 5000 AND 10000;

SELECT MAX(salary) AS max
FROM employees
WHERE job_id = 'ST_CLERK';

SELECT ROUND(AVG(salary), 2) AS round
FROM employees
WHERE TO_CHAR(hire_date,'MM') = '05';


SELECT employee_id, first_name, email, salary 
FROM employees
WHERE job_id = 'SA_REP' AND salary >= 10000;

rollback;
commit;