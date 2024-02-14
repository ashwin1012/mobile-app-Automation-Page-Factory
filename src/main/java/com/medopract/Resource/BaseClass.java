package com.medopract.Resource;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass  {
	public static AndroidDriver driver;
		
		public  AndroidDriver initializeDriver() throws MalformedURLException, InterruptedException {
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
}
