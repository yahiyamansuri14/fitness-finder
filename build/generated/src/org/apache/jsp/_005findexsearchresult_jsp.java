package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import entity.Studio;

public final class _005findexsearchresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Allerta+Stencil\">\n");
      out.write("        <style>\n");
      out.write("            *{font-family: \"Allerta Stencil\", Sans-serif;margin:0px;}`\n");
      out.write("            .w3-allerta {font-family: \"Allerta Stencil\", Sans-serif;}\n");
      out.write("            #main-container{display:inline-flex;width:100%;height:100%;}\n");
      out.write("            #left-container{width:20%;}\n");
      out.write("            #middle-container{width:60%;}\n");
      out.write("            #right-container{width:20%;}\n");
      out.write("            #distance-container{heigth:20%;width:100%;}\n");
      out.write("            #data-container{display:inline-flex;height:30%;width:100%;}\n");
      out.write("            #img-container{height:100%;width:25%;}\n");
      out.write("            #text-container{height:100%;width:75%;border:2px solid black;display:block;}\n");
      out.write("\n");
      out.write("            #upper-text-container{height:40%;border:2px solid black;}\n");
      out.write("            #middle-text-container{height:20%;border:2px solid black;}\n");
      out.write("            #lower-text-container{height:40%;border:2px solid black;}\n");
      out.write("            <!--.w3-panel{padding-top:16px;padding-bottom:16px;}-->\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"w3-mobile w3-container w3-border\" id=\"main-container\">\n");
      out.write("            <div class=\"w3-mobile w3-border w3-panel\" id=\"left-container\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-mobile w3-border w3-panel\" id=\"middle-container\">\n");
      out.write("                <div class=\"w3-mobile w3-border w3-panel\" id=\"distance-container\">\n");
      out.write("                    Search within <a href=\"#\">2Km...</a><a href=\"#\">5Km...</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-mobile w3-border\" id=\"data-container\">\n");
      out.write("                    <div class=\"w3-mobile w3-border\" id=\"img-container\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-mobile w3-border\" id=\"text-container\">\n");
      out.write("                        <div class=\"w3-mobile w3-border\" id=\"upper-text-container\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-mobile w3-border\" id=\"middle-text-container\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-mobile w3-border\" id=\"lower-text-container\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-mobile w3-border w3-panel\" id=\"right-container\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
