<%-- 
    Document   : updateSemester
    Created on : Feb 18, 2012, 1:53:25 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="objManagementSemester" class="DAL.Admin.ManagementSemester"/>
<jsp:useBean id="objManegementCourse" class="DAL.Admin.ManagementCourse" />
<jsp:setProperty name="objManagementSemester" property="semesterId" value="${param.semesterId}"/>
<form action="updateSemester.do" method="post">
    <c:forEach var="item" items="${objManagementSemester.semesterById}">
    <table>
         <tr>
             <tr>
            <td>
                Course Name
            </td>
            <td>
                <select name="txtcourseId">
                    <c:forEach var="item2" items="${objManegementCourse.allCourse}">
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
                <input type="text" name="txtsemesterName"  value="${item.semesterName}"/>
                <input type="hidden" name="txtsemesterId" value="${item.semesterId}"/>
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