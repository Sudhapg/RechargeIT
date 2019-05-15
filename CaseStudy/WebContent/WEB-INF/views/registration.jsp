<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script type="text/javascript" src="./scripts/application.js"></script>
<!--  Link to Font Awesome 4 icons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!--  link to external stylesheet -->
<link rel="stylesheet" href="./styles/main.css">
<style>
.errormsg {
	color: red;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div align="center" class="jumbotron text-center">
		<h2>Registration Page</h2>
	</div>
	<div class="row">
	<div align="center" class="container col-6 offset-3">
		<form:errors path="user.*" class="errormsg" />
		<form:form action="${pageContext.request.contextPath}/saveUser"
			method="POST" modelAttribute="registrationForm">
			
			<div class="form-group">
				<input type="text" class="form-control" name="firstname" placeholder="* Enter your first name" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="lastname" placeholder="* Enter your last name" required>
				
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="username" placeholder="*Enter your email" required>
			</div>
			<div class="form-group">
				<input type="password" class="form-control" name="password" placeholder="*Enter your password" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="street" placeholder="*Enter your street address" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="city" placeholder="*Enter your city" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="state" placeholder="*Enter your state" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="country" placeholder="*Enter your country" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="zip" placeholder="*Enter your zipcode" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="cardnumber" placeholder="*Enter your 16 digit creditcard number" required>
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="cvc" placeholder="*Enter your 3 digit cvc number" required>
			</div>
			<div class="form-group">
				<input type="date" class="form-control" name="expdate" required>
			</div>
			
			<form:select class="form-control" path="subscription.boxtype">
							<c:forEach var="type" items="${types}">
								<form:option value="${type}">${type.getDesc()}</form:option>
							</c:forEach>
			</form:select>
			<br>
			<input class="btn btn-primary mb-5" type="submit" value="Submit">
		</form:form>
	</div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>