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

import pageclasses.AndroidEmpLoginScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidEmpLoginScreenTest extends BaseClass {

	ITestResult result;
	ExtentTest test;
	Utilities utilities=new Utilities();
	public String screenShot;
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidEmpLoginScreenTest.class);
	// create object for LoginScreenPageObjects class
	AndroidEmpLoginScreen loginScreen = new AndroidEmpLoginScreen(driver);
	// create object for navigationsPageObjects class
	ConfigFileUtility configfile = new ConfigFileUtility();
	// create variable version as integer
	int version = 10;
	DesiredCapabilities caps;

	// constructor
	AndroidEmpLoginScreenTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		configfile.loadPropertyFile();
	}
	@Parameters("platform")
	@BeforeClass
	public void launchApplication(String platform) throws Exception {
		if (platform.equalsIgnoreCase("android")) {
			//service.start();
			androidMobileNativeAppCapabilities(version);
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check hotel id,user name and password with blankvalues
	@Parameters("platform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyEmployeeLoginWithBlankValues(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify login Functionality With Blank Values");
			test.log(LogStatus.INFO, "App launched");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Open Screen");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, "");
			test.log(LogStatus.INFO, "Hotelid Field is Filled with Blank Values");
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, "");
			test.log(LogStatus.INFO, "Username Field is Filled with Blank Values");
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, "");
			test.log(LogStatus.INFO, "password Field is Filled with Blank Values");
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String alertMessage = loginScreen.getAlertMessage(driver);
			String strerrormsg = loginScreen.verification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			loginScreen.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
            }else{
            	test.log(LogStatus.FAIL, "Alert pop up message not displayed");
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			loginScreen.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
            }
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check hotel id,user name and password with invalid data
	@Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyWithInValidData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Login Functionality With Invalid Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, configfile.getProperty("invalidhotelid"));
			test.log(LogStatus.INFO,"Hotelid Details is Filled with Invalid Hotelid :" + configfile.getProperty("invalidhotelid"));
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, configfile.getProperty("invalidusername"));
			test.log(LogStatus.INFO,"Username Details is Filled with Invalid Username :" + configfile.getProperty("invalidusername"));
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, configfile.getProperty("invalidemppassword"));
			test.log(LogStatus.INFO, "password Details is Filled with Invalid Password :"+ configfile.getProperty("invalidemppassword"));
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String alertMessage = loginScreen.getAlertMessage(driver);
			String strerrormsg = loginScreen.verification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			loginScreen.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
            }else{
            	test.log(LogStatus.FAIL, "Alert pop up message not displayed");
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			loginScreen.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
            }
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check hotel id,user name and password with invalid data
	@Parameters("platform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyWithValidHotelidInvalidPasswdAndUsername(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Login Screen Functionality With Valid Hotelid and Invalid Password & Username");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			test.log(LogStatus.INFO, "Login with Valid Data");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, configfile.getProperty("validhotelid"));
			test.log(LogStatus.INFO,"Hotelid Details is Filled With Valid Hotelid :" + configfile.getProperty("validhotelid"));
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, configfile.getProperty("invalidusername"));
			test.log(LogStatus.INFO,"Username Details is Filled with Invalid Username :" + configfile.getProperty("invalidusername"));
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, configfile.getProperty("invalidemppassword"));
			test.log(LogStatus.INFO, "password Details is Filled with Invalid Password :"+ configfile.getProperty("invalidemppassword"));
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String alertMessage = loginScreen.getAlertMessage(driver);
			String strerrormsg = loginScreen.verification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			loginScreen.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
            }else{
            	test.log(LogStatus.FAIL, "Alert pop up message not displayed");
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			loginScreen.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
            }
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyWithInValidHotelidAndPasswdAndValidUsername(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Login Screen Functionality With Invalid Hotelid & Password & Valid Username");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, configfile.getProperty("invalidhotelid"));
			test.log(LogStatus.INFO,"Hotelid Details is Filled with Invalid Hotelid :" + configfile.getProperty("invalidhotelid"));
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, configfile.getProperty("validusername"));
			test.log(LogStatus.INFO,"Username Details is Filled with Valid Username :" + configfile.getProperty("validusername"));
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, configfile.getProperty("invalidemppassword"));
			test.log(LogStatus.INFO, "password Details is Filled with Invalid Password :"+ configfile.getProperty("invalidemppassword"));
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String alertMessage = loginScreen.getAlertMessage(driver);
			String strerrormsg = loginScreen.verification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			loginScreen.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
            }else{
            	test.log(LogStatus.FAIL, "Alert pop up message not displayed");
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			loginScreen.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
            }
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void verifyWithInValidHotelidAndBlankPasswdAndUsername(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Login Screen Functionality With Invalid Hotelid & Blank Password & Username ");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, configfile.getProperty("validhotelid"));
			test.log(LogStatus.INFO,"Hotelid Details is Filled with Valid Hotelid :" + configfile.getProperty("validhotelid"));
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, "");
			test.log(LogStatus.INFO, "Username Field is Filled with Blank Values");
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, "");
			test.log(LogStatus.INFO, "password Field is Filled with Blank Values");
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String alertMessage = loginScreen.getAlertMessage(driver);
			String strerrormsg = loginScreen.verification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			loginScreen.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
            }else{
            	test.log(LogStatus.FAIL, "Alert pop up message not displayed");
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			loginScreen.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
            }
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 6, retryAnalyzer = Retry.class)
	public void verifyWithValidUsernameAndBlankPasswdAndHotelid(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Login Screen Functionality With Valid Username & Blank Password & Hotelid");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, "");
			test.log(LogStatus.INFO, "Hotelid Field is Filled with Blank Values");
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, configfile.getProperty("validusername"));
			test.log(LogStatus.INFO,"Username Details is Filled with Valid Username :" + configfile.getProperty("validusername"));
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, "");
			test.log(LogStatus.INFO, "password Field is Filled with Blank Values");
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String alertMessage = loginScreen.getAlertMessage(driver);
			String strerrormsg = loginScreen.verification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			loginScreen.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
            }else{
            	test.log(LogStatus.FAIL, "Alert pop up message not displayed");
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			loginScreen.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
            }
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 7, retryAnalyzer = Retry.class)
	public void verifyWithBlankHotelidAndValidUsernameAndPassword(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Login Screen Functionality With Blank Hotelid  Valid Username & Password");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, "");
			test.log(LogStatus.INFO, "Hotelid Field is Filled with Blank Values");
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, configfile.getProperty("validusername"));
			test.log(LogStatus.INFO,"Username Details is Filled with Valid Username :" + configfile.getProperty("validusername"));
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, configfile.getProperty("validemppassword"));
			test.log(LogStatus.INFO,"password Details is Filled with Valid Password :" + configfile.getProperty("validemppassword"));
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String alertMessage = loginScreen.getAlertMessage(driver);
			String strerrormsg = loginScreen.verification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			loginScreen.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
            }else{
            	test.log(LogStatus.FAIL, "Alert pop up message not displayed");
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			loginScreen.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
            }
		} else {
			System.out.println("Not an Android");
		}
	}
	// method to check hotel id,user name and password with valid data
	@Parameters("platform")
	@Test(priority = 8, retryAnalyzer = Retry.class)
	public void verifyWithValidData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Login Screen Functionality With Valid Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Enter hotelid ");
			loginScreen.fillHotelidFld(driver, configfile.getProperty("validhotelid"));
			test.log(LogStatus.INFO,"Hotelid Details is Filled with Valid Hotelid :" + configfile.getProperty("validhotelid"));
			logger.info("Enter username");
			loginScreen.fillUserNameFld(driver, configfile.getProperty("validusername"));
			test.log(LogStatus.INFO,"Username Details is Filled with Valid Username :" + configfile.getProperty("validusername"));
			logger.info("Enter  password");
			loginScreen.fillemppasswordFld(driver, configfile.getProperty("validemppassword"));
			test.log(LogStatus.INFO,"password Details is Filled with Valid Password :" + configfile.getProperty("validemppassword"));
			loginScreen.clkSigninBtn(driver);
			logger.info("Signin button clicked");
			test.log(LogStatus.INFO, "Signin button clicked");
			String strverify = loginScreen.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Application Is Navigated To Dashboard Screen");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Application Is Not Navigating To Dashboard Screen ");
				test.log(LogStatus.FAIL, "Testcase is Failed");
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

