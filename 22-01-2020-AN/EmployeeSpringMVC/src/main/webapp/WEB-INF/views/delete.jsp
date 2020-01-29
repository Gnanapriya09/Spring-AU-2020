<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<style>
body {
	background-color: #f6eec7;
}

input {
	float: center;
	border-radius: 50px;
	align: center;
	background-color: #f7d695;
	align-content: center;
}

span {
	align-content: center;
	align-items: center;
	float: center;
}

#submit {
	background-color: #ee8972;
	width: 100px;
	height: 30px;
}
</style>
<body>
	<a href="<c:url value = "/home"/>">Back</a>

	<div style="text-align: center;">
		<form action="deletedata" method="post">

			<span>Enter Employee ID:</span> <input type="text" name="id">
			<br />
			<br /> <input id="submit" type="submit" value="Submit">
		</form>
		<br /> 

		<div class="container">

			<c:if test="${not empty result}">
				<div class="alert alert-${css} alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<strong>${result}</strong>
				</div>
			</c:if>
		</div>


	</div>
</body>
</html>