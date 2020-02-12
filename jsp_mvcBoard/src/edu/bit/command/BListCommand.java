package edu.bit.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//����Ʈ �ϴ� �̾ƿ���. �׳� �̺κ� �ϱ��ؾ���.
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		//list ��� �̸����� dtos �� ù��° ���� ��.
		request.setAttribute("list", dtos);
	}

}
