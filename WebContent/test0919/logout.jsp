<%@page import="jdbc.memberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<title>LogOut</title>

<%
memberDTO dto = (memberDTO)session.getAttribute("login");
session.removeAttribute("login");
%>
<script>
alert("<%= dto.getName()%>님이 로그아웃하셨습니다.");
location.href="login.jsp";
</script>
