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
			//3����Ʈ �������ֱ�
			Connection connection;
			Statement statement;
			ResultSet resultSet;
			
			//
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//����Ŭ�� �ִ� �ش� ��ǻ��
			String uid = "scott";
			String upw = "tiger";
			String query = "select * from emp";
			
		%>	
		
		<%
			try{
				
				Class.forName(driver);//��ü�����ϴ� ���. �ϸ� OracleDriver��ü ������.
				connection = DriverManager.getConnection(url, uid, upw);
				statement = connection.createStatement();	//statement : ���� ������ ���� ��ü
				resultSet = statement.executeQuery(query);
				
				while(resultSet.next()){
					String name = resultSet.getString("ename");
					String job = resultSet.getString("job");
					String mgr = resultSet.getString("mgr");
					
					out.println("�̸� : " + name + ", ��å : " + job + ", �Ŵ��� : " + mgr + "<br />");
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