<%-- 
    Document   : addNewSubject
    Created on : Feb 5, 2012, 8:56:18 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="objManegementSemester" class="DAL.Admin.ManagementSemester" />

<form action="addNewSubject.do" method="post">
    <table>
        <tr>
            <td>
                Semester ID
            </td>
            <td>
                <select name="txtsemesterId">
                    <option selected="true">---Select---</option>
                    <c:forEach var="item" items="${objManegementSemester.allSemester}">
                        <option value="${item.semesterId}">${item.semesterId}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                Subject Name
            </td>
            <td>
                <input type="text" name="txtsubjectName"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>