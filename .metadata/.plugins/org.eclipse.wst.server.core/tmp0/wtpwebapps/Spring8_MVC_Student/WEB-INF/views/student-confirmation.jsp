<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
<h3>Student Confirmed</h3>
<br>
Name : ${student.fname}.${student.lname}
<br>
Country : ${student.country}
<br>
Qualification : ${student.qualification}
<br>
Gender : ${student.gender}
<br>
Languages : 
<ul>
	<c:forEach var="temp" items="${student.lang}">
		<li>${temp}</li>
	</c:forEach>
</ul>
<br>
</body>
</html>