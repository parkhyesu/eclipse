<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	
		<meta name="viewport" content="width=device-width, initial-scale=1">
	  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
		
	</head>

<body>
	
	<div class = "container">
	<table class = "table table-bordered">
		<form action="modify.do" method="post">
			<!-- 번호는 수정할수 없게 해야하기 때문에  hidden 으로 받아야함  -->
			<input type="hidden" name="bId" value="${content_view.bId}">
			<tr>
				<td class = "text-center">번호</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td class = "text-center">히트</td>
				<td>${content_view.bHit}</td>
			</tr>
			<tr>
				<td class = "text-center">이름</td>
				<td><input type="text" class="form-control" name="bName"
					value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td class = "text-center">제목</td>
				<td><input type="text" class="form-control" name="bTitle"
					value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td class = "text-center">내용</td>
				<td><textarea class="form-control" name="bContent" rows="10">${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="btn btn-outline-secondary" value="수정">
					&nbsp;&nbsp; <a href="list.do" class="btn btn-light">목록보기</a> &nbsp;&nbsp; 
					<a href="delete.do?bId=${content_view.bId}" class="btn btn-light">삭제</a> &nbsp;&nbsp; 
					<a href="reply_view.do?bId=${content_view.bId}" class="btn btn-light">답변</a></td>
			</tr>
		</form>
	</table>
	</div>

</body>
</html>
