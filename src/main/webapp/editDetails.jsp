<!DOCTYPE html>  
<%@page import="java.io.PrintWriter"%>
<%@page import="com.project.controler.LoginDao"%>
<%@page import="com.project.controler.LoginBean"%>
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.project.bean.*"%>  

<% 
String id=request.getParameter("id");
//out.print("welcome "+id);  
LoginDao ld=new LoginDao();
LoginBean u=ld.editMethod(Integer.parseInt(id)) ;
%>
  
<%-- <%  
String id=request.getParameter("id");  
LoginDao ld=new LoginDao();
LoginBean u=ld.editMethod(Integer.parseInt(id)) ;
%>  
   --%>
<h1>Edit Form</h1>  
<form  action="updated.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getLid()%>"/>  
<table>  
<tr><td>Name:</td><td>  
<input type="text" name="name" value="<%= u.getUsers()%>"/></td></tr>  
<tr><td>Password:</td><td>  
<input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr>  
<tr><td>Email:</td><td>  


<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  