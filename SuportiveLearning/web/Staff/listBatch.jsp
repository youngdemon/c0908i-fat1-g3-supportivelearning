<%-- 
    Document   : listBatch
    Created on : Feb 8, 2012, 3:06:30 PM
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objMB" class="DAL.Admin.ManagementBatch" />
<jsp:setProperty name="objMB" value="${staffId}" property="staffId"/>
<div id="header2">List Your Batch Manage</div>
<table width="100%" style="border: solid 1px #999999;" cellpadding="0" cellspacing="0">
    <tr>
        <th>Batch</th>
        <th>Start Date</th>
    </tr>
    <c:forEach var="item" items="${objMB.batchByStaffId}">
        <tr>
            <td align="center"><a href="SubjectListBySemId.do?semesterId=${item.semesterId}&batchId=${item.batchId}">${item.batchName}</a></td>
            <td align="center">${item.startDate}</td>

        </tr>
    </c:forEach>
</table>

