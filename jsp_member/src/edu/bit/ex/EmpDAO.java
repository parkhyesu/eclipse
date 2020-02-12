package edu.bit.ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class EmpDAO {
	
	private DataSource dataSource;
	
	public EmpDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<EmpDTO> memberSelect(){
		ArrayList<EmpDTO> dtos = new ArrayList<EmpDTO>();
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = dataSource.getConnection();
			stmt = connection.createStatement();
			resultSet = stmt.executeQuery("select ename, hiredate from emp where comm is not null");
		
			while(resultSet.next()) {
				String ename = resultSet.getString("ename");
				Date hiredate = resultSet.getDate("hiredate");
			
				EmpDTO dto = new EmpDTO(ename, hiredate);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(resultSet != null)
					resultSet.close();
				if(stmt != null)
					stmt.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
}




