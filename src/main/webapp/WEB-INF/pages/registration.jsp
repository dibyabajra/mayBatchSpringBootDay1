<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>registration page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<div class="container">
  <h2>Registration form</h2>
  <img src="https://tse4.mm.bing.net/th?id=OIP.E7RJLrX91eAudlmgwoA7KwHaFG&pid=Api&P=0&h=180" alt="registration image">
  <img src="images/registration.jpg" alt="registration image" style="height:140px">
  
  <form action="registerBook" method="post">
    <marquee><h4>${msg}</h4> </marquee>
    <div class="form-group">
      <label for="bookId">book Id:</label>
      <input type="text" class="form-control"  placeholder="Enter bookId" name="bookId">
    </div>
    
     <div class="form-group">
      <label for="bookname">book Name:</label>
      <input type="text" class="form-control"  placeholder="Enter book name" name="bookName">
    </div>
    
     <div class="form-group">
      <label for="price">Price:</label>
      <input type="text" class="form-control"  placeholder="Enter salary" name="salary">
    </div>
    
    
    <button type="submit" class="btn btn-primary">Register</button>
    
   
  </form>
</div>



</body>
</html>