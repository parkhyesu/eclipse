package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Dto;

public class ContentCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String strId = request.getParameter("bId");
		Dao dao = new Dao();
		
		Dto dto = dao.contentView(strId);
		
		request.setAttribute("content_view", dto);

	}

}
