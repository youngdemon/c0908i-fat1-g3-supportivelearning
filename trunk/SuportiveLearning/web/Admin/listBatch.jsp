<%-- 
    Document   : listBatch
    Created on : Feb 17, 2012, 7:10:04 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManagementBatch" class="DAL.Admin.ManagementBatch"/>
<table align="center" width="100%">
    <tr id="headerTable">
        <th>Batch Name</th>
        <th>Date Start</th>
        <th>Staff Id</th>
        <th>Semester Id</th>
    </tr>
    <c:forEach var="item" items="${objManagementBatch.allBatch}">
        <tr id="rowTable">
            <td><a href="updateBatch_Redirect.do?batchId=${item.batchId}">${item.batchName}</a></td>
            <td>${item.startDate}</td>
            <td>${item.staffId}</td>
            <td>${item.semesterId}</td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="addBatch_Redirect.do">Add New Batch</a>
        </td>
    </tr>
</table>
