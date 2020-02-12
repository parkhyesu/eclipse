<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
		<style>
			table{
				background-color : green
			}
		
		</style>
	</head>
	
	<body>
		
		<table border = "1">
			<tr>
			
			<c:forEach var = "dan" begin = "2" end = "9" step = "1">
				<td>
				${dan}단
				</td>
			</c:forEach>
			
			</tr>
			<c:forEach var = "i" begin = "1" end = "9" step = "1">
				<tr>
				<c:forEach var = "j" begin = "2" end = "9" step = "1">
					
					<td> ${j} X ${i} = ${i*j} </td>
					
				</c:forEach>
				</tr>
			</c:forEach>

		</table>
	</body>
</html>
