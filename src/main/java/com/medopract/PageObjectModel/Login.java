package com.medopract.PageObjectModel;

import com.medopract.Listners.CommonMethod;

public class Login extends CommonMethod {
	
	public Login() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void enterUserName() throws Exception {
		enterData("userNameField", "userName");
	}
	
	public void enterPassword() throws Exception {
		enterData("passwordField", "passWord");
	}
	
	public void clickSubmit() throws Exception {
		click("submitBtn");
	}


}
