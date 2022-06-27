<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

	<h1>Send an Omikuji!</h1>
	
	<form action="/processFormData" method="post">
	
		<div class="form-group">
			<label for="">Pick any number from 5 to 25</label><br />
			<input type="number" name="number" class="form-control"/>
		</div>
		
		<div>
			<label for="">Enter the name of any city</label><br />
			<input type="text" name="city" class="form-control"/>
		</div>
		
		<div>
			<label for="">Enter the name of any real person</label><br />
			<input type="text" name="person" class="form-control"/>
		</div>
		
		<div>
			<label for="">Enter professional endeavor or hobby</label><br />
			<input type="text" name="hobby" class="form-control"/>
		</div>
		
		<div>
			<label for="">Enter any type of living thing</label><br />
			<input type="text" name="livingThing" class="form-control"/>
		</div>
		<div>
			<label for="">Say something nice to someone:</label><br />
			<textarea name="message" id="" cols="30" rows="10" class="form-control"></textarea>
		</div>
		
		<p>Send and show a friend!</p>
		
		<input type="submit" value="Send"/>
		
	
	</form>

</body>
</html>