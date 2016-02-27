package Oust1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MenuCheck {
	AppiumDriver<AndroidElement> driver;
	@BeforeTest
	public void setUp() throws MalformedURLException {
	
		DesiredCapabilities capabilities = new DesiredCapabilities(); 
	
		capabilities.setCapability("deviceName", "3a223ed");
	
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		
		capabilities.setCapability(CapabilityType.VERSION, "5.1.1");
		
		capabilities.setCapability("platformName", "Android"); 
		capabilities.setCapability("appPackage", "com.oustme.oustapp");
		capabilities.setCapability("appActivity", "com.oustme.oustapp.activity.SplashActivity_");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
	
	 @Test
	  public void Click1() throws InterruptedException {
		  Thread.sleep(2000);
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		  driver.findElementById("com.oustme.oustapp:id/txtProgress").click();
		  Thread.sleep(3000);
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		  driver.findElementById("com.oustme.oustapp:id/oustcoin_text").click();
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		  driver.findElementById("com.oustme.oustapp:id/rate_text").click();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		  driver.findElementById("com.oustme.oustapp:id/tutorial_text").click();
		  Thread.sleep(2000);
		  driver.swipe(606, 638, 106, 685, 0);
			 Thread.sleep(1000);
			driver.swipe(606, 638, 106, 685, 0);
			 Thread.sleep(1000);
			driver.swipe(606, 638, 106, 685, 0);
			Thread.sleep(1000);
			driver.swipe(606, 638, 106, 685, 0);
		  driver.findElementById("com.oustme.oustapp:id/letsGoButton").click();
		  driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		
		  driver.findElementById("com.oustme.oustapp:id/promocode_txt").click();
		  driver.findElementById("com.oustme.oustapp:id/edittext_refercode").sendKeys("ABC");
		  driver.findElementById("com.oustme.oustapp:id/edittext_refercode").clear();
		  driver.hideKeyboard();
		  
		  driver.findElementById("com.oustme.oustapp:id/edittext_refercode").sendKeys("Oust25");
		  driver.hideKeyboard();
		  driver.findElementById("com.oustme.oustapp:id/refer_okbtn").click();
		  Thread.sleep(1000);
		  driver.findElementById("com.oustme.oustapp:id/btnAlert").click();
	  }
	 @AfterTest
	  public void Click2() throws InterruptedException {
		driver.quit();
		     
	 } 
}
