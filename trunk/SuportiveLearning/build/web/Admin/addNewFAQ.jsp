<%--
    Document   : addNewFAQ
    Created on : Feb 17, 2012, 9:29:05 PM
    Author     : Ncuong
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="addNewFAQ.do" method="post">
    <table>        
         <tr>
            <td>
                Answer
            </td>
            <td>
                <input type="text" name="txtAnswer" />
            </td>
        </tr>
         <tr>
            <td>
                Question
            </td>
             <td>
                <input type="text" name="txtQuestion" />
            </td>
         </tr>
         <tr>
            <td>
                FAQ Date
            </td>
            <td>
                <input type="text" name="txtFAQDate" id="datepicker" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>

