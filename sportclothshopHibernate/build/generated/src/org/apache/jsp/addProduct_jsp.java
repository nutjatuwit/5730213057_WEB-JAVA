package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;\n");
      out.write("              charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Add Product</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String message = request.getParameter("message");
            if (message != null) {
                out.println(message);
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <form name=\"formAddProduct\" action=\"AddProductController\">\n");
      out.write("            Team: <input type=\"text\" name=\"PTeam\" value=\"\" />\n");
      out.write("            Size: <input type=\"text\" name=\"PSize\" value=\"\" />\n");
      out.write("            Color: <input type=\"text\" name=\"PColor\" value=\"\" />\n");
      out.write("            Price: <input type=\"text\" name=\"PPrice\" value=\"\" />\n");
      out.write("            Amount: <input type=\"text\" name=\"PAmount\" value=\"\" />\n");
      out.write("            <input type=\"submit\" value=\"Submit\" name=\"AddProduct\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <form name=\"formSearchProduct\" action=\"SearchController\" >\n");
      out.write("\n");
      out.write("            Search by name: <input type=\"text\" name=\"searchValue\" value=\"\" />\n");
      out.write("            <input type=\"submit\" value=\"Search\" name=\"SearchProduct\" />\n");
      out.write("        </form>\n");
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
