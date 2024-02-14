package com.medopract.AppTestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.medopract.Listners.CommonMethod;
import com.medopract.PageObjectModel.Login;

public class PLogin extends CommonMethod {


	public PLogin() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void openAndroidApk() throws MalformedURLException, InterruptedException {
	//	test=reports.startTest("Open Android Apk");
		initializeDriver();
	}
	
	@Test
	public void login() throws Exception {
		test=reports.startTest("Login");
			Login l=new Login();
			l.enterUserName();
			l.enterPassword();
			l.clickSubmit();
		}
	
	@AfterClass
	public void closeAndroid() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}
	

}
