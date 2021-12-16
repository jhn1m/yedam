SELECT last_name
FROM employees e
INNER JOIN departments d
ON e.department_id = d.department_id
WHERE department_name = 'IT'
AND salary <= 10000;

SELECT last_name
FROM employees 
NATURAL JOIN departments
WHERE department_name LIKE 'IT' AND salary <= 10000;

SELECT *
FROM employees e
JOIN departments d
ON e.department_id = d.department_id
WHERE d.department_name LIKE 'IT' AND e.salary <= 10000;

INSERT INTO employees VALUES();

rollback;

CREATE VIEW dept_test_vu AS(
SELECT d.department_id, d.department_name, e.last_name, l.city
FROM departments d
JOIN employees e
ON (d.manager_id = e.employee_id)
JOIN locations l
ON (d.location_id = l.location_id)
);

SELECT * FROM dept_test_vu;

-- INSERT
INSERT INTO departments 
VALUES(1000, 'YEDAM', (SELECT employee_id 
                       FROM employees 
                       WHERE last_name = 'Abel'), 
                       (SELECT location_id 
                       FROM locations 
                       WHERE city = 'Oxford'));



-- UPDATE

UPDATE departments
SET manager_id = (SELECT employee_id 
                       FROM employees 
                       WHERE last_name = 'Abel')
WHERE department_id = 1000;

-- DELETE
DELETE FROm departments WHERE department_id = 1000;