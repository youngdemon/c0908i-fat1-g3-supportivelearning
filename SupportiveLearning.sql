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
create table Account
(
	AccountId nvarchar(100) primary key,
	RoleId nvarchar(100) foreign key references Roles(RoleId),
	UserName nvarchar(100),
	PassWord nvarchar(100),
	DateCreate datetime,
	FullName nvarchar(100),
	Birthday datetime,
	Gender bit,
	Phone nvarchar(100),
	Email nvarchar(100),
	Address nvarchar(100),
	Status bit,
	LastLogin datetime,
	AlowLogin bit
)
go
create table Staff
(
	StaffId nvarchar(100) primary key,
	AccountId nvarchar(100) foreign key references Account(AccountId)
)
go
create table Admin
(
	AdminId nvarchar(100) primary key,
	AccountId nvarchar(100) foreign key references Account(AccountId),
)
go
create table Course
(
	CourseId nvarchar(100) primary key,
	CourseName nvarchar(max),
	DateStart datetime,
	DateEnd datetime
)
go
create table Semester
(
	SemesterId nvarchar(100) primary key,
	SemesterName nvarchar(max),
	SemesterTime datetime
)
go
create table Batch
(
	BatchId nvarchar(100) primary key,
	BatchName nvarchar(max),
	StartDate datetime,
	CourseId nvarchar(100) foreign key references Course(CourseId),
	SemesterId nvarchar(100) foreign key references Semester(SemesterId),
)
go
create table Student
(
	StudentId nvarchar(100) primary key,
	AccountId nvarchar(100) foreign key references Account(AccountId),
	RollNumber nvarchar(100),
	BatchId nvarchar(100) foreign key references Batch(BatchId),
)
go
create table FeedBack
(
	FeedBackId nvarchar(100) primary key,
	StudentId nvarchar(100) foreign key references Student(StudentId),
	StaffId nvarchar(100) foreign key references Staff(StaffId),
	FeedBackTitle nvarchar(100),
	FeedBack nvarchar(max),
	FeedBackDate datetime
)
go
create table Answer
(
	AnswerId nvarchar(100) primary key,
	FeedBackId nvarchar(100) foreign key references FeedBack(FeedBackId),
	Answer nvarchar(max),
	AnswerDate datetime
)
go
create table Subject
(
	SubjectId nvarchar(100) primary key,
	SubjectName nvarchar(max)
)
go
create table Assignment
(
	AssignmentId nvarchar(100) primary key,
	AssignmentName nvarchar(max),
	AssignmentFile nvarchar(max),
	Assignment nvarchar(max),
	AssignmentStartDate datetime,	
	AssignmentEndDate datetime,
	SubjectId nvarchar(100) foreign key references Subject(SubjectId),
	StaffId nvarchar(100) foreign key references Staff(StaffId),
	BatchId nvarchar(100) foreign key references Batch(BatchId)
)
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
go
--drop table FAQ
create table FAQ
(
	FAQId nvarchar(100) primary key,
	Question nvarchar(max),
	Answer nvarchar(max),
	FAQDate datetime
)

create table ChangeLeaning
(
	ChangeLeaningId nvarchar(200) primary key,
	StudentId nvarchar(100) foreign key references Student(StudentId),
	BatchId nvarchar(100) foreign key references Batch(BatchId),
	Reason nvarchar(max),
	DataChange datetime
)

create table StaffAndBatch
(
	StaffAndBatchId nvarchar(100) primary key,
	StaffId nvarchar(100) foreign key references Staff(StaffId),
	BatchId nvarchar(100) foreign key references Batch(BatchId),
)
select * from subject