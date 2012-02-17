<%-- 
    Document   : addNewSemester
    Created on : Feb 17, 2012, 6:12:50 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManegementCourse" class="DAL.Admin.ManagementCourse" />

<form action="addNewSemester.do" method="post">
    <table>
         <tr>
            <td>
                Course Name
            </td>
            <td>
                <select name="txtcourseId">
                    <option selected="true">---Select---</option>
                    <c:forEach var="item" items="${objManegementCourse.allCourse}">
                        <option value="${item.courseId}">${item.courseName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
         <tr>
            <td>
                Semester Name
            </td>
            <td>
                <input type="text" name="txtsemesterName"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>