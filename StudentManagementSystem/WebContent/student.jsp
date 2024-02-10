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
    <li><a href="register" class="btn btn-primary"  >Add student</a></li>
  </ul>

  </nav>
</div>
<div>
     <table class="table table-striped ">
          <thead class="thead-dark">
          <tr>
          <th class="text-white">Id</th>
          <th class="text-white">Name</th>
          <th class="text-white">Email</th>
          <th class="text-white">D.O.B</th>
          <th class="text-white">Modify</th>
          </tr>
          </thead>   
          <tbody>
          <c:forEach var="student1" items="${student}">
            <tr>
               <td><c:out value="${student1.id}"/></td>
                <td><c:out value="${student1.name}"/></td>
                <td><c:out value="${student1.email}"/></td>
                <td><c:out value="${student1.dob}"/></td>
                <td>
                <a href="edit?id=<c:out value="${student1.id}"/>" class="btn btn-warning ">Edit</a>
                <a href="delete?id=<c:out value="${student1.id}"/>" class="btn btn-danger ">Delete</a>
                </td>
            </tr>
            </c:forEach>
          </tbody>
     </table><br>

</div>



</body>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" ></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" ></script>
</html>