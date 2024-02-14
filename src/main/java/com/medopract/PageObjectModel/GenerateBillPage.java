package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GenerateBillPage {

	public WebDriver driver;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	WebElement clickMenu;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")
	WebElement billingClick;

	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"GENERATE BILL\"]/android.widget.TextView")
	WebElement generateBillingClick;

	@FindBy(id = "com.aanksolutions.medopract:id/actvbillingPatientName")
	WebElement patientsNameField;

	@FindBy(id="com.aanksolutions.medopract:id/etBedNumber")
	WebElement BedNumber;

	@FindBy(id="com.aanksolutions.medopract:id/admissionDate")
	WebElement AdmissionDate;

	@FindBy(id="com.aanksolutions.medopract:id/dischargeDate")
	WebElement DischargeDate;

	@FindBy(id="android:id/button1")  
	WebElement OkButton;

	@FindBy(id="com.aanksolutions.medopract:id/etDescription")
	WebElement Description;

	@FindBy(id="com.aanksolutions.medopract:id/etQuantity")
	WebElement Quantity ;

	@FindBy(id="com.aanksolutions.medopract:id/etRate")
	WebElement Rate;

	@FindBy(id="com.aanksolutions.medopract:id/tvBillPlus")
	WebElement PlusSign;

	@FindBy(id="com.aanksolutions.medopract:id/imgCancelBill")
	WebElement CancelButton;

	@FindBy(id="com.aanksolutions.medopract:id/btnGenerateBill")
	WebElement GenerateBillButton;



	public GenerateBillPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getClickMenu() {
		return clickMenu;
	}

	public WebElement getBillingClick() {
		return billingClick;
	}

	public WebElement getGenerateBillingClick() {
		return generateBillingClick;
	}

	public WebElement getPatientsNameField() {
		return patientsNameField;
	}

	public WebElement getBedNumber() {
		return BedNumber;
	}

	public WebElement getAdmissionDate() {
		return AdmissionDate;
	}

	public WebElement getOkButton() {
		return OkButton;
	}

	public WebElement getDischargeDate() {
		return DischargeDate;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getRate() {
		return Rate;
	}

	public WebElement getPlusSign() {
		return PlusSign;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}

	public WebElement getGenerateBillButton() {
		return GenerateBillButton;
	}

}
