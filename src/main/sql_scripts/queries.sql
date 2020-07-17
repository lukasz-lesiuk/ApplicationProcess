SELECT * FROM mentors;
SELECT * FROM applicants;

--1
SELECT first_name, last_name FROM mentors;

--2
SELECT nick_name FROM mentors WHERE city LIKE 'Miskolc';

-- 3
SELECT first_name || ' ' || last_name AS full_name, phone_number  FROM applicants WHERE first_name = 'Carol';

--4
SELECT first_name || ' ' || last_name AS full_name, phone_number  FROM applicants WHERE email LIKE '%adipiscingenimmi.edu';

--5
INSERT INTO applicants
VALUES (11, 'Markus', 'Schaffarzyk', '003620/725-2666', ' djnovus@groovecoverage.com', 54823);

SELECT * FROM applicants WHERE id = 11;

--6
UPDATE applicants
SET phone_number = '003670/223-7459';

SELECT * FROM applicants WHERE last_name = 'Foreman';

--7
DELETE FROM applicants WHERE email LIKE '%@mauriseu.net';



