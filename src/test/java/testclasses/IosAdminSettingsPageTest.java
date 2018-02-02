
package testclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageclasses.IosAdminSettingsPage;
import pageclasses.IosNewNotePage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosAdminSettingsPageTest extends BaseClass {
	ExtentTest test;
	ITestResult result;
	Logger logger = Logger.getLogger(IosAdminSettingsPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosAdminEmployeeLogin login = new IosAdminEmployeeLogin();
	IosAdminSettingsPage settings = new IosAdminSettingsPage(driver);
	IosNewNotePage newNote = new IosNewNotePage(driver);
	Utilities utilities = new Utilities();
    public String screenShotName;
 	public IosAdminSettingsPageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
 	//@Parameters("mobilePlatform")
	@BeforeClass
	public void setUp() throws Exception {//String mobilePlatform
 		//if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		String ipaPath = utilities.ipaPath();
		Boolean alertStatus = false;
		iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
		logger.info("App is launched ");
		test = utilities.reportsFile("Verify Admin Settings Screen Functionality");
		login.adminLogin();
 		//}else{
 			
 		//}
	}
 	//@Parameters("mobliePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void adminSeetings_ProfileScreen() throws Exception {//String mobilePlatform
 	//	if(mobilePlatform.equalsIgnoreCase("iOS")){
 		cfru.loadPropertyFile();
		logger.info("Okay");
		test.log(LogStatus.INFO, "Verify Profile Functionality in Settings Page");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked settings button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		settings.clkProfileBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on profile button");
		settings.fillFullNameFld(driver, "Alex");
		logger.info("Okay");
		logger.info("Enter the FullName");
		test.log(LogStatus.INFO, "FullName field is filled : Alex");
		settings.fillLastNameFld(driver, "");
		logger.info("Okay");
		logger.info("Enter the LastName");
		test.log(LogStatus.INFO, "LastName field is filled : " + "");
		String EmailFieldValue = settings.gettingTxtFromEmailFld(driver);
		System.out.println(EmailFieldValue);
		logger.info("Okay");
		test.log(LogStatus.INFO, " Email is Displaying as : " + EmailFieldValue);
		logger.info("Email presented is: " + EmailFieldValue);
		settings.clkLaunge(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on language");
		settings.selectEngLaunge(driver);
		logger.info("Okay");
		logger.info("Select English language");
		newNote.clkSaveBtn(driver);
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on save button");
		test.log(LogStatus.PASS, "Test Case is Passed");
		utilities.endReport();
		// newNote.clkSaveBtn(driver);
		// logger.info("Okay");
 	//	}else{
 			
 		//}
	}
 	//@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void adminSeetings_AccountsScreen() throws Exception {//String mobilePlatform
 	//	if(mobilePlatform.equalsIgnoreCase("iOS")){
		test.log(LogStatus.INFO, "Verify Accounts Functionality in Settings Page");
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on settings button");
		settings.clkAccountBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on account button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		settings.fillOldPasswordFld(driver, cfru.getProperty("AdminPassword"));
		logger.info("Okay");
		test.log(LogStatus.INFO, "Old password field is filled");
		settings.fillNewPasswordFld(driver, cfru.getProperty("AdminPassword"));
		logger.info("Okay");
		test.log(LogStatus.INFO, "New password field is filled");
		settings.fillConfirmPasswordFld(driver, cfru.getProperty("AdminPassword"));
		logger.info("Okay");
		test.log(LogStatus.INFO, "Confirm password field is filled");
		newNote.clkCancelBtn(driver);
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.INFO, "Clicked on Save button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, " Test Case is Passed");
		utilities.endReport();
 		//}else{
 			
 		//}
	}
 	//@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void adminSeetings_NotificationsScreen() throws Exception {//String mobilePlatform
 //		if(mobilePlatform.equalsIgnoreCase("iOS")){
 		test.log(LogStatus.INFO, "Verify Notifications Functionality in Settings Page");
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on settings button");
		settings.clkNotificationsToggleBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on Notifications Toggle");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		logger.info("Okay");
		utilities.endReport();
 		//}else{
 			
 		//}
	}
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void adminSeetings_ChangeHotelScreen() throws Exception {//String mobilePlatform
		//if(mobilePlatform.equalsIgnoreCase("iOS")){
		test.log(LogStatus.INFO, "Verify ChangeHotel Functionality in Settings Page");
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on settings button");
		settings.clkChangeHotelBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on Change Hotel button");
		settings.clkChangeHotel_AlexHotelBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on Alex Hotel button");
		newNote.clkSaveBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on save button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		settings.clkLogOut(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on logout button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
    	test.log(LogStatus.PASS, "Test Case is Passed");
    	utilities.endReport();
		//}else{
			
		//}
	}
	@AfterClass
	public void tearDown() {
		
		driver.closeApp();
	}
}
