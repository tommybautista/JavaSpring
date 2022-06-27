<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Fruity Loops</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/main.css"/>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	
</head>
<body>
	<h1>Fruits</h1>
	
	<table class="table table-striped table-dark table-hover">

		<thead class="thead-dark">
			<tr>
				<th scope="col">Fruit</th>
				<th scope="col">Price</th>
			
			</tr>
		</thead>
		<tbody>
			    <c:forEach var="fruit" items="${fruitsFromMyController}">
			    	<tr>
	        			<td><c:out value="${fruit.name}" /></td>
	        			<td><c:out value="${fruit.price}" /></td>
	        		</tr>
    			</c:forEach>
		</tbody>
	
	</table>


</body>
</html>