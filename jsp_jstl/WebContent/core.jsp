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
		
		변수제거<br>
		<c:remove var = "num"/>
			vatName : <c:out value="${vatName}"/> <br />
			num : <c:out value="${num}"/>
		<br />
		<hr />
		
		에러처리<br>
		<c:catch var = "error">
			<%= 2/0 %>
		</c:catch>
		
		<c:out value = "${error}"/>	<!-- 에러 출력 -->
		<br />
		<hr />
		
		if문 <!-- test에는 true/false 구문 와야함 --><br>
		<c:if test = "${1+2==3}"> 
			1+2=3
		</c:if>
		
		<c:if test = "${1+2!=3}">
			1+2!=3
		</c:if>
		<hr />
		
		for-each 문  <br>
		<c:forEach var = "feach" begin = "0" end = "30" step = "3">
			${feach}
		</c:forEach>
		<hr />
		
		switch문 <br>
		<c:choose>
		<c:when test = "${1>0}"> 1은 0보다 크다</c:when>
		<c:when test = "${2>0}"> 2도 0보다 크다</c:when>
		<c:otherwise> 왠만하면 0보다 크다 </c:otherwise>
		</c:choose>
		
	</body>
</html>