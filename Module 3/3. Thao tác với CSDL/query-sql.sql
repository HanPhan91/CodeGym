Use quanlysinhvien;
select * from student where StudentName like 'h%';
select * from class where month(startdate)= 12;
SELECT * FROM subject where credit >= 3 and credit <= 5;
update student set ClassId= 2 where StudentName='Hung';