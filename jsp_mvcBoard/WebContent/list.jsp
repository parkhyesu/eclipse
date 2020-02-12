<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>Insert title here</title>
		
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	

	
	</head>
	<body>
		
		<div class = "container">
		<table class = "table table-hover">
			<tr class = "font-weight-bold text-center table-light">
				<td>번호</td>
				<td>이름</td>
				<td>제목</td>
				<td>날짜</td>
				<td>히트</td>
			</tr>
			<!-- BListCommand 의 setAttribute 에서 받아온 list  -->
			<!-- dto 변수로 list(배열) 을 하나씩 받아오겠다고.  -->
			<c:forEach items="${list}" var="dto">
			<tr class = "text-center">
				<td>${dto.bId}</td>
				<td>${dto.bName}</td>
				<td>
					<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
					<!--title 에 링크 걸어주는 부분  -->
					<a href="content_view.do?bId=${dto.bId}">${dto.bTitle}</a></td>
				<td>${dto.bDate}</td>
				<td>${dto.bHit}</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="5"> <a href="write_view.do" class="btn btn-outline-secondary">글작성</a> </td>
			</tr>
		</table>
		</div>
	</body>
</html>
