<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
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
<title>User Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	 <jsp:include page="menu.jsp" />
	
	<div class="container">
	
	<table class="table table-dark">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Street</th>
			<th>City</th>
			<th>State</th>
			<th>ZipCode</th>
			<th>Country</th>
			<th>CreditCardNo</th>
			<th>CVC</th>
			<th>ExpiryDate</th>
			<th>SubscriptionType</th>
		</tr>
			
			<tr>
				<td>${userdetails.firstname}</td>
				<td>${userdetails.lastname}</td>
				<td>${userdetails.street}</td>
				<td>${userdetails.city}</td>
				<td>${userdetails.state}</td>
				<td>${userdetails.zip}</td>
				<td>${userdetails.country}</td>
				<td>${userdetails.cardnumber}</td>
				<td>${userdetails.cvc}</td>
				<td>${userdetails.expdate}</td>
				<td>${userdetails.subscription.boxtype}</td>
				<td>
					<input type="button" class="button btn-success" onclick="location.href='${pageContext.request.contextPath}/edituser?username=${userdetails.username}'" value="Edit" name="edit">
				</td>
			</tr>
		
	
	</table>
	</div>
	<jsp:include page="footer.jsp" />
	
</body>
</html>