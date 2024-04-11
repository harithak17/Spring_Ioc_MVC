<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Hello, ${param.studName}</h5>
	<h5>${message}</h5>
	<h6>Submit below details</h6>
	<table>
		<tr>
			<td>Email Id:</td>
			<td><input type="text" name="studMailId"></td>
		</tr>
		<tr>
			<td>Username:</td>
			<td><input type="text" name="studUname"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="text" name="studPasswrd"></td>
		</tr>
		<tr>
			<td>Confirm Password:</td>
			<td><input type="text" name="studConfirmPass"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Register"></td>
		</tr>
	</table>
</body>
</html>