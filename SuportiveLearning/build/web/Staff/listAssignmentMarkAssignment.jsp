<%--
    Document   : listAssigment
    Created on : Feb 8, 2012, 9:48:02 PM
    Author     : Administrator
--%>

<%@page import="Model.DBConnection"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objManagementAssignment" class="DAL.Staff.ManagementAssigment"/>
<jsp:useBean id="objDB" class="Model.DBConnection"/>
<jsp:useBean id="objDB2" class="Model.DBConnection"/>
<c:if test="${empty requestScope.batchId && empty requestScope.subjectId}">
    <jsp:setProperty name="objManagementAssignment" property="batchId" value="${param.batchId}"/>
    <jsp:setProperty name="objManagementAssignment" property="subjectId" value="${param.subjectId}"/>
</c:if>
<c:if test="${not empty requestScope.batchId && not empty requestScope.subjectId}">
    <jsp:setProperty name="objManagementAssignment" property="batchId" value="${requestScope.batchId}"/>
    <jsp:setProperty name="objManagementAssignment" property="subjectId" value="${requestScope.subjectId}"/>
</c:if>
<c:set var="items" value="${objManagementAssignment.asssignmentByBatchIdAndSubjectId}" />
<div id="header2">List Assignment</div>
<table border="0" width="100%">
    <tr id="headerTable">
        <th>Assignment Name</th>
        <th>Subject</th>
        <th>Details</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>List</th>
    </tr>
    <c:forEach var="item" items="${items}">
        <tr align="center" id="rowTable">
            <td><a href="DetailAssignmentRedirect.do?assignmentId=${item.assignmentId}">${item.assignmentName}</a></td>
        <td>${item.subjectId}</td>
        <td><a href="Staff_Assignment_Upload/${item.assignmentFile}" >Download</a></td>
        <td>
            <jsp:setProperty name="objDB" property="strDate" value="${item.assignmentStartDate}"/>
            ${objDB.convertToDate}
        </td>
        <td>
            <jsp:setProperty name="objDB2" property="strDate" value="${item.assignmentEndDate}"/>
            ${objDB2.convertToDate}
        </td>
        <td><a href="ListMarkAssignment.do?assignmentId=${item.assignmentId}">Student Submited</a></td>
    </tr>
    </c:forEach>
</table>
