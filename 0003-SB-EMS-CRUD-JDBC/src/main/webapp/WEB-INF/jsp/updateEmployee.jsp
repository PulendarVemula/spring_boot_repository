<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<h1>Update Employee Here</h1>
<hr>
<form action="./updateEmployee" method="post">
<table>
<tr>
<td>Employee id : </td>
<td><input type="text" name="eid" value="${employee.eid}"  disabled="disabled"></td>
</tr>
<tr>
<td>Employee Name : </td>
<td><input type="text" name="ename" value="${employee.ename}"></td>
</tr>
<tr>
<td>Employee Salary : </td>
<td><input type="text" name="esalary"  value="${employee.esalary}"></td>
</tr>
<tr>
<td><input type="submit" value="submit"> </td>
<td><input type="reset" value="reset"></td>

</tr>

</table>
</form>

</body>
</html>