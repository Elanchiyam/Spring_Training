<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hey ${user.userName}</h1>
	<form name="product" action="seller/addProduct" method="post">
		<input hidden type="text" name="userId" value="${user.userId}"/>
		Title : <input type="text"  name="title"/><br/>
		Category : <input type="text"  name="catergory"/><br/>
		Product Description : <input type="text"  name="productDescription"/><br/>
		Image : <input type="text"  name="image"/><br/>
		Price : <input type="number"  name="price"/><br/>
		<input type="submit" value="submit">
	</form>
</body>
</html>