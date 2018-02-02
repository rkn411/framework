package simulatorTekion;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class STekionLogin {
	public static AppiumDriver driver;
	public IOSDriver d;
	
	@Test
	public void launch() throws Exception {
		
	File app  = new File("/Users/tekion/Desktop/tekion_cdms_mobile.ipa");
	DesiredCapabilities caps =new DesiredCapabilities();
	caps.setCapability("deviceName","iPhone 6");
	caps.setCapability("platformName","iOS");
	//caps.setCapability("AutomationName","XCUITest");
	caps.setCapability("platformVersion","11.0.1");
	//caps.setCapability("appiumVersion", "1.6.5");
	//app.getAbsolutePath();
	caps.setCapability("bundleId","com.tekion.cdmsmobileenterprise");
	//caps.setCapability("udid","f816d8d53643f2dde57fcb003d911576a7d10b6c");
	//6s iphone
	caps.setCapability("udid","D6A34E01-3E85-4525-9ADC-E50F71611A86");
	driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	Thread.sleep(12000);
	SServiceAdvisorLogin();
	
}
	
	public static final By EMAIL=By.name("Email");
	public static final By PWD=By.name("Password");
	public static final By PD=By.name("PASSWORD");
	public static final By SIGNIN=By.name("Sign In");
	public static final By FORGOTPWD=By.name("forgot password?");
	public static final By ACCEPTCONTINUE =By.id("Accept & Continue");
	public static void SServiceAdvisorLogin()throws Exception {
		//enter email
		driver.findElement(EMAIL).sendKeys("serviceadvisor2@tekion.com");
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
     	try{
     		driver.findElement(ACCEPTCONTINUE).click();
			}catch(Exception e){
			System.out.println("ACCEPT AND CONTINUE not found");
			}
		}
	// Explicit wait method
		public static WebElement waitForExpectedElement(WebDriver driver, final By locator, int time) {
				WebDriverWait wait = new WebDriverWait(driver, time);
				return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			}

			// Explicit wait
		public static WebElement waitForExpectedElement(WebDriver driver, final By locator) {
			  WebDriverWait wait = new WebDriverWait(driver, 30);
				return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

			}
		// Explicit wait method for element clickable
		public static WebElement waitForExpectedElement(AppiumDriver driver, final By locator) {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			return wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		// Explicit wait method for presence of element
		public static WebElement waitForExpectedElement(AppiumDriver driver, final By locator, int time) {
			WebDriverWait wait = new WebDriverWait(driver, time);
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		
		public Boolean apply(AppiumDriver arg0) {
					// TODO Auto-generated method stub
					return null;
		}
		public Boolean apply(WebDriver arg0) {
					// TODO Auto-generated method stub
					return null;
		}
			
	
		public static void ajaxDroDownSelect(AppiumDriver driver, By locator, String name) {
			Select se = new Select((WebElement) locator);
			se.selectByVisibleText(name);
		}
		public static void ajaxdropDownSelect(AppiumDriver driver, By locator, int index) {
			Select se = new Select((WebElement) locator);
			se.selectByIndex(index);
		}
        
}


