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
  <style>
  	.body{
  	font-size: 1rem;
  	font-weight: 400;
  	line-height: 1.5;
  	}
  </style>
<title>Home</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	 <jsp:include page="menu.jsp" />
	<!--  <div style="background-color:yellow">
	 <br>
	 <span style="font-weight:700;font-family:REIS"><bold><center>Welcome to Little Minds Book Box!</center></bold></span>
	</div> -->
	<div align="center">
		<span style="font-family: cursive;font-size:1.5em;color: #FF6B6B">Bond With Your Little One,<span><br>
		<span style="font-family: cursive;color:#FF6B6B">One Book At a Time </span><br>
		<span>Discover books your little ones will love,delivered to your doorstep each month.</span><br>
		<span>Every box will save up to 50% off retail prices!</span>
		
	</div>
	
	<div align="center">
		
		<img src="<%=request.getContextPath() %>/images/once-upon-a-time.jpg" alt="Photography.jpg"> <br>
		<input align="center" type="button" class="btn btn-primary" onclick ="location.href='${pageContext.request.contextPath}/login'" value="Get Started">
	</div>
	<jsp:include page="footer.jsp" />

</body>
</html>