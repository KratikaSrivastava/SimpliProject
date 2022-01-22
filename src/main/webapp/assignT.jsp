<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.* "%>
<%@page import="com.entity.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Teacher</title>
</head>
<body>

<div align="center">
<form action="<%=request.getContextPath()%>/assignCotroller?action=assignteacher" method="post">
	<table>

		<tr>
			<th align="center" bgcolor="indigo" style="color: white" colspan="6"><h3
					align="center">Assign Teachers</h3></th>
		</tr>
		<tr>
			<th align="right">Teacher id</th>
			<td><input type="text" name="tid" value="${param.tid }"></td>

			<th align="right">Teacher name</th>
			<td><input type="text" name="tname" value="${param.tname }"></td>
		<tr>
			<th>Select Class:</th>
			<td><select name="classname">

					<%
					try {
						String query = "select * from class";
						Class.forName("com.mysql.jdbc.Driver").newInstance();
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
						Statement stm = con.createStatement();

						ResultSet rs = stm.executeQuery(query);
						while (rs.next()) {
					%>
					<option value="<%=rs.getString("class_name")%>"><%=rs.getString("class_name")%></option>
					<%
					}

					} catch (Exception ex) {
					ex.printStackTrace();
					}
					%>

			</select></td>
		</tr>
	</table><br>
	
	<input type="submit" value="Assign">
	</form>
</div>	
</body>
</html>