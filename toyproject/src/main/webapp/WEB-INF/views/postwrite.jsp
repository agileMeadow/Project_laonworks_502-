<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file = "./header.jsp" %>

<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Hahmlet:wght@100;200;400&display=swap"
	rel="stylesheet">
<title>글 수정</title>
<style>
* {
	font-family: 'Hahmlet', serif;
}
</style>
</head>

<body>
	<div class="my-5">
		<main class="mb-4">
			<div class="container px-4 px-lg-5">
				<div class="row gx-4 gx-lg-5 justify-content-center">
					<form action="/postinsert" method=post>
					<input type="hidden" name="page" value="${page}">
					<div class="container List-container">
						<div class="row mt-1 header">
							<div class="col-8">
							<h5 class="content-title">글작성</h5>
							<h5 class="content-title">제목</h5>
							<input type="text" name="post_name" value="" required></div>
							<h5 class="col-1"></h5>
							<p class="col-8"></p>
							<p class="col-2"></p>
						</div>
						<div class="post-container">
							<h5 class="content-title">내용</h5>
							<div class="content">
							<textarea class="form-control" name="post_content" rows="3" 
								style="width:90%; height:250px; resize:none;" maxlength="300" placeholder = "내용을 작성해주세요" required></textarea>
							</div>
						</div>
						<div class="board-footer">
							<button type="submit" class="btn btn-warning update-btn">작성</button>
							<button type="button" class="btn btn-primary list-btn"
								onclick="history.go(-1);">취소</button>
						</div>
					</div>
					</form>
				</div>
			</div>
		</main>
	</div>
</body>
</html>