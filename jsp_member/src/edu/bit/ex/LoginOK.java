package edu.bit.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginOK
 */
@WebServlet("/LoginOK") // /LoginOK 이게 URL. 이 URL 로 받아내겠다.
public class LoginOK extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;
	private Statement stmt;
	private ResultSet resultSet;

	private String name, id, pw, phone1, phone2, phone3, gender;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginOK() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		id = request.getParameter("id");
		pw = request.getParameter("pw");

		String query = "select * from member where id = '" + id + "' and pw = '" + pw + "'";

		System.out.println(query);// 잘들어갔는지 확인용(디버깅용)

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			stmt = connection.createStatement();
			resultSet = stmt.executeQuery(query);
			
			while(resultSet.next()) {
				
				name = resultSet.getString("name");
				id = resultSet.getString("id");
				pw = resultSet.getString("pw");
				phone1 = resultSet.getString("phone1");
				phone2 = resultSet.getString("phone2");
				phone3 = resultSet.getString("phone3");
				gender = resultSet.getString("gender");
			}
			
			//세션의 개념이용..name, id, pw 를 서버쪽에 저장해놓는것? 톰캣에 30분으로 저장시간 설정되어있음.
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("name", name);
			httpSession.setAttribute("id", id);
			httpSession.setAttribute("pw", pw);
			
			response.sendRedirect("loginResult.jsp");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				// 객체 생성된 순서의 역순으로 닫아준다.
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
