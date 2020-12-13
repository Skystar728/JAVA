<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new JSP</title>

</head>
<body>
	<h3>신규 학생</h3>
	<form action="insert.st" method="post">
		<table class='w-pct60'>
			<tr>
				<th class='w-px160'>학생명</th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th>학번</th>
				<td><input type="text" name="stuID" /></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phone" /></td>
			</tr>
		</table>
	</form>
	
	<div class="btnSet">
		<a class="btn-fill" onclick="$('form').submit()">저장</a>
		<a class="btn-empty" href="list.st">취소</a>
	</div>
</body>
</html>