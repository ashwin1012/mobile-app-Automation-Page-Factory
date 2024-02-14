package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.medopract.Resource.BaseClass;

public class LoginPage extends BaseClass {
	

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//android.widget.ImageView")
	 WebElement medoPractLogo;
	
	@FindBy(xpath="//android.widget.TextView[1][@text='Log-In']")
	 WebElement LoginPage;
	
	@FindBy(id="com.aanksolutions.medopract:id/etUsername")
	 WebElement usernameField;
	
	@FindBy(id="com.aanksolutions.medopract:id/etPassword")
	  WebElement passwordField;
	
	@FindBy(id="com.aanksolutions.medopract:id/btnSubmit")
	 WebElement submitBtn;
	
	@FindBy(id="com.aanksolutions.medopract:id/actionHelp")
	WebElement helpBtn;

	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Open\"]")
	WebElement menuBtn;
	
	@FindBy(xpath = "//android.widget.CheckedTextView[@text='Logout']")
	WebElement logOutBtn;
	
	
	public WebElement getMedopractLogo() {
		return medoPractLogo;
	}
	
	public WebElement getLoginPage() {
		return LoginPage;
	}
	
	public WebElement getHelpBtn() {
		return helpBtn;
	}
	
	public WebElement getUsernameField() {
		return usernameField;
	}
	
	public WebElement getPasswordField() {
		return passwordField;
	}
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public WebElement getMenuBtn() {
		return menuBtn;
	}
	
	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

}
