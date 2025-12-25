<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8"/>
	<title>Servlet</title>
	<link rel="stylesheet" href=" <%= application.getContextPath() %>/css/style.css "/>
</head>
<body> 
	<div class="container">
	<%@ include file="menu.jsp" %>
		<h1>
			Servlet
		</h1>
		<p>This page is : Servlet</p>
		
		<form action="<%= application.getContextPath() %>/third" method="post">
		<input name="message" type="text" placeholder="Enter text here ">
		<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>