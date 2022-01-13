<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<h1>Add Student Here</h1>
<hr>
<form action="./saveStudent" method="post">
<table>
<tr>
<td>Student id : </td>
<td><input type="text" name="sid"></td>
</tr>
<tr>
<td>Student Name : </td>
<td><input type="text" name="sname"></td>
</tr>
<tr>
<td>Student Address : </td>
<td><input type="text" name="saddress"></td>
</tr>
<tr>
<td><input type="submit" value="Submit"> </td>
<td><input type="reset" value="Reset"></td>
</tr>

</table>
</form>
</body>
</html>