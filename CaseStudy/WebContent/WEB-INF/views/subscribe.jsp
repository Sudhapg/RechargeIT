<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no"> 
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Subscription Page</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<jsp:include page="menu.jsp" />
<div style = "background-color:yellow">
<div style="float:right">
	<span>${msg}</span>
</div>
<h3><center>Subscribe Today!</center></h3>
</div>
<div class="row">
	<div class="col-4 px-5">
		<img src=" <%=request.getContextPath()%>/images/bookboximg1.jpg" style="width:300px; height=300px;" alt="Photography.jpg">
		<div>
		<h4 style="font-family: REIS;font-weight: 500;line-height:1.1 text-align:center!important">Board Book Box</h4>
		<span>4 Board Books,Ages 0-3</span><br>
		<span>Our board book box is great for children ages 0-3. In each box, 
		you will find 3-4 books which will bring lot of joy to your baby or toddler in your life!</span><br>
		<span>$25.00</span>
		<!-- <input type="button" class="btn btn-primary" onclick="$location.href='${pageContext.request.contextPath}/registeruser'" value="Subscribe"> -->
		</div>
	</div>
	<div class="col-4">
		<img src=" <%=request.getContextPath()%>/images/bookboximg2_.jpg" style="width:300px; height=300px;" alt="Photography.jpg">
		<div>
		<h4 style="font-family: REIS;font-weight: 500;line-height:1.1 text-align:center!important">Picture Book Box</h4>
		<span>4 Board Books,Ages 0-3</span><br>
		<span>Our picture book box is great for children ages 4-7. In each box, 
		you will find 3-4 books which will bring lot of joy to your kid in your life!</span><br>
		<span>$30.00</span>
		</div>
	</div>
	<div class="col-4">
		<img src=" <%=request.getContextPath()%>/images/bookboximg3.jpg" style="width:300px; height=300px;" alt="Photography.jpg">
		<div>
		<h4 style="font-family: REIS;font-weight: 500;line-height:1.1 text-align:center!important">Chapter Book Box</h4>
		<span>4 Chapter Books,Ages 7-12</span><br>
		<span>Our chapter book box is great for children ages 7-12. In each box, 
		you will find 3-4 books which will bring lot of joy to your kid in your life!</span><br>
		<span>$35.00</span>
		
	</div>
</div>

</div> <!--  closing the main div -->

<div style="text-align: center">
&nbsp;&nbsp;&nbsp;<input class="btn btn-primary btn-center mb-5" type="button" onclick="location.href='${pageContext.request.contextPath}/registeruser'" value="Register Me!">

</div>
	<jsp:include page="footer.jsp" />
</body>
</html>