<%-- 
    Document   : listMarkAssignment
    Created on : Mar 5, 2012, 2:18:54 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objMarkAssignment" class="DAL.Staff.ManagementMarkAssignment"/>
<c:if test="${not empty requestScope.backAssignmentId}">
    <jsp:setProperty name="objMarkAssignment" property="assignmentId" value="${requestScope.backAssignmentId}"/>
</c:if>
<c:if test="${empty requestScope.backAssignmentId}">
    <jsp:setProperty name="objMarkAssignment" property="assignmentId" value="${param.assignmentId}"/>
</c:if>
<div id="header2">List Student Submit Assignment</div>
<table width="100%">
    <tr id="headerTable">
        <th>Student Name</th>
        <th>Assignment Name</th>
        <th>File Submited</th>
        <th>Date Submited</th>
        <th>Mark</th>
        <th>Update Mark</th>
    </tr>
    <c:forEach items="${objMarkAssignment.markAssignmentAssignmentId}" var="item">
        <tr id="rowTable" align="center">
            <td>${item.assignmentId}</td>
            <td>${item.studentId}</td>
            <td><a href="Student_Assignment_Upload/${item.fileUpload}">Download</a></td>
            <td>${item.dateUpload}</td>
            <td>${item.markAssignment}</td>
            <td><a href="updateMarkAssignment.do?markAssignmentId=${item.markAssignmentId}&assignmentId=${item.assignmentId}">Update</a></td>
        </tr>
    </c:forEach>
</table>