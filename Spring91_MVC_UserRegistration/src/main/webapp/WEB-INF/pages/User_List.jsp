<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User Details</title>
</head>
<body>
	<h2>View User Details</h2>
	<table border="1" width="70%" cellpadding="2">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>PH.NO</th>
			<th>DOB</th>
			<th>SUBSRIBED</th>
			<th>GENDER</th>
			<th>COUNTRY</th>
		</tr>
		<c:forEach var="u" items="${list}">
			<tr>
				<td>${u.id}</td>
				<td>${u.name}</td>
				<td>${u.email}</td>
				<td>${u.phone}</td>
				<td>${u.dob}</td>
				<td>${u.subscribed}</td>
				<td>${u.gender}</td>
				<td>${u.country}</td>
				<td><a href="edituser/${u.id}">Edit</a></td>
				<td><a href="deleteuser/${u.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<a href="UserRegistration">Add new User</a>
</body>
</html>