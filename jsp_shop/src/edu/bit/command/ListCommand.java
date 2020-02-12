package edu.bit.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.bit.dao.Dao;
import edu.bit.dto.Dto;

public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		Dao dao = new Dao();
		ArrayList<Dto> dtos = dao.list();
		
		request.setAttribute("list", dtos);

	}

}
