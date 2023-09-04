<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog: Index</title>
<%@include file="all_component/allCss.jsp"%>

<style type="text/css">
.back-img {
	background: url("img/banner-web.jpg");
	height: 70vh;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid back-img">
		<h2 class="text-center text-danger">Blog</h2>
	</div>

	<div class="container-fluid">
		<h3 class="text-center">New</h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card">
					<div class="card-body text-center">
						<img alt="" src="cosmetics/perfume1.jpg" style="width: 150px"
							height="200px" class="img-thumblin">
						<p>Miss Dior</p>
						<p>Nuowsc hoa</p>
						<p>Categories: Perfume</p>
						<div class="row ">

							<a href="" class="btn btn-success btn-sm1">View Details</a>

						</div>
					</div>
				</div>
			</div>
		</div>

	</div>


</body>
</html>