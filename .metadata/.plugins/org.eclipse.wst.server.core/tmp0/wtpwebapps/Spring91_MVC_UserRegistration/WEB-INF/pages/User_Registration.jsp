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
       		<td>Name:</td>
        	<td><form:input type="text" path="name" name="name"></form:input></td>
        	<td><form:errors path="name" cssClass="error"></form:errors></td>
       </tr>
       <tr>
        	<td>Email:</td>
        	<td><form:input type="email" path="email" name="email"></form:input></td>
        	<td><form:errors path="email" cssClass="error"></form:errors></td>
		</tr>
		<tr>
        	<td>Phone:</td>
        	<td><form:input type="text" path="phone" name="phone"></form:input></td>
        	<td><form:errors path="phone" cssClass="error"></form:errors></td>
		</tr>
		<tr>
        	<td>Date of Birth:</td>
        	<td><form:input type="date" path="dob" name="dob"></form:input></td>
        	<td><form:errors path="dob" cssClass="error"></form:errors><br></td>
		</tr>
		<tr>
        	<td>Subscribe to newsletter:</td>
        	<td><form:checkbox path="subscribed" name="subscribed"></form:checkbox></td>
        	<td><form:errors path="subscribed" cssClass="error"></form:errors><br></td>
		</tr>
		<tr>
          <td>Gender:</td>
          <td>
          		<form:radiobutton path="gender" value="Male" label="Male"></form:radiobutton>
       			<form:radiobutton path="gender"  value="Female" label="Female"></form:radiobutton>  
       	  </td>		     	  
       	  <td><form:errors path="gender" cssClass="error"></form:errors><br></td>
		</tr>
		<tr>
        	<td>Country:</td>
        	<td><form:select path="country">
            	<option value="USA">USA</option>
            	<option value="Canada">Canada</option>
            	<option value="UK">UK</option>
            <!-- Add more options as needed -->
        	</form:select>
        	</td>        	
        	<td><form:errors path="country" cssClass="error"></form:errors><br></td>
		</tr>
		<tr>
        	<td><input type="submit" value="Add User"></td>
        </tr>
      </table>
 </form:form>
</body>
</html>