<%--
    Document   : listSubjectBySemesterID
    Created on : Feb 10, 2012, 2:29:06 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objSubject" class="DAL.Admin.ManagementSubject">
    <jsp:setProperty name="objSubject" property="semesterId" value="${param.semesterId}"/>
</jsp:useBean>
<div id="header2">List Subjects</div>
<ol>
    <ul>
        <c:forEach var="item" items="${objSubject.subjectBySemesterId}">
            <li><a href="ListAssigment_Redirect.do?batchId=${param.batchId}&subjectId=${item.subjectId}">${item.subjectName}</a></li>
        </c:forEach>
    </ul>
</ol>