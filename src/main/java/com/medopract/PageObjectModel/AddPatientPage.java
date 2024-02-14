package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatientPage {
	WebDriver driver;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open']")
	WebElement clickMenu;

	@FindBy(xpath="//android.widget.CheckedTextView[@text='Patients']")
	WebElement menuPatientsBtn;

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Patient\"]")
	WebElement homePagePatientsClick;

	@FindBy(id = "com.aanksolutions.medopract:id/etPatientName")
	WebElement patientNameField;

	@FindBy(id = "com.aanksolutions.medopract:id/etPatientPhone")
	WebElement phoneNoField;

	@FindBy(id="com.aanksolutions.medopract:id/radiobtnM")
	WebElement genderMaleRadioBtn;

	@FindBy(id="com.aanksolutions.medopract:id/radiobtnF")
	WebElement genderFemaleRadioBtn;

	@FindBy(id = "com.aanksolutions.medopract:id/etOccupation")
	WebElement OccupationField;

	@FindBy(id = "com.aanksolutions.medopract:id/etEmergencyContact")
	WebElement emergencyField;

	@FindBy(id = "com.aanksolutions.medopract:id/etAddress")
	WebElement addressField;

	@FindBy(id = "com.aanksolutions.medopract:id/etAllergies")
	WebElement allergiesField;

	@FindBy(id = "com.aanksolutions.medopract:id/etHistory")
	WebElement historyField;
	
	@FindBy(id = "com.aanksolutions.medopract:id/etRemarks")
	WebElement remarksField;

	@FindBy(id = "com.aanksolutions.medopract:id/etHabits")
	WebElement habitsField;

	@FindBy(id = "com.aanksolutions.medopract:id/btnPatientSave")
	WebElement saveButton;

	@FindBy(id = "com.aanksolutions.medopract:id/tvPatAddSuccess")
	WebElement AddPatientSuccessMessage;

	@FindBy(id = "com.aanksolutions.medopract:id/btnOKAYaddpatient")
	WebElement AddPatientMessageOKBtn;

	AddPatientPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickMenu() {
		return clickMenu;
	}

	public WebElement getMenuPatientsBtn() {
		return menuPatientsBtn;
	}

	public WebElement getHomePagePatientsClick() {
		return homePagePatientsClick;
	}

	public WebElement getPatientNameField() {
		return patientNameField;
	}

	public WebElement getPhoneNoField() {
		return phoneNoField;
	}

	public WebElement getGenderMaleRadioBtn() {
		return genderMaleRadioBtn;
	}

	public WebElement getGenderFemaleRadioBtn() {
		return genderFemaleRadioBtn;
	}

	public WebElement getOccupationField() {
		return OccupationField;
	}

	public WebElement getEmergencyField() {
		return emergencyField;
	}

	public WebElement getAllergiesField() {
		return allergiesField;
	}

	public WebElement getRemarksField() {
		return remarksField;
	}

	public WebElement getHistoryField() {
		return historyField;
	}

	public WebElement getHabitsField() {
		return habitsField;
	}

	public WebElement getAddressField() {
		return addressField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getAddPatientSuccessMessage() {
		return AddPatientSuccessMessage;
	}

	public WebElement getAddPatientMessageOKBtn() {
		return AddPatientMessageOKBtn;
	}


}
