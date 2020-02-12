package edu.bit.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//리스트 싹다 뽑아오기. 그냥 이부분 암기해야함.
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		//list 라는 이름으로 dtos 의 첫번째 값이 들어감.
		request.setAttribute("list", dtos);
	}

}
