<%-- 
    Document   : menuRight
    Created on : Feb 5, 2012, 9:21:34 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<div id="header">Main Menu</div>
<c:if test="${not empty user}">
<div id="header">Navigation</div>
</c:if>
