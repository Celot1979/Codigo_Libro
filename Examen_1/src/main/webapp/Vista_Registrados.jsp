<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de registrados</title>
<style>

body{
	background-color:#999;
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
  color:white
}
h2{
  color:white
}
a { 
  color: #FDFDFD; 
}


</style>
</head>
<body>
<%@ page import="model.Registro, java.util.ArrayList" %>
<h2 style="text-align:center">Los usuarios registrados son</h2>
<%
  ArrayList<Registro> usuarios = null;
  usuarios = (ArrayList<Registro>)request.getAttribute("Registros");
%>

<table border="1">
<tr>
   <th>Clave</th> 
   <th>Cuenta</th> 
   <th>Nombre</th> 
   <th>Contraseña</th> 
   <th>Mail</th>
</tr>
<%
 for(Registro usuario : usuarios)
 {
%>

<tr >
  <td><%= usuario.getClave() %></td>
  <td><%= usuario.getCuenta() %></td>
  <td><%= usuario.getNombre() %></td>
  <td><%= usuario.getContra() %></td>
  <td><%= usuario.getEmail() %></td>
 </tr>
 <% } %>
 </table>
 <br>
<form action="./Logueado.jsp" method="post">
    <div style="text-align:center;">
      <input type="submit" value="Volver a  sesión"> 
    </div>
</form>
</body>
</html>