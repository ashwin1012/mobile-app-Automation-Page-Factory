package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAppointmentsPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open']")
	WebElement clickMenu;

	@FindBy(xpath="//android.widget.CheckedTextView[@text='Appointments']]")
	WebElement menuAppointmentsBtn;
	
	@FindBy(id="com.aanksolutions.medopract:id/tv_AddAppointment")
	WebElement addAppointment;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Book Appt\"]/android.widget.ImageView")
	WebElement ClickBookAppointment;

	@FindBy(id = "com.aanksolutions.medopract:id/etFullName")
	WebElement FullNameField;

	@FindBy(id = "com.aanksolutions.medopract:id/etPhoneNo")
	WebElement PhoneNoField;

	@FindBy(id = "com.aanksolutions.medopract:id/etVisitReason")
	WebElement ClickVisitReasonField;

	@FindBy(id = "//android.widget.TextView[1][@text='MON']")
	WebElement ClickCalenderDate;
	
	@FindBy(id = "com.aanksolutions.medopract:id/imgRightScroll")
	WebElement dateGreater;
	
	@FindBy(id = "com.aanksolutions.medopract:id/imgLeftScroll")
	WebElement dateLesser;
	
	@FindBy(id = "//android.widget.Button[4][@text='10:30AM']")
	WebElement ClickCalenderTime;
	
	@FindBy(id = "com.aanksolutions.medopract:id/imgleftTimeScroll")
	WebElement timeLesser;
	
	@FindBy(id = "com.aanksolutions.medopract:id/imgrightTimeScroll")
	WebElement timeGreater;
	
	@FindBy(id = "com.aanksolutions.medopract:id/btnConfirmAppointment")
	WebElement ConfirmAppointmentBtn;

	@FindBy(id = "com.clinic.myclinic.debug:id/btnConfirmAppointment")
	WebElement ClickConfirmAppointment;
	
	@FindBy(id="com.clinic.myclinic.debug:id/tvAppBookSuccess")
	WebElement AppointmentBookMessage;
	
	@FindBy(id="com.clinic.myclinic.debug:id/btnOKAY")
	WebElement AppointmentBookOkMessage;
	
	
	public BookAppointmentsPage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	public WebElement getClickMenu() {
		return clickMenu;
	}

	public WebElement getMenuAppointmentsBtn() {
		return menuAppointmentsBtn;
	}
	
	public WebElement getAddAppointment() {
		return addAppointment;
	}

	public WebElement getClickBookAppointment() {
		return ClickBookAppointment;
	}

	public WebElement getFullNameField() {
		return FullNameField;
	}

	public WebElement getPhoneNoField() {
		return PhoneNoField;
	}

	public WebElement getClickVisitReasonField() {
		return ClickVisitReasonField;
	}

	public WebElement getClickCalender() {
		return ClickCalenderDate;
	}
	
	public WebElement getDateGreater() {
		return dateGreater;
	}
	
	public WebElement getDateLesser() {
		return dateLesser;
	}
	
	public WebElement getClickCalenderTime() {
		return ClickCalenderTime;
	}
	
	public WebElement getTimeLesser() {
		return timeLesser;
	}
	
	public WebElement getTimeGreater() {
		return timeGreater;
	}

	public WebElement getConfirmAppointmentBtn() {
		return ConfirmAppointmentBtn;
	}

	public WebElement getClickConfirmAppointment() {
		return ClickConfirmAppointment;
	}

	public WebElement getAppointmentBookMessage() {
		return AppointmentBookMessage;
	}

	public WebElement getAppointmentBookOkMessage() {
		return AppointmentBookOkMessage;
	}
	

}
