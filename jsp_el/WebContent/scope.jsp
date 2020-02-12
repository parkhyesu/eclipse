<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<%
			pageContext.setAttribute("name", "hong gil dong");
			request.setAttribute("id", "abcde");
		%>
		
		<h2> 저장된 정보 출력 해보기</h2>
		request : <%= request.getAttribute("id") %> <br />
		pageContext : <%= pageContext.getAttribute("name") %> <br /> 
		
		
		<jsp:forward page = "scope2.jsp"/>
		
		
	</body>
</html>
