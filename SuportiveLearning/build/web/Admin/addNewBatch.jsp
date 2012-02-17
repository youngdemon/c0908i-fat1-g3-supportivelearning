<%-- 
    Document   : addNewBatch
    Created on : Feb 6, 2012, 5:41:05 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objManegementSemester" class="DAL.Admin.ManagementSemester" />
<jsp:useBean id="objManegementStaff" class="DAL.Admin.ManagementStaff" />
<form action="addNewBatch.do" method="post">
    <table>
        <tr>
            <td>
                Batch Name
            </td>
            <td>
                <input type="text" name="txtBatchName"/>
            </td>
        </tr>
         <tr>
            <td>
                StaffId
            </td>
            <td>
                <select name="txtStaffId">
                    <option selected="true">---Select---</option>
                    <c:forEach var="item" items="${objManegementStaff.allStaff}">
                        <option value="${item.staffId}">${item.staffId}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
         <tr>
            <td>
                Start Date
            </td>
            <td>
                <input type="text" name="txtStartDate" id="datepicker" />
            </td>
        </tr>
         <tr>
            <td>
                Semester Name
            </td>
            <td>
                <select name="txtsemesterId">
                    <option selected="true">---Select---</option>
                    <c:forEach var="item" items="${objManegementSemester.allSemester}">
                        <option value="${item.semesterId}">${item.semesterName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>