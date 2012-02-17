<%-- 
    Document   : detailAssigment
    Created on : Feb 10, 2012, 6:57:37 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header2">Detail Assignment</div>
<jsp:useBean id="objManagementAssignment" class="DAL.Staff.ManagementAssigment"/>
<jsp:setProperty name="objManagementAssignment" property="assigmentId" value="${param.assignmentId}"/>
<jsp:useBean id="objDB" class="Model.DBConnection"/>
<jsp:useBean id="objDB2" class="Model.DBConnection"/>
<form action="" method="post">
    <c:forEach var="item" items="${objManagementAssignment.asssignmentById}">
        <table>
            <tr>
                <td>Assignment Name :</td>
                <td><input type="text" value="${item.assignmentName}"</td>
            </tr>
            <tr>
                <td>Description :</td>
                <td><input type="text" value="${item.descriptions}"</td>
            </tr>
            <tr>
                <td>Start Date :</td>
                <td>
                    <jsp:setProperty name="objDB" property="strDate" value="${item.assignmentStartDate}"/>
                    <input type="text" value="${objDB.convertToDate}"/>
                </td>
            </tr>
            <tr>
                <td>End Date :</td>
                <td>
                    <jsp:setProperty name="objDB2" property="strDate" value="${item.assignmentEndDate}"/>
                    <input type="text" value="${objDB2.convertToDate}"/>
                </td>
            </tr>
            <tr>
                <td>Assignment File</td>
                <td>${item.assignmentFile}</td>
            </tr>
            <tr>
                <td>
                    Update Another File
                </td>
                <td>
                    <input type="file" name="fileUp" accept="text"  />
                </td>
            </tr>
            <tr>
                <td>&zwj;</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update"/></td>
            </tr>
        </table>
    </c:forEach>
</form>