<%@page import="jdbc.memberDTO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="alert.jsp">
<%if(session.getAttribute("login")==null || session.getAttribute("login").equals("")){ %>
<table border="">
	<tr>
		<td> <input type="text" name="id" >id</<input ></td>	<td> <input type="text"name="pw" >pw</<input ></td>
	</tr>
	<tr>
		<td colspan="2" align = "right"><input type="submit" value="로그인"/></td>
	</tr>
</table>
<%} else {%>
<table>
	<tr>
		<td><%=((memberDTO)session.getAttribute("login")).getName() %></td>
		<td><a href="logout.jsp">로그아웃</a></td>
	</tr>
</table>
<%} %> 
</form>
</body>
</html>