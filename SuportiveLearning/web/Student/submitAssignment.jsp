<%-- 
    Document   : submitAssignment
    Created on : Feb 28, 2012, 1:45:31 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header2">Submit Assignment</div>
<jsp:useBean id="objMarkAssignment" class="DAL.Staff.ManagementMarkAssignment">
</jsp:useBean>
<jsp:setProperty name="objMarkAssignment" property="studentId" value="${studentId}"/>
<jsp:setProperty name="objMarkAssignment" property="assignmentId" value="${param.assignmentId}" />
<c:if test="${not empty objMarkAssignment.markAssignmentByStudentId}">
    <form action="changeFileMarkAssignment.do" method="post" enctype="multipart/form-data">
        <table border="1" width="100%">
            <tr>
                <c:forEach var="item" items="${objMarkAssignment.markAssignmentByStudentId}">
                    <td width="100px">File Submited</td>
                    <td>
                        <a href="Student_Assignment_Upload/${item.fileUpload}">${item.fileUpload}</a>
                        <input type="hidden" name="markAssignmentId" value="${item.markAssignmentId}"/>
                    </td>
                </c:forEach>
            </tr>
            <tr>
                <td>Change File</td>
                <td>
                    <input type="file" name="changeFile" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Change"/></td>                
            </tr>
        </table>
    </form>
</c:if>
<c:if test="${empty objMarkAssignment.markAssignmentByStudentId}">
    <form action="submitAssignment.do" method="post" enctype="multipart/form-data">
        <table width="100%">
            <tr>
                <td>File Upload</td>
                <td>
                    <input type="file" name="fileUp"/>
                    <input type="hidden" name="assignmentId" value="${param.assignmentId}"/>
                    <input type="hidden" name="studentId" value="${studentId}"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form>
</c:if>