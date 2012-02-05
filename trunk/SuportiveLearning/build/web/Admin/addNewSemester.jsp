<%-- 
    Document   : addNewSemester
    Created on : Feb 5, 2012, 5:05:36 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewSemester.do" method="post">
    <table>
        <tr>
            <td>
                ID
            </td>
            <td>
                <html:text property="txtSemesterID" value="" />
            </td>
        </tr>
        <tr>
            <td>
                ID
            </td>
            <td>
                <html:text property="txtSemesterName" value="" />
            </td>
        </tr>
        <tr>
            <td>
                ID
            </td>
            <td>
                <html:text property="txtSemesterDate" value="" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>
