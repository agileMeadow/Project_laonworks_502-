<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="commonConfig.jsp"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.104.2"> -->

<title>login</title>

<!--     <link href="signin.css" rel="stylesheet"> -->

<link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/sign-in/">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
      
            html,
	body {
	  height: 100%;
	}
	
	body {
	  display: flex;
	  align-items: center;
	  padding-top: 40px;
	  padding-bottom: 40px;
	  background-color: #f5f5f5;
	}
	
	.form-signin {
	  max-width: 330px;
	  padding: 15px;
	}
	
	.form-signin .form-floating:focus-within {
	  z-index: 2;
	}
	
	.form-signin input[type="email"] {
	  margin-bottom: -1px;
	  border-bottom-right-radius: 0;
	  border-bottom-left-radius: 0;
	}
	
	.form-signin input[type="password"] {
	  margin-bottom: 10px;
	  border-top-left-radius: 0;
	  border-top-right-radius: 0;
	}
	
	.button-group{
	margin-bottom: 10px;
	}
    </style>


</head>

<body class="text-center">

<script>
	function login_check() {
		
		if($.trim($("#member_email").val())==""){
			alert("이메일을 입력해주세요.");
			$("#member_email").val("").focus();
			return false;
		}
		
		if($.trim($("#member_pw").val())==""){
			alert("비밀번호를 입력해주세요.");
			$("#member_pw").val("").focus();
			return false;	
		}
		
		// 이메일 형식 유효성 검사
		email = $.trim($("#member_email").val());
		  
		var regEmail = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;

		if(!regEmail.test(email)){
			alert("이메일 형식이 유효하지 않습니다.");
			$("#member_email").val("").focus();
			return false;
		}
	}		
		
/*[비번 찾기창]*/
	function passwd_find(){
		window.open("member_pwd_find.do","비밀번호 찾기","width=500, height=500");
		}		
</script>


<main class="form-signin w-100 m-auto">

<form method="post" action="login" onsubmit="return login_check()">

    <h1 class="h3 mb-3 fw-normal">로그인</h1>
    
    <div class="form-floating">
      <input type="email" class="form-control" id="member_email" name="member_email" 
      		placeholder="name@example.com">
      <label for="floatingInput">Email address</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="member_pw" name="member_pw"
      		placeholder="Password">
      <label for="floatingPassword">Password</label>
    </div>

    <div class="checkbox mb-3">

    </div>
    <div class="button-group">
    <input type="button" class="w-45 btn btn-sm btn-outline-secondary" value="회원가입" >
	<input type="button" class="w-50 btn btn-sm btn-outline-secondary" value="비밀번호 찾기" name="passwd_btn" onclick="passwd_find()" />
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
    
</form>

</main>

</body>
</html>