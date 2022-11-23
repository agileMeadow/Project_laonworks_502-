<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<main class="mt-5 pt-5">
	<div class="container-fluid px-4">
		<h1 class="mt-4">게시판</h1>


		<!-- 목록 -->
		<div class="card mb-4">
			<div class="card-header">
				<a class="btn btn-primary float-end" href="register"> 
					<i class="fas fa-edit"></i> 글 작성
				</a>
			</div>
			<div class="card-body">
				<table class="table table-hover table-striped">
					<thead>
						<tr>
							<th>글번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성일</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${postlist}" var="p">
							<tr>
								<td>${p.post_num}</td>
								<td><a href="postcont?post_num=${p.post_num} ">${p.post_name}</a></td>
								<td>${p.member_name}</td>
								<td>${p.post_date}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	</main>
	
	
	<!-- 페이징 -->
	
	

</body>
</html>