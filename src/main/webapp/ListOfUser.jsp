<!DOCTYPE html>  
  
<%@page import="com.project.controler.LoginDao"%>
<%@page import="com.project.controler.LoginBean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
</head>  
<body>  
  
<%@page import="com.project.bean.*,java.util.*"%>  

  
<h1>Users List</h1>  
  
<%  
LoginDao l=new LoginDao();
List<LoginBean> list=l.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Name</th><th>Password</th><th>Edit</th><th>Delete</th>

<c:forEach items="${list}" var="u">  

<tr>
<td>${u.getLid()}</td>
<td>${u.getUsers()}</td>
<td>${u.getPassword()}</td>  
 
<td><a href="editDetails.jsp?id=${u.getLid()}">Edit</a></td>  
<td><a href="updated.jsp?id=${u.getLid()}">Delete</a></td></tr>  

</c:forEach>  
</table>  
<br/><a href="index.jsp">Add New User</a>  
  
</body>  
</html>  