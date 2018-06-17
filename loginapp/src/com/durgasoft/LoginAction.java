package com.durgasoft;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String uname,upwd;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Conndb cb=new Conndb();
		String name=cb.take();
		System.out.println(name);
		String status="";
		if(uname.equals(name) && (upwd.equals("1234"))){
			status=SUCCESS;
		}
		else{
			status=ERROR;
		}
		return status;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
