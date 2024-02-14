package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientVisitPage {
	WebDriver driver;
	
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open\"]")
	WebElement menuIcon;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Patients']")
	WebElement patientsBtn;
	
	@FindBy(id="com.aanksolutions.medopract:id/startpatvisit")
	WebElement startPatientVisit;
	
	@FindBy(id="com.aanksolutions.medopract:id/etSearchPatient")
	WebElement searchPatient;

	@FindBy(id="com.aanksolutions.medopract:id/tv_NewPatient")
	WebElement addNewPatient ;

	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout")
	WebElement patientList;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	WebElement callOption;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]")
	 WebElement smsOption;

	@FindBy(id="com.aanksolutions.medopract:id/btnPatientVisitAtDetail")
	 WebElement patientVisitBtn;

	@FindBy(id="com.aanksolutions.medopract:id/etDateandTime")
	 WebElement patientVisitDateAndTime;

	@FindBy(id="com.aanksolutions.medopract:id/etPrimaryComplain")
	 WebElement primaryComplaint;

	@FindBy(id="com.aanksolutions.medopract:id/etSymptomIndication")
	 WebElement symptomsAndIndication;
	
	@FindBy(id="com.aanksolutions.medopract:id/etClinicalObservation")
	 WebElement clinicalObservation;
	
	@FindBy(id="com.aanksolutions.medopract:id/etDiagnosisRemarks")
	 WebElement remarks;
	
	@FindBy(id="com.aanksolutions.medopract:id/etBloodPressure")
	 WebElement bloodPressure;
	
	@FindBy(id="com.aanksolutions.medopract:id/etSugarLevel")
	 WebElement sugarLevel;
	
	@FindBy(id="com.aanksolutions.medopract:id/etHeartRate")
	 WebElement heartRate;
	
	@FindBy(id="com.aanksolutions.medopract:id/etInvestigations")
	 WebElement investigationsAndTests;
	
	@FindBy(id="com.aanksolutions.medopract:id/btnPatientVisitSave")
	 WebElement saveBtn;
	
	@FindBy(id="com.aanksolutions.medopract:id/tv_EditPatientDetail")
	 WebElement viewOrEditBtn;
	
	PatientVisitPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMenuIcon() {
		return menuIcon;
	}
	
	public WebElement getPatientsBtn() {
		return patientsBtn;
	}
	
	public WebElement getStartPatientVisit() {
		return startPatientVisit;
	}
	
	public WebElement getSearchPatient() {
		return searchPatient;
	}
	
	public WebElement getAddNewPatient() {
		return addNewPatient;
	}
	
	public WebElement getPatientList() {
		return patientList;
	}
	
	public WebElement getCallOption() {
		return callOption;
	}
	
	public WebElement getSmsOption() {
		return smsOption;
	}
	
	public WebElement getPatientVisitBtn() {
		return patientVisitBtn;
	}
	
	public WebElement getPatientVisitDateAndTime() {
		return patientVisitDateAndTime;
	}
	
	public WebElement getPrimaryComplaint() {
		return primaryComplaint;
	}
	
	public WebElement getSymptomsAndIndication() {
		return symptomsAndIndication;
	}
	
	public WebElement getClinicalObservation() {
		return clinicalObservation;
	}
	
	public WebElement getRemarks() {
		return remarks;
	}
	
	public WebElement getBloodPressure() {
		return bloodPressure;
	}
	
	public WebElement getSugarLevel() {
		return sugarLevel;
	}
	
	public WebElement getHeartRate() {
		return heartRate;
	}
	
	public WebElement getInvestigationsAndTests() {
		return investigationsAndTests;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getViewOrEditBtn() {
		return viewOrEditBtn;
	}
	 
}
