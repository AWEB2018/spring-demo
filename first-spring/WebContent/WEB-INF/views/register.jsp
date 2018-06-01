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
		<div class="row bg-primary text-white" style="height: 50px; margin-bottom: 10px;">
			<div class="col-sm-12 make-center">Register Page</div>
		</div>
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6 bg-light ">
				<form method="post" action="register-action">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">UserName</label>
      <input type="text" name="uname" class="form-control" id="inputEmail4" placeholder="UserName">
		<small id="usernameHelp" class="form-text text-danger">${USERNAME_MISSING}</small>
      
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" name="pwd" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">First Name</label>
    <input type="text" name="fname" class="form-control" id="inputAddress" placeholder="First Name">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Last Name</label>
    <input type="text" name="lname" class="form-control" id="inputAddress2" placeholder="Last Name">
  </div>
  <div class="form-row">
    <div class="form-group col-md-12">
      <label for="inputCity">Mobile no</label>
      <input type="text" name="mobile" class="form-control" id="inputCity" placeholder="Mobile no">
    </div>
    </div>
  <button type="submit" class="btn btn-primary">Register</button>
</form>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>
</body>
</html>