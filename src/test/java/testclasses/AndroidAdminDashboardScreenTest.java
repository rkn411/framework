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

import pageclasses.AndroidAdminDashboardScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidAdminDashboardScreenTest extends BaseClass {

	// create variable for Itest results
	ITestResult result;
	ExtentTest test;
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidAdminDashboardScreenTest.class);
	// create object for LoginScreenPageObjects class
	AndroidAdminDashboardScreen adminDashBoard = new AndroidAdminDashboardScreen(driver);
	// create object for navigationsPageObjects class
	ConfigFileUtility configfile = new ConfigFileUtility();
	Utilities utilities =new Utilities();
	// create variable version as integer
	int version = 11;
	DesiredCapabilities caps;
    public String screenShot; 
	// constructor
	AndroidAdminDashboardScreenTest() throws Exception {
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
	public void clkBoardsBtn(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Boards Button In Dashboard Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminDashBoard.clkBoardsBtn(driver);
			test.log(LogStatus.INFO, "Boards Button is Clicked");
			String strverify = adminDashBoard.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Boards Button Is Verified ");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Boards Button Verification Failed");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
			
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void clkToDoBtn(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Todo Button In Dashboard Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminDashBoard.clkToDoBtn(driver);
			test.log(LogStatus.INFO, "To Do Button is Clicked");
			String strverify = adminDashBoard.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Todo Button Is Verified ");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Todo Button Verification Failed");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
			
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void clkAddBtn(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Add Button In Dashboard Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminDashBoard.clkAddBtn(driver);
			test.log(LogStatus.INFO, "Add Button is Clicked");
			String strverify = adminDashBoard.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Add Button Is Verified ");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Add Button Verification Failed");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
			
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void clkSettingsBtn(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Settings Button In Dashboard Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminDashBoard.clkSettingsBtn(driver);
			test.log(LogStatus.INFO, "Settings Button is Clicked");
			String strverify = adminDashBoard.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Settings Button Is Verified ");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Settings Button Verification Failed");
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
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
		//service.stop();
		//System.out.println("current status:" + service.isRunning());
	}
}

