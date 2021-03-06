<%-- 
    Document   : contactenos
    Created on : 21/09/2018, 07:44:42 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contáctenos</title>        <style>
            h1{
                color:  black;
               
            }
            body{
                background-color: #b3c6ff;
            }
            a{
                color: black;
            }
            
        </style>
    </head>
    <body>
        
        <ul>
            <li><a href="principal">Inicio</a></li>    
            <li><a href="productos">Productos</a></li>       
            <li><a href="deudas">Deudas</a></li>    
            <li><a href="usuarios">Usuarios</a></li>  
        </ul>
        
        <%@page import="java.util.List" %>
        <%@page import="modelos.Contactenos" %>
        
        <%
        List<Contactenos> listaContactenos = (List<Contactenos>) request.getAttribute("Contactenos");
        %>
        <h1>Contáctenos</h1>
        
        <form name="contactenos" action="ContactoC" method="POST">
            <span>Nombre</span><input type="text" name="nombre" id="nombre"/>
            <span>Teléfono</span><input type="text" name="telefono" id="telefono"/>
            <span>Dirección</span><input type="text" name="direccion" id="direccion"/>
                
            <button type="submit" class="btn btn-danger">Guardar información</button>
        </form>
        <table class="table">
            <thead class="thead-dark">

                <tr>
                    <th>Nombre</th>
                    <th>Teléfono</th>
                    <th>Dirección</th>
                </tr>
                <% 
                    Contactenos c;
                    for(int i = 0; i < listaContactenos.size(); i++){
                        c = listaContactenos.get(i);%>
                        <tr>
                            <td><%= c.nombre%></td>
                            <td><%= c.telefono%></td>
                            <td><%= c.direccion%></td>
                        </tr>
                        <%
                }%>
            </thead>

        </table>
    </body>
</html>