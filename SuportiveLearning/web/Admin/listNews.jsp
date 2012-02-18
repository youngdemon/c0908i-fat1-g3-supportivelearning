<%-- 
    Document   : listNews
    Created on : Feb 6, 2012, 1:34:19 AM
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManagementNews" class="DAL.Admin.ManagementNews"/>
<table align="center" width="100%">
    <tr id="headerTable">
        <th>ID</th>>
        <th>Title</th>
        <th>News</th>
        <th>Images</th>
        <th>NewsDate</th>
    </tr>
    <c:forEach var="item" items="${objManagementNews.allNews}">
        <tr id="rowTable">
        <td><a href="updateNews_Redirect.do?newsId=${item.newsId}">${item.newsId}</a></td>
        <td>${item.title}</td>
        <td>${item.news}</td>
        <td>${item.images}</td>
        <td>${item.newsDate}</td>
        <td><a href="deleteNews.do?newsId=${item.newsId}">Delete</a></td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="4">
            <a href="addNews_Redirect.do">Add New News</a>
        </td>
    </tr>
</table>
