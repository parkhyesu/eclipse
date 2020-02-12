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
	
	//데이터베이스에 접속해서 모든 멤버들을 가져오는 함수
	public ArrayList<MemberDTO> memberSelect(){
		
		//ArrayList 안에 MemberDTO 를 가져오고있다.
		ArrayList<MemberDTO> dtos = new ArrayList<MemberDTO>();
		
		//3종세트
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
				
				//메모리 안에 담아야해
				MemberDTO dto = new MemberDTO(name, id, pw, phone1, phone2, phone3, gender);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				// 객체 생성된 순서의 역순으로 닫아준다.
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
