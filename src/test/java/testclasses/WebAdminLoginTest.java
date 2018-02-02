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
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Singleton;
import utilities.Utilities;

public class WebAdminLoginTest extends BaseClass {
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebAdminLoginTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebAdminLoginPage AdminLogin = new WebAdminLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	public String screenshot;
	Boolean AdminUsername;
	// constructor
	WebAdminLoginTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		configfile.loadPropertyFile();
	}
	@Parameters({ "browser" })
	@BeforeClass
	public void launchApplication(String browserName) throws Exception {
		if (browserName.equalsIgnoreCase("firefox")) {
			webDriver = Singleton.getInstanceFirefox(configfile.getProperty("Geckodriverpath"));
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
		} else if (browserName.equalsIgnoreCase("chrome")) {
			webDriver = Singleton.getInstanceChrome(utilities.chromedriverpath + "Chromedriver");
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
			webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}
	}
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void blankEmailAndPassword() {
		test = utilities.reportsFile("Admin_Verify Login Screen Functionality with Blank Data");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminLogin.clkIAmAdminLnk(webDriver);
		test.log(LogStatus.INFO, "Clicked on I Am Admin Link");
		logger.info(" Clicked on I Am Admin Link");
		AdminLogin.fillEmailidFld(webDriver, " ");
		test.log(LogStatus.INFO, "Email field is filled with Blank Data ");
		logger.info("Email field is filled with Blank Data ");
		AdminLogin.fillPasswordFld(webDriver, " ");
		test.log(LogStatus.INFO, "Password Field is Filled with Blank Data ");
		logger.info("Password Field is Filled with Blank Data");
		AdminLogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		AdminLogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = AdminLogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = AdminLogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void invalidEmailAndPassword() {
		test = utilities.reportsFile("Admin_Verify Login Screen Functionality with Invalid Email and Password");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminLogin.fillEmailidFld(webDriver, configfile.getProperty("invalidemail"));
		test.log(LogStatus.INFO,"Email Field  is Filled with Invalid Email : " + configfile.getProperty("invalidemail"));
		logger.info("Email Field is Filled with Invalid Email");
		AdminLogin.fillPasswordFld(webDriver, configfile.getProperty("invalidpassword"));
		test.log(LogStatus.INFO,"Password Field  is Filled with Invalid Password : " + configfile.getProperty("invalidpassword"));
		logger.info("Password Field is Filled with Invalid Password");
		AdminLogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		AdminLogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = AdminLogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = AdminLogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg2 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg2);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed");
		}
		utilities.endReport();
	}
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void validEmailAndInValidPassword() {
		test = utilities.reportsFile("Admin_Verify Login Screen Functionality with valid Email and  InValid Password");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminLogin.fillEmailidFld(webDriver, configfile.getProperty("validemail"));
		test.log(LogStatus.INFO, "Email Field  is Filled with valid Email : " + configfile.getProperty("validemail"));
		logger.info("Email Field is Filled with Valid Email");
		AdminLogin.fillPasswordFld(webDriver, configfile.getProperty("invalidpassword"));
		test.log(LogStatus.INFO,"Password Field  is Filled with Invalid Password : " + configfile.getProperty("invalidpassword"));
		logger.info("Password Field is Filled with Invalid Password");
		AdminLogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		AdminLogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = AdminLogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = AdminLogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg3 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg3);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed");
		}
		utilities.endReport();
	}
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void blankEmailAndValidPassword() {
		test = utilities.reportsFile("Admin_Verify Login Screen Functionality with Blank Email and  Valid Password");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminLogin.fillEmailidFld(webDriver, " ");
		test.log(LogStatus.INFO, "Email field is filled with Blank Data ");
		logger.info("Email Field Field is With Blank Data");
		AdminLogin.fillPasswordFld(webDriver, configfile.getProperty("validpassword"));
		test.log(LogStatus.INFO,
				"Password Field  is Filled with valid Password : " + configfile.getProperty("validpassword"));
		logger.info(" Password Field is Filled with valid Password");
		AdminLogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		AdminLogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		alertMessage = AdminLogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = AdminLogin.verify(webDriver);
		if (strtext == true) {
			// test.log(LogStatus.PASS, "Alert Message Displayed");
			String AlertMsg4 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg4);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void validEmailAndBlankPassword() {
		test = utilities.reportsFile("Admin_Verify Login Screen Functionality with valid Email and Blank Password");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminLogin.fillEmailidFld(webDriver, configfile.getProperty("validemail"));
		test.log(LogStatus.INFO, "Email Field  is Filled with valid Email : " + configfile.getProperty("validemail"));
		logger.info("Email Field is Filled With Valid Email");
		AdminLogin.fillPasswordFld(webDriver, " ");
		test.log(LogStatus.INFO, "Password Field is Filled with Blank Data");
		logger.info("Password Field Filled with Blank data");
		AdminLogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		AdminLogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		alertMessage = AdminLogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = AdminLogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg5 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg5);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	@Test(priority = 6, retryAnalyzer = Retry.class)
	public void verifyIForgotMyPasswordLink() {
		test = utilities.reportsFile("Admin_Verify I forgot my password link");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminLogin.clkForgotPasswordLink(webDriver);
		logger.info("Clicked on  I forgot my Password Link");
		test.log(LogStatus.INFO, "Clicked on I forgot my Password Link ");
		boolean strverify = AdminLogin.verifyForgotPassword(webDriver);
		if (strverify == true) {
			test.log(LogStatus.PASS, "Forgot Password Section is Displayed");
			String forgotmypassword = utilities.captureScreenshot(webDriver, "forgotmypassword");
			test.log(LogStatus.INFO, "Screen Shot is taken " + forgotmypassword);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Forgot Password Section is not Displayed");
		}
	}
	@Test(priority = 7, retryAnalyzer = Retry.class)
	public void validEmailAndPassword() {
		test = utilities.reportsFile("Admin_Verify Login Screen Functionality with valid Email and valid password");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminLogin.clkIAmAdminLnk(webDriver);
		test.log(LogStatus.INFO, "Clicked on I Am Admin Clicked");
		logger.info("Clicked on I Am Admin Clicked");
		AdminLogin.fillEmailidFld(webDriver, configfile.getProperty("validemail"));
		test.log(LogStatus.INFO, "Email Field  is Filled with valid Email : " + configfile.getProperty("validemail"));
		logger.info("EmailId Entered");
		AdminLogin.fillPasswordFld(webDriver, configfile.getProperty("validpassword"));
		test.log(LogStatus.INFO,"Password Field  is Filled with valid Password : " + configfile.getProperty("validpassword"));
		logger.info(" Entered Password");
		AdminLogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		AdminLogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		AdminUsername = AdminLogin.adminVerification(webDriver);
		if (AdminUsername == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Home Page");
			String HomePage = utilities.captureScreenshot(webDriver, "Home Page");
			test.log(LogStatus.INFO, "Screen Shot is taken " + HomePage);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Home Page");
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
		// webDriver.close();
		// webDriver.quit();
		utilities.endReport();
	}
}