<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form action="/member/save" method="post"><!-- 데이터를 url에 노출시키지 않기 떄문데 보안적으로 더 안전함. -->
		<p>아 이 디 : <input type="text" name="memberEmail" placeholder="이메일" /></p>
		<p>비밀번호 : <input type="text" name="memberPassword" placeholder="비밀번호" /></p>
		<p>이   름 : <input type="text" name="memberName" placeholder="이름" /></p>
		<p>나   이 : <input type="text" name="memberAge" placeholder="나이" /></p>
		<p>전화번호 : <input type="text" name="memberMobile" placeholder="전화번호" /></p>
		<input type="submit" value="회원가입" />
	</form>
</body>
</html>