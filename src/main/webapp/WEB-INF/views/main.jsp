<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>

<style>
	.button{
		margin-top: 350px;
		text-align: center;
	}
</style>

</head>
<body>

<div class="button">
	<input type="button" class="w-30 btn btn-lg btn-primary" value="로그인 페이지" 
		onclick="location='loginForm'">
	<input type="button" class="w-30 btn btn-lg btn-primary" value="글 목록"
		name="passwd_btn" onclick="location='post_list.do'"/>
</div>


</body>
</html>