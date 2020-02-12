<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%!
			String name, id, pw;
		%>
		
		<%
		//session 은 Object형이기 때문에 형변환 반드시 필요.
		name = (String)session.getAttribute("name");
		id = (String)session.getAttribute("id");
		pw = (String)session.getAttribute("pw");
		
		%>
		
		<%= name %> 님 안녕하세요 <br />
		<a href = "modify.jsp"> 회원정보 수정</a>
	
	</body>
</html>