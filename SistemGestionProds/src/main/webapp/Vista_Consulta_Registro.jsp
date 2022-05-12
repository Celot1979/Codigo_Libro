<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vista Consulta</title>
</head>
<body>
<%@ page import="Model.Producto" %>
<% Producto nuevo = (Producto) request.getAttribute("atribAlumn");%>
<form action="Registro" method="post">
  <h1>CONSULTA REALIZADA CON ÉXITO</h1>
		<table cellspacing="3" cellpadding="3" border="1">
			<tr>
				<td align="right">Clave :</td>
				<td><%= nuevo.getClave() %></td>
			</tr>
			<tr>
				<td align="right">Nombre :</td>
				<td><%=nuevo.getNombre()%></td>
			</tr>
			<tr>
				<td align="right">Precio :</td>
				<td><%=nuevo.getPrecio() %></td>
			</tr>

			<tr>
				<td align="right">cantidad :</td>
				<td><%=nuevo.getCantidad()  %></td>
			</tr>
		</table>

		<input type="reset" value="Borrar"> 
		<input type="submit" value="Enviar">
	</form>

</body>
</html>