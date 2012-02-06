<%-- 
    Document   : addNewChangeLeaning
    Created on : Feb 6, 2012, 6:46:28 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewChangeLeaning.do" method="post">
    <table>
        <tr>
            <td>
                ChangeLeaningId
            </td>
            <td>
                <html:text property="txtChangeLeaningId" value="" />
            </td>
        </tr>
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
                BatchId
            </td>
            <td>
                <html:text property="txtBatchId" value="" />
            </td>
        </tr>
         <tr>
            <td>
                Reason
            </td>
            <td>
                <html:text property="txtReason" value="" />
            </td>
        </tr>
        <tr>
            <td>
                DateChange
            </td>
            <td>
                <html:text property="txtDateChange" value="" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>