<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<%!	
			//3종세트 선언해주기
			Connection connection;
			Statement statement;
			ResultSet resultSet;
			
			//
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//오라클이 있는 해당 컴퓨터
			String uid = "scott";
			String upw = "tiger";
			String query = "select * from emp";
			
		%>	
		
		<%
			try{
				
				Class.forName(driver);//객체생성하는 방법. 하면 OracleDriver객체 생성됨.
				connection = DriverManager.getConnection(url, uid, upw);
				statement = connection.createStatement();	//statement : 쿼리 날리기 위한 객체
				resultSet = statement.executeQuery(query);
				
				while(resultSet.next()){
					String name = resultSet.getString("ename");
					String job = resultSet.getString("job");
					String mgr = resultSet.getString("mgr");
					
					out.println("이름 : " + name + ", 직책 : " + job + ", 매니져 : " + mgr + "<br />");
				}
				
				
			}catch (Exception e){
				
			}finally{
				
				try{
					if(resultSet != null)
						resultSet.close();
					if(statement != null)
						statement.close();
					if(connection != null)
						connection.close();
				}catch (Exception e){
					
				}
			}
		%>
	</body>
</html>