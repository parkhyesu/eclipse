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
			<form action="reply.do" method="post">
			
			<!-- ��� �������ֱ� ���� �ʿ��� 3�� �ݵ�� �Ѱ������.  -->
			<input type = "hidden" name = "bId" value = "${reply_view.bId }">
			<input type = "hidden" name = "bGroup" value = "${reply_view.bGroup }">
			<input type = "hidden" name = "bStep" value = "${reply_view.bStep }">
			<input type = "hidden" name = "bIndent" value = "${reply_view.bIndent }">
			
			<!-- �Է��ϴ°� �ƴϱ� ������ ������ �� �޾ƿ;���. -->
			<tr>
				<td class = "text-center"> ��ȣ </td>
				<td> ${reply_view.bId }</td>
			</tr>
			<tr>
				<td class = "text-center"> ��Ʈ </td>
				<td> ${reply_view.bHit }</td>
			</tr>
			<tr>
				<td class = "text-center"> �̸� </td>
				<td> <input type="text" class="form-control" name="bName" value = "${reply_view.bName}"> </td>
			</tr>
			<tr>
				<td class = "text-center"> ���� </td>
				<td> <input type="text" class="form-control" name="bTitle" value = "${reply_view.bTitle}"> </td>
			</tr>
			<tr>
				<td class = "text-center"> ���� </td>
				<td> <textarea name="bContent" class="form-control" value = "${reply_view.bContent}" >${reply_view.bContent}</textarea> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" class="btn btn-outline-secondary" value="�亯"> &nbsp;&nbsp; <a href="list.do" class="btn btn-light">��Ϻ���</a></td>
			</tr>
		</form>
	</table>     
		
	</div>	
	</body>
</html>
