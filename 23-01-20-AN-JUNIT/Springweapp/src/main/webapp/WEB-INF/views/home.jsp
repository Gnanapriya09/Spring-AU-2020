<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<title>Spring MVC</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<br />
<center>
	<strong>SPRING MVC</strong>
</center>
<br />
<br />
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
	float: left;
}

#submit {
	background-color: #ee8972;
	width: 100px;
	height: 30px;
}
</style>
</head>
<body>
	<br />
	<nav class="navbar navbar-default" style="align: center; width: cover;">
		<div class="container-fluid"
			style="padding-left: 250px; width: cover; background-color: lightgrey">
			<div class="navbar-header" style="background-color: lightgrey"></div>
			<ul class="nav navbar-nav" style="background-color: lightgrey">

				<li class="active"><a href="<c:url value= "/home"/>">Welcome
						Home</a></li>
				<li class="active"><a href="<c:url value= "/viewall"/>">List
						All Employees</a></li>
				<li class="active"><a href="<c:url value= "/view"/>">Search
						Employees</a></li>
				<li class="active"><a href="<c:url value= "/edit"/>">Update
						Employees</a></li>
				<li class="active"><a href="<c:url value="/delete"/>">Delete
						Employee</a></li>

			</ul>
		</div>
	</nav>
	<br />
	<br />
	<center>
		<div style="width: 600px; margin: auto;">
			<form action="login" method="post"">

				<span>Employee ID</span> <input type="text" name="id"> <br />
				<br /> <span>First Name &nbsp;</span> <input type="text"
					name="fname"> <br /> <br /> <span>Last Name&nbsp;</span>
				<input type="text" name="lname"> <br /> <br /> <span>Phone&nbsp;&nbsp;
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span> <input type="tel" name="phone">
				<br /> <br /> <span>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
				<input type="email" name="email"> <br /> <br /> <input
					id="submit" type="submit" value="Submit">
			</form>
		</div>
	</center>
</body>
</html>