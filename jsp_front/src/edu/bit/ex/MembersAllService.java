package edu.bit.ex;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MembersAllService implements Service{

	@Override
	public ArrayList<MemberDto> execute(HttpServletRequest request, HttpServletResponse response) {
		
		//new 안하고 static 함수인 getInstance() 함수 통해 객체생성.
		//유저한테 new 안시키게끔.
		MemberDao dao = MemberDao.getInstance();
		
		return dao.membersAll();
	}

}
