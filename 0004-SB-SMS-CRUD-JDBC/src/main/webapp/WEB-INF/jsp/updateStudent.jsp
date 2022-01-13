<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
</head>
<body>
<h1>Update Student Here</h1>
<hr>
<form action="./updateStudent" method="post">
<table>
<tr>
<td>Student id : </td>
<td><input type="text" name="sid" value="${student.sid}"  readonly="readonly" </td>
</tr>
<tr>
<td>Student Name : </td>
<td><input type="text" name="sname" value="${student.sname}"></td>
</tr>
<tr>
<td>Student Salary : </td>
<td><input type="text" name="saddress"  value="${student.saddress}"></td>
</tr>
<tr>
<td><input type="submit" value="submit"> </td>
<td><input type="reset" value="reset"></td>

</tr>

</table>
</form>

</body>
</html>