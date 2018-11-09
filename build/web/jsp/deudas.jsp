<%-- 
    Document   : deudas
    Created on : 17/09/2018, 08:36:39 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deudas</title>
        <style>
            h1{
                color: blue;
            }
            
             td>img.edit {
                width: 30px;
            }
            
        </style>
        
            
    </head>
    <body>
        <%@page import="java.util.List" %>
        <%@page import="modelos.Deudas" %>
        <%
        List<Deudas> listaDeudas = (List<Deudas>)request.getAttribute("listaDeu");
        %>
        <h1>Cuentas de deudas en la tienda</h1>
        
        <ul>
            <li><a href="productos">Inicio</a></li>    
            <li><a href="contactenos">Contáctenos</a></li>       
            <li><a href="productos">Productos</a></li>    
            <li><a href="usuarios">Usuarios</a></li>  
        </ul>
        
        <form name="deudas" action="deudas" method="POST">
            <span>id</span><input type="hidden" name="id" />
            <span>idusuario</span><input type="text" name="idusuario" />
            <span>valor deudas</span><input type="number" name="valor_deudas" />
            
            
            <button type="submit">Confirmar deudas</button>

        </form>
        
       <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Idusuario</th>
                        <th>Valor deuda</th>
                        <th>Editar</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    for(Deudas d : listaDeudas) {%>
                    <tr>
                        <td><%= d.id%></td>
                        <td><%= d.idusuario%></td>
                        <td><%= d.valor_deudas%></td>
                        <td><image class="edit" onclick="editarDeuda(<%= d.id%>, '<%= d.idusuario%>', '<%= d.valor_deudas%>')" src="https://icon-icons.com/icons2/906/PNG/512/pencil_icon-icons.com_69999.png" /></td>
                    </tr>
                    <%
                    }%>
                </tbody>
            </table>
            <script>
                function editarDeuda(id, idusuario, deuda){
                    //alert(id + " " + nombre + " " + ruta);
                    var inputId = document.getElementById("id");
                    var inputIdusuario = document.getElementById("idusuario");
                    var inputValor_deudas = document.getElementById("valor_deudas");
                    
                    inputId.value = id;
                    inputIdusuario.value = idusuario;
                    inputValor_deudas.value = valor_deudas;
                }
            </script>
    </body>
</html>
