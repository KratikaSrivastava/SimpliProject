<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Panel</title>
</head>
<body>
<%

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);


%>

	<div align="center">
		<form action="<%=request.getContextPath()%>/MainController"
			method="post">
			<div class="form-group">
				<label>User Name</label> <input type="text" name="username"
					class="form-control" placeholder="User Name" required>
			</div>
			<div class="form-group">
				<label>Password</label> <input type="password" name="password"
					class="form-control" placeholder="Password" required>
			</div>
			<input type="submit" class="btn btn-black" value="Login">
		</form>
	</div>
</body>
</html>