<%-- 
    Document   : listSubject
    Created on : Feb 17, 2012, 9:29:33 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManagementSubject" class="DAL.Admin.ManagementSubject"/>
<c:if test="${not empty requestScope.mess}">
    <c:if test="${requestScope.mess=='deleteFail'}">
        <div>
            * Delete fails please check relationship
        </div>
    </c:if>
</c:if>
<table align="center" width="100%">
    <tr id="headerTable">
        <th>Subject Name</th>
        <th>Semester ID</th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${objManagementSubject.allSubject}">
        <tr id="rowTable">
            <td><a href="updateSubject_Redirect.do?subjectId=${item.subjectId}">${item.subjectName}</a></td>
            <td>${item.semesterId}</td>
            <td><a href="deleteSubject.do?subjectId=${item.subjectId}">Delete</a></td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="addSubject_Redirect.do">Add New Subject</a>
        </td>
    </tr>
</table>
