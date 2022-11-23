<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>

<!doctype html>
<html>
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
<title>상세페이지</title>
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
					<div class="container List-container">
						<div class="row mt-1 header">
							<h5 class="col-1 board-title">제목</h5>
							<p class="col-8" style="word-break: break-all;">${pcont.post_name}</p>
							<h5 class="col-1 board-title">작성자</h5>
							<p class="col-8" style="word-break: break-all;">${pcont.member_name}</p>
							<p class="col-2">
								<fmt:formatDate value="${pcont.post_date}"
									pattern="yy/MM/dd HH:mm" />
							</p>
						</div>
						<div class="board-container">
							<h5 class="content-title">내용</h5>
							<p class="content" style="word-break: break-all;">
								${pcont.post_content}</p>
						</div>

						<div class="board-footer">
							<button type="button" class="btn btn-primary update-btn"
								onclick="location='postcont.do?post_num=${pcont.post_num}&page=${page}&state=edit'">수정</button>
							<button type="button" class="btn btn-danger delete-btn"
								id="deleteBoard"
								onclick="location='postcont.do?post_num=${pcont.post_num}&page=${page}&state=del'">삭제</button>
							<button type="button" class="btn btn-primary list-btn"
								onclick="location='postlist.do?page=${page}'">목록으로</button>
						</div>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>