<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h1>User:Home</h1>
<c:if test="${not empty userobj }">
				<h1>Name:${userobj.name}</h1>
				<h1>Email:${userobj.email}</h1>
				</c:if>
				
				
</body>
</html>