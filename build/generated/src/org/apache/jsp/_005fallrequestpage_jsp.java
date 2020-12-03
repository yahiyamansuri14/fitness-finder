package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.StudioRequest;
import java.util.ArrayList;

public final class _005fallrequestpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>_AllRequestPage</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        <h1>All-Requests-By-Id</h1>\n");
      out.write("        \n");
      out.write("        <table border=\"2px solid black\">\n");
      out.write("            <tr>\n");
      out.write("                <th>RequestId</th>\n");
      out.write("                <th>view</th>\n");
      out.write("                <th>delete</th>\n");
      out.write("                <th>confirm</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 
                session=request.getSession(false);
                if(session!=null){
                ArrayList<StudioRequest> studioRequest=(ArrayList<StudioRequest>)session.getAttribute("studioRequests");
               for(StudioRequest sr:studioRequest){
            
      out.write("\n");
      out.write("            \n");
      out.write("            <!-- Arranging Data in tabular format-->\n");
      out.write("            <tr>\n");
      out.write("                <th>");
      out.print(sr.getRequest_id());
      out.write("</th>\n");
      out.write("                <th><a href=\"RequestInDetail?id=");
      out.print(sr.getRequest_id());
      out.write("\">view</a></th>\n");
      out.write("                <th>delete</th>\n");
      out.write("                <th>confirm</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
  }
            }else{
                    out.println("session is destroyed");
                }
            
      out.write("\n");
      out.write("                \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    \n");
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
