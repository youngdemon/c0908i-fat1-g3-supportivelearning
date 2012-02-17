<%-- 
    Document   : listCourse
    Created on : Mar 1, 2012, 5:24:45 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManagementCourse" class="DAL.Admin.ManagementCourse"/>
<table align="center" width="100%">
    <tr id="headerTable">
        <th>Course Name</th>
        <th>Date Start</th>
        <th>Date End</th>
    </tr>
    <c:forEach var="item" items="${objManagementCourse.allCourse}">
        <tr id="rowTable">
        <td>${item.courseName}</td>
                <td>${item.dateStart}</td>
                        <td>${item.dateEnd}</td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="addCourse_Redirect.do">Add New Course</a>
        </td>
    </tr>
</table>