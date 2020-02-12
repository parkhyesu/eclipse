<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		<table width="500" cellpadding="0" cellspacing="0" border="1">
			<form action="reply.do" method="post">
			
			<!-- 댓글 관리해주기 위해 필요한 3개 반드시 넘겨줘야함.  -->
			<input type = "hidden" name = "bId" value = "${reply_view.bId }">
			<input type = "hidden" name = "bGroup" value = "${reply_view.bGroup }">
			<input type = "hidden" name = "bStep" value = "${reply_view.bStep }">
			<input type = "hidden" name = "bIndent" value = "${reply_view.bIndent }">
			
			<!-- 입력하는게 아니기 때문에 무조건 다 받아와야함. -->
			<tr>
				<td> 번호 </td>
				<td> ${reply_view.bId }</td>
			</tr>
			<tr>
				<td> 히트 </td>
				<td> ${reply_view.bHit }</td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="bName" value = "${reply_view.bName}"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" value = "${reply_view.bTitle}"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea name="bContent" value = "${reply_view.bContent}" >${reply_view.bContent}</textarea> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" value="답변"> &nbsp;&nbsp; <a href="list.do">목록보기</a></td>
			</tr>
		</form>
	</table>     
		
		
	</body>
</html>
