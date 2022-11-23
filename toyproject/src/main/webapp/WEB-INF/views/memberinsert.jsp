<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>

<script src="http://code.jquery.com/jquery-latest.js"></script>   
<script src="js/check.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<form action="memberinsert_ok" onsubmit="return check()" method="post" align="center" style="margin-top: 15%;">
		<h2>회원 가입</h2>
			<table align="center">
				<tr>
					<td>이메일</td>
					<td> <input type="text" name="member_email" id="member_email" oninput="checkemail()" /></td>
           			<td> <span class="email_ok" style="color:green; display:none;">사용 가능</span>
           				 <span class="email_already" style="color:red; display:none;">사용 불가능</span>
           				 </td>
           			 
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="member_pw" id="member_pw">
						<div id=passfail style="color: red;"></div>
						<div id=passsucc style="color: blue;"></div></td>
				</tr>
				<tr>
					<td>비밀번호 확인</td>
					<td><input type="password" name="passconfirm" id="passconfirm" ></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="member_name" id="member_name" ></td>
				</tr>
				<tr>
					<td>전화번호</td>
    				 <td>
     				<select name="member_phone1">
      				 <option value="010">010</option>
      				 <option value="011">011</option>
      				 <option value="016">016</option>
      				 <option value="017">017</option>
      				 <option value="018">018</option>
      				 <option value="019">019</option>
    				</select>
    				 -<input name="member_phone2" id="member_phone2" size="4" maxlength="4" class="input_box" />
    				 -<input name="member_phone3" id="member_phone3" size="4" maxlength="4" class="input_box" /></td>
				</tr>
				<tr>
					<td colspan="3"><input type="submit" class="btn btn-primary" value="가입">
									<button type="reset" class="btn btn-secondary">다시 작성</button></td>
				</tr>
			</table>
	</form>

</body>


</html>
