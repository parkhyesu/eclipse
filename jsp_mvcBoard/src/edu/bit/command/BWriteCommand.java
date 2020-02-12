package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//request �ȿ� ������ �Է��� ������ �� �������.
		//request �ȿ� �ִ°� ��������.
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		//���� 3���� �����ؼ� ���� ����־����
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);
	}
}
