<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
	
	
	<h3>구구단 출력</h3>
	
		<table border = "1">
			<%
				for(int i = 0; i < 10; i++){
					out.println("<tr>");
					
					for(int j = 2; j < 10; j++){
						
						if ( i == 0 ){
							out.println("<td>" + j + "단" + "</td>");
						}else {
							out.println("<td>" + j + " X " + i + " = " + (i*j) + "</td>");
						}
					}
					out.println("</tr>");
				}
			
			%>
	
		</table>
	</body>
</html>

