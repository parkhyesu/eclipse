<%@ page import = "edu.bit.ex.Rectangle" %>
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
			double width, height;
			double area;
			
		%>
		
		<%
		String str_width = request.getParameter("width");
		String str_height = request.getParameter("height");
		
		
		width = Double.parseDouble(str_width);
		height = Double.parseDouble(str_height);
		area = width*height;
		
		Rectangle rec = new Rectangle(width,height);
		
		out.println("�簢���� ������ : " + rec.getArea());
		%>
		
		�簢���� ������ <%= area %>
	</body>
</html>