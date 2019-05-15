<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Login Page</title>
</head>
<body>
<jsp:include page="header.jsp" />
<jsp:include page="menu.jsp" />
<div class="jumbotron text-center">

<h2>Please Login!</h2>
</div>
<div class="container">
<form:form align="center" action="loginAction" method="post">
	<div class="form-group">
	Don't have an account? <a href="${pageContext.request.contextPath}/subscribe"> subscribe</a> to Sign Up!
	<br>
	<table align="center">
		<tr>
		<td>Email:</td>
		<td>
			<input type="text" name="username">
		</td>
		</tr>
		<tr>
			<td>Password:</td>
			<td>
				<input type="password" name="password">
			</td>
		</tr>
		<tr>
		  	<td><button class="btn btn-lg btn-block btn-primary" type="submit">Login</button></td>
		</tr>
	</table>
	</div>
</form:form>
</div>

<jsp:include page="footer.jsp" />
</body>
</html>