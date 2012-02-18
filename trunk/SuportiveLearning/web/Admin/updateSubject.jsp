<%-- 
    Document   : updateSubject
    Created on : Feb 18, 2012, 1:53:21 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="objManegementSubject" class="DAL.Admin.ManagementSubject" />
<jsp:useBean id="objManegementSemester" class="DAL.Admin.ManagementSemester" />
<jsp:setProperty name="objManegementSubject" property="subjectId" value="${param.subjectId}" />
<form action="updateSubject.do" method="post">
    <c:forEach var="item" items="${objManegementSubject.subjectById}" >
    <table>
        <tr>
            <td>
                Semester ID
                <input type="hidden" name="txtsubjectId" value="${item.subjectId}"/>
            </td>
            <td>
                <select name="txtsemesterId">
                    <c:forEach var="item2" items="${objManegementSemester.allSemester}">
                        <c:if test="${item.semesterId==item2.semesterId  }">
                            <option value="${item2.semesterId}" selected="true">${item2.semesterName}</option>
                        </c:if>
                        <c:if test="${item.semesterId!=item2.semesterId  }">
                            <option value="${item2.semesterId}" >${item2.semesterName}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                Subject Name
            </td>
            <td>
                <input type="text" name="txtsubjectName" value="${item.subjectName}"/>
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
