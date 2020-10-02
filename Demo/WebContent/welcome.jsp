<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%
if(session.getAttribute("name")==null || session.getAttribute("password")==null){
	response.sendRedirect("signin.html");
}
%>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
%>
<h1>hi  ${name}</h1>
<center>
<iframe width="560" height="315" src="https://www.youtube.com/embed/nMxBximWIKo" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</center>
<form action="Logout" method="post">
<input type ="submit" value="logout">
</form>
</body>
</html>