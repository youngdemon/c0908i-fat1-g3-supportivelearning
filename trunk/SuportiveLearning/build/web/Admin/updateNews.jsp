<%-- 
    Document   : updateNews
    Created on : Feb 18, 2012, 3:34:26 PM
    Author     : ducnt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objManagementNews" class="DAL.Admin.ManagementNews"/>
<jsp:setProperty name="objManagementNews" property="newsId" value="${param.newsId}" />
<jsp:useBean id="objDBConnection" class="Model.DBConnection"/>
<form action="updateNews.do" method="post">
    <c:forEach var="item" items="${objManagementNews.allNewsById}">
    <table>
        <tr>
            <td>
                Title
            </td>
            <td>
                <input type="text" name="txtTitle" value="${item.title}"/>
                <input type="hidden" name="txtNewsId" value="${item.newsId}"/>
            </td>
        </tr>
         <tr>
            <td>
                News
            </td>
            <td>
                <input type="text" name="txtNews" value="${item.news}"/>
            </td>
        </tr>
         <tr>
            <td>
                Images
            </td>
            <td>
                <input type="text" name="txtImages" value="${item.images}"/>
            </td>
        </tr>
         <tr>
            <td>
                News Date
            </td>
            <td>
                <jsp:setProperty name="objDBConnection" property="strDate" value="${item.newsDate}"/>
                 <input type="text" name="txtNewsDate" value="${objDBConnection.convertToDate}"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update" />
            </td>

        </tr>
    </table>
    </c:forEach>
</form>
