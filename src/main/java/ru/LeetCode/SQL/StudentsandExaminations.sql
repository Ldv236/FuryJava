/*Table: Students

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| student_id    | int     |
| student_name  | varchar |
+---------------+---------+
student_id is the primary key for this table.
Each row of this table contains the ID and the name of one student in the school.


Table: Subjects

+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| subject_name | varchar |
+--------------+---------+
subject_name is the primary key for this table.
Each row of this table contains the name of one subject in the school.


Table: Examinations

+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| student_id   | int     |
| subject_name | varchar |
+--------------+---------+
There is no primary key for this table. It may contain duplicates.
Each student from the Students table takes every course from the Subjects table.
Each row of this table indicates that a student with ID student_id attended the exam of subject_name.


Write an SQL query to find the number of times each student attended each exam.

Return the result table ordered by student_id and subject_name.*/

SELECT decart.student_id, decart.student_name, decart.subject_name,
       CASE WHEN attend.c is null THEN '0' ELSE attend.c END as attended_exams
FROM
    (SELECT student_id, student_name, subject_name
     FROM Students
              CROSS JOIN Subjects) decart
        LEFT JOIN
    (SELECT student_id, subject_name, count(*) c
     from Examinations
     GROUP BY student_id, subject_name) attend
    ON decart.student_id = attend.student_id
        and decart.subject_name = attend.subject_name
ORDER BY student_id, subject_name