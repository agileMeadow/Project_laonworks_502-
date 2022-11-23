function checkemail(){
	var member_email = $('#member_email').val();
	$.ajax({
		url:'/emailcheck',
		type: 'post',
		data: {member_email:member_email},
		success:function(cnt){
			if(cnt != 1 && member_email.length > 0 ){ // 사용가능 이메일
				$('.email_ok').css("display","inline-block");
				$('.email_already').css("display","none");
			}else if(cnt == 1 && member_email.length > 0 ){ // 중복된 이메일
				$('.email_ok').css("display","none");
				$('.email_already').css("display","inline-block");
			}else{ // 이메일에 아무것도 입력하지 않을 경우, 중복검사 문구 모두 안보이게 설정
				$('.email_ok').css("display","none");
				$('.email_already').css("display","none");
			}
				
		},
		error:function(){
			alert("에러입니다");
		}
	});
};

function check(){
	 if($.trim($("#member_email").val())==""){
		 alert("회원 E-mail을 입력하세요!");
		 $("#member_email").val("").focus();
		 return false;
	 }
	 if($.trim($("#member_pw").val())==""){
		 alert("비밀번호를 입력하세요!");
		 $("#member_pw").val("").focus();
		 return false;
	 }
	 if($.trim($("#passconfirm").val())==""){
		 alert("비밀번호확인을 입력하세요!");
		 $("#passconfirm").val("").focus();
		 return false;
	 }
	 if($.trim($("#member_pw").val()) != $.trim($("#passconfirm").val())){
		 //!=같지않다 연산. 비번이 다를 경우
		 alert("비밀번호가 일치하지 않습니다!");
		 $("#member_pw").val("");
		 $("#passconfirm").val("");
		 $("#member_pw").focus();
		 return false;
	 }
	 if($.trim($("#member_name").val())==""){
		 alert("회원 이름을 입력하세요!");
		 $("#member_name").val("").focus();
		 return false;
	 }
	 if($.trim($("#member_phone2").val())==""){
		 alert("휴대전화번호를 입력하세요!");
		 $("#member_phone2").val("").focus();
		 return false;
	 }
	 if($.trim($("#member_phone3").val())==""){
		 alert("휴대전화번호를 입력하세요!");
		 $("#member_phone3").val("").focus();
		 return false;
	 } 	 
}