<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Spring MVC</h1>
	<form action="First/processForm" method="get">  
	<!--  <form action="processDataOne" method="get"> -->
		<input type="text" placeholder="Enter your name" name="studName">
		<input type="submit">
	</form>
	<a href="Student/Showform">Student Details</a>
</body>
</html>