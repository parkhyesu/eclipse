package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		//list.jsp 에서 bId=${dto.bId} 이렇게 해서 bId 넘긴거 받아오기
		String bId = request.getParameter("bId");
		
		//list 와 다르게 bId 값 받아서 하나만 받아오면 되는거니까 ArrayList 할 필요 없음.
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		//핵심코드 이거 안넣으면 아무 소용 없음. 받아왔으면 집어넣어줘야지
		request.setAttribute("content_view", dto);
		

	}

}
