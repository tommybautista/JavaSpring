<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Hopper's Receipt</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
	
</head>
<body>
	<h1>Customer Name: <c:out value="${name}"/></h1>
	<h2>Item Name: <c:out value="${itemName}"/></h2>
	<h2>Price: <c:out value="${price}"/></h2>
	<h2>Description:<c:out value="${description}"/></h2>
	<h2>Vendor: <c:out value="${vendor}"/></h2>
	
</body>
</html>