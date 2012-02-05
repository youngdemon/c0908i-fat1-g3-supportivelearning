<%-- 
    Document   : addNewStaffAndBatch
    Created on : Feb 5, 2012, 5:39:51 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewStaffAndBatch.do" method="post">
    <table>
        <tr>
            <td>
                SABId
            </td>
            <td>
                <html:text property="txtStaffAndBatchId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                StaffId
            </td>
            <td>
                <html:text property="txtStaffId" value="" />
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
