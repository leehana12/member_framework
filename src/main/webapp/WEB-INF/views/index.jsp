<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!-- 한글인코딩 설정 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>index</title>
</head>
<body>
	<h2>Hello Spring FrameWork 회원 프로젝트</h2>
	<a href="/member/save">회원가입</a>
	<a href="/member/login">로그인</a>
	<a href="/member/">회원목록 조회</a>
</body>
</html>