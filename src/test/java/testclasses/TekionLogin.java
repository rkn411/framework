package testclasses;

	import java.io.File;
	import java.io.IOException;
	import java.net.MalformedURLException;
	import java.net.URL;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import com.relevantcodes.extentreports.LogStatus;
	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.ios.IOSDriver;
	import utilities.Retry;

	public class TekionLogin {
		@Test(priority=1)
		public void launch() throws Exception {
			
		//File app  = new File("/Users/tekion/Desktop/tekion_cdms_mobile.ipa");
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("deviceName","Bala's iPhone");
		caps.setCapability("platformName","iOS");
		caps.setCapability("AutomationName","XCUITest");
		caps.setCapability("platformVersion","11.0.3");
		//caps.setCapability("appiumVersion", "1.6.5");
		//app.getAbsolutePath();
		caps.setCapability("bundleId","com.tekion.cdmsmobileenterprise");
		//caps.setCapability("udid","f816d8d53643f2dde57fcb003d911576a7d10b6c");
		//6s iphone
		caps.setCapability("udid","4efe4d624506f95c1333db73534c3bac26e92867");
		driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		Thread.sleep(12000);
		ServiceAdvisorLogin();
		
	}
		public static AppiumDriver driver;
		public IOSDriver d;
		public static final By EMAIL=By.name("Email");
		public static final By PWD=By.name("Password");
		public static final By PD=By.name("PASSWORD");
		public static final By SIGNIN=By.name("Sign In");
		public static final By FORGOTPWD=By.name("forgot password?");
		public static final By ACCEPTCONTINUE =By.id("Accept & Continue");
	    public static void ServiceAdvisorLogin()throws Exception {
			//enter email
			driver.findElement(EMAIL).sendKeys("serviceadvisor1@tekion.com");
			Thread.sleep(6500);
			//focus pwd
			driver.findElement(PWD).click();
			Thread.sleep(4000);
			//enter password
			driver.findElement(PD).sendKeys("Tekion123");
			//tap on signin
	     	driver.findElement(SIGNIN).click();
	     	System.out.print("login successfull");
	     	//accept terms and policy
	     	Thread.sleep(3000);
	     	try {
	     		driver.findElement(ACCEPTCONTINUE).click();
	        } catch (NoSuchElementException e) {
	        	e.printStackTrace();
	        }
	        
	     	
		}
	}

