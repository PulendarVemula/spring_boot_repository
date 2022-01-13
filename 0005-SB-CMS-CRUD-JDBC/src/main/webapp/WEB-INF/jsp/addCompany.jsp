<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Company</title>
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
      <a href="./addCompany.jsp">Add Company</a>
    </div>
  </li>
</ul>
</nav>
<div class="formHeader">
<h2>New Company Registration</h2>
</div>
<div class="formStyle">
<form action="./saveCompany" method="post">
     <label for="cid">Company id :</label>
    <input type="text" id="cid" name="cid" placeholder="Enter Company id...">

    <label for="cname">Company Name :</label>
    <input type="text" id="cname" name="cname" placeholder="Enter Company name...">

     <label for="caddress">Company Address :</label>
    <input type="text" id="caddress" name="caddress" placeholder="Enter Company Address..."> 
    
     <label for="ccapital">Company Capital :</label>
    <input type="text" id="ccapital" name="ccapital" placeholder="Enter Company Capital...">
  
    <input type="submit" value="Submit">
  </form>
</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>