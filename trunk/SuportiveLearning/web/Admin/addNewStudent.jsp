<%-- 
    Document   : addNewStudent
    Created on : Feb 5, 2012, 8:40:10 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewStudent.do" method="post">
    <table>
        <tr>
            <td>
                StudentId
            </td>
            <td>
                <html:text property="txtStudentId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                AccountId
            </td>
            <td>
                <html:text property="txtAccountId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                RollNumber
            </td>
            <td>
                <html:text property="txtRollNumber" value="" />
            </td>
        </tr>
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
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>