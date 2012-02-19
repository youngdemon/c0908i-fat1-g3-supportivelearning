<%-- 
    Document   : listSemester
    Created on : Feb 17, 2012, 6:30:47 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManagementSemester" class="DAL.Admin.ManagementSemester"/>
<jsp:useBean id="objManagementCourse" class="DAL.Admin.ManagementCourse"/>
<c:if test="${not empty requestScope.mess}">
    <c:if test="${requestScope.mess=='deleteFail'}">
        <div>
            * Delete fails please check relationship
        </div>
    </c:if>
</c:if>
<table align="center" width="100%">
    <tr id="headerTable">
        <th>Semester Name</th>
        <th>Course Id</th>
        <th></th>
    </tr>
    <c:forEach var="item" items="${objManagementSemester.allSemester}">
        <tr id="rowTable">
        <td><a href="updateSemester_Redirect.do?semesterId=${item.semesterId}">${item.semesterName}</a></td>
        <td>${item.courseId}</td>
        <td><a href="deleteSemester.do?semesterId=${item.semesterId}">Delete</a></td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="addSemester_Redirect.do">Add New Semester</a>
        </td>
    </tr>
</table>