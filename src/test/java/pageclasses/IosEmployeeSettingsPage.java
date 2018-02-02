package pageclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;

public class IosEmployeeSettingsPage extends BaseClass {
	AppiumDriver driver;
	Logger logger = Logger.getLogger(IosEmployeeSettingsPage.class);
	public static final By SETTINGICONBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]");
	public static final By SETTINGS_PROFILEBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By SETTINGS_ACCOUNTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	public static final By SETTINGS_NOTIFICATIONSTOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]");
	public static final By SETTINGS_CHANGEHOTELBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]");
	public static final By SETTINGS_CHANGEHOTEL_ALEXHOTEL = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By SETTINGS_LOGOUTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By SETTINGS_PROFILE_FULLNAMEFLD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
	public static final By SETTINGS_PROFILE_LASTNAMEFLD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]");
	public static final By SETTINGS_PROFILE_EMAILFLD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]");
	public static final By SETTINGS_PROFILE_LANGUGELIST = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]");
	public static final By SETTINGS_PROFILE_LANGUAGEENGLISH = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By SETTINGS_ACCOUNT_OLDPASSWORD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]");
	public static final By SETTINGS_ACCOUNT_NEWPASSWORD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]");
	public static final By SETTINGS_ACCOUNT_CONFIRMPASSWORD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField[1]");

	public IosEmployeeSettingsPage(AppiumDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	// Click on the Setting Icon
	public void clkSettingsBtn(AppiumDriver driver) throws Exception {
		try {
			waitForExpectedElement(driver, SETTINGICONBTN);
			driver.findElement(SETTINGICONBTN).click();
		} catch (Exception e) {
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on the Profile Button
	public void clkProfileBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, SETTINGS_PROFILEBTN);
		driver.findElement(SETTINGS_PROFILEBTN).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
// Method to fill the full name field in profile page 
	public void fillFullNameFld(AppiumDriver driver, String input) throws Exception {
        try{
		if (input != null) {
			waitForExpectedElement(driver, SETTINGS_PROFILE_FULLNAMEFLD);
			driver.findElement(SETTINGS_PROFILE_FULLNAMEFLD).clear();
			driver.findElement(SETTINGS_PROFILE_FULLNAMEFLD).sendKeys(input);
			// driver.hideKeyboard();
		} else {
			waitForExpectedElement(driver, SETTINGS_PROFILE_FULLNAMEFLD);
			driver.findElement(SETTINGS_PROFILE_FULLNAMEFLD).clear();
			driver.findElement(SETTINGS_PROFILE_FULLNAMEFLD).sendKeys(input);
			// driver.hideKeyboard();
		}
        }catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
    // Getting the text from Email field in profile page
	public String gettingTxtFromEmailFld(AppiumDriver driver) throws Exception {
	
		waitForExpectedElement(driver, SETTINGS_PROFILE_EMAILFLD);
		String EmailFieldValue = driver.findElement(SETTINGS_PROFILE_EMAILFLD).getText();
		return EmailFieldValue;
	}
// Method to fill the last name field in profile page
	public void fillLastNameFld(AppiumDriver driver, String input) throws Exception {
        try{
		if (input != null) {
			waitForExpectedElement(driver, SETTINGS_PROFILE_LASTNAMEFLD);
			driver.findElement(SETTINGS_PROFILE_LASTNAMEFLD).clear();
			driver.findElement(SETTINGS_PROFILE_LASTNAMEFLD).sendKeys(input);
			// driver.hideKeyboard();
		} else {
			waitForExpectedElement(driver, SETTINGS_PROFILE_LASTNAMEFLD);
			driver.findElement(SETTINGS_PROFILE_LASTNAMEFLD).clear();
			driver.findElement(SETTINGS_PROFILE_LASTNAMEFLD).sendKeys(input);
			// driver.hideKeyboard();
		}
        }catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on the Account Button
	public void clkAccountBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, SETTINGS_ACCOUNTBTN);
		driver.findElement(SETTINGS_ACCOUNTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on the Notifications Toggle
	public void clkNotificationsToggleBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, SETTINGS_NOTIFICATIONSTOGGLE);
		driver.findElement(SETTINGS_NOTIFICATIONSTOGGLE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on the Change Hotel
	public void clkChangeHotelBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, SETTINGS_CHANGEHOTELBTN);
		driver.findElement(SETTINGS_CHANGEHOTELBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// Click on Hotel in change Hotel page
	public void clkChangeHotel_AlexHotelBtn(AppiumDriver driver) throws Exception {
		try{
	    waitForExpectedElement(driver, SETTINGS_CHANGEHOTEL_ALEXHOTEL);
		driver.findElement(SETTINGS_CHANGEHOTEL_ALEXHOTEL).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
// Click on log out button
	public void clkLogOut(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, SETTINGS_LOGOUTBTN);
		driver.findElement(SETTINGS_LOGOUTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// Click on language button
	public void clkLaunge(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, SETTINGS_PROFILE_LANGUGELIST);
		driver.findElement(SETTINGS_PROFILE_LANGUGELIST).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// Click on English language
	public void selectEngLaunge(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, SETTINGS_PROFILE_LANGUAGEENGLISH);
		driver.findElement(SETTINGS_PROFILE_LANGUAGEENGLISH).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// method to fill old password field 
	public void fillOldPasswordFld(AppiumDriver driver, String input) throws Exception {
   try{
		if (input != null) {
			waitForExpectedElement(driver, SETTINGS_ACCOUNT_OLDPASSWORD);
			driver.findElement(SETTINGS_ACCOUNT_OLDPASSWORD).clear();
			driver.findElement(SETTINGS_ACCOUNT_OLDPASSWORD).sendKeys(input);
			// driver.hideKeyboard();

		} else {
			waitForExpectedElement(driver, SETTINGS_ACCOUNT_OLDPASSWORD);
			driver.findElement(SETTINGS_ACCOUNT_OLDPASSWORD).clear();
			driver.findElement(SETTINGS_ACCOUNT_OLDPASSWORD).sendKeys(input);
			// driver.hideKeyboard();
		}
   }catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
// method to fill new password filed 
	public void fillNewPasswordFld(AppiumDriver driver, String input) throws Exception {
       try{
		if (input != null) {
			waitForExpectedElement(driver, SETTINGS_ACCOUNT_NEWPASSWORD);
			driver.findElement(SETTINGS_ACCOUNT_NEWPASSWORD).clear();
			driver.findElement(SETTINGS_ACCOUNT_NEWPASSWORD).sendKeys(input);
			// driver.hideKeyboard();

		} else {
			waitForExpectedElement(driver, SETTINGS_ACCOUNT_NEWPASSWORD);
			driver.findElement(SETTINGS_ACCOUNT_NEWPASSWORD).clear();
			driver.findElement(SETTINGS_ACCOUNT_NEWPASSWORD).sendKeys(input);
			// driver.hideKeyboard();
		}
       }catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
  // fill confirm password field 
	public void fillConfirmPasswordFld(AppiumDriver driver, String input) throws Exception {
    try{
		if (input != null) {
			waitForExpectedElement(driver, SETTINGS_ACCOUNT_CONFIRMPASSWORD);
			driver.findElement(SETTINGS_ACCOUNT_CONFIRMPASSWORD).clear();
			driver.findElement(SETTINGS_ACCOUNT_CONFIRMPASSWORD).sendKeys(input);
			// driver.hideKeyboard();
		} else {
			waitForExpectedElement(driver, SETTINGS_ACCOUNT_CONFIRMPASSWORD);
			driver.findElement(SETTINGS_ACCOUNT_CONFIRMPASSWORD).clear();
			driver.findElement(SETTINGS_ACCOUNT_CONFIRMPASSWORD).sendKeys(input);
			// driver.hideKeyboard();
		}
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
}
