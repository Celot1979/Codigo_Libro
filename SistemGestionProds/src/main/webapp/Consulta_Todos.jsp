<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta de todos los registros</title>
</head>
<body>
<%@ page import="Model.Producto" %>
<%@ page import="Model.BBDD" %>
<h2>CONSULTA DE TODOS LOS REGISTROS</h2>
<% java.util.ArrayList<Producto> productos = null;
    productos= (java.util.ArrayList<Producto>)request.getAttribute("Productos");
%>
  <% for(Producto producto:productos) { %>
        <table cellspacing="3" cellpadding="3" border="1">
            <tr> 
                <td>Clave :</td>     
                <td><%= producto.getClave() %></td>
                <td>Nombre :</td> 
                <td><%= producto.getNombre() %></td>
                <td>Precio :</td> 
                <td><%= producto.getPrecio() %></td>
                <td>Cantidad :</td> 
                <td><%= producto.getCantidad() %></td>  
            </tr>
         </table>
        <% } %>

</body>
</html>