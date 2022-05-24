<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Usuario no logueado</title>
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
h2{
  color:white;

}
a { 
  color: #FDFDFD; 
}
</style>
</head>
<body>

<% response.sendRedirect("http://localhost:8007/Examen_1/Index.html"); %>
</body>
</html>