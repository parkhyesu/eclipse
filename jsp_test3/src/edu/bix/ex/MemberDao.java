package edu.bix.ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDao {

	
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getInstance(){
		return instance;
	}
	
	private MemberDao() {
		
	}
	
	
	private Connection getConnection() {
		Context context = null;
		DataSource dataSource = null;
		Connection connection = null;
		
		try {
			context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			connection = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
		public ArrayList<MemberDto> memberSelect(){
			
			ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
			
			Connection connection = null;
			PreparedStatement stmt = null;
			ResultSet resultSet = null;
			String query = "SELECT * FROM EMP";
			
			try {
				
				connection = getConnection();
				stmt = connection.prepareStatement(query);
				resultSet = stmt.executeQuery();
				
				System.out.println("=============================");
				while(resultSet.next()) {
					
					MemberDto dto = new MemberDto();
					dto.setEmpNo(resultSet.getInt("empNo"));
					dto.seteName(resultSet.getString("eName"));
					dto.setJob(resultSet.getString("job"));
					dto.setMgr(resultSet.getInt("mgr"));
					dto.setHireDate(resultSet.getDate("date"));
					dto.setSal(resultSet.getInt("sal"));
					dto.setComm(resultSet.getInt("comm"));
					dto.setDeptNo(resultSet.getInt("deptNo"));
					
					dtos.add(dto);
					
				}		
				System.out.println("================================");
			}catch (Exception e) {
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

