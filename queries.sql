## Part 1: Test it with SQL
   id INT PRIMARY KEY
   employer varchar(255)
   name varchar(255)
   skills varchar(255)

## Part 2: Test it with SQL
select name from employer where location = "St. Louis"

## Part 3: Test it with SQL
--used this code because there was a foreign key in job_skills

    SET FOREIGN_KEY_CHECKS = 0;
    drop table if exists customers;
    drop table if exists orders;
    drop table if exists order_details;
    SET FOREIGN_KEY_CHECKS = 1;

## Part 4: Test it with SQL
    SELECT skill
    FROM job
    WHERE skills.job IS NOT NULL