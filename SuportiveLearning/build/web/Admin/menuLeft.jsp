<%-- 
    Document   : menuRight
    Created on : Feb 5, 2012, 9:21:34 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManagementAccount" class="DAL.Admin.ManagementAccount">
    <jsp:setProperty property="studentId" value="${studentId}" name="objManagementAccount"/>
</jsp:useBean>
<jsp:useBean id="objManagementBatch" class="DAL.Admin.ManagementBatch">
    <jsp:setProperty property="batchId" name="objManagementBatch" value="${objManagementAccount.batchIdByStudentId}"/>
</jsp:useBean>
<div id="header">Main Menu</div>
        <ul>
            <li><a href="#1">Home</a></li>
            <li><a href="#2">Site News</a></li>
            <li><a href="#3">Mark View</a></li>

        </ul>
<c:if test="${not empty user}">
    <c:if test="${role=='R1'}">
        <div id="header">Navigation</div>
        <ul>
            <li><a href="ManagementStaffRedirect.do">Management Staff</a></li>
            <li><a href="ManagementStudentRedirect.do">Management Student</a></li>
            <li><a href="ListCourse.do">Management Course</a></li>
            <li><a href="ListSemester.do">Management Semester</a></li>
            <li><a href="ListBatch.do">Management Batch</a></li>
            <li><a href="ManagementSubjectRedirect.do">Management Subject</a></li>
            <li><a href="ListFAQ.do">Management FAQs</a></li>
            <li><a href="ListNews.do">Management News</a></li>
        </ul>
    </c:if>
    <c:if test="${role=='R2'}">
        <div id="header">Navigation</div>
        <ul>
            <li><a href="ListBatchRedirect.do">Assignment</a></li>
            <li><a href="ListBatchMarkAssignment.do">Mask Assignment</a></li>
        </ul>
    </c:if>
    <c:if test="${role=='R3'}">
        <div id="header">My Batch</div>
        <ul><c:forEach items="${objManagementBatch.batchById}" var="item">
            <li><a href="ListSubjectBySemId.do?semesterId=${item.semesterId}">${item.batchName}</a></li>
            </c:forEach>
        </ul>
    </c:if>
</c:if>
<div id="header">Calendar</div>
