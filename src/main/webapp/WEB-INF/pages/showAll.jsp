<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>congratulation page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<div class="container">
  <h2>Congratulations You have received all records!!!</h2>
            
  <table class="table table-hover">
    <thead>
      <tr bgcolor="yellow">
        <th>Book Id</th>
        <th>Book Name</th>
        <th>Price</th>
        <th colspan=2>Action(Delete/Edit)</th>
        
      </tr>
    </thead>
    <tbody>
      
      <c:forEach items="${bookDtoList}" var="tempa">
      
         
		      <tr bgcolor="pink">
		        <td>${tempa.bookId}</td>
		        <td>${tempa.bookName}</td>
		        <td>${tempa.price}</td>
		        <td>
		       		<a href="deletebook?bookId=${tempa.bookId}">
		       			<button type="button" class="btn btn-warning">
		       		</button>
		       		</a> 
		        </td>
		        <td>
		        	<a href="updatebook?bookId=${tempa.bookId}">
		       			<button type="button" class="btn btn-success">
		       			<img src="images/edit.jpg" alt="delete image" style="height:10px; width:10px">
		       		</button>
		       		</a> 
		        </td>
		              	        
		        
		      </tr>
   
      </c:forEach>
  
    </tbody>
  </table>
  
  
</div>









</body>
</html>