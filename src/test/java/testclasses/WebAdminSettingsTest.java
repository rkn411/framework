package testclasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageclasses.WebAdminLoginPage;
import pageclasses.WebAdminPostaNotePage;
import pageclasses.WebAdminSettingsPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Singleton;
import utilities.Utilities;
public class WebAdminSettingsTest extends BaseClass{
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebAdminSettingsTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebAdminSettingsPage Adminsettings=new WebAdminSettingsPage(webDriver);
	WebAdminPostaNotePage Admpstnote=new WebAdminPostaNotePage(webDriver);
	WebAdminLoginPage adminlogin=new WebAdminLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities=new Utilities();
	// constructor
	WebAdminSettingsTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		configfile.loadPropertyFile();
	}
	@Parameters({"browser"})
	@BeforeClass
	public void launchApplication(String browserName) throws Exception {
		if (browserName.equalsIgnoreCase("firefox")) {
			webDriver = Singleton.getInstanceFirefox(configfile.getProperty("Geckodriverpath"));
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
		} else if (browserName.equalsIgnoreCase("chrome")) {
			webDriver = Singleton.getInstanceFirefox(utilities.chromedriverpath + "Chromedriver");
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
			webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);		
		}
	}
	@Test(priority = 1)
	public void verifyProfilePage() {
		test =utilities.reportsFile("Admin_Verify Profile Functionality in Settings");
		//test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : "+ configfile.getProperty("URL"));
		adminlogin.login(webDriver);
		Admpstnote.clkAlex(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		Adminsettings.clkProfileBtn(webDriver);
		logger.info("Clicked on Profile Button");
		test.log(LogStatus.INFO, "Clicked on Profile Button");
		Adminsettings.fillFirstnameFld(webDriver,configfile.getProperty("firstname"));
		logger.info("First Name Filled");
		test.log(LogStatus.INFO, "First Name field is filled with : "+ configfile.getProperty("firstname"));
		Adminsettings.fillLastnameFld(webDriver,configfile.getProperty("lastname"));
		test.log(LogStatus.INFO, "Last Name Field is filled with : "+ configfile.getProperty("lastname"));
		logger.info("Last Name field is Filled");
		String Emailid = Adminsettings.getEmailFld(webDriver);
		test.log(LogStatus.PASS, "Email id is : " + Emailid);
		Adminsettings.clkLanguagesBtn(webDriver);
		test.log(LogStatus.INFO, "Clicked on Language Dropdown");
		logger.info("Clicked on Language Dropdown");
		Adminsettings.selectlanguage(webDriver);
		test.log(LogStatus.INFO, "Selected English Language from the dropdown");
		logger.info("Selected English Language from the dropdown");
		String screenshot = utilities.captureScreenshot(webDriver, "AdminProfile Page");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		Adminsettings.clkUpdateProfileBtn(webDriver);
		test.log(LogStatus.INFO, "Clicked on update profile button");
		logger.info("Clicked on update profile button");
		boolean adminsettings = Adminsettings.profileVerification(webDriver);
		if (adminsettings==true) {
            test.log(LogStatus.PASS, "Profile page Verified");
            String profilePage=utilities.captureScreenshot(webDriver, "profilePage");
            test.log(LogStatus.INFO, "Screen Shot is taken "+profilePage);
            test.log(LogStatus.PASS, "Testcase is Passed");
        } else {
            test.log(LogStatus.FAIL, "Profile page Verification Failed");
        }
		utilities.endReport();
	}
	@Test(priority = 2)
	public void verifyAccountsPage() {
		test = utilities.reportsFile("Admin_Verify Accounts Functionality in Settings");
		//test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : "+ configfile.getProperty("URL"));
		Adminsettings.clkProfileBtn(webDriver);
		logger.info("Clicked on Profile Button");
		test.log(LogStatus.INFO, "Clicked on Profile Button");
		Adminsettings.clkAccountstab(webDriver);
		logger.info("Clicked on Accounts Tab");
		test.log(LogStatus.INFO, "Clicked on Accounts Tab");
		Adminsettings.fillOldPasswordField(webDriver, configfile.getProperty("oldPassword"));
		test.log(LogStatus.INFO, "Old Password Field is filled with: "+ configfile.getProperty("oldPassword"));
		logger.info("Old Password Field Filled");
		Adminsettings.fillNewPasswordField(webDriver, configfile.getProperty("newPassword"));
		test.log(LogStatus.INFO, "New Password Field is filled with: "+ configfile.getProperty("newPassword"));
		logger.info("New Password Field Filled");
		Adminsettings.fillConfirmPasswordField(webDriver, configfile.getProperty("confirmPassword"));
		test.log(LogStatus.INFO, "Confirm Password Field is filled with: "+ configfile.getProperty("confirmPassword"));
		logger.info("Confirm password Field Filled");
		Adminsettings.clkUpdateProfileBtn(webDriver);
		logger.info("Clicked on Update Profile Button");
		alertMessage=Adminsettings.getAlertMsg(webDriver);
		String screenshot = utilities.captureScreenshot(webDriver, "Admin Accounts page");
		test.log(LogStatus.INFO, "Alert pop up displayed a message as : " + alertMessage);
		 boolean adminsettings = Adminsettings.adminVerification(webDriver);
		if (adminsettings==true) {
            test.log(LogStatus.PASS, "Accounts Page Verified");
            String Accountspage=utilities.captureScreenshot(webDriver, "Accounts page");
            test.log(LogStatus.INFO, "Screen Shot is taken "+Accountspage);
            test.log(LogStatus.PASS, "Testcase is Passed");
        } else {
            test.log(LogStatus.FAIL, "Accounts Page Verification Failed");
        }
		utilities.endReport();
	}
	@Test(priority = 3)
	public void verifyNotificationToggle() {
		test = utilities.reportsFile("Admin_Verify Notifications Toggle Functionality");
		//test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : "+ configfile.getProperty("URL"));
		Adminsettings.clkProfileBtn(webDriver);
		logger.info("Clicked on Profile Button");
		test.log(LogStatus.INFO, "Clicked on Profile Button");
		Adminsettings.clkNotificationsBtn(webDriver);
		logger.info("Clicked on Notifications Tab");
		test.log(LogStatus.INFO, "Clicked on Notifications Tab");
		Adminsettings.clkNotificationsToggle(webDriver);
		test.log(LogStatus.INFO, "Clicked on Notifications Toggle");
		Adminsettings.clkUpdateProfileBtn(webDriver);
		test.log(LogStatus.INFO, "Clicked on Update Profile Button");
		logger.info("Clicked on Update Profile Button");
		String screenshot = utilities.captureScreenshot(webDriver, "Admin Notifications page");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		Adminsettings.clkCloseSym(webDriver);
		test.log(LogStatus.INFO, "Clicked on Close Symbol");
		logger.info("Clicked on Close Symbol");
		boolean adminsettings = Adminsettings.adminPageVerification(webDriver);
		if (adminsettings==true) {
            test.log(LogStatus.PASS, "Notifications Page Verified");
            String NotificationPage=utilities.captureScreenshot(webDriver, "NotificationPage");
            test.log(LogStatus.INFO, "Screen Shot is taken "+NotificationPage);
            test.log(LogStatus.PASS, "Testcase is Passed");
        } else {
            test.log(LogStatus.FAIL, "Notifications Page Verification Failed");
        }
		utilities.endReport();
	}
	@Test(priority = 4)
	public void verifyChangehotelFunctionality() {
		test = utilities.reportsFile("Admin_Verify Change hotel Functionality");
		//test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : "+ configfile.getProperty("URL"));
		Adminsettings.clkChangeHotelBtn(webDriver);
		logger.info("Clicked on Change Hotel button");
		test.log(LogStatus.INFO, "Clicked on Change Hotel button");
		Adminsettings.clkHotelBtn(webDriver);
	    logger.info(" Clicked on Mark Hotel");
	    test.log(LogStatus.INFO, "Clicked on Mark Hotel");
	     String hotel=Adminsettings.gethotelname(webDriver);
		test.log(LogStatus.PASS, "Hotel Name is : " + hotel );
		String screenshot=utilities.captureScreenshot(webDriver, "HomePage");
		test.log(LogStatus.INFO, "Screen Shot is taken "+screenshot);
        test.log(LogStatus.PASS, "Testcase is Passed");
	 	utilities.endReport();
	}
	@Test(priority = 5)
	public void verifySignoutBtnFunctionality(){
		test = utilities.reportsFile("Admin_Verify Signout Button Functionality");
		//test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : "+ configfile.getProperty("URL"));
		Adminsettings.clkSignoutBtn(webDriver);
		logger.info("Signout Button Clicked");
		test.log(LogStatus.INFO, "Signout Button Clicked");
		boolean strverify=Adminsettings.verifyLoginPage(webDriver);
		if (strverify==true) {
            test.log(LogStatus.PASS, "Application is Navigated to Login Page");
            String forgotmypassword=utilities.captureScreenshot(webDriver, "forgotmypassword");
            test.log(LogStatus.INFO, "Screen Shot is taken "+forgotmypassword);
            test.log(LogStatus.PASS, "Testcase is Passed");
        } else {
            test.log(LogStatus.FAIL, "Application is not Navigated to Login Page");
        }
		utilities.endReport();
	}
	@AfterMethod
	public void result(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test failed");
		}
		utilities.endReport();
	}
	@AfterClass
	public void tearDown() {
		webDriver.quit();
		utilities.endReport();
	}
}
