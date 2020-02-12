<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		
		request : <%= request.getAttribute("id") %> <br />
		pageContext : <%= pageContext.getAttribute("name") %> <br />
		
		
	</body>
</html>
