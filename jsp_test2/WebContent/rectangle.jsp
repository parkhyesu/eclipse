<%@ page import = "jsp_test2.Rectangle" %>
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
			Rectangle rectangle = new Rectangle();;
		%>
		
		<%!
			int width;
			int height;
		
		%>
		<%
			String str1 = request.getParameter("width");
			String str2 = request.getParameter("height");
			width = Integer.parseInt(str1);
			height = Integer.parseInt(str2);
		%>
		
		사각형의 넓이는 <%= rectangle.getRectangleArea(width, height) %>
	</body>
</html>