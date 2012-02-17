<%-- 
    Document   : updateMark
    Created on : Feb 2, 2012, 9:22:55 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="header2">Update Mark Assignment</div>
<form action="updateMark.do" method="post">
    <table width="100%" align="center">
        <tr>
            <td>Mark</td>
            <td>
                <input type="text" name="txtMarkAssignment"/>
                <input type="hidden" name="assignmentId" value="${param.assignmentId}"/>
                <input type="hidden" name="txtMarkAssignmentId" value="${param.markAssignmentId}"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update"/></td>
        </tr>

    </table>
</form>