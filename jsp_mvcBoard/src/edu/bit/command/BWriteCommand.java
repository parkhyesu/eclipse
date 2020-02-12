package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//request 안에 유저가 입력한 정보들 다 들어있음.
		//request 안에 있는거 꺼내야함.
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		//위에 3개를 참고해서 이제 집어넣어야함
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);
	}
}
