INSERT INTO departments
VALUES (70, 'Public Relations', 100, 1700);
INSERT INTO	departments (department_id, department_name)
VALUES		(30, 'Purchasing');
INSERT INTO	departments
VALUES		(100, 'Finance', NULL, NULL);
INSERT INTO employees 
VALUES		   (113,  'Louis', 'Popp', 'LPOPP', '515.124.4567', 
                        SYSDATE, 'AC_ACCOUNT', 6900,  NULL, 205, 110);
INSERT INTO employees
VALUES      (114, 'Den', 'Raphealy', 'DRAPHEAL', '515.127.4561',
                      TO_DATE('02 03, 99', 'MM DD, YY'), 'SA_REP', 11000, 0.2, 100, 60);
INSERT INTO employees
VALUES      (115, 'Mark', 'Kim', 'MKIM', '515.127.4562',
                      TO_DATE('02 03, 99', 'MM DD, RR'),
                      'SA_REP', 13000, 0.25, 100, 60);  

CREATE TABLE sales_reps
AS
SELECT employee_id id, last_name name, salary, commission_pct
FROM employees
WHERE 1=2;
INSERT INTO sales_reps
SELECT employee_id, last_name, salary, commission_pct
FROM   employees
WHERE  job_id LIKE '%REP%';