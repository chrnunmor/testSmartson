<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/load" method="post">
	<div>
		<input type="text" name="campaign" value=""/>
		<input type="submit" value="Choose"/>
	</div>
</form>
<form action="/create" method="post">
	<div><input type="submit" value="Create"/></div>
</form>
<button type="button">Edit</button>


</body>
</html>