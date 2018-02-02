package utilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class BaseClass {
	public static WebElement element;
	public static AppiumDriver driver;
	public static WebDriver webDriver;
    public static DesiredCapabilities capabilities;
	public static String versionString;
	// Set the Desired Capabilities for iOS Native App
	public static void iOSMobileNativeAppCapabilities(String ipaFilePath, String deviceUDID,Boolean	autoDismissAlertsStatus) throws Exception {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "DevRabbit’s iPhone");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("platformVersion", "10.2.1");
		capabilities.setCapability("udid",deviceUDID);
		capabilities.setCapability("app",ipaFilePath);
		capabilities.setCapability("bundleid","com.devrabbit.hoteltap");
		capabilities.setCapability("autoDismissAlerts", autoDismissAlertsStatus);
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	// Set the Desired Capabilities for Android Native App
	public static void androidMobileNativeAppCapabilities(int version) throws Exception{
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "android");
		capabilities.setCapability("platformName", "android");

        switch (version) {
        case 1:
            versionString = "4.4.2";
            break;
        case 2:
            versionString = "4.4.3";
            break;
        case 3:
            versionString = "4.4.4";
        case 4:
            versionString = "5.0";
            break;
        case 5:
            versionString = "5.0.1";
            break;
        case 6:
            versionString = "5.0.2";
        case 7:
            versionString = "5.1";
            break;
        case 8:
            versionString = "5.1.1";
            break;
        case 9:
            versionString = "6";
        case 10:
            versionString = "6.0.1";
            break;
        case 11:
            versionString = "7";
            break;
        case 12:
            versionString = "7.1";
            break;
        }
        capabilities.setCapability("platformVersion", versionString);
        capabilities.setCapability("autoAcceptAlerts", true);
        capabilities.setCapability("appPackage", "com.hoteltap");
        capabilities.setCapability("appActivity", "com.hoteltap.MainActivity");
        capabilities.setCapability("newCommandTimeout", "360");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);    
	}
	// Method for hide key board in android
	 public static void key(AppiumDriver driver) {
	        try {
	            driver.hideKeyboard();
	        } catch (Exception e) {
	            e.getMessage();
	        }
	    }
	

		/*
		 * public static void launchApplication() { driver = new FirefoxDriver();
		 * driver.get("xxxxxx"); waitForPageToLoad();
		 * driver.manage().window().maximize();
		 * 
		 * }
		 */
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
	public static void waitForPageToLoad() {
		(new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply1(AppiumDriver driver) {
				return (((org.openqa.selenium.JavascriptExecutor) driver).executeScript("return document.readyState")
						.equals("complete"));
			}
			public Boolean apply(AppiumDriver arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			public Boolean apply(WebDriver arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
	public static void ajaxDroDownSelect(AppiumDriver driver, By locator, String name) {
		Select se = new Select((WebElement) locator);
		se.selectByVisibleText(name);
	}
	public static void ajaxdropDownSelect(AppiumDriver driver, By locator, int index) {
		Select se = new Select((WebElement) locator);
		se.selectByIndex(index);
	}
	public static void hideKeyBoard(AppiumDriver driver)
	{
		try
		{
			driver.hideKeyboard();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
