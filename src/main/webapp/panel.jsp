<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>

<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);

if(session.getAttribute("username")==null){
	
	response.sendRedirect("adminlogin.jsp");
}else{
	
	
}
%>
	
	<div align="center">
	Hello <%=session.getAttribute("username") %><br><br>
	Session id : <%=request.getSession().getId() %><br><br>
	</div>
	<br>
	<br>
	<hr>
	<div align="center">
		
		<form action="<%=request.getContextPath()%>/LogoutController"method="post">
		
			<div>
				<input type="hidden" name="action" value="destroy">
				 <input type="submit" value="Logout">
			</div>
		</form>
	</div><br><br>
	
	<div align="center">
	<a href="<%=request.getContextPath()%>/MainController?page=listofteacher" >List of Teachers</a><br><hr>
	<a href="<%=request.getContextPath()%>/MainController?page=listofclass">List of Class</a><br><hr>
	<a href="<%=request.getContextPath()%>/MainController?page=listofsubject">List of Subjects</a><br><hr>
	<a href="<%=request.getContextPath()%>/MainController?page=listofstudents">List of Students</a><br><hr>
	
	</div>
	
</body>
</html>