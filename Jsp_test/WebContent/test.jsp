<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h3> 1 ~ 10 ���� Ȧ�� ¦�� ���� ��� </h3>
		<table border = "1">
			
			<%
			
			for(int i = 0; i < 11; i++){
				out.println("<tr>");
				for(int j = 0; j < 2; j++){
					if(j == 0){
						out.println("<td>" + i + "</td>");
					}else{
						if( i % 2 == 0 ){
							out.println("<td> ¦���Դϴ�.</td>");
						}else{
							out.println("<td> Ȧ���Դϴ�.</td>");
						}
					}
				}
				out.println("</tr>");
			}
					
			%>
	
		</table>
	
	</body>
</html>

