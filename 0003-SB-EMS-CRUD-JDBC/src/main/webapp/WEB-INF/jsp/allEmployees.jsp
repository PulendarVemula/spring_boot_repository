<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
<style type="text/css">
table {
	text-align: center;
}
</style>
</head>
<body>
<h1>All Employees</h1>
<hr>
<table border="2px solid">
<tr>
<th>Employee_id</th>
<th>Employee_Name</th>
<th>Employee_Salary</th>
<th>Delete_Employee</th>
<th>Update_Employee</th>
</tr>

<c:forEach items="${employees}" var="emp">
<tr>
<td><c:out value="${emp.eid}"></c:out></td>
<td><c:out value="${emp.ename}"></c:out></td>
<td><c:out value="${emp.esalary}"></c:out></td>
<td><a href="./deleteEmployee?eid=${emp.eid }">Delete</a></td>
<td><a href="./showUpdateEmployee?eid=${emp.eid}">Update</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>