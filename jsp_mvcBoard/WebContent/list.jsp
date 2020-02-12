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
				<td>��ȣ</td>
				<td>�̸�</td>
				<td>����</td>
				<td>��¥</td>
				<td>��Ʈ</td>
			</tr>
			<!-- BListCommand �� setAttribute ���� �޾ƿ� list  -->
			<!-- dto ������ list(�迭) �� �ϳ��� �޾ƿ��ڴٰ�.  -->
			<c:forEach items="${list}" var="dto">
			<tr class = "text-center">
				<td>${dto.bId}</td>
				<td>${dto.bName}</td>
				<td>
					<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
					<!--title �� ��ũ �ɾ��ִ� �κ�  -->
					<a href="content_view.do?bId=${dto.bId}">${dto.bTitle}</a></td>
				<td>${dto.bDate}</td>
				<td>${dto.bHit}</td>
			</tr>
			</c:forEach>
			<tr>
				<td colspan="5"> <a href="write_view.do" class="btn btn-outline-secondary">���ۼ�</a> </td>
			</tr>
		</table>
		</div>
	</body>
</html>
