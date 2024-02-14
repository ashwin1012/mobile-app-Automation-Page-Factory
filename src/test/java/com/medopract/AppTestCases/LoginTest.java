package com.medopract.AppTestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.medopract.PageObjectModel.LoginPage;
import com.medopract.Resource.BaseClass;

public class LoginTest extends BaseClass {
	
	@BeforeClass
	public void OpenBrowser() throws MalformedURLException, InterruptedException {
		driver=initializeDriver();
	}
	
	@Test
	public void login() throws InterruptedException {
		LoginPage l=new LoginPage(driver);
		l.getUsernameField().sendKeys("ashwinkv016");
		Thread.sleep(2000);
		l.getPasswordField().sendKeys("ashwinkv016");
		Thread.sleep(2000);
		l.getSubmitBtn().click();
	}
	
	@AfterClass
	public void closeAndroidApp() {
		driver.quit();
	}

}
