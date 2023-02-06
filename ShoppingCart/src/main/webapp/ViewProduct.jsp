<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
<body>

	<h1>Hey ${user.userName}</h1>


 <form name="viewProduct" action="customer/addCart" method="post">

	<table class="table">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Title</th>
					<th>Category</th>
					<th>Product Description</th>
					<th>Image</th>
					<th>Price</th>
					<th>Add To cart</th>
				</tr>
			</thead>
		<c:forEach var="prod" items="${product}">
			<tr name="prod">
				<td>
					${prod.productId}
				</td>
				<td>${prod.title}</td>
				<td>${prod.catergory}</td>
				<td>${prod.productDescription}</td>
				<td>${prod.image}</td>
				<td>${prod.price}</td>
				<td>
					<a href="${user.userId}/${prod.productId}/product">Add</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</form>
	
</body>
</html>