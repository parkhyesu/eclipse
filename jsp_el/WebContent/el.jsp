<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<!-- ��ü���� ���� �ؾ��� 
		MemberInfo member = new MemberInfo(); -->
		<jsp:useBean id = "member" class = "edu.bit.ex.MemberInfo" scope = "page"/>
		
		<!-- member.setName(), member.setId(), member.setPw() -->
		<jsp:setProperty name = "member" property = "name" value = "ȫ�浿"/> <br />
		<jsp:setProperty name = "member" property = "id" value = "abc"/> <br />
		<jsp:setProperty name = "member" property = "pw" value = "123"/> <br />
		
		<!-- member.get___() -->
		<!-- �׼��±׻�� -->
		�̸� : <jsp:getProperty name = "member" property = "name"/> <br />
		���̵� : <jsp:getProperty name = "member" property = "id"/> <br />
		��й�ȣ : <jsp:getProperty name = "member" property = "pw"/> <br />
		
		<!-- EL �� member.get___(); -->
		�̸� : ${member.name} <br/>
		���̵� : ${member.id} <br/>
		��й�ȣ : ${member.pw} <br/>
		
		
	</body>
</html>