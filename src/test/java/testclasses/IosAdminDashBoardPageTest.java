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

import pageclasses.IosAdminDashBoardPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosAdminDashBoardPageTest extends BaseClass {
	public ExtentTest test;
	public ExtentReports reports;
	ITestResult result;
	public Boolean verifyStatus;
	Logger logger = Logger.getLogger(IosAdminDashBoardPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosAdminEmployeeLogin adminLogin = new IosAdminEmployeeLogin();
	IosAdminDashBoardPage adminDashBoard = new IosAdminDashBoardPage(driver);
	Utilities utilities = new Utilities();
	public String screenShotName;
	public IosAdminDashBoardPageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
	@Parameters("mobilePlatform")
	@BeforeClass
	public void setUp(String mobilePlatform) throws Exception {
		if (mobilePlatform.equalsIgnoreCase("iOS")) {
			cfru.loadPropertyFile();
			String ipaPath = utilities.ipaPath();
			Boolean alertStatus = true;
			iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
			logger.info("App is Launched ");
			adminLogin.adminLogin();
			test = utilities.reportsFile("Verify Admin DashBoard Screen Functionality");
		} else {

		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyAdminDashBoard_BoardsPage(String mobilePlatform) throws Exception {
		if (mobilePlatform.equalsIgnoreCase("iOS")) {
			adminDashBoard.clkAdmin_DashBoard_BoardsBtn(driver);
			test.log(LogStatus.INFO, "Boards button is Clicked");
			verifyStatus = adminDashBoard.verifyBoardsScreen(driver);
			if (verifyStatus == true) {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.PASS, "Application is Navigated to Boards Screen");
				logger.info("Okay");
			} else {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.FAIL, "Application is not Navigated to Boards Screen");
				logger.info("Okay");
			}
		} else {

		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyAdminDashBoard_ToDoPage(String mobilePlatform) throws Exception {
		if (mobilePlatform.equalsIgnoreCase("iOS")) {
			adminDashBoard.clkAdmin_DashBoard_TodoBtn(driver);
			test.log(LogStatus.INFO, "Todo button is clicked");
			verifyStatus = adminDashBoard.verifyToDOScreen(driver);
			if (verifyStatus == true) {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.PASS, "Application is Navigated to ToDo Screen");
				logger.info("Okay");
			} else {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.FAIL, "Application is not Navigated to ToDo Screen");
				logger.info("Okay");
			}
		} else {

		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyAdminDashBoard_ADDPage(String mobilePlatform) throws Exception {
		if (mobilePlatform.equalsIgnoreCase("iOS")) {
			adminDashBoard.clkAdmin_DashBoard_AddBtn(driver);
			test.log(LogStatus.INFO, "Add button is clicked");
			if (verifyStatus == true) {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.PASS, "Application is Navigated to Add Screen");
				logger.info("Okay");
			} else {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.FAIL, "Application is not Navigated to Add Screen");
				logger.info("Okay");
			}
		} else {

		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyAdminDashBoard_SettingsPage(String mobilePlatform) throws Exception {
		if (mobilePlatform.equalsIgnoreCase("iOS")) {
			adminDashBoard.clkAdmin_DashBoard_SettingsBtn(driver);
			test.log(LogStatus.INFO, "Settings button is clicked");
			if (verifyStatus == true) {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.PASS, "Application is Navigated to Seetings Screen");
				logger.info("Okay");
			} else {
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				test.log(LogStatus.FAIL, "Application is not Navigated to Settings Screen");
				logger.info("Okay");
			}
		} else {

		}
	}
	@AfterClass
	public void tearDown() {
		utilities.endReport();
		driver.closeApp();
	}
}
