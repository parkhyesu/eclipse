package edu.bix.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class select
 */
@WebServlet("*.select")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring(conPath.length());
		
		if(command.equals("/membersAll.select")) {
			response.setContentType("text/html; charset=EUC-KR");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			
			Service service = new MemberService();
			ArrayList<MemberDto> dtos = service.execute(request, response);
			
			
			for(int i = 0; i <dtos.size(); i++) {
				
				MemberDto dto = dtos.get(i);
				
				int empNo = dto.getEmpNo();
				String eName = dto.geteName();
				String job = dto.getJob();
				int mgr = dto.getMgr();
				Date hireDate = dto.getHireDate();
				int sal = dto.getSal();
				int comm = dto.getComm();
				int deptNo = dto.getDeptNo();
				
				writer.println(empNo +"||"+ eName +"||"+ job +"||"+ mgr +"||"+ hireDate +"||"+ sal +"||"+ comm+"||"+ deptNo);
				
			}
			
			writer.println("</body></html>");
		}
	}

}
