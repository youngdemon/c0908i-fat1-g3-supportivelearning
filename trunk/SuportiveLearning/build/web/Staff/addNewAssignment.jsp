<%-- 
    Document   : addNewAssigment
    Created on : Feb 8, 2012, 9:38:19 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objBatch" class="DAL.Admin.ManagementBatch">
    <jsp:setProperty name="objBatch" property="batchId" value="${param.batchId}"/>
</jsp:useBean>
<jsp:useBean id="objSubjects" class="DAL.Admin.ManagementSubject">
    <jsp:setProperty name="objSubjects" value="${param.subjectId}" property="semesterId"></jsp:setProperty>
</jsp:useBean>
<div id="header2">Add New Assigment</div>
<form method="post" action="addNewAssignment.do" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Assigment Name</td>
            <td><input type="text" name="txtAssignmentName"/></td>
        </tr>
        <tr>
            <td>Subject Name</td>
            <td>
                ${objSubjects.subjectNameById}
                <input type="hidden" name="txtSubjectId" value="${param.subjectId}"/>
            </td>
        </tr>
        <tr>
            <td>Batch Name</td>
            <c:forEach var="item" items="${objBatch.batchById}">
                <td>
                    ${item.batchName}
                <input type="hidden" name="txtBatchId" value="${param.batchId}"/>
                </td>
            </c:forEach>
        </tr>
        <tr>
            <td>File</td>
            <td><input type="file" name="fileUp" title="Chọn file assigment txt"/></td>
        </tr>
        <tr>
            <td>Description</td>
            <td>
                <textarea name="txaDescription">
                </textarea>
            </td>
        </tr>
        <tr>
            <td>Start Date</td>
            <td><input type="text" id="datepicker" name="txtStartDate"/></td>
        </tr>

        <tr>
            <td>End Date</td>
            <td><input type="text" id="datepicker2" name="txtEndDate"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Add New"/></td>
        </tr>

    </table>

</form>