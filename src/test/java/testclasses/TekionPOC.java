package testclasses;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

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

public class TekionPOC {
	
	@Test(priority=1)
	public void launch() throws IOException, InterruptedException {
		
	File app  = new File("/Users/tekion/Desktop/tekion_cdms_mobile.ipa");
	DesiredCapabilities caps =new DesiredCapabilities();
	caps.setCapability("app",app.getAbsolutePath());
	caps.setCapability("deviceName","Tekion som iPhone");
	caps.setCapability("platformName","iOS");
	caps.setCapability("AutomationName","XCUITest");
	caps.setCapability("platformVersion","10.2");
	caps.setCapability("appiumVersion", "1.6.5");
	caps.setCapability("bundleId","com.tekion.cdmsmobileenterprise");
	caps.setCapability("udid","f816d8d53643f2dde57fcb003d911576a7d10b6c");
	driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	Thread.sleep(12000);
}
	public static AppiumDriver driver;
	public IOSDriver d;
	public static final By EMAIL=By.name("Email");
	public static final By PWD=By.name("Password");
	public static final By SIGNIN=By.name("Sign In");
	public static final By FORGOTPWD=By.name("forgot password?");
	public static final By ACCEPTCONTINUE =By.xpath("(//XCUIElementTypeOther[@name=\"Accept & Continue \"])[2]");

public void emailIDFill(String input, AppiumDriver driver) {
		waitForExpectedElement(driver, EMAIL);
		driver.findElement(EMAIL).clear();
		driver.findElement(EMAIL).sendKeys(input);
}
public void Fill(String pd, AppiumDriver driver) {
			waitForExpectedElement(driver, PWD);
			driver.findElement(PWD).click();
			driver.findElement(PWD).clear();
			driver.findElement(PWD).sendKeys(pd);	
}
		// Method for Click on SignIn Button
public void SignInBtn(AppiumDriver driver) {
			waitForExpectedElement(driver, SIGNIN);
			driver.findElement(SIGNIN).click();
			
}

public void Accept(AppiumDriver driver)
{
	waitForExpectedElement(driver,ACCEPTCONTINUE);
	driver.findElement(ACCEPTCONTINUE).click();
}
//Explicit wait method for element clickable
public static WebElement waitForExpectedElement(AppiumDriver driver, final By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
}

@Test(priority=2)	
public static void ServiceAdvisorLogin()throws Exception {
		TekionPOC login= new TekionPOC();
		//System.out.println(driver.getPageSource());
	  //enter email
		login.emailIDFill("serviceadvisor1@tekion.com", driver);
		//enter password
		login.Fill("Tekion123", driver);
		//tap on sign in
		login.SignInBtn(driver);
		//tap on accept and continue
		login.Accept(driver);
	}

}
