package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class filtrado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Filtrado</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul id=\"menu\">\n");
      out.write("            <li><a href=\"inicial.jsp\">Inicio</a></li>\n");
      out.write("            <li><a href=\"ServletListadoPorArticulo\">Lista por articulo</a></li> \n");
      out.write("            <li><a href=\"filtrado.jsp\">Filtrado</a></li> \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("        <form action=\"ServletListadoPorTabla\">\n");
      out.write("            <label for=\"filtro\">Seleccione la opción por la que quiere filtrar:</label>\n");
      out.write("            \n");
      out.write("            <select name=\"filtro\" id=\"filtro\">\n");
      out.write("                <option value=\"nombre\">Nombre</option>\n");
      out.write("                <option value=\"precio\">Precio</option>\n");
      out.write("                <option value=\"fecha_produccion\">Fecha de producción</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"textFiltrado\"/>\n");
      out.write("            <input type=\"submit\" value=\"Buscar\">\n");
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
