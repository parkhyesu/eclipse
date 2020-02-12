package edu.bit.ex;

import java.sql.Date;

public class EmpDTO {
	
	private String ename;
	private Date hiredate;
	
	public EmpDTO() {
		
	}
	public EmpDTO(String ename,Date hiredate) {
		super();
		this.ename = ename;
		this.hiredate = hiredate;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

}
