<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
</head>
<body>
<h1>All Students</h1>
<hr>
<table border="2px solid">
<tr>
<th>Student_id</th>
<th>Student_Name</th>
<th>Student_Address</th>
<th>Student_Delete</th>
<th>Student_Update</th>
</tr>
<c:forEach items="${allStd}" var="std">
<tr>
<td><c:out value="${std.sid }"></c:out></td>
<td><c:out value="${std.sname }"></c:out></td>
<td><c:out value="${std.saddress }"></c:out></td>
<td><a href="./deleteStudent?sid=${std.sid}">Delete</a></td>
<td><a href="./showUpdateStudent?sid=${std.sid}">Update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>