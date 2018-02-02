package pageclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;

public class IosEmployeeDashBoardPage extends BaseClass{
	AppiumDriver driver;
	Logger logger = Logger.getLogger(IosEmployeeDashBoardPage.class);
	public static final By EMPLOYEE_DASHBOARD_ADDBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]");
	public static final By EMPLOYEE_DASHBOARD_TODOBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
	public static final By EMPLOYEE_DASHBOARD_BOARDSBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By EMPLOYEE_DASHBOARD_SETTINGSBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]");
	public static final By EMPLOYEE_BOARDS_VERIFYBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By EMPLOYEE_ADD_NEWNOTE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By EMPLOYEE_SETTINGS = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By EMPLOYEE_TODO=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	// Constructor
	public IosEmployeeDashBoardPage(AppiumDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	// Click on Add Button
	public void clkEmployee_DashBoard_AddBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPLOYEE_DASHBOARD_ADDBTN);
		driver.findElement(EMPLOYEE_DASHBOARD_ADDBTN).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	// Click on Add Button
	public void clkEmployee_DashBoard_TodoBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPLOYEE_DASHBOARD_TODOBTN);
		driver.findElement(EMPLOYEE_DASHBOARD_TODOBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Add Button
	public void clkEmployee_DashBoard_BoardsBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPLOYEE_DASHBOARD_BOARDSBTN);
		driver.findElement(EMPLOYEE_DASHBOARD_BOARDSBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Add Button
	public void clkEmployee_DashBoard_SettingsBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPLOYEE_DASHBOARD_SETTINGSBTN);
		driver.findElement(EMPLOYEE_DASHBOARD_SETTINGSBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public Boolean verifyToDOScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver,EMPLOYEE_TODO );
		driver.findElement(EMPLOYEE_TODO).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(EMPLOYEE_TODO).isDisplayed();
	}
	public Boolean verifyADDScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPLOYEE_ADD_NEWNOTE);
		driver.findElement(EMPLOYEE_ADD_NEWNOTE).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(EMPLOYEE_ADD_NEWNOTE).isDisplayed();
	}
	public Boolean verifySettingsScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPLOYEE_SETTINGS);
		driver.findElement(EMPLOYEE_SETTINGS).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(EMPLOYEE_SETTINGS).isDisplayed();
	}
	public Boolean verifyBoardsScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPLOYEE_BOARDS_VERIFYBTN);
		driver.findElement(EMPLOYEE_BOARDS_VERIFYBTN).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(EMPLOYEE_BOARDS_VERIFYBTN).isDisplayed();
	}
}
