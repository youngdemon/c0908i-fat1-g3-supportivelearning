<%-- 
    Document   : Home
    Created on : Feb 5, 2012, 2:58:36 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head><link href="CSS/Style.css"  rel="stylesheet" type="text/css" />
    <body>
        <div id="LayerBody">
            <div id="LayerMenu">
                <ul class="menu">
	<li class="top"><a href="#" class="top_link"><span>Home</span></a></li>
	<li class="top"><a href="#" class="top_link"><span>Course</span></a>
		<ul class="sub">
			<li><a href="#">Sample Menu This is some longer text</a></li>
			<li><a href="#">Sample Menu</a></li>
            <li><a href="#">Sample Menu</a></li>
            <li><a href="#">Sample Menu</a></li>
            <li><a href="#">Sample Menu</a></li>
		</ul>
	</li>
	<li class="top"><a href="#" class="top_link"><span>Mark View</span></a>
		<ul class="sub">
			<li><a href="#">Sample Menu This is some longer text</a></li>
            <li><a href="#">Sample Menu</a></li>
            <li><a href="#">Sample Menu</a></li>
            <li><a href="#">Sample Menu</a></li>
		</ul>
	</li>
	<li class="top"><a href="#" class="top_link"><span>Site News</span></a></li>
	<li class="top"><a href="#" class="top_link"><span>FAQS</span></a></li>
</ul>

            </div>
            <div id="LayerLeft">
            </div>


            <div id="LayerMain">
                <jsp:include page="Admin/addNewSemester.jsp"></jsp:include>
                <jsp:include page="Admin/addNewStaffAndBatch.jsp"></jsp:include>
            </div>

            <div id="LayerRight">
                
            </div>
            <div id="LayerFooter">
                <center>
                    <strong><strong><a href="index.asp">Trang Chá»§</a>|<a href="index.asp">Tuyá»ƒn Dá»¥ng </a>|<a href="index.asp">LiÃªn Há»‡</a></strong> | <a href="admin/dangnhap.asp">Äiá»u HÃ nh
                        </a></strong>
                </center>



            </div>
            <div id="LayerBanner"></div>
            <div id="LayerLogo"></div>
        </div>


    </body>

</html>
