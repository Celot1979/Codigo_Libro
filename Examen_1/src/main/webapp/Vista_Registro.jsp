<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vista_Registro</title>
<style>

body{
	background-image: url("https://i.imgur.com/h8IyYtA.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

table{
	background:#3C0;
	padding:10px;
	border:solid 2px #0F0;
	margin:auto;
}

td{
	padding:5px 0;
}

h1{
  color:white;

}
a { 
  color: #FDFDFD; 
}

</style>
</head>
<body>
<%@ page import="model.Registro" %>
<% Registro nuevo = (Registro) request.getAttribute("atribAlumn");%>
<form action="Registro" method="post">
  <h1 style="text-align:center">REGISTRADO CON ÉXITO</h1>
		<table width="25%" cellspacing="3" cellpadding="3" border="1">
			<tr>
				<td align="right">Clave :</td>
				<td><%= nuevo.getClave() %></td>
			</tr>
			<tr>
				<td align="right">Cuenta :</td>
				<td><%= nuevo.getCuenta() %></td>
			</tr>
			<tr>
				<td align="right">Nombre :</td>
				<td><%=nuevo.getNombre()%></td>
			</tr>
			<tr>
				<td align="right">Contraseña:</td>
				<td><%=nuevo.getContra() %></td>
			</tr>

			<tr>
				<td align="right">Email :</td>
				<td><%=nuevo.getEmail()  %></td>
			</tr>
		</table>
		
		<div style="text-align:center;">
		<img src="./img/2.png" width="600" height="400" align="center" alt="No se pudo mostrar la imagen">
		<br>
		<a href="Index.html"> INGRESA EN TU PERFIL </A>
		</div>
	</form>


</body>
</html>