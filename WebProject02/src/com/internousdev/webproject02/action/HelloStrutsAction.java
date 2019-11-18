package com.internousdev.webproject02.action;

import com.internousdev.webproject02.dao.HelloStrutsDAO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport{
	public String execute(){
		String ret=ERROR;
		com.internousdev.webproject02.dao.HelloStrutsDAO dao=new HelloStrutsDAO();
		boolean b=dao.select();
		if(b==true){
			ret=SUCCESS;
		}else{
			ret=ERROR;
		}
		return ret;
	}

}
