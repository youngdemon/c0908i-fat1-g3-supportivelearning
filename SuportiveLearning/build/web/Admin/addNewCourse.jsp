<%-- 
    Document   : addNewCourse
    Created on : Feb 5, 2012, 10:13:58 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="addNewCourse.do" method="post">
    <table>
        <tr>
            <td>
                Course Name
            </td>
            <td>
                <input type="text" name="txtCourseName"/>
            </td>
        </tr>
         <tr>
            <td>
                Date Start
            </td>
            <td>
                <input type="text" name="txtDateStart" id="datepicker" />
            </td>
        </tr>
         <tr>
            <td>
                DateEnd
            </td>
            <td>
                <input type="text" name="txtDateEnd" id="datepicker2" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>

