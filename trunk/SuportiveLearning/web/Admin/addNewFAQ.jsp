<%-- 
    Document   : addNewFAQ
    Created on : Feb 5, 2012, 9:26:42 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewFAQ.do" method="post">
    <table>
        <tr>
            <td>
                FAQId
            </td>
            <td>
                <html:text property="txtFAQId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                Question
            </td>
            <td>
                <html:text property="txtQuestion" value="" />
            </td>
        </tr>
         <tr>
            <td>
                Answer
            </td>
            <td>
                <html:text property="txtAnswer" value="" />
            </td>
        </tr>
         <tr>
            <td>
                FAQDate
            </td>
            <td>
                <html:text property="txtFAQDate" value="" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>
