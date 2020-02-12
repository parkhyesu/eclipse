<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h3> 1 ~ 10 까지 홀수 짝수 여부 출력 </h3>
		<table border = "1">
			
			<%
			
			for(int i = 0; i < 11; i++){
				out.println("<tr>");
				for(int j = 0; j < 2; j++){
					if(j == 0){
						out.println("<td>" + i + "</td>");
					}else{
						if( i % 2 == 0 ){
							out.println("<td> 짝수입니다.</td>");
						}else{
							out.println("<td> 홀수입니다.</td>");
						}
					}
				}
				out.println("</tr>");
			}
					
			%>
	
		</table>
	
	</body>
</html>

