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
			<form action="write.do" method="post">
			<tr>
				<td class = "text-center"> 이름 </td>
				<td> <input type="text" class="form-control" name="bName" size = "50"> </td>
			</tr>
			<tr>
				<td class = "text-center"> 제목 </td>
				<td> <input type="text" class="form-control" name="bTitle" size = "50"> </td>
			</tr>
			<tr>
				<td class = "text-center"> 내용 </td>
				<td> <textarea class="form-control" name="bContent" rows="10" ></textarea> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" class="btn btn-outline-secondary" value="입력"> &nbsp;&nbsp; <a href="list.do" class="btn btn-light">목록보기</a></td>
			</tr>
		</form>
	</table>     
	</div>	
		
	</body>
</html>
