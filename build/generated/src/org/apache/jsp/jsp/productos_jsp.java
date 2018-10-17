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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos tienda</title>\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                color: blue;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: gray;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        List<Producto> listaProductos = (List<Producto>)request.getAttribute("listaProd");
        
      out.write("\n");
      out.write("        <h1>Ingreso de productos a la tienda</h1>\n");
      out.write("        <form name=\"productos\" action=\"productos\" method=\"POST\">\n");
      out.write("            <span>Nombre</span><input type=\"text\" name=\"nombre\" />\n");
      out.write("            <span>Precio</span><input type=\"number\" name=\"precio\" />\n");
      out.write("            <span>Descripción</span><input type=\"text\" name=\"descripcion\" />\n");
      out.write("            <select name=\"tipoproducto\">\n");
      out.write("                <option value=\"1\">Fritos</option>              \n");
      out.write("                <option value=\"2\">Mecato</option>\n");
      out.write("                <option value=\"3\">Bebidas</option>\n");
      out.write("                <option value=\"4\">Desechables</option>\n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <button type=\"submit\">Guardar productos</button>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>nombre</th>\n");
      out.write("                <th>precio</th>\n");
      out.write("                <th>descripcion</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

            Producto p;
            for(int i = 0; i < listaProductos.size(); i++){
                p = listaProductos.get(i);
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( p.nombre);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.precio);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.descripcion);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            ");

            }
      out.write("\n");
      out.write("        </table>\n");
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
