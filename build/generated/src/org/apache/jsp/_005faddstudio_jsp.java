package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005faddstudio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Add-Studio-Form</h1>\n");
      out.write("        <form action=\"AddStudio\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <pre>\n");
      out.write("                Enter Owner Id::<input type=\"text\" name=\"owner_id\"/>\n");
      out.write("                Enter Studio Name::<input type=\"text\" name=\"s_name\"/>\n");
      out.write("                Enter Address::<input type=\"text\" name=\"s_address\"/>\n");
      out.write("                Enter State::<input type=\"text\" name=\"s_state\"/>\n");
      out.write("                Enter City::<input type=\"text\" name=\"s_city\"/>\n");
      out.write("                Enter Contact::<input type=\"text\" name=\"s_contact\"/>\n");
      out.write("                Enter Workout available::<input type=\"text\" name=\"workout_avail\"/>\n");
      out.write("                Enter Amenities::<input type=\"text\" name=\"amenities\"/>\n");
      out.write("                Enter HotLocation::<input type=\"text\" name=\"s_hotlocation\"/>\n");
      out.write("                Enter Distance HotLocation::<input type=\"text\" name=\"distance_hotlocation\"/>\n");
      out.write("                Select Category::<select name=\"category\">\n");
      out.write("                                        <option value=\"gym\">GYM</option>\n");
      out.write("                                        <option value=\"yoga\">YOGA</option>\n");
      out.write("                                        <option value=\"zumba\">ZUMBA</option>\n");
      out.write("                                        <option value=\"crossfunctional\">CROSS-FUNCTIONAL-TRAINING</option>\n");
      out.write("                                        <option value=\"dance\">DANCE</option>\n");
      out.write("                                        <option value=\"aqua\">AQUA</option>\n");
      out.write("                                 </select>\n");
      out.write("                Add Images::<input type=\"file\" name=\"image\"/>\n");
      out.write("                <input type=\"submit\" value=\"Save\"/>\n");
      out.write("            </pre>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
