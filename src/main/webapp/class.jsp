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
			<th>Class Id</th>
			<th>Class Section</th>
			<th>Class Name</th>
			<th>Assign</th>

		</tr>
		</thead>
		<tfoot>
			<tr>
				<th>Class Id</th>
				<th>Class Section</th>
				<th>Class Name</th>
				<th>Assign</th>

			</tr>
		</tfoot>
		<tbody>
			
			<%
			String tempUrl;

			List<ClassDetails> listUsers = (List) request.getAttribute("listclass");
			for (int i = 0; i < listUsers.size(); i++) {

				out.print("<tr>");
				out.print("<td>" + listUsers.get(i).getId() + "</td>");
				out.print("<td>" + listUsers.get(i).getSection() + "</td>");
				out.print("<td>" + listUsers.get(i).getName() + "</td>");
				tempUrl = request.getContextPath() + "/OperationController?page=assignstudent" + "&stdid="
				+ listUsers.get(i).getId() + "&stdname=" + listUsers.get(i).getSection() + "&stdage="
				+ listUsers.get(i).getName();
				out.print("<td><a href=" + tempUrl + ">Assign Class</a></td>");
				out.print("</tr>");
			}
			%>

		</tbody>
		</table>

	</div>

</body>
</html>