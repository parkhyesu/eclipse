<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		--dispacherJsp.jsp--
		<hr />
		
		<!--getAttribute 하려면 어디선가 setAttribute 해놨어야함.  -->
		
		id : <%= request.getAttribute("id") %> <br />
		pw : <%= request.getAttribute("pw") %>
		
		
		
	</body>
</html>