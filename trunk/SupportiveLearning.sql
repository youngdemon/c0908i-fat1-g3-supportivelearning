create database SupportiveLearning
go
--use master
--drop database SupportiveLearning
use SupportiveLearning
go
<<<<<<< .mine
=======

>>>>>>> .r57
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

go
create table Staff
(
	StaffId nvarchar(100) primary key,
	AccountId nvarchar(100) foreign key references Account(AccountId)
)
go
select * from Staff
insert into Staff values('S02','A002')
go
create table Course
(
	CourseId nvarchar(100) primary key,
	CourseName nvarchar(max),
	DateStart datetime,
	DateEnd datetime
)
go
insert into Course values('C01','TestCourse','1991-1-1','1991-4-4')
go
create table Batch
(
	BatchId nvarchar(100) primary key,
	BatchName nvarchar(max),	
	StartDate datetime,
	CourseId nvarchar(100) foreign key references Course(CourseId),
	StaffId nvarchar(100) foreign key references Staff(StaffId)
	
)
go
insert into Batch values('B01','C0908I','1991-6-6','C01','S01')
insert into Batch values('B02','T0908I','1991-6-6','C01','S01')
insert into Batch values('B03','H0908I','1991-6-6','C01','S01')
insert into Batch values('B04','K0908I','1991-6-6','C01','S01')

insert into Batch values('B06','K0908I','1991-6-6','C01','S02')
insert into Batch values('B07','K0908I','1991-6-6','C01','S02')
insert into Batch values('B08','K0908I','1991-6-6','C01','S02')
select * from staff
go

create table Student
(
	StudentId nvarchar(100) primary key,
	AccountId nvarchar(100) foreign key references Account(AccountId),
	RollNumber nvarchar(100),
	BatchId nvarchar(100) foreign key references Batch(BatchId),
)
go
insert into Student values('ST01','A001','1','B01')
go
create table FeedBack
(
	FeedBackId nvarchar(100) primary key,
	StudentId nvarchar(100) foreign key references Student(StudentId),
	FeedBackTitle nvarchar(100),
	FeedBack nvarchar(max),
	FeedBackDate datetime
)
go
create table Subject
(
	SubjectId nvarchar(100) primary key,
	SubjectName nvarchar(max)
)
go
insert into Subject values('SJ01','Java')
insert into Subject values('SJ02','C++')
insert into Subject values('SJ03','C#')
insert into Subject values('SJ04','HDJ')
insert into Subject values('SJ05','HKT')

go
create table Assignment
(
	AssignmentId nvarchar(100) primary key,
	AssignmentName nvarchar(max),
	AssignmentFile nvarchar(max),
	Descriptions nvarchar(max),
	AssignmentStartDate datetime,	
	AssignmentEndDate datetime,
	SubjectId nvarchar(100) foreign key references Subject(SubjectId),
	BatchId nvarchar(100) foreign key references Batch(BatchId)
)
go
insert into Assignment values('ASM01','Java Sem IV','Doc','Java','1991-2-2','1991-2-9','SJ01','S01','B01')
go

create table MarkAssignment
(
	MarkAssignmentId nvarchar(100) primary key,
	StudentId nvarchar(100) foreign key references Student(StudentId),
	Assignment nvarchar(100) foreign key references Assignment(AssignmentId),
	FileUpload nvarchar(max),
	MarkAssignment float,
	DateUpload datetime
)
go
create table News
(
	NewsId nvarchar(100) primary key,
	Title nvarchar(100),
	News nvarchar(max),
	Images nvarchar(100),
	NewsDate datetime
)
<<<<<<< .mine
select *  from subject
select * from assignment=======
go
--drop table FAQ
create table FAQ
(
	FAQId nvarchar(100) primary key,
	Question nvarchar(max),
	Answer nvarchar(max),
	FAQDate datetime
)
go

create table ChangeLeaning
(
	ChangeLeaningId nvarchar(200) primary key,
	StudentId nvarchar(100) foreign key references Student(StudentId),
	BatchId nvarchar(100) foreign key references Batch(BatchId),
	Reason nvarchar(max),
	DateChange datetime
)
go

create table StaffAndBatch
(
	StaffAndBatchId nvarchar(100) primary key,
	StaffId nvarchar(100) foreign key references Staff(StaffId),
	BatchId nvarchar(100) foreign key references Batch(BatchId),
)
go
insert into StaffAndBatch values('SAB01','S01','B01')
go

select * from ChangeLeaning>>>>>>> .r57
