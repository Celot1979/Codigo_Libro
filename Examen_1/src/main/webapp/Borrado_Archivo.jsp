<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Borrado</title>
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
<%@ page import="model.Base_Datos" %>
<h1 style="text-align:center">BORRADO</h1>
<%
String clave = request.getParameter("clave");
String cuenta = request.getParameter("cuenta");
Base_Datos bor = new Base_Datos();
bor.prueba();
bor.borrar(clave, cuenta);
%>
<div style="text-align:center;">
		<img src="./img/2.png" width="600" height="400" align="center" alt="No se pudo mostrar la imagen">
		<br>
		<a href="Index.html"> INGRESA EN TU PERFIL </a>
</div>
</body>
</html>