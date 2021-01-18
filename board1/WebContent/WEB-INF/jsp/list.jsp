<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.koreait.board.model.*" %>    
<%
	List<BoardEntity> list = (List)request.getAttribute("list");
	int pageLength = (int)request.getAttribute("pageLength");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>
	.pagingContainer {
		text-align: center;
	}
</style>
</head>
<body>
	<div>
		<a href="/write"><button>글쓰기</button></a>
	</div>
	<div>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>등록일시</th>
			</tr>
			<% for(BoardEntity vo : list) { %>
			<tr>
				<td><%=vo.getI_board()%></td>
				<td>
					<a href="/detail?i_board=<%=vo.getI_board()%>">
						<%=vo.getTitle()%>
					</a>
				</td>
				<td><%=vo.getR_dt()%></td>
			</tr>
			<% } %>
		</table>
		<div class="pagingContainer">
			<% for(int i=1; i<=pageLength; i++) { %>
				<span class="page">
					<a href="/list?page=<%=i%>"><%=i%></a>
				</span>
			<% } %>
		</div>
	</div>
</body>
</html>







