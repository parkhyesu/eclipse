<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%@ page import = "java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		String name, id, password, major, protocol;
		String[] hobby;
	%>

	<%
		request.setCharacterEncoding("EUC-KR");
	
		name = request.getParameter("name");
		id = request.getParameter("id");
		password = request.getParameter("password");
		major = request.getParameter("major");
		protocol = request.getParameter("protocol");
		
		hobby = request.getParameterValues("hobby");
	
	%>	
	
	이름 : <%= name %><br />
	아이디 : <%= id %><br />
	비밀번호 : <%= password %><br />
	취미 : <%= Arrays.toString(hobby) %><br />
	전공 : <%= major %><br />
</body>
</html>