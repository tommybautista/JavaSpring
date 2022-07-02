<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
</head>
<body>
	<div class="container">
		<div style="display: flex;">
			<h1>Your Gold:</h1>
			<h1 class="gold">sample 10</h1>
		</div>
		
		<div style="display: flex; justify-content: space-evenly;">
			<div style="border: 1px black solid; padding: 10px; text-align: center;">
				<h4>Farm</h4>
				<h5>(earns 10-20 gold)</h5>
				<button type="submit" action="/">Find Gold</button>
			</div>
			<div style="border: 1px black solid; padding: 10px; text-align: center;">
				<h4>Cave</h4>
				<h5>(earns 10-20 gold)</h5>
				<button type="submit" action="/">Find Gold</button>
			</div>
			<div style="border: 1px black solid; padding: 10px; text-align: center;">
				<h4>House</h4>
				<h5>(earns 10-20 gold)</h5>
				<button type="submit" action="/">Find Gold</button>
			</div>
			<div style="border: 1px black solid; padding: 10px; text-align: center;">
				<h4>Quest</h4>
				<h5>(earns/takes 0-50 gold)</h5>
				<button type="submit" action="/">Find Gold</button>
			</div>
		</div>
		
		<div>
			<div><h4>Activities:</h4></div>
			<div style="border: 1px solid black; padding: 5px;">
				<h6>Sample activity by pressing the button</h6>
			</div>
		</div>
	
	
	</div>
</body>
</html>