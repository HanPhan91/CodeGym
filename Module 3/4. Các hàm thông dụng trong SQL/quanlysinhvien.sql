select * from subject where credit=(select max(credit) FROM subject);

select * from mark where Mark=(select max(Mark) from mark);

select student.StudentId,student.StudentName , mark.Mark from student
	inner join mark
    on student.StudentId = mark.StudentId
    order by Mark DESC;