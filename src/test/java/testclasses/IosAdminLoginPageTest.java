package testclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageclasses.IosLoginPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosAdminLoginPageTest extends BaseClass {
	public ExtentTest test;
	public ExtentReports reports;
	ITestResult result;
	Logger logger = Logger.getLogger(IosAdminLoginPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosLoginPage login = new IosLoginPage(driver);
	Utilities utilities = new Utilities();
	public String alertMessage;
	public String screenShotName;
	public Boolean loginStatus;
	public IosAdminLoginPageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
	@Parameters("mobilePlatform")
	@BeforeClass
	public void setUp(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		String ipaPath = utilities.ipaPath();
		Boolean alertStatus = true;
		iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
		logger.info("App is launched");
		}else{
		}
		}
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void adminVerifyForgotpassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
			cfru.loadPropertyFile();
			test = utilities.reportsFile("Verify Admin Forgot Password Functionality");
			test.log(LogStatus.INFO, "App is Launched in iPhone");
			login.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			login.clkForgotPasswordLnk(driver);
			test.log(LogStatus.INFO, "Forgot password link is Clicked");
			String textPresence=login.verifyTextPresence(driver);
			test.log(LogStatus.INFO, "Forgot password screen is displaying a message as :"+textPresence);
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Forgot password screen");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			login.clkForgotPasswordCancelBtn(driver);
			utilities.endReport();
			}else{
				
			}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void adminLoginVerifyWithBlankData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Admin Login with Blank Values");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		login.clkAdminBtn(driver);
		test.log(LogStatus.INFO, "Admin button is Clicked");
		login.fillAdminEmailFld("", driver);
		test.log(LogStatus.INFO, "Email Field is Filled with Blank");
		login.fillAdminPasswordFld("", driver);
		test.log(LogStatus.INFO, "PassWord Field is Filled with Blank");
		login.admnSignInBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if(alertMessage.contains("Please, enter credentials")){
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Blank Data");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		login.adminAlertOkBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.PASS, "Alert Pop up Displayed a Message as : " + alertMessage);
		test.log(LogStatus.PASS, "Test Case is Passed");
		}else{
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Blank Data");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			login.adminAlertOkBtn(driver);
			logger.info("Okay");
			test.log(LogStatus.FAIL, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.FAIL, "Test Case is Failed");
		
		}
		utilities.endReport();
		}else{
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void adminLoginVerifyWithValidEmailBlankPassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Admin Login With Valid Email BlankPassword ");
		login.clkAdminBtn(driver);
		test.log(LogStatus.INFO, "Admin button is Clicked");
		login.fillAdminEmailFld(cfru.getProperty("AdmnEmail"), driver);
		test.log(LogStatus.INFO, "Email Field is Filled with Valid Email");
		login.fillAdminPasswordFld("", driver);
		test.log(LogStatus.INFO, "PassWord Field is Filled with Blank");
		login.admnSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if(alertMessage.contains("Please, enter credentials")){
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Blank Password");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Alert Pop up Displayed a Message as : " + alertMessage);
		test.log(LogStatus.PASS, "Test Case is Passed");
		login.adminAlertOkBtn(driver);
		logger.info("Okay");
		}else{
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Blank Password");
			test.log(LogStatus.FAIL, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.FAIL, "Test Case is Failed");
			login.adminAlertOkBtn(driver);
		}
		utilities.endReport();
		}else{
		}
		}
	@Parameters("mobilePlatform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void adminLoginVerifyWithBlankEmailValidPassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Admin Login With Blank Email valid Password ");
		login.clkAdminBtn(driver);
		test.log(LogStatus.INFO, "Admin button is Clicked");
		login.fillAdminEmailFld("", driver);
		test.log(LogStatus.INFO, "Email Field is Filled with blank");
		login.fillAdminPasswordFld(cfru.getProperty("AdminPassword"), driver);
		test.log(LogStatus.INFO, "PassWord Field is Filled with valid password");
		login.admnSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if(alertMessage.contains("Please, enter credentials")){
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Blank Email");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Alert Pop up Displayed a Message as : " + alertMessage);
		test.log(LogStatus.PASS, "Test Case is Passed");
		login.adminAlertOkBtn(driver);
		logger.info("Okay");
		}else{
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Blank Email");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.FAIL, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.FAIL, "Test Case is Failed");
			login.adminAlertOkBtn(driver);
		}
		utilities.endReport();
		}else{
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void adminLoginVerifyWithValidEmailInValidPassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Admin Login With valid Email Invalid Password ");
		login.clkAdminBtn(driver);
		test.log(LogStatus.INFO, "Admin button is Clicked");
		login.fillAdminEmailFld(cfru.getProperty("AdmnEmail"), driver);
		test.log(LogStatus.INFO, "Email Field is Filled with Valid Email");
		login.fillAdminPasswordFld("chandra234rgtf@", driver);
		test.log(LogStatus.INFO, "PassWord Field is Filled with invalid password");
		login.admnSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if (alertMessage.contains("Cannot sign you in. Please, try again")) {
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with InValid Password");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			test.log(LogStatus.PASS, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.PASS, "Test Case is Passed");
			logger.info("Okay");
			login.adminAlertOkBtn(driver);
		} else {
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with InValid Password");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.FAIL, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.FAIL, "Test Case is Failed");
			logger.info("Okay");
			login.adminAlertOkBtn(driver);
		}
		utilities.endReport();
		}else{
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 6, retryAnalyzer = Retry.class)
	public void adminLoginVerifyWithInValidEmailPassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Admin Login With Invalid Email and Password ");
		login.clkAdminBtn(driver);
		test.log(LogStatus.INFO, "Admin button is Clicked");
		login.fillAdminEmailFld("chandra@gmail.com", driver);
		test.log(LogStatus.INFO, "Email Field is Filled with InValid Email");
		login.fillAdminPasswordFld("chandra369", driver);
		test.log(LogStatus.INFO, "PassWord Field is Filled with invalid password");
		login.admnSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if (alertMessage.contains("")) {
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with InValid Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.adminAlertOkBtn(driver);
			test.log(LogStatus.PASS, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.PASS, "Test Case is Passed");
			logger.info("Okay");
		} else {
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with InValid Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.adminAlertOkBtn(driver);
			test.log(LogStatus.FAIL, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.FAIL, "Test Case is Failed");
		}
		utilities.endReport();
		}else{
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 7, retryAnalyzer = Retry.class)
	public void adminLoginVerifyWithValidEmailPassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test=utilities.reportsFile("Verify Admin Login With valid Email and Password ");
		login.clkAdminBtn(driver);
		test.log(LogStatus.INFO, "Admin button is Clicked");
		login.fillAdminEmailFld(cfru.getProperty("AdmnEmail"), driver);
		test.log(LogStatus.INFO, "Email Field is Filled with Valid Email");
		login.fillAdminPasswordFld(cfru.getProperty("AdminPassword"), driver);
		test.log(LogStatus.INFO, "PassWord Field is Filled with valid password");
		login.admnSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		loginStatus=login.admnLoginVerify(driver);
		if(loginStatus==true){
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Valid Data");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.PASS, "Admin Logged in Successfully");
			test.log(LogStatus.PASS, "Test Case is Passed");
		}else{
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Valid Data");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.PASS, "Admin is not Logged in Successfully");
			test.log(LogStatus.FAIL, "Test Case is Failed");
		}
		utilities.endReport();
		}else{
			
		}
	}
	@AfterClass
	public void tearDown() {
		driver.closeApp();
	}
}
