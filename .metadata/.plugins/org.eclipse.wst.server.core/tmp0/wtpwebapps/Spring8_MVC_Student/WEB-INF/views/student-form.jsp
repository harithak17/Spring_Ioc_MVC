<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>  
.error{color:red}  
</style> 
</head>
<body>
	<h1>Student Registration</h1>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="fname"/>
		<form:errors path="fname" cssClass="error"></form:errors>
		<br>
		<br>		
		Last Name: <form:input path="lname"/>
		<br>
		<br>		
			Qualification: <form:select path="qualification">
						<option value="btech" label="B.Tech"></option>
						<option value="bca" label="BCA"></option>
						<option value="bba" label="BBA"></option>
						<option value="bcom" label="B.Com"></option>
						<option value="bsc" label="B.Sc"></option>
					</form:select>
		<br>
		<br>
		  Country: <form:select path="country">
						<form:options items="${student.countryOptions}"></form:options>						
						</form:select>
		<br><br>
		Gender:
		Male<form:radiobutton path="gender" value="Male"/>
		Female<form:radiobutton path="gender" value="Female"/>
		Others<form:radiobutton path="gender" value="Others"/>
		<br>
		<br>
		Languages knows: 
			English<form:checkbox path="lang" value="Eng"/>
			Spanish<form:checkbox path="lang" value="Span"/>
			Hindi<form:checkbox path="lang" value="Hindi"/>
			<br><br>
			age: <form:input path="age"/>
			<form:errors path="age" cssClass="error"></form:errors>
			<br><br>
			Postal Code: <form:input path="postalcode"/>
			<form:errors path="postalcode" cssClass="error"></form:errors>
		<br>
		<br>			
		<input type="submit" value="save">
	</form:form>	
	<!-- When we load form, mvc will call getter methods -->
	<!-- When we submit form, mvc will call setter methods -->
</body>
</html>