package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPrescriptionPage {
	
	public WebDriver driver;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open\"]")
	WebElement clickMenu;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Prescriptions']")
	WebElement prescriptionsClick;
	
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc='VIEW PRESCRIPTION']/android.widget.TextView")
	WebElement viewPrescriptionTab;

	@FindBy(id = "com.aanksolutions.medopract:id/actvPatientNamePresp")
	WebElement patientNameField;
	
	
	public ViewPrescriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getClickMenu() {
		return clickMenu;
	}

	public WebElement getPrescriptionsClick() {
		return prescriptionsClick;
	}
	
	public WebElement getViewPrescriptionTab() {
		return viewPrescriptionTab;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}

}
