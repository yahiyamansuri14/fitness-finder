package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testdesign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\"> \n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Allerta+Stencil\">\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\t*{font-family: \"Allerta Stencil\", Sans-serif;margin:0px;}`\n");
      out.write("\t\t\t.w3-allerta {font-family: \"Allerta Stencil\", Sans-serif;}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#data-container{display:inline-flex;height:30%;}\n");
      out.write("\t\t\t#img-container{height:100%;width:25%;}\n");
      out.write("\t\t\t#text-container{height:100%;width:75%;border:2px solid black;}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#upper-text-container{height:40%;border:2px solid black;}\n");
      out.write("\t\t\t#middle-text-container{height:20%;border:2px solid black;}\n");
      out.write("\t\t\t#lower-text-container{height:40%;border:2px solid black;}\n");
      out.write("\t\t\t<!--.w3-panel{padding-top:16px;padding-bottom:16px;}-->\n");
      out.write("\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"w3-container w3-mobile w3-border\"><!-- Main Container-->\n");
      out.write("\t\t\t<div class=\"w3-container w3-mobile w3-border\" style=\"height:10%;\"><!-- Header Container-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3-container w3-mobile w3-border w3-row w3-card-4\"style=\"height:100%;\"><!-- Middle Container-->\n");
      out.write("\t\t\t\t<div class=\"w3-mobile w3-col w3-border\" style=\"width:20%;height:100%\"><!-- Left-Middle-Container -->\n");
      out.write("\t\t\t\t\t<p>LeftMiddleContainer</p>\n");
      out.write("\t\t\t\t</div><!-- End-Of-Left-Middle-Container -->\n");
      out.write("\t\t\t\t<div class=\"w3-mobile w3-col w3-border w3-panel\t\" style=\"width:60%;height:100%\"><!-- Center-Middle-Container -->\n");
      out.write("\t\t\t\t\t<div class=\"w3-mobile w3-panel w3-border\" style=\"height:10%;\"><!-- post-division-->\n");
      out.write("\t\t\t\t\t\tSearch Within <a href=\"#\">2Km...&nbsp &nbsp &nbsp </a><a href=\"#\">5Km...</a>\n");
      out.write("\t\t\t\t\t</div><!--End-Of-Post-Division -->\n");
      out.write("\t\t\t\t\t<!-- List show container-->\n");
      out.write("\t\t\t\t\t<div class=\"w3-mobile w3-border w3-large w3-panel\"  id=\"data-container\">\n");
      out.write("\t\t\t\t\t\t<!-- Studio Result Show Container-->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3-mobile w3-border w3-large\" id=\"img-container\" >\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"image.png\" class=\"w3-image w3-round\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3-mobile w3-border\" id=\"text-container\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3-mobile \" id=\"upper-text-container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Yahiya Mansuri</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3-mobile\" id=\"middle-text-container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Yahiya Mansuri</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3-mobile\" id=\"lower-text-container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Yahiya Mansuri</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<!-- End Of Studio Result Show Container-->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- end of list show container--> \n");
      out.write("\t\t\t\t</div><!-- End-Of-Center-Middle-Container -->\n");
      out.write("\t\t\t\t<div class=\"w3-mobile w3-col w3-border\" style=\"width:20%;height:100%\"><!-- Right-Middle-Container-->\n");
      out.write("\t\t\t\t\t<p>RightMiddleContainer</p>\n");
      out.write("\t\t\t\t</div><!-- End-Of-Right-Middle-Container-->\n");
      out.write("\t\t\t</div><!-- End-Of-Middle-Container -->\n");
      out.write("\t\t</div><!-- End-Of-Main-Container-->\n");
      out.write("\t</body>\n");
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
