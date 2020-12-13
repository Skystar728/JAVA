<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list JSP</title>
</head>
<body>
	<h3>학생 목록</h3>
	<table class='w-pct60'>
		<tr>
			<th class='w-px60'>번호</th>
			<th class='w-px200'>학생명</th>
			<th>학번</th>
		</tr>
		<core:forEach items="${list }" var="vo">
			<tr>
				<td>${vo.no }</td>
				<td><a href='detail.st?id=${vo.id}'>${vo.name }</a></td>
				<td>${vo.stuID }</td>
			</tr>
		</core:forEach>
	</table>
	
	<div class="btnSet">
		<a class="btn-fill" href="new.st">신규 학생</a>
	</div>
</body>
</html>