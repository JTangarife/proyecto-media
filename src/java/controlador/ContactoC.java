/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Contactenos;

/**
 *
 * @author Usuario
 */
public class ContactoC extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("jsp/contactenos.jsp");

        List<Contactenos> Contactenos = Contactenos();
        request.setAttribute("Contactenos", Contactenos);
        
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd = request.getRequestDispatcher("jsp/contactenos.jsp");
        
        String idicontactoStr = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        
        if(idicontactoStr != null && !idicontactoStr.equals("")){
            int idicontacto = Integer.parseInt(idicontactoStr);
            actualizarContacto(idicontacto, nombre, telefono, direccion);
        } else {
            try {
                guardarContacto(nombre, telefono, direccion);
            } catch (SQLException ex) {
                Logger.getLogger(ContactoC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        List<Contactenos> Contactenos = Contactenos();
        request.setAttribute("Contactenos", Contactenos);
        
        rd.forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    private void guardarContacto(String nombre, String telefono, String direccion) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO `tienda`.`contactenos` (`nombre`, `telefono`, `direccion`) VALUES (?, ?, ?)");
            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContactoC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ContactoC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<Contactenos> Contactenos() {
        List<Contactenos> listaContactenos = new ArrayList<Contactenos>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM contactenos");
            ResultSet resultados = ps.executeQuery();
            while(resultados.next()) {
                int idcontacto = resultados.getInt("id");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String direccion = resultados.getString("direccion");
                Contactenos i = new Contactenos();
                i.idcontacto = idcontacto;
                i.nombre = nombre;
                i.telefono = telefono;
                i.direccion = direccion;
                listaContactenos.add(i);
            }
            conexion.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContactoC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ContactoC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaContactenos;
    }

    private void actualizarContacto(int idcontacto, String nombre, String telefono, String direccion) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "root", "");
            PreparedStatement ps = conexion.prepareStatement("UPDATE `ejemplo`.`imagenes` SET `nombre` = ?, `ruta` = ?, `tipo` = ? WHERE `idimagenes` = ?");
            ps.setString(1, nombre);
            ps.setString(2, telefono);
            ps.setString(3, direccion);
            ps.setInt(4, idcontacto);
            ps.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContactoC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ContactoC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

