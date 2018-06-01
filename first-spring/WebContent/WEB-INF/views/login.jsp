<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
	<div class="row bg-primary text-white" style="font-size: 50px; margin-bottom: 10px;">
		<div class="col-sm-12">Login Page</div>
	</div>
	<div class="row ">
		<div class="col-sm-7"></div>
		<div class="col-sm-4 bg-light">
			<form action="login-action" method="post">
			  <div class="form-group">
			    <label for="exampleInputEmail1">UserName </label>
			    <input type="text" name="uname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
			    <small id="usernameHelp" class="form-text text-danger">${USERNAME_MISSING}</small>
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Password</label>
			    <input type="password" name="pwd" class="form-control" id="exampleInputPassword1" placeholder="Password">
			    <small id="passwordHelp" class="form-text text-muted">${PASSWORD_MISSING}</small>
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Login</button>
			</form>
			
			<div class="col-sm-12 text-danger">
				${ERROR}
			</div>
		</div>
		
	</div>
</div>
</body>
</html>