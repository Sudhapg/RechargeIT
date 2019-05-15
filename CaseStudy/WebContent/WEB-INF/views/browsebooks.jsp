<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<title>Browse Books</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="menu.jsp" />
	<div class="container">
	
	<h4>List of Books</h4>
	<table class="table table-dark">
	<tr>
		<th>Book Name</th>
		<th>Publisher</th>
		<th>Category</th>
	</tr>
	<c:forEach items="${bookslist}" var="books">
		<tr>
			<td>${books.bookname}</td>
			<td>${books.publisher}</td>
			<td>${books.category}</td>
			
		</tr>	
	
	</c:forEach>
	</table>
		
	</div>
</body>
</html>