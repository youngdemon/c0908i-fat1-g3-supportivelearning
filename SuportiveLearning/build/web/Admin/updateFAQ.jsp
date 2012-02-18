<%-- 
    Document   : updateFAQ
    Created on : Feb 18, 2012, 2:38:31 PM
    Author     : Ncuong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="objManagementFAQ" class="DAL.Admin.ManagementFAQ"/>
<jsp:setProperty name="objManagementFAQ" property="fAQId" value="${param.fAQId}"/>
<jsp:useBean id="objDBConnection" class="Model.DBConnection"/>
<form action="updateFAQs.do" method="post">
    <c:forEach var="item" items="${objManagementFAQ.allFAQById}">
    <table>
        <tr>
            <td>
                Answer
            </td>
            <td>
                <input type="text" name="txtAnswer" value="${item.answer}"/>
                <input type="hidden" name="txtFAQId" value="${item.fAQId}"/>
            </td>
        </tr>
        <tr>
            <td>
                Question
            </td>
            <td>
                <input type="text" name="txtQuestion" value="${item.question}"/>
            </td>
        </tr>
        <tr>
            <td>
                FAQ Date
            </td>
            <td>
            <jsp:setProperty name="objDBConnection" property="strDate" value="${item.fAQDate}"/>
            <input type="text" name="txtFAQDate" value="${objDBConnection.convertToDate}"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" name="Update "/>
            </td>
        </tr>
    </table>
    </c:forEach>
</form>