<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Succes</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<%
if(session.getAttribute("name")==null || session.getAttribute("birthday")==null
   || session.getAttribute("gender")==null || session.getAttribute("phone")==null || session.getAttribute("email")==null 
   || session.getAttribute("pass")==null ){
	response.sendRedirect("register.html");
}
%>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
response.setHeader("Pragma","no-cache");
response.setHeader("Expires","0");
session.removeAttribute("name");
session.removeAttribute("birthday");
session.removeAttribute("gender");
session.removeAttribute("phone");
session.removeAttribute("email");
session.removeAttribute("pass");
%>
<br>
<center><h1>Thank U for Choosing us!!!</h1></center>
<i>You are successfully registered go to Sigin page or Home page..</i>
<br>
<br>
<br>
<a href="signin.html"><button><b><u>Signin</u></b></button></a>
<a href="index.html"><button><b><u>Home</u></b></button></a>
</body>
</html>