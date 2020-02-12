package edu.bit.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.BDao;
import edu.bit.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		//list.jsp ���� bId=${dto.bId} �̷��� �ؼ� bId �ѱ�� �޾ƿ���
		String bId = request.getParameter("bId");
		
		//list �� �ٸ��� bId �� �޾Ƽ� �ϳ��� �޾ƿ��� �Ǵ°Ŵϱ� ArrayList �� �ʿ� ����.
		BDao dao = new BDao();
		BDto dto = dao.contentView(bId);
		
		//�ٽ��ڵ� �̰� �ȳ����� �ƹ� �ҿ� ����. �޾ƿ����� ����־������
		request.setAttribute("content_view", dto);
		

	}

}
