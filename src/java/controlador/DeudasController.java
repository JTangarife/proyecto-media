/*
 * To change this template, choose Tools | Templates
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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Deudas;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "deudas", urlPatterns = {"/deudas"})
public class DeudasController extends HttpServlet {

    private void guardarDeudas(int idusuario, int valordeuda) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES (?, ?)");
            ps.setInt(1, idusuario);
            ps.setInt(2, valordeuda);
            ps.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudasController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DeudasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizarDeuda( int idusuario, int valordeuda) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            PreparedStatement ps = conexion.prepareStatement("UPDATE `tienda`.`deudas` SET `idusuario`=?, `valordeuda`=? WHERE `id`=?");
            ps.setInt(1, idusuario);
            ps.setInt(2, valordeuda);
            ps.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudasController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DeudasController.class.getName()).log(Level.SEVERE, null, ex);
        }//UPDATE `tienda`.`deudas` SET `idusuario`=?, `valor_deudas`=? WHERE `id`=?;//UPDATE `tienda`.`deudas` SET `idusuario`=?, `valor_deudas`=? WHERE `id`=?;

    }

    List<Deudas> consultarDatos() {
        List<Deudas> listaDeu = new ArrayList<Deudas>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM deudas");
            ResultSet resultado = ps.executeQuery();
            Deudas d;
            while (resultado.next()) {
                int idusuario = resultado.getInt("idusuario");
                int valordeuda = resultado.getInt("valordeuda");
                d = new Deudas(idusuario, valordeuda);
                listaDeu.add(d);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudasController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DeudasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDeu;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("jsp/deudas.jsp");

        request.setAttribute("listaDeu", consultarDatos());

        rd.forward(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("jsp/deudas.jsp");

        String idusuario = request.getParameter("idusuario");
        String valor_deudas = request.getParameter("valordeuda");

        int deuda = Integer.parseInt(valor_deudas);

        if (idstr != null && !idstr.equals("")) {
            int id = Integer.parseInt(idstr);
            actualizarDeuda(idusuario, valordeuda);
        } else {
            guardarDeudas(idusuario, deuda);
        }
        request.setAttribute("listaDeu", consultarDatos());

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

   
}
