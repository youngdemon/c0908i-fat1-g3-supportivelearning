package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head><link href=\"CSS/Style.css\"  rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <body>\n");
      out.write("        <div id=\"LayerBody\">\n");
      out.write("            <div id=\"LayerMenu\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("\t<li class=\"top\"><a href=\"#\" class=\"top_link\"><span>Home</span></a></li>\n");
      out.write("\t<li class=\"top\"><a href=\"#\" class=\"top_link\"><span>Course</span></a>\n");
      out.write("\t\t<ul class=\"sub\">\n");
      out.write("\t\t\t<li><a href=\"#\">Sample Menu This is some longer text</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Sample Menu</a></li>\n");
      out.write("            <li><a href=\"#\">Sample Menu</a></li>\n");
      out.write("            <li><a href=\"#\">Sample Menu</a></li>\n");
      out.write("            <li><a href=\"#\">Sample Menu</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"top\"><a href=\"#\" class=\"top_link\"><span>Mark View</span></a>\n");
      out.write("\t\t<ul class=\"sub\">\n");
      out.write("\t\t\t<li><a href=\"#\">Sample Menu This is some longer text</a></li>\n");
      out.write("            <li><a href=\"#\">Sample Menu</a></li>\n");
      out.write("            <li><a href=\"#\">Sample Menu</a></li>\n");
      out.write("            <li><a href=\"#\">Sample Menu</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</li>\n");
      out.write("\t<li class=\"top\"><a href=\"#\" class=\"top_link\"><span>Site News</span></a></li>\n");
      out.write("\t<li class=\"top\"><a href=\"#\" class=\"top_link\"><span>FAQS</span></a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"LayerLeft\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"LayerMain\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin/addNewSemester.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin/addNewStaffAndBatch.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin/addNewStudent.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin/addNewSubject.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin/addNewFAQ.jsp", out, false);
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin/addNewStaff.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"LayerRight\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"LayerFooter\">\n");
      out.write("                <center>\n");
      out.write("                    <strong><strong><a href=\"index.asp\">Trang Chá»§</a>|<a href=\"index.asp\">Tuyá»ƒn Dá»¥ng </a>|<a href=\"index.asp\">LiÃªn Há»‡</a></strong> | <a href=\"admin/dangnhap.asp\">Äiá»u HÃ nh\n");
      out.write("                        </a></strong>\n");
      out.write("                </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"LayerBanner\"></div>\n");
      out.write("            <div id=\"LayerLogo\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
