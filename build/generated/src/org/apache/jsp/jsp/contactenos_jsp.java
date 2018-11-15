package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelos.Contactenos;

public final class contactenos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Contáctenos</title>        <style>\r\n");
      out.write("            h1{\r\n");
      out.write("                color:  black;\r\n");
      out.write("               \r\n");
      out.write("            }\r\n");
      out.write("            body{\r\n");
      out.write("                background-color: #b3c6ff;\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"principal\">Inicio</a></li>    \r\n");
      out.write("            <li><a href=\"productos\">Productos</a></li>       \r\n");
      out.write("            <li><a href=\"deudas\">Deudas</a></li>    \r\n");
      out.write("            <li><a href=\"usuarios\">Usuarios</a></li>  \r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        ");

        List<Contactenos> listaContactenos = (List<Contactenos>) request.getAttribute("ListaDesa");
        
      out.write("\r\n");
      out.write("        <h1>Contáctenos</h1>\r\n");
      out.write("        \r\n");
      out.write("        <form name=\"contactenos\" action=\"contactenos\" method=\"POST\">\r\n");
      out.write("            <span>Nombre</span><input type=\"text\" name=\"nombre\"/>\r\n");
      out.write("            <span>Teléfono</span><input type=\"text\" name=\"telefono\"/>\r\n");
      out.write("            <span>Dirección</span><input type=\"text\" name=\"direccion\"/>\r\n");
      out.write("                \r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-danger\">Guardar información</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("            <thead class=\"thead-dark\">\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Nombre</th>\r\n");
      out.write("                    <th>Teléfono</th>\r\n");
      out.write("                    <th>Dirección</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 
                    Contactenos c;
                    for(int i = 0; i < listaContactenos.size(); i++){
                        c = listaContactenos.get(i);
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print( c.nombre);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( c.telefono);
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( c.direccion);
      out.write("</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                }
      out.write("\r\n");
      out.write("            </thead>\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
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
