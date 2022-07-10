<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">

		<div style="display:flex; justify-content:space-between;">
			<h1> Expense Detail </h1>
			<a href="/savetravels"> Go Back </a>
		</div>

		<div>
			<table>
				<tr>
					<th><h4> Expense: </h4></th>
					<td class="p-3"><h4> ${expense.name} </h4></td>
				</tr>
				<tr style="margin:5px;">
					<th><h4> Expense Description: </h4></th>
					<td class="p-3"><h4> ${expense.description} </h4></td>
				</tr>
				<tr>
					<th><h4> Vendor: </h4></th>
					<td class="p-3"><h4> ${expense.vendor} </h4></td>
				</tr>
				<tr>
					<th><h4> Amount Spent: </h4></th>
					<td class="p-3"><h4> ${expense.amount} </h4></td>
				</tr>

			</table>

		</div>
	</div>

</body>
</html>