<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Success</title>
</head>
<body>
 <jsp:include page="header.jsp" />
<jsp:include page="menu.jsp" />
	<h2>Welcome to Little Minds Book Box!!</h2>
	<span>${msg}</span>
	<h3> Please Check your details!</h3>
	<div class="row">
	<div align="center">
		
    	First Name: ${registrationForm.firstname}<br>
		Last Name: ${registrationForm.lastname}<br>
		Email: ${registrationForm.username}<br>
		Address<br>
		Street: ${registrationForm.street}<br>
		State: ${registrationForm.state} <br>
		Country:${registrationForm.country} <br>
		Zip:${registrationForm.zip} <br>
		
		Account Details:<br>
		Card Number: ${registrationForm.cardnumber}<br>
		CVC: ${registrationForm.cvc}<br>
		Expiry Date: ${registrationForm.expdate}<br>
		BoxType: ${registrationForm.subscription.boxtype}<br>
		Price: ${registrationForm.subscription.boxtype.price}<br>
	</div>
	</div>
	<input type="button" class="btn btn-primary" value="Proceed to Checkout" onclick="location.href='${pageContext.request.contextPath}/checkout'">
	<input type="button" class="btn btn-primary" value="Cancel" onclick ="location.href='${pageContext.request.contextPath}/cancelreg?username=${registrationForm.username}'">
		
	
<jsp:include page="footer.jsp" />
</body>
</html>