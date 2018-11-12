<%-- 
    Document   : productos
    Created on : 17/09/2018, 08:36:39 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
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
            
            
            
                <button type="submit" class="btn btn-dark">Guardar productos</button>
        </form>
        
        <br>
         
        
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">Nombre</th>
                    <th scope="col">Precio</th>
                    <th scope="col">Descripción</th>
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
                
            </thead>
  
        </table>
    </body>
</html>
