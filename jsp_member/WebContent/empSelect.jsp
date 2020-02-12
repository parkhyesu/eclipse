<%@page import = "java.util.ArrayList" %>
<%@page import = "java.sql.Date" %>
<%@page import = "edu.bit.ex.*" %>
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
		EmpDAO empDAO = new EmpDAO();
		ArrayList<EmpDTO> dtos = empDAO.memberSelect();
		
		out.println("<table border =1 bgcolor = green>");
		
		for(int i = 0; i <dtos.size(); i++){
			
			EmpDTO dto = dtos.get(i);
			String ename = dto.getEname();
			Date hiredate = dto.getHiredate();
			
			out.println("<tr>");
			out.println("<td>");
			out.println("이름 : " + ename);
			out.println("</td>");
			out.println("<td>");
			out.println("입사날짜 : " + hiredate + "<br />");
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	%>
	</body>
</html>

