<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.* " %>
<%@page import="com.entity.*"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
<table border="1">
		<tr>
			<th>Student Roll No</th>
			<th>Student Name</th>
			<th>Student Age</th>
			<th>Assign</th>

		</tr>
		</thead>
		<tfoot>
			<tr>
				<th>Student Roll No</th>
				<th>Student Name</th>
				<th>Student Age</th>
				<th>Assign</th>

			</tr>
		</tfoot>
		<tbody>
			
			<%
			String tempUrl;

			List<Student> listUsers = (List) request.getAttribute("liststudents");
			for (int i = 0; i < listUsers.size(); i++) {

				out.print("<tr>");
				out.print("<td>" + listUsers.get(i).getRollno() + "</td>");
				out.print("<td>" + listUsers.get(i).getName() + "</td>");
				out.print("<td>" + listUsers.get(i).getAge() + "</td>");
				tempUrl = request.getContextPath() + "/OperationController?page=assignstudent" + "&stdid="
				+ listUsers.get(i).getRollno() + "&stdname=" + listUsers.get(i).getName() + "&stdage="
				+ listUsers.get(i).getAge();
				out.print("<td><a href=" + tempUrl + ">Assign Class</a></td>");
				out.print("</tr>");
			}
			%>

		</tbody>
		</table>

	</div>

</body>
</html>