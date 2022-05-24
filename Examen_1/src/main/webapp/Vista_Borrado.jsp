<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vista de borrado</title>
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
<h1 style="text-align:center">BORRADO CON ÉXITO</h1>
<div style="text-align:center;">
		<img src="./img/2.png" width="600" height="400" align="center" alt="No se pudo mostrar la imagen">
		<br>
		<a href="Index.html"> SALIR </A>
</div>
</body>
</html>