<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	
		<meta name="viewport" content="width=device-width, initial-scale=1">
	  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
		
	</head>

<body>
	
	<div class = "container">
	<table class = "table table-bordered">
		<form action="modify.do" method="post">
			<!-- ��ȣ�� �����Ҽ� ���� �ؾ��ϱ� ������  hidden ���� �޾ƾ���  -->
			<input type="hidden" name="bId" value="${content_view.bId}">
			<tr>
				<td class = "text-center">��ȣ</td>
				<td>${content_view.bId}</td>
			</tr>
			<tr>
				<td class = "text-center">��Ʈ</td>
				<td>${content_view.bHit}</td>
			</tr>
			<tr>
				<td class = "text-center">�̸�</td>
				<td><input type="text" class="form-control" name="bName"
					value="${content_view.bName}"></td>
			</tr>
			<tr>
				<td class = "text-center">����</td>
				<td><input type="text" class="form-control" name="bTitle"
					value="${content_view.bTitle}"></td>
			</tr>
			<tr>
				<td class = "text-center">����</td>
				<td><textarea class="form-control" name="bContent" rows="10">${content_view.bContent}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="btn btn-outline-secondary" value="����">
					&nbsp;&nbsp; <a href="list.do" class="btn btn-light">��Ϻ���</a> &nbsp;&nbsp; 
					<a href="delete.do?bId=${content_view.bId}" class="btn btn-light">����</a> &nbsp;&nbsp; 
					<a href="reply_view.do?bId=${content_view.bId}" class="btn btn-light">�亯</a></td>
			</tr>
		</form>
	</table>
	</div>

</body>
</html>
