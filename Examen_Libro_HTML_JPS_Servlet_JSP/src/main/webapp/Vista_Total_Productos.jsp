<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vista de Productos</title>
</head>
<body>
<%@ page import="Guardar.Archivos, java.util.ArrayList"%> 
<h2>Los productos que están registrados son: </h2>
 <% 
 	ArrayList<Archivos> productos = null; 
 	productos= (ArrayList<Archivos>)request.getAttribute("Productos");
  %>
<table cellspacing="3" cellpadding="3" border="1">
			<tr>
				<th>Clave</th>
				<th>Nombre</th>
				<th>Precio</th>
				<th>Cantidad</th>
			</tr>
			<% 
			   for(Archivos producto: productos)
				{
			%>
			
			<tr valing="top">
			<td><%= producto.getClave() %></td>
			<td><%= producto.getNombre() %></td>
			<td><%= producto.getPrecio() %></td>
			<td><%= producto.getCantidad() %></td>
			</tr>
			<% }  %>
			
		</table>
		
		<p> Numero de registros : <% productos.size();%></p>
		<% productos.clear(); %>
		<br>
		<form action"index.html" method ="post">
			<input type="submit" value="Rwgresar">
		</form>
</body>
</html>