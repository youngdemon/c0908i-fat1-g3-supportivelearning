<%-- 
    Document   : addNewCourse
    Created on : Feb 5, 2012, 10:13:58 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewCourse.do" method="post">
    <table>
        <tr>
            <td>
                CourseId
            </td>
            <td>
                <html:text property="txtCourseId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                CourseName
            </td>
            <td>
                <html:text property="txtCourseName" value="" />
            </td>
        </tr>
         <tr>
            <td>
                DateStart
            </td>
            <td>
                <html:text property="txtDateStart" value="" />
            </td>
        </tr>
         <tr>
            <td>
                DateEnd
            </td>
            <td>
                <html:text property="txtDateEnd" value="" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>

