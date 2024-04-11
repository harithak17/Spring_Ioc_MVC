<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>  
.error{color:red}  
</style>  
</head>
<body>
 <form:form action="AddUserdetails" method="post" modelAttribute="user">
 <table>
       <tr>
       		<td> Name:</td>
        	<td>
        		<form:input type="text" path="name" name="name"></form:input><br>
        		<form:errors path="name" cssClass="error"/><br><br> 
        		
        	</td>
       </tr>
       <tr>
        	<td>Email:</td>
        	<td><form:input type="email" path="email" name="email"></form:input><br></td>
		</tr>
		<tr>
        	<td>Phone:</td>
        	<td><form:input type="text" path="phone" name="phone"></form:input><br></td>
		</tr>
		<tr>
        	<td>Date of Birth:</td>
        	<td><form:input type="date" path="dob" name="dob"></form:input><br></td>
		</tr>
		<tr>
        	<td>Subscribe to newsletter:</td>
        	<td><form:checkbox path="subscribed" name="subscribed"></form:checkbox><br></td>
		</tr>
		<tr>
          <td>Gender:</td>
          <td>
          		<form:radiobutton path="gender" value="Male"></form:radiobutton>
       			<form:radiobutton path="gender"  value="Female"></form:radiobutton><br>
       	  </td>
		</tr>
		<tr>
        	<td>Country:</td>
        	<td><form:select path="country">
            	<option value="USA">USA</option>
            	<option value="Canada">Canada</option>
            	<option value="UK">UK</option>
            <!-- Add more options as needed -->
        	</form:select><br>
        	</td>
		</tr>
		<tr>
        	<td><input type="submit" value="Add User"></td>
        </tr>
      </table>
 </form:form>
</body>
</html>