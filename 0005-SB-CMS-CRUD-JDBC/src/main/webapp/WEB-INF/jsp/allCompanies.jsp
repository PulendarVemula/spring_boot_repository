<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all Companies</title>
<link rel="stylesheet" href="css/headerstyle.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body style="background-color: lightcyan;">
<div>
<h1 style="color: orangered; font-style: inherit;">Welcome to Company Management System</h1>
</div>
<nav>
<ul>
  <li><a href="welcome.jsp"><b>Home</b></a></li>
  <li><a href="#news"><b>News</b></a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn"><b>Companies</b></a>
    <div class="dropdown-content">
      <a href="./allCompanies">All Companies</a>
      <a href="./addCompany">Add Company</a>
    </div>
  </li>
</ul>
</nav>
<div class="formHeader">
<h2>All Companies</h2>
</div>
<div class="tablediv">
<table id="companies">
  <tr>
    <th>Company_id</th>
    <th>Company_Name</th>
    <th>Company_Salary</th>
    <th>Company_Capital</th>
    <th>Company_Update</th>
    <th>Company_Delete</th>
    
  </tr>
  <c:forEach items="${allCmp}" var="Company">
<tr>
<td><c:out value="${Company.cid}"></c:out></td>
<td><c:out value="${Company.cname}"></c:out></td>
<td><c:out value="${Company.caddress}"></c:out></td>
<td><c:out value="${Company.ccapital}"></c:out></td>
<td><a href="./showUpdateCompany?cid=${Company.cid}"><img src="icons/update.jpg" alt="update" style="width: 40px;height: 25px"></a></td>
<td><a href="./deleteCompany?cid=${Company.cid}"><img src="icons/delete.jpg" alt="delete" style="width: 30px;height: 20px"></a></td>
</tr>
</c:forEach>
</table>
</div>

</body>
</html>