[<%-- 
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
        <link type="text/css" href="CSS/smoothness/jquery-ui-1.8.17.custom.css" rel="stylesheet" />
        <link type="text/css" href="CSS/Style.css" rel="stylesheet" />
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.17.custom.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $('#datepicker').datepicker({
                });
                $('#datepicker2').datepicker({
                });
                $('#datepicker2').datepicker("option", "dateFormat",'dd/mm/yy');
                $('#datepicker').datepicker("option", "dateFormat",'dd/mm/yy');

            });
        </script>
    </head>
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
                            <li><a href="Staff/listBatch.jsp"">Sample Menu</a></li>
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
                <jsp:include page="Admin/menuLeft.jsp" />
            </div>
            <div id="LayerMain">
                <c:if test="${not empty requestScope.action}">
                    <c:if test="${requestScope.action=='mngStaff'}">
                        <jsp:include page="Admin/addNewStaff.jsp" />
                    </c:if>
                    <c:if test="${requestScope.action=='mngStudent'}">
                        <jsp:include page="Admin/addNewStudent.jsp" />
                    </c:if>

                    <c:if test="${requestScope.action=='listBatch'}">
                        <jsp:include page="Staff/listBatch.jsp" />
                    </c:if>
                    <c:if test="${requestScope.action=='listBatchMarkAssignment'}">
                        <jsp:include page="Admin/listBatchMarkAssignment.jsp" />
                    </c:if>
                    <c:if test="${requestScope.action=='mngAssigmentStaff'}">
                        <jsp:include page="Staff/listAssignmentForStaff.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='listSubjectBySemID'}">
                        <jsp:include page="Admin/listSubjectBySemesterID.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='listSubjectForStaff'}">
                        <jsp:include page="Admin/listSubjectBySemForStaff.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='listSubjectMarkAssignment'}">
                        <jsp:include page="Admin/listSubjectMarkAssignment.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='mngAssigmentStudent'}">
                        <jsp:include page="Staff/listAssignment.jsp"/>
                    </c:if>

                    <c:if test="${requestScope.action=='listMarkAssignment'}">
                        <jsp:include page="Staff/listMarkAssignment.jsp"/>
                    </c:if>

                    <c:if test="${requestScope.action=='updateMarkAssignment'}">
                        <jsp:include page="Staff/updateMark.jsp"/>
                    </c:if>

                    <c:if test="${requestScope.action=='listAssignmentMarkAssignment'}">
                        <jsp:include page="Staff/listAssignmentMarkAssignment.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='addNewAssignment'}">
                        <jsp:include page="Staff/addNewAssignment.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='detailAssignment'}">
                        <jsp:include page="Staff/detailAssigment.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='submitAssignment'}">
                        <jsp:include page="Student/submitAssignment.jsp"/>
                    </c:if>

                    <c:if test="${requestScope.action=='listCourse'}">
                        <jsp:include page="Admin/listCourse.jsp"/>
                    </c:if>

                     <c:if test="${requestScope.action=='listSubjectAdmin'}">
                        <jsp:include page="Admin/listSubject.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='addSubject'}">
                        <jsp:include page="Admin/addNewSubject.jsp"/>
                    </c:if>

                    <c:if test="${requestScope.action=='listSemester'}">
                        <jsp:include page="Admin/listSemester.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='listBatchAdmin'}">
                        <jsp:include page="Admin/listBatch.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='addBatch'}">
                        <jsp:include page="Admin/addNewBatch.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='updateBatch'}">
                        <jsp:include page="Admin/updateBatch.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='updateSubject'}">
                        <jsp:include page="Admin/updateSubject.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='addSemester'}">
                        <jsp:include page="Admin/addNewSemester.jsp"/>
                    </c:if>

                    <c:if test="${requestScope.action=='addCourse'}">
                        <jsp:include page="Admin/addNewCourse.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='listNews'}">
                        <jsp:include page="Admin/listNews.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='addNews'}">
                        <jsp:include page="Admin/addNewNews.jsp"/>
                    </c:if>
                     <c:if test="${requestScope.action=='updateNews'}">
                        <jsp:include page="Admin/updateNews.jsp"/>
                    </c:if>
                     <c:if test="${requestScope.action=='listFAQ'}">
                        <jsp:include page="Admin/listFAQ.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='addFAQ'}">
                        <jsp:include page="Admin/addNewFAQ.jsp"/>
                    </c:if>
                    <c:if test="${requestScope.action=='updateFAQ'}">
                        <jsp:include page="Admin/updateFAQ.jsp"/>
                    </c:if>
                </c:if>
                     <c:if test="${requestScope.mess=='addSuccess'}">
                        <jsp:include page="Admin/addSuccess.jsp"/>
                    </c:if>
            </div>
            <div id="LayerRight">
                <jsp:include page="Admin/login.jsp" />
                
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
