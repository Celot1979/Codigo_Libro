<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Perfil Logueado</title>
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
a { 
  color: #FDFDFD; 
}


</style>
</head>
<body>
<%@ page import="model.Registro" %>
<% Registro nuevo = (Registro) request.getAttribute("atribAlumn");%>
<%String nombre = (String) session.getAttribute("nombre"); %>
<h1 style="text-align:center"> El Usuario  <%= nombre %>  entró en la sala</h1>

<br>
<form action="Controlador_JSP_LECTURA_REGISTROS" method="post">
	<div style="text-align:center;">
		<input type="submit" value="CONSULTAR USUARIOS">
	</div>
</form>
<br>
<form action="Borrar.html" method="post">
      <div style="text-align:center;">
		<input type="submit" value="BORRAR UN REGISTRO">
		
	  </div>
</form>
</body>
</html>