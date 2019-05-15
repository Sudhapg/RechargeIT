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
<title>Manage Account</title>
</head>
<body>
<jsp:include page="header.jsp" />
	 <jsp:include page="menu.jsp" />

<h2>Manage Account</h2>
<span>${msg}</span>
<form action="getuserdetails" method="POST">
<input type="text" name="username" placeholder="Enter your username">
<input type="submit" class="btn btn-primary" value="Click here"><br>
<br>
<a href="${pageContext.request.contextPath}/cancelsubscription">CancelSubscription</a>
</form>
<jsp:include page="footer.jsp" />
</body>
</html>