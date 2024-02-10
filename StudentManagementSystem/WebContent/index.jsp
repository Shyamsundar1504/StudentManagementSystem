<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management System</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
<div>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
 <span class="navbar-brand mb-0 h1">Student Management System</span>
  <ul  class="navbar-nav ">
    <li><a href="list" class="btn btn-success">View Student List</a></li>
  </ul>

  </nav>
</div>

<div class="container col-md-6 px-5 py-5 bg-dark" style="border: 1px solid ; margin-top: 10px ;   ">

   <form action="insert" method="post" class="form-grop">
   <h2 class="text text-center text-warning">Student Registration Form</h2>
      
         <label for="name"  class="text-white">Name</label>
       <input type="text" id="name" class="form-control " name="name" placeholder="Enter the Name"><br>
         <label for="email"  class="text-white">Email</label>
       <input type="email" id="email" class="form-control" name="email" placeholder="Enter the Email"><br>
         <label for="D.O.B"  class="text-white">D.O.B</label>
       <input type="text" id="D.O.B" class="form-control" name="dob" placeholder="dd/yy/mm"><br>
       <button type="submit" class="btn btn-primary" >add info</button>
   </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" ></script>
</html>