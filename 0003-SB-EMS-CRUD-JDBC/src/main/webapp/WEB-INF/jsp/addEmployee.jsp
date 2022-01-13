<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h1>Add Employee</h1>
<hr>
<form action="./saveEmployee" method="post">
<table>
<tr>
<td>Employee id : </td>
<td><input type="text" name="eid"></td>
</tr>
<tr>
<td>Employee Name : </td>
<td><input type="text" name="ename"></td>
</tr>
<tr>
<td>Employee Salary : </td>
<td><input type="text" name="esalary"></td>
</tr>
<tr>
<td><input type="submit" value="Submit"> </td>
<td><input type="reset" value="Reset"></td>
</tr>

</table>
</form>
</body>
</html>