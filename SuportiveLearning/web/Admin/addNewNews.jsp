<%-- 
    Document   : addNewNews
    Created on : Feb 17, 2012, 9:29:05 PM
    Author     : Ncuong
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form action="addNewNews.do" method="post">
    <table>
        <tr>
            <td>
                Title
            </td>
            <td>
                <input type="text" name="txtTitle"/>
            </td>
        </tr>
         <tr>
            <td>
                News
            </td>
            <td>
                <input type="text" name="txtNews" />
            </td>
        </tr>
         <tr>
            <td>
                Images
            </td>
             <td>
                <input type="text" name="txtImages" />
            </td>
         </tr>
         <tr>
            <td>
                News Date
            </td>
            <td>
                <input type="text" name="txtNewsDate" id="datepicker" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add New" />
            </td>

        </tr>
    </table>
</form>

