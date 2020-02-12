package edu.bix.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberService implements Service {

	@Override
	public ArrayList<MemberDto> execute(HttpServletRequest request, HttpServletResponse response) {
		
		MemberDao dao = MemberDao.getInstance();
		
		return dao.memberSelect();
	}

}
