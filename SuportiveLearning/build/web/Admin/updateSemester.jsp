<%-- 
    Document   : updateSemester
    Created on : Feb 18, 2012, 1:53:25 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="objManegementCourse" class="DAL.Admin.ManagementCourse" />
<form action="updateSemester.do" method="post">
    <table>
         <tr>
            <td>
                Course Name
            </td>
            <td>
                <select name="txtcourseId">
                    <option selected="true">---Select---</option>
                    <c:forEach var="item" items="${objManegementCourse.allCourse}">
                        <c:if test="${item.courseId==item2.courseId  }">
                            <option value="${item2.courseId}" selected="true">${item2.courseName}</option>
                        </c:if>
                        <c:if test="${item.courseId!=item2.courseId  }">
                            <option value="${item2.courseId}" >${item2.courseName}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </td>
        </tr>
         <tr>
            <td>
                Semester Name
            </td>
            <td>
                <input type="text" name="txtsemesterName" value="${item.semesterName}"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update" />
            </td>
        </tr>
    </table>
</form>
