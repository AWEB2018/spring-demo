<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	.make-center{
		display: flex;
		justify-content: center;
		align-items: center;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">

<title>Insert title here</title>
</head>

<body>
	<div class="container-fluid">
		<div class="row bg-primary text-white " style="height: 60px;">
			<div class="col-sm-2 make-center">Home Page</div>
			<div class="col-sm-7 ">
				
				<form action="searchUser">
					<div class="row ">
						<div class="col-sm-10 ">
							<input name="search" class=" form-control" type="text" placeholder="Search">
						</div>
						<div class="col-sm-2">
							<button type="submit" class="text-white btn btn-info make-center">Search</button>
						</div>
					</div>
				</form>
			</div>
			
			
			<div class="col-sm-1  make-center">
				<a  href="register" class="text-white">Register</a>
			</div>
			<div class="col-sm-2  make-center">
				<a  href="logout" class="text-white">Log Out (${UNAME})</a>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-8 bg-light">
				<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">FIRST_NAME</th>
      <th scope="col">LAST_NAME</th>
      <th scope="col">MOBILE_NO</th>
      <th scope="col">USERNAME</th>
      <th scope="col">Update</th>
      <th scope="col">Delete</th>
    </tr>
  </thead>
  
  <tbody>
  	<% 
  		List<Map<String, Object>> userList = (List<Map<String, Object>>)request.getAttribute("userList");
  		for(int i=0; i<userList.size(); i++){
			Map<String, Object> row = (Map<String, Object>)userList.get(i);  			
 	%>
    <tr>
    	<td><%=row.get("ID") %></td>
      <td><%= row.get("FIRST_NAME") %></td>
      <td><%= row.get("LAST_NAME") %></td>
      <td><%= row.get("MOBILE_NO") %></td>
      <td><%= row.get("USERNAME") %></td>
      <td><a href="#"  class="text-warning">Update</a></td>
      <td >
      	<a href="deleteUser?id=<%=row.get("ID") %>"  class="text-danger">DELETE</a>
      </td>
    </tr>
    <%}%>
  </tbody>
</table>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>
</body>
</html>