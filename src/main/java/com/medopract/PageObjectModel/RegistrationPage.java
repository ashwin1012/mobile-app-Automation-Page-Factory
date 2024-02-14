package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Register']")
	WebElement registerPage;
	
	@FindBy(id="com.aanksolutions.medopract:id/etFirstName")
	WebElement firstName;
	
	@FindBy(id="com.aanksolutions.medopract:id/etLastName")
	WebElement lastName;
	
	@FindBy(id="com.aanksolutions.medopract:id/etEmailId")
	WebElement emailID;
	
	@FindBy(id="com.aanksolutions.medopract:id/etPhoneNo")
	WebElement phoneNo;
	
	@FindBy(id="com.aanksolutions.medopract:id/etNewUsername")
	WebElement userName;
	
	@FindBy(id="com.aanksolutions.medopract:id/etConfirmUsername")
	WebElement cnfrmUserName;
	
	@FindBy(id="com.aanksolutions.medopract:id/cbCheckBox")
	WebElement agreeTermCheckBox;
	
	@FindBy(id="com.aanksolutions.medopract:id/btnRegister")
	WebElement registerBtn;
	
	public WebElement getRegistrationPage() {
		return registerPage;
	}
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getEmailID() {
		return emailID;
	}
	
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getCnfrmUserName() {
		return cnfrmUserName;
	}
	
	public WebElement getAgreeTermCheckBox() {
		return agreeTermCheckBox;
	}
	
	public WebElement getRegisterBtn() {
		return registerBtn;
	}

}
