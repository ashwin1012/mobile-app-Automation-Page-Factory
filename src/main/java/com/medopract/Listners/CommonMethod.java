package com.medopract.Listners;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.google.common.collect.ImmutableList;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class CommonMethod extends MasterPage {

	public static WebDriverWait wait;
	public static ExtentTest test;
	public static ExtentReports reports;
	public static CommonMethod base;
	public static AndroidDriver driver;
	public static AppiumDriverLocalService server;

	public CommonMethod() throws Exception {
		super();
		base = this;

	}

	@BeforeSuite
	public void configuration() {
		 SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a", Locale.ENGLISH);
	     String formattedDate = sdf.format(new Date());
	     System.out.println(formattedDate);
	     
	     String timestamp = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date()); 

		reports = new ExtentReports("src\\main\\resources\\reports\\ExtentReport\\ExtentReport_" + timestamp + ".html", true);
		reports.addSystemInfo("OS", "Windows 11");
		reports.addSystemInfo("User Name", "Ashwin Kumar Testing System");
		reports.addSystemInfo("Java Version", "20.0.1");
		reports.addSystemInfo("Environment", "QA");

	}

	@AfterSuite
	public void closure() {
		reports.flush();
		driver.quit();
	}
	
	public static void setInstance() {
		String nodeJsMainPath="C:\\Users\\vashw\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
		String nodeExePath="C:\\Program Files\\nodejs\\node.exe";
		String logFilePath="C:\\Users\\vashw\\Desktop\\Selenium\\MedopractMobileAppAutomation\\src\\test\\resources\\log2.txt";
		
		AppiumServiceBuilder builder=new AppiumServiceBuilder();
		builder
		.withAppiumJS(new File(nodeJsMainPath))
		.usingDriverExecutable(new File(nodeExePath))
		.usingPort(4723)
		.withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
		.withLogFile(new File(logFilePath))
		.withIPAddress("127.0.0.1");
		
		server=AppiumDriverLocalService.buildService(builder);
	}
	
	public static  AppiumDriverLocalService getInstance() {
		if(server == null) {
			setInstance();
		}
		return server;
	}
	
	public static void stopAppiumServer() {
		if(server != null) {
			getInstance().stop();
		}
	}
		
		
		public  AndroidDriver initializeDriver() throws MalformedURLException, InterruptedException {
		getInstance().start();
		ClassLoader cl=getClass().getClassLoader();
		File file=new File("C:\\Users\\vashw\\Downloads\\Telegram Desktop\\MedoPract.apk");
		String apkPath=file.getAbsolutePath();

		UiAutomator2Options options=new UiAutomator2Options();
		options
		  .setPlatformName("Android")             
		  .setPlatformVersion("14")              
		  .setAutomationName("UiAutomator2")      
		  .setDeviceName("emulator-5554")         
		  .setAppPackage("com.aanksolutions.medopract") 
		  .setAppActivity("com.clinic.myclinic.SplashScreenActivity ")            
		  .setApp(apkPath)                      
		  .setNoReset(false); 
	
	URL url=new URL("http://127.0.0.1:4723/");
	driver=new AndroidDriver(url,options);
	Thread.sleep(5000);
	return driver;
	}
	
	// Click on the webelement
		public void click(String locatorKey) throws Exception {
			try {
				WebElement element = getWebElement(locatorKey);
				waitForElementVisibility(element, 20);
				waitForElementToBeClickable(element, 20);
				element.click();
				test.log(LogStatus.PASS, "Click on the element: " + locatorKey,"Click on the element " + locatorKey + " Successfully");
			} catch (Exception e) {
				test.log(LogStatus.FAIL, "Click on the element: " + locatorKey,"Failed to click on the element " + locatorKey + e.getLocalizedMessage()+ test.addScreenCapture(takeScreenShot(locatorKey)));
			}

		}
		
		// Clear the Data
			public void clearData(String locatorKey) throws Exception {
				try {
					WebElement element =getWebElement(locatorKey);
					waitForElementVisibility(element, 20);
					element.clear();
					test.log(LogStatus.PASS, "Clear the data : " + locatorKey,
							"Clear the data " + locatorKey + " Successfully");
				} catch (Exception e) {
					test.log(LogStatus.FAIL, "Clear the data : " + locatorKey,
							"Failed to clear the data " + locatorKey + e.getMessage()+ test.addScreenCapture(takeScreenShot(locatorKey)));
				}

			}

		// Enter the Data
		public void enterData(String locatorKey, String testData) throws Exception {
			try {
				WebElement element =getWebElement(locatorKey);
				waitForElementVisibility(element, 20);
				element.sendKeys(propTestData.getProperty(testData));
				test.log(LogStatus.PASS, "Enter the : " + locatorKey, "Enter the text into " + testData + " Successfully");
			} catch (Exception e) {
				test.log(LogStatus.FAIL, "Enter the : " + locatorKey, "Failed to enter " + testData + e.getMessage()+ test.addScreenCapture(takeScreenShot(locatorKey)));
			}

		}

		// To get webelement
		public WebElement getWebElement(String locatorKey) throws Exception {
			try {
				String locatorValues[] = propLocator.getProperty(locatorKey).split(";");
				String locatorType = locatorValues[0].trim();
				String locatorValue = locatorValues[1].trim();
				WebElement element = null;
				if (locatorType.equalsIgnoreCase("id")) {
					element = driver.findElement(AppiumBy.id(locatorValue));
				} else if (locatorType.equalsIgnoreCase("class")) {
					element = driver.findElement(AppiumBy.className(locatorValue));
				} else if (locatorType.equalsIgnoreCase("css")) {
					element = driver.findElement(AppiumBy.cssSelector(locatorValue));
				} else if (locatorType.equalsIgnoreCase("xpath")) {
					element = driver.findElement(AppiumBy.xpath(locatorValue));
				} else if (locatorType.equalsIgnoreCase("linktext")) {
					element = driver.findElement(AppiumBy.linkText(locatorValue));
				}

				return element;
			} catch (Exception e) {
				test.log(LogStatus.FAIL, "Get the WebElement : " + locatorKey, "Failed to get the WebElement "
						+ e.getMessage() + test.addScreenCapture(takeScreenShot(locatorKey)));
				return null;
			}
		}
		
		public void waitForElementVisibility(WebElement element, int timeoutInSeconds) {
			try {
				Thread.sleep(1000);
				wait.until(ExpectedConditions.visibilityOfAllElements(element));
				test.log(LogStatus.PASS, "Wait for the element to be visible " + element,"The element visible " + element + " Successfully");
			} catch (Exception e) {
				test.log(LogStatus.FAIL, "Wait for the element to be visible  " + element,"The element is not visible " + element + " Failure");
			}
		}
		
		public void waitForElementVisibility1(String locatorKey, int timeoutInSeconds) {
			try {
				WebElement element = getWebElement(locatorKey);
				Thread.sleep(1000);
				wait.until(ExpectedConditions.visibilityOfAllElements(element));
				test.log(LogStatus.PASS, "Wait for the element to be visible " + locatorKey, "The element visible " + locatorKey + " Successfully");
			} catch (Exception e) {
				test.log(LogStatus.FAIL, "Wait for the element to be visible  " + locatorKey, "The element is not visible " + locatorKey + " Failure");
			}
		}
		
		public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
			try {
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(element));
				test.log(LogStatus.PASS, "Wait for the Element to be clickable: " + element,"The element clicked " + element + " Successfully");
			} catch (Exception e) {
				test.log(LogStatus.FAIL, "Wait for the element to be clickable: " + element,"The element is not clickable " + element + " Failure");
			}
		}
		
		public String takeScreenShot(String imageName) throws InterruptedException {
		    try {
		        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        String destLocation = System.getProperty("user.dir") + "\\src\\main\\resources\\reports\\screenshots\\" + imageName + ".png";
		        FileUtils.copyFile(screenshot, new File(destLocation));
		        return "../screenshots\\" + imageName + ".png";
		    } catch (IOException e) {
		        System.err.println("Error taking screenshot: " + e.getMessage());
		        return null; 
		    }
		}
		
		public static void longPress(WebElement element) {
		    Point location = element.getLocation();
		     PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		    Sequence sequence = new Sequence(input, 0);
		    sequence.addAction(input.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),location.x,location.y));
		    sequence.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		    sequence.addAction(input.createPointerMove(Duration.ofSeconds(1),PointerInput.Origin.viewport(),location.x,location.y));
		    sequence.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		    driver.perform(ImmutableList.of(sequence));
		}

}
