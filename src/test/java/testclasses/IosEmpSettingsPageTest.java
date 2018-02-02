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

import pageclasses.IosEmployeeSettingsPage;
import pageclasses.IosNewNotePage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosEmpSettingsPageTest extends BaseClass {
	ExtentTest test;
	ITestResult result;
	Logger logger = Logger.getLogger(IosEmpSettingsPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosAdminEmployeeLogin login = new IosAdminEmployeeLogin();
	IosEmployeeSettingsPage settings = new IosEmployeeSettingsPage(driver);
	IosNewNotePage newNote = new IosNewNotePage(driver);
	Utilities utilities = new Utilities();
    public String screenShotName;
	public IosEmpSettingsPageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
	@Parameters("mobilePlatform")
	@BeforeClass
	public void setUp(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		String ipaPath = utilities.ipaPath();
		cfru.loadPropertyFile();
		Boolean alertStatus = false;
		iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
		logger.info("App is launched");
		login.employeeLogin();
		test = utilities.reportsFile("Verify Employee Settings Screen Functionality");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void empSettings_ProfileScreen(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.INFO, "Clicked on settings button");
		settings.clkProfileBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on profile button");
		settings.fillFullNameFld(driver, "emp1");
		logger.info("Enter the FullName");
		test.log(LogStatus.INFO, " FullName field is filled");
		settings.fillLastNameFld(driver, "emp1");
		logger.info("Entered the LastName");
		settings.clkLaunge(driver);
		test.log(LogStatus.INFO, "Clicked language list");
		settings.selectEngLaunge(driver);
		logger.info("Selected English language");
		newNote.clkCancelBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Cancel button");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Saved Changes in Profile Page");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void empSettings_AccountScreen(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on settings button");
		settings.clkAccountBtn(driver);
		test.log(LogStatus.INFO, "Clicked account button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		settings.fillOldPasswordFld(driver, cfru.getProperty("EmpPassWord"));
		test.log(LogStatus.INFO, " Old password field filled");
		settings.fillNewPasswordFld(driver, cfru.getProperty("EmpPassWord"));
		test.log(LogStatus.INFO, " New password field filled");
		settings.fillConfirmPasswordFld(driver, cfru.getProperty("EmpPassWord"));
		test.log(LogStatus.INFO, " Confirm password field filled");
		newNote.clkCancelBtn(driver);
		test.log(LogStatus.INFO, "Clicked cancel button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void empSettings_NotificationsScreen(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){cfru.loadPropertyFile();
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on settings button");
		settings.clkNotificationsToggleBtn(driver);
		test.log(LogStatus.INFO, "Clicked Notifications Toggle");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void empSettings_ChangeHotelScreen(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		settings.clkSettingsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on settings button");
		settings.clkChangeHotelBtn(driver);
		test.log(LogStatus.INFO, "Clicked Change Hotel button");
		settings.clkChangeHotel_AlexHotelBtn(driver);
		test.log(LogStatus.INFO, "Clicked Hotel button");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked save button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		settings.clkLogOut(driver);
		test.log(LogStatus.INFO, "Clicked logout button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		utilities.endReport();
		}else{
			
		}
	}
	@AfterClass
	public void tearDown() {
		
		driver.closeApp();
	}
}
