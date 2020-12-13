<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify JSP</title>
</head>
<body>
	<h3>[ ${vo.name } ]고객 정보 수정</h3>
	<form action="update.st" method="post">
		<input type="hidden" name="id" value="${vo.id }" /> 
		<table class="w-pct60">
			<tr>
				<th>학번</th>
				<td><input type="text" name="stuID" value="${vo.stuID }"/></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phone" value="${vo.phone }"/></td>
			</tr>
		</table>
	</form>
	<div class='btnSet'>
		<a class="btn-fill" onclick="$('form').submit()">저장</a>
		<a class="btn-empty" href="detail.st?id=${vo.id }">취소</a>
	</div>
</body>
</html>