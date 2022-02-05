<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "http://www.springframework.org/tags/form" prefix="vemula" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Company</title>
<link rel="stylesheet" href="css/headerstyle.css">
<link rel="stylesheet" href="css/style.css">
<style type="text/css">

.error{
  color: red;
}
</style>
</head>
<body style="background-color: lightcyan;">
<div>
<h1 style="color: orangered; font-style: inherit;">Welcome to Company Management System</h1>
</div>
<nav>
<ul>
  <li><a href="./"><b>Home</b></a></li>
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
<h2>New Company Registration</h2>
</div>
<div class="formStyle">
<vemula:form action="./saveCompany"  modelAttribute="company">
     <label for="cid">Company id :</label>
    <vemula:input type="text" id="cid" name="cid" placeholder="Enter Company id..." path="cid"></vemula:input>
    <vemula:errors path="cid" class="error"></vemula:errors>
    
    
    <label for="cname">Company Name :</label>
    <vemula:input type="text" id="cname" name="cname" placeholder="Enter Company name..." path="cname"></vemula:input>
    <br>
    <vemula:errors path="cname" class="error"></vemula:errors>
    
     <label for="caddress">Company Address :</label>
    <vemula:input type="text" id="caddress" name="caddress" placeholder="Enter Company Address..." path="caddress"></vemula:input>
    <vemula:errors path="caddress" class="error"></vemula:errors>
    
     <label for="ccapital">Company Capital :</label>
    <vemula:input type="text" id="ccapital" name="ccapital" placeholder="Enter Company Capital..." path="ccapital"></vemula:input>
   <vemula:errors path="ccapital" class="error"></vemula:errors>
   
    <input type="submit" value="Submit">
  </vemula:form>
</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>