<%-- 
    Document   : filtrado
    Created on : 11-mar-2021, 20:59:26
    Author     : alego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Filtrado</title>
        <link rel="stylesheet" type="text/css" href="estilos.css">
    </head>
    <body>
        <ul id="menu">
            <li><a href="inicial.jsp">Inicio</a></li>
            <li><a href="ServletListadoPorArticulo">Lista por articulo</a></li> 
            <li><a href="filtrado.jsp">Filtrado</a></li> 
        </ul>
        
        <br/>
        <br/>
        
        <form action="ServletListadoEnTabla">
            <label for="filtro">Seleccione la opción por la que quiere filtrar:</label>
            
            <select name="filtro" id="filtro">
                <option value="nombre">Nombre</option>
                <option value="precio">Precio</option>
                <option value="fecha_produccion">Fecha de producción</option>
            </select>
            
            <input type="text" name="textFiltrado"/>
            <input type="submit" value="Buscar">
        </form>
    </body>
</html>
