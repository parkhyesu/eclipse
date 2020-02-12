<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<c:set var="vatName" value="varValue"/>
			vatName : <c:out value="${vatName }"/>	
		<br />
		
		<c:set var="num" value="100"/>
			num : <c:out value="${num}"/>
		<br />
		
		��������<br>
		<c:remove var = "num"/>
			vatName : <c:out value="${vatName}"/> <br />
			num : <c:out value="${num}"/>
		<br />
		<hr />
		
		����ó��<br>
		<c:catch var = "error">
			<%= 2/0 %>
		</c:catch>
		
		<c:out value = "${error}"/>	<!-- ���� ��� -->
		<br />
		<hr />
		
		if�� <!-- test���� true/false ���� �;��� --><br>
		<c:if test = "${1+2==3}"> 
			1+2=3
		</c:if>
		
		<c:if test = "${1+2!=3}">
			1+2!=3
		</c:if>
		<hr />
		
		for-each ��  <br>
		<c:forEach var = "feach" begin = "0" end = "30" step = "3">
			${feach}
		</c:forEach>
		<hr />
		
		switch�� <br>
		<c:choose>
		<c:when test = "${1>0}"> 1�� 0���� ũ��</c:when>
		<c:when test = "${2>0}"> 2�� 0���� ũ��</c:when>
		<c:otherwise> �ظ��ϸ� 0���� ũ�� </c:otherwise>
		</c:choose>
		
	</body>
</html>