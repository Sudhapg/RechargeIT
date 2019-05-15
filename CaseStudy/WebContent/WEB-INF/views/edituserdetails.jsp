<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Kalam" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Edit User Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	 <jsp:include page="menu.jsp" />
	<div align="center">
		<form:form action="${pageContext.request.contextPath}/saveuserdetails" method="post" modelAttribute="userdetails">
		
		<table>
			<tr>
				<td>FirstName:</td>
				<td><form:input class="form-control" path="firstname" /></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><form:input class="form-control" path="lastname" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input class="form-control" path="username" /></td>
			</tr>
			<tr>
				<td>Street:</td>
				<td><form:input class="form-control" path="street" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:input class="form-control" path="city" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:input class="form-control" path="state" /></td>
			</tr>
			<tr>
				<td>ZipCode:</td>
				<td><form:input class="form-control" path="zip" /></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><form:input class="form-control" path="country" /></td>
			</tr>
			<tr>
				<td>CreditCardNumber:</td>
				<td><form:input class="form-control" path="cardnumber" /></td>
			</tr>
			<tr>
				<td>CVC:</td>
				<td><form:input class="form-control" path="cvc" /></td>
			</tr>
			<tr>
				<td>ExpiryDate:</td>
				<td><form:input class="form-control" path="expdate" /></td>
			</tr>
			<tr>
				<td>BoxType:</td>
				
				<td><form:input class="form-control" path="subscription.boxtype" /></td>
			</tr>
		</table>
		<input type="submit" value="Save">
		</form:form>
	</div>

</body>
</html>