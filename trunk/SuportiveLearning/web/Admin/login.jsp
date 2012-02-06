<%-- 
    Document   : login
    Created on : Feb 5, 2012, 3:42:46 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty user}">
<div id="header">Login Form</div>
    <form action="Login.do" method="post">

<table>
    <tr>
        <td>
            Username :
        </td>
        <td><html:text property="txtUserName" value="" size="10" /></td>
    </tr>
    <tr>
        <td>
            Password :
        </td>
        <td><html:text property="txtPassword" value="" size="10" /></td>
    </tr>
    <tr>
        <td><html:submit value="Login"/></td>
    </tr>
</table>
</form>
</c:if>
<c:if test="${not empty user}">
    <div id="header">Welcome</div>
    <table>
        <tr>
            <td>
                Hi ! ${user}
            </td>
        </tr>
        <tr>
            <td>
                <a href="#">Logout</a>
            </td>
        </tr>
    </table>
</c:if>