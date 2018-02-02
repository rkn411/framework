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

import pageclasses.IosEmployeeDashBoardPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosEmpDashBoardPageTest extends BaseClass {
	public ExtentTest test;
	public ExtentReports reports;
	ITestResult result;
	boolean verifyStatus;
	Logger logger = Logger.getLogger(IosEmpDashBoardPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosAdminEmployeeLogin employeeLogin = new IosAdminEmployeeLogin();
	IosEmployeeDashBoardPage employeeDashBoard = new IosEmployeeDashBoardPage(driver);
	Utilities utilities = new Utilities();
    public String screenShotName;
	public IosEmpDashBoardPageTest() {
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
		logger.info("App is Launched ");
		employeeLogin.employeeLogin();
		test = utilities.reportsFile("Verify Employee DashBoard Screen Functionality");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyEmployeeDashBoard_BoardsPage(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		employeeDashBoard.clkEmployee_DashBoard_BoardsBtn(driver);
		test.log(LogStatus.INFO, "Boards button is Clicked");
		verifyStatus = employeeDashBoard.verifyBoardsScreen(driver);
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
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyEmployeeDashBoard_ToDoPage(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		employeeDashBoard.clkEmployee_DashBoard_TodoBtn(driver);
		test.log(LogStatus.INFO, "Todo button is clicked");
		verifyStatus = employeeDashBoard.verifyToDOScreen(driver);
		if (verifyStatus == true) {
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			test.log(LogStatus.PASS, "Application is Navigated to Todo Screen");
			logger.info("Okay");
		} else {
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			test.log(LogStatus.FAIL, "Application is not Navigated to Todo Screen");
			logger.info("Okay");
		}
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyEmployeeDashBoard_ADDPage(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		employeeDashBoard.clkEmployee_DashBoard_AddBtn(driver);
		test.log(LogStatus.INFO, "Add button is clicked");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		verifyStatus = employeeDashBoard.verifyADDScreen(driver);
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
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyEmployeeDashBoard_SettingsPage(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		employeeDashBoard.clkEmployee_DashBoard_SettingsBtn(driver);
		test.log(LogStatus.INFO, "Settings button is clicked");
		verifyStatus = employeeDashBoard.verifySettingsScreen(driver);
		if (verifyStatus == true) {
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			test.log(LogStatus.PASS, "Application is Navigated to Settings Screen");
			logger.info("Okay");
		} else {
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			test.log(LogStatus.FAIL, "Application is not Navigated to Settings Screen");
			logger.info("Okay");
		}
		}else{
			
		}
	}
	@AfterClass
	public void tearDown() {
		utilities.endReport();
		driver.closeApp();
	}
}