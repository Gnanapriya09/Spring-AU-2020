<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Viewdetails</title>
</head>
<style>

body
{
background-color: #f6eec7;
}

</style>
<body>


<a href = "<c:url value = "/home"/>">Back</a>
<br/>
<br/>
<center>
<table width="80%"border="1">
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
 <c:forEach items = "${employee}" var="employee">
 <tr>
 <td><h3><c:out value = "${employee.id}"/></h3></td>
<td><h3><c:out value = "${employee.fname}"/></h3></td>
<td><h3><c:out value = "${employee.lname }"/></h3></td>
<td><h3><c:out value = "${employee.email }"/></h3></td>
<td><h3><c:out value = "${employee.phone }"/></h3></td>
</tr>
</c:forEach>
 </tbody>
 </table>
 </div>


</center>

</body>
</html>