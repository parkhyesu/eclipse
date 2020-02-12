package jsp_hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bitcamp
 */
@WebServlet("/bitcamp")
public class bitcamp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bitcamp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr"); 
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		
		writer.println("<style>");
		writer.println("p { color:#ffd800;   background-color:#ff0000;");
		writer.println("</style");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("<p>�ȳ��ϼ���</p>");
		writer.println("<p>��Ʈķ���Դϴ�.</p>");
		
		writer.println("</body>");
		writer.println("</html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
