<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id = "circle" class = "jsp_test2.Circle" scope = "page" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
		
	<body>
	
		
		
		<jsp:setProperty name = "circle" property = "radius"/>
		<jsp:getProperty name = "circle" property = "radius"/>
		
		
		
	</body>
</html>


