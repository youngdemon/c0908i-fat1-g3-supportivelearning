<%-- 
    Document   : addNewSubject
    Created on : Feb 5, 2012, 8:56:18 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<form action="addNewSubject.do" method="post">
    <table>
        <tr>
            <td>
                SubjectId
            </td>
            <td>
                <html:text property="txtSubjectId" value="" />
            </td>
        </tr>
        <tr>
            <td>
                SubjectName
            </td>
            <td>
                <html:text property="txtSubjectName" value="" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>