<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "jsp_jstl.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<jsp:useBean id = "empDAO" class = "jsp_jstl.EmpDAO"/>
		
		<% ArrayList<EmpDTO>dtos = empDAO.memberSelect(); %>
		
		
		<c:forEach var = "i" begin = "0" end = "5" step = "1" >
			
			
			EmpDTO dto = dtos.get(i);
			<c:set var = "empno" value = "${dto.empno}"/>
			<c:set var = "ename" value = "${dto.ename}"/>
			<c:set var = "job" value = "${dto.job}"/>
			<c:set var = "hireDate" value = "${dto.hireDate}"/>
			<c:set var = "sal" value = "${dto.sal}"/>
			<c:set var = "comm" value = "${dto.comm}"/>
			<c:set var = "deptno" value = "${dto.deptno}"/>
		
			번호 : <c:out value = "${empno}"/>
			이름 : <c:out value = "${ename}"/>
			직업 : <c:out value = "${job}"/>
			입사일 : <c:out value = "${hireDate}"/>
			월급 : <c:out value = "${sal}"/>
			커미션 : <c:out value = "${comm}"/>
			부서번호 : <c:out value = "${deptno}"/>
		
		
		</c:forEach>
		
		
		
		
		
	
	
	
	</body>
</html>