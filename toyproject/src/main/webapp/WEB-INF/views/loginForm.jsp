<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<script>
	function login_check() {
		if($.trim($("#email").val())==""){
			alert("이메일을 입력해주세요.");
			$("#email").val("").focus();
			return false;
		}
		if($.trim($("#passwd").val())==""){
			alert("비밀번호를 입력해주세요.");
			$("#passwd").val("").focus();
			return false;	
		}
	}		
	
/*[비번 찾기창]*/
	function passwd_find(){
		window.open("member_pwd_find.do","비밀번호 찾기","width=500, height=500");
		}		
</script>
	

<form method="post" action="login" onsubmit="return login_check()">
	<div>
		<h5>이메일</h5>
		<input type="text" id="email" name="member_email" size=20 required="required">
	</div>
	<div>
		<h5>비밀번호</h5>
		<input type="password" id="password" name="member_pw" size=20 required="required">
	</div>
	<div>
		<input type="submit" value="로그인" >
		<input type="button" value="회원가입" >
		<input type="button" value="비밀번호 찾기" name="passwd_btn" onclick="passwd_find()" />
	</div>
</form>

</body>
</html>