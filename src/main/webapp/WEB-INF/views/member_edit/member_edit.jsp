<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>회원정보 수정</title>

<script src="./js/member_edit.js"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>

</head>
<body>
  <div id="join_wrap">
  <h2 class="member_title">회원수정</h2>
  <form name="f" method="post" action="/member_edit_ok"
  		onsubmit="return edit_check()" enctype="multipart/form-data">
   <!-- 이진파일을 업로드 할려면 enctype 속성을 지정 -->
   <table id="join_t">
    <tr>
     <th>회원이메일</th>
     <td>
      ${email}
     </td>
    </tr>
    
    <tr>
     <th>회원비번</th>
     <td>
      <input type="password" name="member_pw1" id="member_pw1" size="14"
      class="input_box" />
     </td>
    </tr>
    
    <tr>
     <th>회원비번확인</th>
     <td>
      <input type="password" name="member_pw2" id="member_pw2" size="14"
      class="input_box" />
     </td>
    </tr>
    
    <tr>
     <th>회원이름</th>
     <td>
      <input name="member_name" id="member_name" size="14" class="input_box"
      value="${medit.member_name}" />
     </td>
    </tr>
    
    
    <tr>
     <th>휴대전화번호</th>
     <td>
     <%@ include file="phone_number.jsp" %>
     <select name="member_phone1">
      <c:forEach var="p" items="${phone}" begin="0" end="5"><!-- "${phone}"에 무엇을 넣어야 하나 -->
       <option value="${p}" <c:if test="${member_phone1 == p}">${'selected'}
          </c:if>>${p}
        </option>
      </c:forEach>
     </select>-
     <input name="member_phone2" id="member_phone2" size="4" maxlength="4" class="input_box" value="${member_phone2}"/>-
     <input name="member_phone3" id="member_phone3" size="4" maxlength="4" class="input_box" value="${member_phone3}"/>
     </td>
    </tr>
    
   </table>
   
   <div id="join_menu">
    <input type="submit" value="회원수정" class="input_button" />
    <input type="reset" value="수정취소" class="input_button" 
    onclick="$('#member_pw1').focus();" />
   </div>
  </form>
 </div>
</body>
</html>