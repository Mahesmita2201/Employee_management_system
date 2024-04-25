<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<thead>
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Designation</th>
	<th>Phone</th>
	</tr>
	</thead>
	<tbody>
	<thead>
	<tr>
	<td>${emp.getId()}</td>
	<td>${emp.getName()}</td>
	<td>${emp.getDesignation()}</td>
	<td>${emp.getPhone()}</td>
	</tr>
	</tbody>
	</table>
	<a href="index.jsp">HOME</a>
</body>
</html>