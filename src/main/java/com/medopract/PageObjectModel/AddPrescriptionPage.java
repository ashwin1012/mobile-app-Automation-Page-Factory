package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPrescriptionPage {

	public WebDriver driver;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open\"]")
	WebElement clickMenu;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Prescriptions']")
	WebElement prescriptionsClick;

	@FindBy(id = "com.aanksolutions.medopract:id/actvPatientName")
	WebElement patientNameField;
	
	@FindBy(id = "com.aanksolutions.medopract:id/prescriptionDate")
	WebElement prescriptionDateClick;
	
	@FindBy(id="android:id/button1")
	WebElement prescriptionDateOKBtn;

	@FindBy(id = "com.aanksolutions.medopract:id/etPatientEmail")
	WebElement emailField;

	@FindBy(id = "com.aanksolutions.medopract:id/etMedicineName")
	WebElement medicineNameField;

	@FindBy(id = "com.aanksolutions.medopract:id/etNoofDays")
	WebElement totalNumberDays;

	@FindBy(id = "com.aanksolutions.medopract:id/etInstructions")
	WebElement timingsInput;

	@FindBy(id = "com.aanksolutions.medopract:id/etMedAmount")
	WebElement amountInput;
	
	@FindBy(id = "com.aanksolutions.medopract:id/tvPlus")
	WebElement PlusSign;
	
	@FindBy(id = "com.aanksolutions.medopract:id/etNotes")
	WebElement notesForDoctor;

	@FindBy(id = "com.aanksolutions.medopract:id/btnSavePrint")
	WebElement saveAndPrintButton;
	
	public AddPrescriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getClickMenu() {
		return clickMenu;
	}

	public WebElement getPrescriptionsClick() {
		return prescriptionsClick;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}

	public WebElement getPrescriptionDateClick() {
		return prescriptionDateClick;
	}

	public WebElement getPrescriptionDateOKBtn() {
		return prescriptionDateOKBtn;
	}

	public WebElement getMedicineNameField() {
		return medicineNameField;
	}

	public WebElement getTotalNumberDays() {
		return totalNumberDays;
	}

	public WebElement getTimingsInput() {
		return timingsInput;
	}

	public WebElement getAmountInput() {
		return amountInput;
	}

	public WebElement getPlusSign() {
		return PlusSign;
	}

	public WebElement getNotesForDoctor() {
		return notesForDoctor;
	}

	public WebElement getSaveAndPrintButton() {
		return saveAndPrintButton;
	}

}
