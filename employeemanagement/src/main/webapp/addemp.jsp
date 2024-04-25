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
			<form:form action="save" modelAttribute="employee">
			
			<form:label path="name">Name: </form:label>
			<form:input path="name"/>
			
			
			<form:label path="designation">Designation: </form:label>
			<form:input path="designation"/>
			
			
			<form:label path="phone">Phone: </form:label>
			<form:input path="phone"/>
			
			
			<input type="submit" value="SAVE"/>
			</form:form>
</body>
</html>