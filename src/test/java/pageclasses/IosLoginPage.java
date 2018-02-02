package pageclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import utilities.BaseClass;

public class IosLoginPage extends BaseClass{
	AppiumDriver driver;
	Logger logger = Logger.getLogger(IosLoginPage.class);
	public static final By EMPLOYEEBTN= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By ADMINBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	public static final By EMPHOTELIDFLD=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
	public static final By EMPUSERNAMEFLD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]");
	public static final By EMPPASSWORDFLD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField[1]");
	public static final By ADMIN_SIGNINBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By EMP_SIGNINBTN= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By ADMNEMAILFLD= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
	public static final By ADMNPASSWORDFLD=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
	public static final By ADMNFORGETPASSWORDLNK=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]");
	public static final By ADMNFORGOTPASSWORDCACELBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By ADMNFORGOTPASSWORDVERIFCATION=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By ADMNFORGOTPASSWORDBLNK=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]");
	public static final By ADMIN_ALERTOKBTN= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	public static final By MESSAGE_ALERT=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	public static final By DONTALLOWBTN= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	public static final By KEYBOARDRETURNBTN= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeKeyboard[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[4]");
	public static final By EMPLOYEE_ALERTOKBTN= By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	public static final By ADMIN_VERIFY_LOGIN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public IosLoginPage(AppiumDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	// Click on the Employee Button
	public void clkEmployeeBtn(AppiumDriver driver) throws Exception {
		try{
			waitForExpectedElement(driver, EMPLOYEEBTN);
			driver.findElement(EMPLOYEEBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkForgotPasswordLnk(AppiumDriver driver) throws Exception {
		try{
			waitForExpectedElement(driver, ADMNFORGETPASSWORDLNK);
			driver.findElement(ADMNFORGETPASSWORDLNK).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public String verifyTextPresence(AppiumDriver driver) throws Exception {
		String strVerification=null;
		try{
			waitForExpectedElement(driver, ADMNFORGOTPASSWORDVERIFCATION);
			strVerification=driver.findElement(ADMNFORGOTPASSWORDVERIFCATION).getText();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return strVerification;
	}
	public void clkForgotPasswordCancelBtn(AppiumDriver driver) throws Exception {
		try{
			waitForExpectedElement(driver, ADMNFORGOTPASSWORDCACELBTN);
			driver.findElement(ADMNFORGOTPASSWORDCACELBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on the Admin Button
	public void clkAdminBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADMINBTN);
		driver.findElement(ADMINBTN).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	// Method for Emp Hotel Id filed filling with String Data
	public void empHotelIDFill(String input, AppiumDriver driver) {
		try{
		if (input != null) {
			waitForExpectedElement(driver, EMPHOTELIDFLD);
			driver.findElement(EMPHOTELIDFLD).clear();
			driver.findElement(EMPHOTELIDFLD).sendKeys(input);
		} else {
			waitForExpectedElement(driver, EMPHOTELIDFLD);
			driver.findElement(EMPHOTELIDFLD).clear();
			driver.findElement(EMPHOTELIDFLD).sendKeys(input);
		}
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	// Method for Emp User Name Field filling with String Data
	public void fillEmpUserNmaeFld(String input, AppiumDriver driver) {
		try{
		if (input != null) {
			waitForExpectedElement(driver, EMPUSERNAMEFLD);
			driver.findElement(EMPUSERNAMEFLD).clear();
			driver.findElement(EMPUSERNAMEFLD).sendKeys(input);
			} else {
			waitForExpectedElement(driver, EMPUSERNAMEFLD);
			driver.findElement(EMPUSERNAMEFLD).clear();
			driver.findElement(EMPUSERNAMEFLD).sendKeys(input);
			}
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Method for Emp Password Field filling with String Data
	public void fillEmpPasswordFld(String input, AppiumDriver driver) {
		try{
		if (input != null) {
			waitForExpectedElement(driver, EMPPASSWORDFLD);
			driver.findElement(EMPPASSWORDFLD).clear();
			driver.findElement(EMPPASSWORDFLD).sendKeys(input);
			driver.hideKeyboard();
		} else {
			waitForExpectedElement(driver, EMPPASSWORDFLD);
			driver.findElement(EMPPASSWORDFLD).clear();
			driver.findElement(EMPPASSWORDFLD).sendKeys(input);
			driver.hideKeyboard();
		}
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Method for Admin Email Id filed filling with String Data
	public void fillAdminEmailFld(String input, AppiumDriver driver) {
		try{
		if (input != null) {
			waitForExpectedElement(driver, ADMNEMAILFLD);
			driver.findElement(ADMNEMAILFLD).clear();
			driver.findElement(ADMNEMAILFLD).sendKeys(input);
		} else {
			waitForExpectedElement(driver, ADMNEMAILFLD);
			driver.findElement(ADMNEMAILFLD).clear();
			driver.findElement(ADMNEMAILFLD).sendKeys(input);
		}
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Method for Admin Password filed filling with String Data
	public void fillAdminPasswordFld(String input, AppiumDriver driver) {
		try{
		if (input != null) {
			waitForExpectedElement(driver, ADMNPASSWORDFLD);
			driver.findElement(ADMNPASSWORDFLD).clear();
			driver.findElement(ADMNPASSWORDFLD).sendKeys(input);
			driver.hideKeyboard();
		} else {
			waitForExpectedElement(driver, ADMNPASSWORDFLD);
			driver.findElement(ADMNPASSWORDFLD).clear();
			driver.findElement(ADMNPASSWORDFLD).sendKeys(input);
			driver.hideKeyboard();
		}
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Method for Click on SignIn Button
	public void admnSignInBtn(AppiumDriver driver) {
		try{
		waitForExpectedElement(driver, ADMIN_SIGNINBTN);
		driver.findElement(ADMIN_SIGNINBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// need to change locator
	public Boolean admnLoginVerify(AppiumDriver driver) {
		try{
		waitForExpectedElement(driver, ADMIN_VERIFY_LOGIN);
		driver.findElement(ADMIN_VERIFY_LOGIN).isDisplayed();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		return driver.findElement(ADMIN_VERIFY_LOGIN).isDisplayed();
	}
	// Method to sign button
	public void empSignInBtn(AppiumDriver driver) {
		try{
		waitForExpectedElement(driver, EMP_SIGNINBTN);
		driver.findElement(EMP_SIGNINBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// Method to ok button in alert popup in Admin Login
	public void adminAlertOkBtn(AppiumDriver driver) {
		try{
		waitForExpectedElement(driver, ADMIN_ALERTOKBTN);
		driver.findElement(ADMIN_ALERTOKBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Method to ok button in alert popup in Employee Login
		public void employeeAlertOkBtn(AppiumDriver driver) {
			try{
			waitForExpectedElement(driver, EMPLOYEE_ALERTOKBTN);
			driver.findElement(EMPLOYEE_ALERTOKBTN).click();
			}catch(Exception e){
				logger.info("unable to locate the elemnet");
			}
		}
// getting message from alert pop up
	public String alertMessage(AppiumDriver driver) {
		waitForExpectedElement(driver, MESSAGE_ALERT);
		return driver.findElement(MESSAGE_ALERT).getText();
	}
// Click on don't allow button
	public void alertDontAllowBtn(AppiumDriver driver) {
	  try{
		waitForExpectedElement(driver, DONTALLOWBTN);
		driver.findElement(DONTALLOWBTN).click();
	  }catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
  // Click on return button on keyboard
	public void clkKeyBoardReturnbtn(AppiumDriver driver) {
		try{
		waitForExpectedElement(driver, KEYBOARDRETURNBTN);
		driver.findElement(KEYBOARDRETURNBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
}