package pageclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;

public class IosAdminDashBoardPage extends BaseClass {
	AppiumDriver driver;
	Logger logger = Logger.getLogger(IosAdminDashBoardPage.class);
	public static final By ADMIN_DASHBOARD_ADDBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]");
	public static final By ADMIN_DASHBOARD_TODOBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
	public static final By ADMIN_DASHBOARD_BOARDSBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By ADMIN_DASHBOARD_SETTINGSBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]");
	public static final By ADMIN_BOARDS_ALEXBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By ADMIN_ADD_NEWNOTE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By ADMIN_SETTINGS = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By ADMIN_TODO=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	// Constructor
	public IosAdminDashBoardPage(AppiumDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	// Click on Add Button
	public void clkAdmin_DashBoard_AddBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_DASHBOARD_ADDBTN);
		driver.findElement(ADMIN_DASHBOARD_ADDBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
   // Click on Add Button
	public void clkAdmin_DashBoard_TodoBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_DASHBOARD_TODOBTN);
		driver.findElement(ADMIN_DASHBOARD_TODOBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Add Button
	public void clkAdmin_DashBoard_BoardsBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_DASHBOARD_BOARDSBTN);
		driver.findElement(ADMIN_DASHBOARD_BOARDSBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		}
	// Click on Add Button
	public void clkAdmin_DashBoard_SettingsBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_DASHBOARD_SETTINGSBTN);
		driver.findElement(ADMIN_DASHBOARD_SETTINGSBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public Boolean verifyToDOScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_TODO);
		driver.findElement(ADMIN_TODO).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(ADMIN_TODO).isDisplayed();
	}
	public Boolean verifyADDScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_ADD_NEWNOTE);
		driver.findElement(ADMIN_ADD_NEWNOTE).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(ADMIN_ADD_NEWNOTE).isDisplayed();
	}
	public Boolean verifySettingsScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_SETTINGS);
		driver.findElement(ADMIN_SETTINGS).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(ADMIN_SETTINGS).isDisplayed();
	}
	public Boolean verifyBoardsScreen(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMIN_BOARDS_ALEXBTN);
		driver.findElement(ADMIN_BOARDS_ALEXBTN).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(ADMIN_BOARDS_ALEXBTN).isDisplayed();
	}
}
