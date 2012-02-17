create database SupportiveLearning
go
--use master
--drop database SupportiveLearning
use SupportiveLearning
go
create table Roles
(
	RoleId nvarchar(100) primary key,
	RoleName nvarchar(100),
	Description nvarchar(max)
)
go
insert into Roles values('R1','Administrator','Root role')
insert into Roles values('R2','Staff','Employee role')
insert into Roles values('R3','Student','Student Role')
go
select * from MarkAssignment
create table Account
(
	AccountId nvarchar(100) primary key,
	RoleId nvarchar(100) foreign key references Roles(RoleId),
	UserName nvarchar(100) unique,
	PassWord nvarchar(100),
	DateCreate datetime,
	FullName nvarchar(100),
	Birthday datetime,
	Gender bit,
	Phone int,
	Email nvarchar(100),
	Address nvarchar(100),
	Status bit,
	LastLogin datetime,
	AlowLogin bit
)
go
insert into Account values('A001','R1','admin','admin','1-1-1991','Vang Nguyen','1-1-1991',1,13123,'sdfaf','qwrqr',0,'1-1-1991',0)
insert into Account values('A002','R2','staff','staff','1-1-1991','Vang Nguyen','1-1-1991',1,13123,'sdfaf','qwrqr',0,'1-1-1991',0)
insert into Account values('A003','R3','student','student','1-1-1991','Vang Nguyen','1-1-1991',1,13123,'sdfaf','qwrqr',0,'1-1-1991',0)
go
create table Staff
(
	StaffId int identity(1,1) primary key,
	AccountId nvarchar(100) foreign key references Account(AccountId)
)
go
insert into Staff values('A002')
go
create table Course
(
	CourseId int identity(1,1) primary key,
	CourseName nvarchar(max),
	DateStart datetime,
	DateEnd datetime
)
insert into Course values('ITT','2012-2-2','2012-2-2')
insert into Course values('HDSE','2009-2-2','2012-2-2')

go
create table Semester
(
	SemesterId int identity(1,1) primary key,
	CourseId int foreign key references Course,
	SemesterName nvarchar(30)		
)
insert into Semester values (1,'SEMESTER I')
insert into Semester values (1,'SEMESTER II')
insert into Semester values (2,'SEMESTER III')
insert into Semester values (2,'SEMESTER IV')
go
create table Subject
(
	SubjectId int identity(1,1) primary key,
	SemesterId int foreign key references Semester,
	SubjectName nvarchar(100)
)
select SubjectName from Subject where SubjectId = 13
insert into Subject values(1,'Computer Fudamente')
insert into Subject values(1,'HTML Dreamwave Javascript')
insert into Subject values(1,'Java By Example')
insert into Subject values(1,'RDBMS')

insert into Subject values(2,'XML By Example')
insert into Subject values(2,'Programming in C#')
insert into Subject values(2,'Database and Security in Java')
insert into Subject values(2,'Guide to advanced Java')

insert into Subject values(3,'Winform C#')
insert into Subject values(3,'Begining ASP.NET')
insert into Subject values(3,'Webservice in c#')
insert into Subject values(3,'Database handling C#')

insert into Subject values(4,'Servlet and JSP')
insert into Subject values(4,'XML with Java')
insert into Subject values(4,'Enterprise Application with EJB')
insert into Subject values(4,'JSF and Struts')
go
create table Batch
(
	BatchId int identity(1,1) primary key,
	BatchName nvarchar(max) unique,	
	StartDate datetime,
	StaffId int foreign key references Staff,
	SemesterId int foreign key references Semester
	
)
insert into Batch values('C0908I','2009-8-8',1,4)
insert into Batch values('C1122H','2009-8-8',1,1)
insert into Batch values('C0124J','2009-8-8',1,2)
insert into Batch values('C0124J','2009-8-8',1,3)
go
create table Student
(
	StudentId int identity(1,1) primary key,
	AccountId nvarchar(100) foreign key references Account(AccountId),
	BatchId int foreign key references Batch
)
insert into Student values('A003',4)
go
create table FeedBack
(
	FeedBackId int identity(1,1) primary key,
	StudentId int foreign key references Student,
	FeedBackTitle nvarchar(100),
	FeedBack nvarchar(max),
	FeedBackDate datetime
)
go
create table Assignment
(
	AssignmentId int identity(1,1) primary key,
	AssignmentName nvarchar(100),
	AssignmentFile nvarchar(200),
	Descriptions nvarchar(max),
	AssignmentStartDate datetime,	
	AssignmentEndDate datetime,
	SubjectId int foreign key references Subject,
	BatchId int foreign key references Batch
)
go
insert into Assignment values('Servlet Assigment','soucre.txt','Very super hyper essy','1991-1-1','1991-2-2',13,4)
go
create table MarkAssignment
(
	MarkAssignmentId int identity(1,1) primary key,
	StudentId int foreign key references Student,
	AssignmentId int foreign key references Assignment,
	FileUpload nvarchar(max),
	MarkAssignment float,
	DateUpload smalldatetime default getDate()
)
insert into MarkAssignment(StudentId,AssignmentId,FileUpload) values(1,2,'myfile.docx')
go
create table News
(
	NewsId int identity(1,1) primary key,
	Title nvarchar(100),
	News nvarchar(max),
	Images nvarchar(100),
	NewsDate datetime
)