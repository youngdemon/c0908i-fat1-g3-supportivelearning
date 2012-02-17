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
<jsp:useBean id="objManagementAssignment" class="DAL.Staff.ManagementAssigment">
    <jsp:setProperty name="objManagementAssignment" property="batchId" value="${param.batchId}"/>
    <jsp:setProperty name="objManagementAssignment" property="subjectId" value="${param.subjectId}"/>
</jsp:useBean>
<jsp:useBean id="objDB" class="Model.DBConnection"/>
<jsp:useBean id="objDB2" class="Model.DBConnection"/>
<c:set var="items" value="${objManagementAssignment.asssignmentByBatchIdAndSubjectId}" />
<div id="header2">List Assignment</div>
<table border="0" width="100%">
    <tr id="headerTable">
        <th>Assignment Name</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Assigment File</th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${items}">
        <tr align="center" id="rowTable">
            <td>${item.assignmentName}</td>
       <td>
            <jsp:setProperty name="objDB" property="strDate" value="${item.assignmentStartDate}"/>
            ${objDB.convertToDate}
        </td>
        <c:if test="${item.status=='1'}">
            <td style="color: red;">
            <jsp:setProperty name="objDB2" property="strDate" value="${item.assignmentEndDate}"/>
            ${objDB2.convertToDate}
        </td>
        </c:if>
        <c:if test="${item.status=='0'}">
            <td>
            <jsp:setProperty name="objDB2" property="strDate" value="${item.assignmentEndDate}"/>
            ${objDB2.convertToDate}
        </td>
        </c:if>
        <td><a href="Staff_Assignment_Upload/${item.assignmentFile}">Download</a></td>
        <c:if test="${item.status=='1'}">
        <td><a href="#">Submited File</a></td>
        </c:if>
        <c:if test="${item.status=='0'}">
        <td><a href="SubmitAssignmentRedirect.do?assignmentId=${item.assignmentId}">Submit Assignment</a></td>
        </c:if>
</tr>
    </c:forEach>
</table>