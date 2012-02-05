<%-- 
    Document   : login
    Created on : Feb 5, 2012, 3:42:46 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${not empty requestScope.user}">
<form action="" method="post">
<table>
    <tr>
        <td>
            Username :
        </td>
        <td><input type="text" name="username"  size="10"/></td>
    </tr>
    <tr>
        <td>
            Password :
        </td>
        <td><input type="text" name="password"  size="10"/></td>
    </tr>
    <tr>
        <td><input type="button" value="submit"/></td>
    </tr>
</table>
</form>
</c:if>
<c:if test="${empty requestScope.user}">
    <table>
        <tr>
            <td>
                Hi !
            </td>
        </tr>
        <tr>
            <td>
                <a href="#">Logout</a>
            </td>
        </tr>
    </table>
</c:if>