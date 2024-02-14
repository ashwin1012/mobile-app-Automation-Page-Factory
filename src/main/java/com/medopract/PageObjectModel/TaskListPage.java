package com.medopract.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	WebDriver driver;

	@FindBy(id = "com.aanksolutions.medopract:id/txtHomeFragment")
	 WebElement taskListPageClick;

	@FindBy(id = "com.aanksolutions.medopract:id/txtAddTask")
	 WebElement addTaskPlusBtn;

	@FindBy(id= "com.aanksolutions.medopract:id/etTask")
	 WebElement addTaskName;
	
	@FindBy(id= "com.aanksolutions.medopract:id/etDate")
      WebElement DueDateClick;
	
	@FindBy(id="android:id/button1")
	WebElement dueDateOKButton;
	
	@FindBy(id="com.aanksolutions.medopract:id/iv_close")
	WebElement addTaskCancelBtn;

	@FindBy(id = "com.aanksolutions.medopract:id/btnAddTask")
	 WebElement addTaskButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	 WebElement ClickCompleteButton;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView[2]")
	 WebElement ClickDeleteButton;
	
	@FindBy(xpath="//android.widget.LinearLayout[@content-desc=\"OPEN TASKS\"]/android.widget.TextView")
	 WebElement ClickViewCompletedTask;
	
	@FindBy(xpath="//android.widget.LinearLayout[@content-desc=\"COMPLETED TASKS\"]")
	 WebElement ClickOpenTask;

	
	
	public TaskListPage(WebDriver driver) {
		this.driver = (WebDriver) driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskListPageClick() {
		return taskListPageClick;
	}

	public WebElement getAddTaskPlusBtn() {
		return addTaskPlusBtn;
	}

	public WebElement getAddTaskName() {
		return addTaskName;
	}

	public WebElement getDueDateClick() {
		return DueDateClick;
	}

	public WebElement getdueDateOKButton() {
		return dueDateOKButton;
	}

	public WebElement getAddTaskCancelBtn() {
		return addTaskCancelBtn;
	}

	public WebElement getAddTaskButton() {
		return addTaskButton;
	}

	public WebElement getClickCompleteButton() {
		return ClickCompleteButton;
	}

	public WebElement getClickYesDeleteButton() {
		return ClickDeleteButton;
	}
	
	public WebElement getClickViewCompletedTask() {
		return ClickViewCompletedTask;
	}
	
	public WebElement getClickOpenTask() {
		return ClickOpenTask;
	}
}
