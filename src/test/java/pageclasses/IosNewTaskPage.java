package pageclasses;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import utilities.BaseClass;

public class IosNewTaskPage extends BaseClass{
	AppiumDriver driver;
Logger logger = Logger.getLogger(IosNewTaskPage.class);
public static final By NEWTASK_CONVERTTASKBTN=By.xpath(" //XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]");
public static final By NEWTASK_ASSIGNTOBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]");
public static final By NEWTASK_SUBJECTTXTBOX=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
public static final By NEWTASK_UNDREMPLOYEESTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
public static final By NEWTASK_TASKDESCRIPTIONTXTBOX=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeOther[1]");
public static final By NEWTASK_DUEDATEBTN= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
public static final By NEWTASK_DATETABLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeDatePicker[1]/XCUIElementTypeOther[1]/XCUIElementTypePickerWheel[1]");
public static final By ALERTOKBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
public static final By MESSAGE_ALERT = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
public static final By NEWNOTE_TASKFROM= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");

	// Constructor
	public IosNewTaskPage(AppiumDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	// Click on Task From.
	public void clkTaskFromBtn(AppiumDriver driver, String direction) throws Exception {
		do {
			try {
				driver.findElement(NEWNOTE_TASKFROM).click();
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	}
	// Click on Alert ok button
	public void clkAlertOk(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ALERTOKBTN);
		driver.findElement(ALERTOKBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// getting Text message Alert
	public String alertMessage(AppiumDriver driver) {
		waitForExpectedElement(driver, MESSAGE_ALERT);
		return driver.findElement(MESSAGE_ALERT).getText();
		}
	// Click on Assign To Value
	public void clkAssignTo(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWTASK_ASSIGNTOBTN);
		driver.findElement(NEWTASK_ASSIGNTOBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// enable the toggle switch
	public void clkToggleSwtchUndrEmp(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWTASK_UNDREMPLOYEESTOGGLE);
		driver.findElement(NEWTASK_UNDREMPLOYEESTOGGLE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Enter the data in Subject Field
	public void fillSubjectTxtBox(AppiumDriver driver, String subjectBoxValue) throws Exception {
		try{
		waitForExpectedElement(driver, NEWTASK_SUBJECTTXTBOX);
		driver.findElement(NEWTASK_SUBJECTTXTBOX).click();
		((IOSDriver) driver).getKeyboard().pressKey(subjectBoxValue);
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Enter the data in Task Description field
	public void fillTaskDscrptonTxtBox(AppiumDriver driver, String taskDescription) throws Exception {
		try{
		waitForExpectedElement(driver, NEWTASK_TASKDESCRIPTIONTXTBOX);
		driver.findElement(NEWTASK_TASKDESCRIPTIONTXTBOX).click();
		((IOSDriver) driver).getKeyboard().pressKey(taskDescription);
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// Click on convert task
	public void clkConvertTask(AppiumDriver driver, String direction) throws Exception {
		do {
			try {
				driver.findElement(NEWTASK_CONVERTTASKBTN).click();
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	}
	// To Scroll
	public void scrollDownToTask(AppiumDriver driver) {
		try{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element",	((RemoteWebElement) driver.findElementByAccessibilityId("Task Description")).getId());
		js.executeScript("mobile: scroll", scrollObject);
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void scrollDownTODue(AppiumDriver driver) {
		try{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", ((RemoteWebElement) driver.findElementByAccessibilityId("Due")).getId());
		js.executeScript("mobile: scroll", scrollObject);
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void selectDate(AppiumDriver driver) throws Exception {
		try{
		WebElement _pickerWheel = driver.findElement(NEWTASK_DATETABLE);
		_pickerWheel.sendKeys("Fri 31 Mar");
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void selectDate(AppiumDriver driver, String direction) throws Exception {
		do {
			try {
				Point p1 = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAPicker[1]")).getLocation();
				Dimension d1 = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAPicker[1]/UIAPickerWheel[2]")).getSize();
				driver.tap(1, p1.getX() + d1.getWidth(), p1.getY() + d1.getHeight() - 100, 500);
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	}
}