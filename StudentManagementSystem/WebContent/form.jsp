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
  <a class="navbar-brand text-center text-dark text-bold" href="#" >Student management system</a>
  </nav>
</div>


<div class="container col-md-6 px-5 py-5 bg-dark" style="border: 1px solid ; margin-top: 10px ;   ">
<c:if test="(student1!=null)"> </c:if>
   <form action="update" method="get" class="form-grop">
   <h2 class="text text-center text-warning">Student updation Form</h2>
        <label for="id"  class="text-white">Id</label>
       <input type="number" id="id" class="form-control " value="<c:out value="${student1.id }"/>" name="id" placeholder="Enter the Id"><br>
         <label for="name"  class="text-white">Name</label>
       <input type="text" id="name" class="form-control " value="<c:out value="${student1.name }"/>" name="name" placeholder="Enter the Name"><br>
         <label for="email"  class="text-white">Email</label>
       <input type="email" id="email" class="form-control" value="<c:out value="${student1.email }"/>" name="email" placeholder="Enter the Email"><br>
         <label for="D.O.B"  class="text-white">D.O.B</label>
       <input type="text" id="D.O.B" class="form-control" value="<c:out value="${student1.dob }"/>" name="dob" placeholder="dd/yy/mm"><br>
       <button type="submit" class="btn btn-success" >update info</button>
   </form>
</div>

</body>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" ></script>
</html>