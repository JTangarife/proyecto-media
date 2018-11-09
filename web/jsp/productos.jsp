<%-- 
    Document   : productos
    Created on : 17/09/2018, 08:36:39 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos tienda</title>
        <style>
            h1{
                color: blue;
               
            }
            body{
                background-color:  #f2f2f2;
            }
            a{
                color: blue;
            }
            
        </style>
    </head>
    <body>
        <ul>
            <li><a href="inicio">Inicio</a></li>    
            <li><a href="contactenos">Contáctenos</a></li>       
            <li><a href="deudas">Deudas</a></li>    
            <li><a href="usuarios">Usuarios</a></li>    
        </ul>
            
        
        

        
        <%@page import="java.util.List" %>
        <%@page import="modelos.Producto" %>
        <%
        List<Producto> listaProductos = (List<Producto>)request.getAttribute("listaProd");
        %>
        <h1>Ingreso de productos a la tienda</h1>
        <br>
        <form name="productos" action="productos" method="POST">
            <span>Nombre</span><input type="text" name="nombre" />
            <span>Precio</span><input type="number" name="precio" />
            <span>Descripción</span><input type="text" name="descripcion" />
            
            <select name="tipoproducto">
                <option value="1">Fritos</option>              
                <option value="2">Mecato</option>
                <option value="3">Bebidas</option>
                <option value="4">Desechables</option>
                
            </select>
            
            <button type="submit">Guardar productos</button>
        </form>
        
        <br>
        
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Precio</th>
                <th>Descripcion</th>
            </tr>
            <%
            Producto p;
            for(int i = 0; i < listaProductos.size(); i++){
                p = listaProductos.get(i);%>
                <tr>
                    <td><%= p.nombre%></td>
                    <td><%= p.precio%></td>
                    <td><%= p.descripcion%></td>
                </tr>
            <%
            }%>
        </table>
    </body>
</html>
