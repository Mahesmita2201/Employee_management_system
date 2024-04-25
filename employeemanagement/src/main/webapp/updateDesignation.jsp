<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form:form action="setDesignation" modelAttribute="employee">
		ID: <form:input path="id"/>
		Designation<form:input path="designation"/>
		<input type="submit" value="UPDATE">
		</form:form>
</body>
</html>