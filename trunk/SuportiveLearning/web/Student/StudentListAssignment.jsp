<%-- 
    Document   : StudentListAssignment
    Created on : Feb 9, 2012, 1:53:02 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objManagementAssignment" class="DAL.Staff.ManagementAssigment">
    <jsp:setProperty name="objManagementAssignment" property="batchId" value="${param.batchID}"/>
</jsp:useBean>
<c:set var="items" value="${objManagementAssignment.asssignmentByBatchId}" />
<div id="header2">List Assignment</div>
<table border="1" width="100%">
    <tr>
        <th>Assignment Name</th>
        <th>Subject</th>
        <th>Start Date</th>
        <th>End Date</th>
    </tr>
    <c:forEach var="item" items="${items}">
        <tr align="center">
            <td>${item.assignmentName}</td>
        <td>${item.subjectId}</td>
        <td></td>
        <td><a href="Staff_Assignment_Upload/${item.assignmentFile}">${item.assignmentFile}</a></td>
    </tr>
    </c:forEach>
</table>

