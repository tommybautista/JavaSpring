<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">

		<div>
			<h2> Edit an expense: </h2>
		</div>
		<div>
			<form:form action="/savetravels/${expense.id}" method="post" modelAttribute="expense">
			     <input type="hidden" name="_method" value="put">
				<div class="form-group">
					<form:label path="name">Expense</form:label>
        			<form:errors path="name" class="text-danger" />
					<form:input type="text" class="form-control" path="name" value="${expense.name}"/>
				</div>
				<div class="form-group">
					<form:label path="vendor">Vendor</form:label>
        			<form:errors path="vendor" class="text-danger" />
					<form:input type="text" class="form-control" path="vendor" value="${expense.vendor}"/>
				</div>
				<div class="form-group">
					<form:label path="amount">Amount</form:label>
        			<form:errors path="amount" class="text-danger" />
					<form:input type="number" class="form-control" path="amount" value="${expense.amount}"/>
				</div>
				<div class="form-group">
					<form:label path="description">Description</form:label>
        			<form:errors path="description" class="text-danger" />
					<form:textarea class="form-control" path="description" rows="3" value="${expense.description}"></form:textarea>
				</div>
				<div class="form-group mt-2">
					<input type="submit" class="btn btn-primary" value="Update"></input>
				</div>
			</form:form>
		</div>

	</div>

</body>
</html>