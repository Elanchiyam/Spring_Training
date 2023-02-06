<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="user" action="addUser" method="post">
		UserName : <input type="text"  name="userName"/><br/>
		EmailId : <input type="text"  name="emailId"/><br/>
		password : <input type="text"  name="password"/><br/>
		<select name="Role">
			<option value="Customer">Customer</option>
			<option value="Seller">Seller</option>
		</select>
		<input type="submit" value="submit">
	</form>
</body>
</html>