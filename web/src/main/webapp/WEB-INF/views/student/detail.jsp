<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>[ ${vo.name } ]고객 정보</h3>
	<table class='w-pct60'>
		<tr>
			<th>전화번호</th>
			<td>${vo.phone }</td>
		</tr>
	</table>
	<div class='btnSet'>
		<a class='btn-fill' href="list.st">학생 목록</a>
		<a class='btn-fill' href="new.st">신규 학생</a>
		<a class='btn-fill' href="modify.st?id=${vo.id }">수정</a>
		<a class='btn-fill' onclick="if( confirm('정말 삭제하시겠습니까?') ){ href='delete.st?id=${vo.id }' }" >삭제</a>
	</div>
</body>
</html>