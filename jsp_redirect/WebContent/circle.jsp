<%@ page import = "edu.bit.ex.Circle" %>
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
				Circle circle = new Circle();
			%>
			
			<%!
				int radius;
			%>
			<%
				String str = request.getParameter("radius");
				radius = Integer.parseInt(str);
			%>
			
			원의 넓이 : <%= circle.getCircleArea(radius) %>
			
			
	</body>
</html>