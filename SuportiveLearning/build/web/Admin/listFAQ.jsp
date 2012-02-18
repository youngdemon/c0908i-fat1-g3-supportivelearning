<%--
    Document   : listNews
    Created on : Feb 6, 2012, 1:34:19 AM
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManagementFAQ" class="DAL.Admin.ManagementFAQ"/>
<table align="center" width="100%">
    <tr id="headerTable">
        <th>FAQId</th>
        <th>Answer</th>
        <th>Question</th>
        <th>FAQDate</th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${objManagementFAQ.allFAQ}">
        <tr id="rowTable" align="center">
        <td><a href="updateFAQ_Redirect.do?fAQId=${item.fAQId}">${item.fAQId}</a></td>
        <td>${item.answer}</td>
        <td>${item.question}</td>
        <td>${item.fAQDate}</td>
        <td><a href="deleteFAQs.do?fQAId=${item.fAQId}">Delete</a></td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="addFAQ_Redirect.do">Add New FAQ</a>
        </td>
    </tr>
</table>
