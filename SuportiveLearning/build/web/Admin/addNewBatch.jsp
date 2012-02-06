<%-- 
    Document   : addNewBatch
    Created on : Feb 6, 2012, 5:41:05 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewBatch.do" method="post">
    <table>
        <tr>
            <td>
                BatchId
            </td>
            <td>
                <html:text property="txtBatchId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                BatchName
            </td>
            <td>
                <html:text property="txtBatchName" value="" />
            </td>
        </tr>
        <tr>
            <td>
                StartDate
            </td>
            <td>
                <html:text property="txtStartDate" value="" />
            </td>
        </tr>
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
                SemesterId
            </td>
            <td>
                <html:text property="txtSemesterId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>
