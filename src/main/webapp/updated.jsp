<%@page import="com.project.controler.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.project.controler.LoginBean"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="u" class="com.project.controler.LoginBean"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
LoginDao.delete(u);  
response.sendRedirect("ListOfUser.jsp");  
%>  
</body>
</html>