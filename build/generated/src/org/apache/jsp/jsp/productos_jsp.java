package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelos.Producto;

public final class productos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Productos tienda</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            h1{\r\n");
      out.write("                color: blue;\r\n");
      out.write("               \r\n");
      out.write("            }\r\n");
      out.write("            body{\r\n");
      out.write("                background-color:  #f2f2f2;\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("                color: blue;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"inicio\">Inicio</a></li>    \r\n");
      out.write("            <li><a href=\"contactenos\">Contáctenos</a></li>       \r\n");
      out.write("            <li><a href=\"deudas\">Deudas</a></li>    \r\n");
      out.write("            <li><a href=\"usuarios\">Usuarios</a></li>    \r\n");
      out.write("        </ul>\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");

        List<Producto> listaProductos = (List<Producto>)request.getAttribute("listaProd");
        
      out.write("\r\n");
      out.write("        <h1>Ingreso de productos a la tienda</h1>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form name=\"productos\" action=\"productos\" method=\"POST\">\r\n");
      out.write("            <span>Nombre</span><input type=\"text\" name=\"nombre\" />\r\n");
      out.write("            <span>Precio</span><input type=\"number\" name=\"precio\" />\r\n");
      out.write("            <span>Descripción</span><input type=\"text\" name=\"descripcion\" />\r\n");
      out.write("            \r\n");
      out.write("            <select name=\"tipoproducto\">\r\n");
      out.write("                <option value=\"1\">Fritos</option>              \r\n");
      out.write("                <option value=\"2\">Mecato</option>\r\n");
      out.write("                <option value=\"3\">Bebidas</option>\r\n");
      out.write("                <option value=\"4\">Desechables</option>\r\n");
      out.write("                \r\n");
      out.write("            </select>\r\n");
      out.write("            \r\n");
      out.write("            <button type=\"submit\">Guardar productos</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        <table border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Nombre</th>\r\n");
      out.write("                <th>Precio</th>\r\n");
      out.write("                <th>Descripcion</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

            Producto p;
            for(int i = 0; i < listaProductos.size(); i++){
                p = listaProductos.get(i);
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print( p.nombre);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( p.precio);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( p.descripcion);
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            ");

            }
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
