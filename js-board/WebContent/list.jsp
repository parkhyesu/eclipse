<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta  http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
	
		<table border = "1">
			<tr>
				<td>��ȣ</td>
				<td>�̸�</td>
				<td>����</td>
				<td>��¥</td>
				<td>��Ʈ</td>
			</tr>
			
			<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.bId}</td>
				<td>${dto.bName}</td>
				<td>
				<a href = "content_view.do?bId=${dto.bId}">${dto.bContent}</a></td>
				<td>${dto.bDate}</td>
				<td>${dto.bHit}</td>
			</tr>
			</c:forEach>
			
			<tr>
			<td colspan = "5"> <a href = "write_view.do"> ���ۼ� </a></td>
			</tr>
				
		</table>
	</body>
</html>