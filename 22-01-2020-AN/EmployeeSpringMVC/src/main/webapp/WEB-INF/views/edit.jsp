<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>UpdateDetails</title>
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
		<form action="fetch" method="post">
			<br /> <span>Enter Employee ID:</span> <input type="text" name="id">
			<br /> <br /> <input id="submit" type="submit" value="Fetch">
		</form>
		<br /> <span><strong>Update Here</strong></span> <br /> <br />
		<form action="editdata" method="post">
			<br /> <span>Employee ID &nbsp;</span> <input type="text" name="id"
				value=${employee.id }> <br /> <br /> <span>First
				name&nbsp;&nbsp;&nbsp;</span> <input type="text" name="fname"
				value=${employee.fname }> <br /> <br /> <span>Last
				name&nbsp;&nbsp;&nbsp;</span> <input type="text" name="lname"
				value=${employee.lname }> <br /> <br /> <span>Phone&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			<input type="tel" name="phone" value=${employee.phone }> <br />
			<br /> <span>Email&nbsp;&nbsp;&nbsp;&nbsp;</span> <input
				type="email" name="email" value=${employee.email }> <br />
			<br /> <input id="submit" type="submit" value="Submit">
		</form>
	</div>

	<div class="container">

		<c:if test="${not empty result}">
			
				<strong>${result}</strong>
			</div>
		</c:if>
	</div>

</body>
</html>