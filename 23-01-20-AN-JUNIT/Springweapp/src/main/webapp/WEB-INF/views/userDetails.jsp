<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<style>
body {
	background-color: #f6eec7;
}
</style>

<body>

	<a href="<c:url value='/home'/>">Back</a>

	<table width="60%" border="1">
		<thead>
			<tr>
				<td>Employee ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Email</td>
				<td>Phone</td>
			</tr>
		</thead>

		<tbody>
			<td><h3>${employee.id }</h3></td>
			<td><h3>${employee.fname }</h3></td>
			<td><h3>${employee.lname }</h3></td>
			<td><h3>${employee.email }</h3></td>
			<td><h3>${employee.phone }</h3></td>
		</tbody>
	</table>
</body>
</html>
