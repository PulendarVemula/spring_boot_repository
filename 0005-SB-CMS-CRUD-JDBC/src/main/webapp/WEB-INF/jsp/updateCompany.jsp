<%@page import="com.createiq.cms.model.Company"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Company Here</title>
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
<h2>Update Company Here</h2>
</div>
<div class="formStyle">
<form action="./updateCompany" method="post">
     <label for="cid">Company id :</label>
    <input type="text" id="cid" name="cid" placeholder="Enter Company id..." readonly="readonly" value="${company.cid}" >
 
    <label for="cname">Company Name :</label>
    <input type="text" id="cname" name="cname" placeholder="Enter Company name..." value="${company.cname}">

     <label for="caddress">Company Salary :</label>
    <input type="text" id="caddress" name="caddress" placeholder="Enter Company Address..." value="${company.caddress}"> 
  
   <label for="ccapital">Company Capital :</label>
    <input type="text" id="ccapital" name="ccapital" placeholder="Enter Company Capital..." value="${company.ccapital}"> 
  
  
    <input type="submit" value="Edit & Submit">

  </form>
</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>
</body>
</html>