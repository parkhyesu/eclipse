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
		
			��ȣ : <c:out value = "${empno}"/>
			�̸� : <c:out value = "${ename}"/>
			���� : <c:out value = "${job}"/>
			�Ի��� : <c:out value = "${hireDate}"/>
			���� : <c:out value = "${sal}"/>
			Ŀ�̼� : <c:out value = "${comm}"/>
			�μ���ȣ : <c:out value = "${deptno}"/>
		
		
		</c:forEach>
		
		
		
		
		
	
	
	
	</body>
</html>