<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<div class="container">
	<h4>Register Here!</h4>
	<form:form>
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" value="Enter your email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" placeholder="Enter your password"></td>
			</tr>
			<tr>
				<td>ConfirmPassword:</td>
				<td><input type="password" name="cfmpassword" placeholder="Confirm password"></td>
			</tr>
						
		</table>
		<input type="submit" class="btn btn-primary" value="Submit">
	</form:form>
</div>

</body>
</html>