<%-- 
    Document   : addNewStaff
    Created on : Feb 5, 2012, 9:11:17 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewStaff.do" method="post">
    <table>
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
                AccountId
            </td>
            <td>
                <html:text property="txtAccountId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>
