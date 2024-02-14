package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewBillPage {

	public WebDriver driver;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	WebElement clickMenu;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")
	WebElement billingClick;
	
	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc='VIEW BILL']/android.widget.TextView")
	WebElement ViewBillclick;
	
	@FindBy(id = "com.aanksolutions.medopract:id/actvPatientNameBill")
	WebElement patientNameField;
	
	@FindBy(id="com.aanksolutions.medopract:id/viewBill_recyclerView")
	WebElement clickPatientNameSuggestion;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")
    WebElement clickPatientList;
	
	public ViewBillPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getClickMenu() {
		return clickMenu;
	}

	public WebElement getBillingClick() {
		return billingClick;
	}
	
	public WebElement getViewBillclick() {
		return ViewBillclick;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}

	public WebElement getClickNamelist() {
		return clickPatientNameSuggestion;
	}
	
	public WebElement getClickPatientList() {
		return clickPatientList;
	}
}
