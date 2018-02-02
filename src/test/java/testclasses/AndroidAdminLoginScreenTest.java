package testclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageclasses.AndroidAdminLoginScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidAdminLoginScreenTest extends BaseClass {

	// create variable for Itest results
	ITestResult result;
	ExtentTest test;
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidAdminLoginScreenTest.class);
	// create object for LoginScreenPageObjects class
	AndroidAdminLoginScreen adminlogin = new AndroidAdminLoginScreen(driver);
	// create object for navigationsPageObjects class
	ConfigFileUtility configfile = new ConfigFileUtility();
	// create variable version as integer
	int version = 11;
	Utilities utilities=new Utilities();
	public String screenShot;
	DesiredCapabilities caps;
	public String alertMessage = null;
	
	// constructor
	AndroidAdminLoginScreenTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		configfile.loadPropertyFile();
	}
	@Parameters("platform")
	@BeforeClass
	public void launchApplication(String platform) throws Exception {
		if (platform.equalsIgnoreCase("android")) {
			androidMobileNativeAppCapabilities(version);
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	// method to check email id and password fields With blank data
	public void blankEmailAndPassword(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Login Screen Functionality With Blank Data");
			test.log(LogStatus.INFO, "App is launched");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Open Screen");
			adminlogin.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			logger.info("Enter the email address");
			adminlogin.fillEmailFld(driver, "");
			test.log(LogStatus.INFO, "Email field is filled With Blank Data ");
			logger.info("Enter  password");
			adminlogin.fillPasswordFld(driver, "");
			test.log(LogStatus.INFO, "Password Field is Filled With Blank Data");
			adminlogin.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			alertMessage = adminlogin.getErrorMsg(driver);
			String strerrormsg = adminlogin.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Alert pop up not displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			
			}
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check invalid email id and password
	@Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void invalidEmailAndPassword(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Login Screen Functionality With Invalid Email & Password");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminlogin.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			logger.info("Enter Email Address");
			adminlogin.fillEmailFld(driver, configfile.getProperty("invalidemail"));
			test.log(LogStatus.INFO,"Email Field Details is Filled With Invalid Email : " + configfile.getProperty("invalidemail"));
			logger.info("Enter Password");
			adminlogin.fillPasswordFld(driver, configfile.getProperty("invalidpassword"));
			test.log(LogStatus.INFO,"Password Field is Filled With Invalid Password :" + configfile.getProperty("invalidpassword"));
			adminlogin.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			alertMessage = adminlogin.getErrorMsg(driver);
			String strerrormsg = adminlogin.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Alert pop up not displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			
			}
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check valid email and invalid password
	@Parameters("platform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void validEmailAndInValidPassword(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Login Screen Functionality With Valid Email & Invalid Password");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminlogin.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			logger.info("Enter Email Address");
			adminlogin.fillEmailFld(driver, configfile.getProperty("validemail"));
			test.log(LogStatus.INFO, "Email Field is Filled With Valid Email :" + configfile.getProperty("validemail"));
			logger.info("Enter Password");
			adminlogin.fillPasswordFld(driver, configfile.getProperty("invalidpassword"));
			test.log(LogStatus.INFO,"Password Field is Filled With Invalid Password :" + configfile.getProperty("invalidpassword"));
			adminlogin.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			alertMessage = adminlogin.getErrorMsg(driver);
			String strerrormsg = adminlogin.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Alert pop up not displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			
			}
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check blank email and invalid password
	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void blankEmailAndValidPassword(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Login Screen Functionality With Blank Email & Valid Password");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminlogin.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			logger.info("Enter Email Address");
			adminlogin.fillEmailFld(driver, "");
			test.log(LogStatus.INFO, "Email Field is Filled With Blank Data");
			logger.info("Enter Password");
			adminlogin.fillPasswordFld(driver, configfile.getProperty("validpassword"));
			test.log(LogStatus.INFO,"Password Field is Filled With Valid Password :" + configfile.getProperty("validpassword"));
			adminlogin.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			alertMessage = adminlogin.getErrorMsg(driver);
			String strerrormsg = adminlogin.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Alert pop up not displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check valid email and blank password
	@Parameters("platform")
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void validEmailAndBlankPassword(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Login Screen Functionality With Valid Email & Blank Password");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminlogin.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			logger.info("Enter Email Address");
			adminlogin.fillEmailFld(driver, configfile.getProperty("validemail"));
			test.log(LogStatus.INFO, "Email Field is Filled With Valid Email :" + configfile.getProperty("validemail"));
			logger.info("Enter Password");
			adminlogin.fillPasswordFld(driver, "");
			test.log(LogStatus.INFO, "Password Field is Filled With Blank Data");
			adminlogin.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			alertMessage = adminlogin.getErrorMsg(driver);
			String strerrormsg = adminlogin.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Alert pop up not displayed a message as : " + alertMessage);
				adminlogin.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
				}
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 6, retryAnalyzer = Retry.class)
	public void verifyForgotPasswordLink(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Forgot Password Link In Login Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminlogin.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			adminlogin.linkFrgtPasswd(driver);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			String strverify = adminlogin.forgotPasswordFldVerification(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				adminlogin.clkCancelBtn(driver);
				test.log(LogStatus.PASS, "Forgot Password Link Verified ");
				test.log(LogStatus.INFO, "Clicked on Cancel Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
				utilities.endReport();
				} else {
				test.log(LogStatus.FAIL, "Forgot Password Field Verification Failed");
			}
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check valid email and password
	@Parameters("platform")
	@Test(priority = 7, retryAnalyzer = Retry.class)
	public void validEmailAndPassword(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Login Screen Functionality With Valid Email & Password");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminlogin.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Admin Button is Clicked");
			logger.info("Enter Email Address");
			adminlogin.fillEmailFld(driver, configfile.getProperty("validemail"));
			test.log(LogStatus.INFO, "Email Field is Filled With Valid Email :" + configfile.getProperty("validemail"));
			logger.info("Enter Password");
			adminlogin.fillPasswordFld(driver, configfile.getProperty("validpassword"));
			test.log(LogStatus.INFO,"Password Field is Filled With Valid Password :" + configfile.getProperty("validpassword"));
			adminlogin.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String strverify = adminlogin.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Application Is Navigated To Dashboard Screen");
				test.log(LogStatus.PASS, "Testcase is Passed");
				utilities.endReport();
			} else {
				test.log(LogStatus.FAIL, "Application Is Not Navigating To Dashboard Screen");
				test.log(LogStatus.FAIL, "Testcase is Passed");
				utilities.endReport();
			}
			
		} else {
			System.out.println("Not an Android");
		}
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
		driver.closeApp();
}
}
