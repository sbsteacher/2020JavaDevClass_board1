<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form action="/write" method="post">
		<div><input type="text" name="title" placeholder="제목"></div>
		<div><textarea name="ctnt" placeholder="내용"></textarea></div>
		<div>
			<input type="submit" value="글쓰기">
			<input type="reset" value="다시 작성">
		</div>
	</form>
</body>
</html>