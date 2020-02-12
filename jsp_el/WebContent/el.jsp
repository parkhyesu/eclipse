<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<!-- 객체생성 먼저 해야함 
		MemberInfo member = new MemberInfo(); -->
		<jsp:useBean id = "member" class = "edu.bit.ex.MemberInfo" scope = "page"/>
		
		<!-- member.setName(), member.setId(), member.setPw() -->
		<jsp:setProperty name = "member" property = "name" value = "홍길동"/> <br />
		<jsp:setProperty name = "member" property = "id" value = "abc"/> <br />
		<jsp:setProperty name = "member" property = "pw" value = "123"/> <br />
		
		<!-- member.get___() -->
		<!-- 액션태그사용 -->
		이름 : <jsp:getProperty name = "member" property = "name"/> <br />
		아이디 : <jsp:getProperty name = "member" property = "id"/> <br />
		비밀번호 : <jsp:getProperty name = "member" property = "pw"/> <br />
		
		<!-- EL 로 member.get___(); -->
		이름 : ${member.name} <br/>
		아이디 : ${member.id} <br/>
		비밀번호 : ${member.pw} <br/>
		
		
	</body>
</html>