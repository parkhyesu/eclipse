package edu.bit.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

//Data Access Object
public class MemberDAO {

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�����ͺ��̽��� �����ؼ� ��� ������� �������� �Լ�
	public ArrayList<MemberDTO> memberSelect(){
		
		//ArrayList �ȿ� MemberDTO �� ���������ִ�.
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		
		//3����Ʈ
		Connection connection = null;
		Statement stmt = null;
		ResultSet resultSet = null;
		
		
		try {

			connection = DriverManager.getConnection(url, uid, upw);
			stmt = connection.createStatement();
			resultSet = stmt.executeQuery("select * from member");
			
			while(resultSet.next()) {
				
				String name = resultSet.getString("name");
				String id = resultSet.getString("id");
				String pw = resultSet.getString("pw");
				String phone1 = resultSet.getString("phone1");
				String phone2 = resultSet.getString("phone2");
				String phone3 = resultSet.getString("phone3");
				String gender = resultSet.getString("gender");
				
				//�޸� �ȿ� ��ƾ���
				MemberDTO dto = new MemberDTO(name, id, pw, phone1, phone2, phone3, gender);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				// ��ü ������ ������ �������� �ݾ��ش�.
				if(resultSet != null)
					resultSet.close();				
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
		
	}
	
}
