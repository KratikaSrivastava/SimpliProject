<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.* "%>
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
			
					<th>Teacher Id</th>
					<th>Teacher Name</th>
					<th>Teacher Age</th>
					<th>Teacher Salary</th>
			

				<th>Assign</th>

			</tr>
			</thead>
			<tfoot>
				<tr>
					<th>Teacher Id</th>
					<th>Teacher Name</th>
					<th>Teacher Age</th>
					<th>Teacher Salary</th>
					
					<th>Assign</th>

				</tr>
			</tfoot>
			<tbody>

				<%
				String tempUrl;

				List<Teacher> listUsers = (List) request.getAttribute("listteacher");
				for (int i = 0; i < listUsers.size(); i++) {

					out.print("<tr>");
					out.print("<td>" + listUsers.get(i).getId() + "</td>");
					out.print("<td>" + listUsers.get(i).getName() + "</td>");
					out.print("<td>" + listUsers.get(i).getAge() + "</td>");
					out.print("<td>" + listUsers.get(i).getSalary() + "</td>");

					tempUrl = request.getContextPath() + "/MainController?page=assignt" + "&tid="
					+ listUsers.get(i).getId() + "&tname=" + listUsers.get(i).getName();
					out.print("<td><a href=" + tempUrl + ">Assign Class</a></td>");
					out.print("</tr>");
				}
				%>

			</tbody>
		</table>

	</div>

</body>
</html>