<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Index</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">

		<div>
			<h1> Save Travels </h1>
		</div>

		<div>
			<table class="table">
				<thead>
					<tr>
						<th>Expense</th>
						<th>Vendor</th>
						<th>Amount</th>
						<th>Description</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="expense" items="${expenses}">
				    	<tr>
		        			<td><a href="/savetravels/show/<c:out value="${expense.id}"/>"><c:out value="${expense.name}"/></a></td>
		        			<td><c:out value="${expense.vendor}" /></td>
		        			<td><c:out value="${expense.amount}" /></td>
		        			<td><c:out value="${expense.description}" /></td>
		        			<td>
		        				<button><a href="savetravels/edit/<c:out value="${expense.id}"/>">Edit</a></button>
		        				<form action="/savetravels/${expense.id}" method="post">
    								<input type="hidden" name="_method" value="delete">
   									<input type="submit" value="Delete">
								</form>
		        			</td>	
		        		</tr>
	    			</c:forEach>
				</tbody>
			</table>
		</div>

		<div> 
			<h2> Add an expense: </h2>
		</div>
		<div>
			<form:form action="/savetravels/submit" method="post" modelAttribute="expense">
				<div class="form-group">
					<form:label path="name">Expense</form:label>
        			<form:errors path="name" class="text-danger" />
					<form:input type="text" class="form-control" path="name" placeholder="ex. Travel Charger"/>
				</div>
				<div class="form-group">
					<form:label path="vendor">Vendor</form:label>
        			<form:errors path="vendor" class="text-danger" />
					<form:input type="text" class="form-control" path="vendor" placeholder="ex. ACDC Outlets"/>
				</div>
				<div class="form-group">
					<form:label path="amount">Amount</form:label>
        			<form:errors path="amount" class="text-danger" />
					<form:input type="number" class="form-control" path="amount" placeholder="ex. 49.99"/>
				</div>
				<div class="form-group">
					<form:label path="description">Description</form:label>
        			<form:errors path="description" class="text-danger" />
					<form:textarea class="form-control" path="description" rows="3"></form:textarea>
				</div>
				<div class="form-group mt-2">
					<input type="submit" class="btn btn-primary"></input>
				</div>
			</form:form>
		</div>

	</div>

</body>
</html>