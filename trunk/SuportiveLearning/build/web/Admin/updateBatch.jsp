<%-- 
    Document   : updateBatch
    Created on : Feb 18, 2012, 12:44:05 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="objManagementBatch" class="DAL.Admin.ManagementBatch"/>
<jsp:useBean id="objManegementSemester" class="DAL.Admin.ManagementSemester" />
<jsp:useBean id="objManegementStaff" class="DAL.Admin.ManagementStaff" />
<jsp:setProperty name="objManagementBatch" property="batchId" value="${param.batchId}" />
<form action="updateBatch.do" method="post">
<c:forEach var="item" items="${objManagementBatch.batchById}">
    <table>
        <tr>
            <td>
                Batch Name
            </td>
            <td>
                <input type="text" name="txtBatchName" value="${item.batchName}"/>
                <input type="hidden" name="txtBatchId" value="${item.batchId}"/>
            </td>
        </tr>
         <tr>
            <td>
                StaffId
            </td>
            <td>
                <select name="txtStaffId">
                    <c:forEach var="item2" items="${objManegementStaff.allStaff}">
                        <c:if test="${item.staffId==item2.staffId  }">
                            <option value="${item2.staffId}" selected="true">${item2.staffId}</option>
                        </c:if>
                        <c:if test="${item.staffId!=item2.staffId  }">
                            <option value="${item2.staffId}" >${item2.staffId}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </td>
        </tr>
         <tr>
            <td>
                Start Date
            </td>
            <td>
                <input type="text" name="txtStartDate" value="${item.startDate}" />
            </td>
        </tr>
         <tr>
            <td>
                Semester Name
            </td>
            <td>
                <select name="txtsemesterId">
                    <c:forEach var="item2" items="${objManegementSemester.allSemester}">
                        <c:if test="${item.semesterId==item2.semesterId}">
                            <option value="${item2.semesterId}" selected="true">${item2.semesterName}</option>
                        </c:if>
                        <c:if test="${item.semesterId!=item2.semesterId}">
                        <option value="${item2.semesterId}">${item2.semesterName}</option>
                        </c:if>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update" />
            </td>

        </tr>
    </table>
    </c:forEach>
</form>
