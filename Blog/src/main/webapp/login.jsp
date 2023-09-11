<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog: Login</title>
<%@include file="all_component/allCss.jsp"%>
</head>
<body style="background-color: #FAFAD2">
	<%@include file="all_component/navbar.jsp"%>
	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Login Form</h4>
						<form>
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" required="required">
								
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1" required="required">
							</div>
							
								<button type="submit" class="btn btn-primary">Login</button><br>
								<a href="register.jsp">Register</a>
							</div>
						</form>


					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>