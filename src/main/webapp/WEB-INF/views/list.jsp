<%@ page language="java" contentType="text/html; charset=UTF-8" language="java" %>
<!-- JSTL(Core 태그 라이브러리)을 사용하기 위한 태그 라이브러리 선언 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<table>
		<tr>
			<!-- 테이블 헤더 -->
			<th>id</th>
			<th>email</th>
			<th>password</th>
			<th>name</th>
			<th>age</th>
			<th>mobile</th>
			<th>조회</th>
			<th>삭제</th>
		</tr>
		<!-- jstl라이브러이의 forEach를 사용하여 회원 목록을 반복하여 테이블에 출력 -->
		<c:forEach items="${memberList}" var="member">
			<tr>
				<!-- 회원정보 출력 -->
				<td>${member.id}</td>
				<td>
					<!-- 회원이메일에 링크를 걸어 회원상세정보(list.jsp) 조회 페이지로 이동 -->
					<a href="/member?id=${member.id}">${member.memberEmail}</a>
				</td>
				<td>${member.memberPassword}</td>
				<td>${member.memberName}</td>
				<td>${member.memberAge}</td>
				<td>${member.memberMobile}</td>
				<td>
					<!-- 상세정보조회 링크 -->
					<a href="/member?id=${member.id}">조회</a>
				</td>
				<td>
					<button onclick="deleteMember('${member.id}')" >삭제</button>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
<script>
	//삭제버튼 크릭시 해당회원의 id를 받아와 삭제처리 url로 이동하는 javascript 함수
	const deleteMember = (id) =>{
		console.log(id);
		location.href = "/member/delete?id="+id;
	}
</script>
</html>


