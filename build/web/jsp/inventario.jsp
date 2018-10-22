<%-- 
    Document   : inventario
    Created on : 26-sep-2018, 19:42:13
    Author     : hogarymoda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventario</title>
        <style>
            h1{
                color: blue;
               
            }
            body{
                background-color: gray;
            }
            
        </style>        
    </head>
    <body>
        
        <li><a href="inicio">Inicio</a></li>    
        <li><a href="contactenos">Contáctenos</a></li>       
        <li><a href="deudas">Deudas</a></li>    
        <li><a href="usuarios">Usuarios</a></li>    
        <li><a href="productos">Productos</a></li>    
        <li><a href="publicidad">Publicidad</a></li>
        
        <h1>Inventario de productos que ingresan a la página</h1>
            <form name="productos" action="productos" method="POST">
                <span>Producto</span><input type="text" name="nombre" />
                <span>Precio</span><input type="number" name="precio" />
                <span>Cantidad<span/><input type="number" name="cantidad"/>
                <span>Descripción</span><input type="text" name="descripcion" />

                <button type="submit">Enviar</button>
                    </form>        
    </body>
</html>
