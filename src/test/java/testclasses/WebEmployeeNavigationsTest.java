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

import pageclasses.WebEmpLoginPage;
import pageclasses.WebEmpNavigationsPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Singleton;
import utilities.Utilities;

public class WebEmployeeNavigationsTest extends BaseClass {
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebEmployeeNavigationsTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebEmpLoginPage emplogin = new WebEmpLoginPage(webDriver);
	WebEmpNavigationsPage employnavigations = new WebEmpNavigationsPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	String screenshot = null;
	// constructor
	WebEmployeeNavigationsTest() throws Exception {
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
			webDriver = Singleton.getInstanceFirefox(utilities.chromedriverpath + "Chromedriver");
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
			webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}
	}
	@Test(priority = 1)
	public void verifyEmployeeLoginWithBlankValues() {
		test = utilities.reportsFile("Employee_Verify Navigations");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		emplogin.employlogin(webDriver);
		employnavigations.clkQaDepartment(webDriver);
		logger.info("Clicked on QA Department tab in left pane");
		test.log(LogStatus.INFO, "Clicked on QA Department tab in left pane");
		Boolean verifyqadept = employnavigations.verifyQaDepartment(webDriver);
		if (verifyqadept == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Qa Departments Page");
			screenshot = utilities.captureScreenshot(webDriver, "QA Department");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Qa Departments Page");
		}
		employnavigations.clkFrontDesk(webDriver);
		logger.info("Clicked on Front Desk tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Front Desk tab in left pane");
		Boolean verifyfrontdesk = employnavigations.verifyFrontDesk(webDriver);
		if (verifyfrontdesk == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Frontdesk Page ");
			screenshot = utilities.captureScreenshot(webDriver, "Front Desk");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Frontdesk Page");
		}
		employnavigations.clkEmp(webDriver);
		logger.info("Clicked on Emp tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Emp tab in left pane");
		Boolean verifyemp = employnavigations.verifyEmp(webDriver);
		if (verifyemp == true) {
			test.log(LogStatus.PASS, "Application is Navigated to emp Page");
			screenshot = utilities.captureScreenshot(webDriver, "Emp");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not  Navigated to emp Page");
		}
		employnavigations.clkRecovery(webDriver);
		logger.info("Clicked on Service Recovery tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Service Recovery tab in left pane");
		Boolean verifyRecovery = employnavigations.verifyRecovery(webDriver);
		if (verifyRecovery == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Service Recovery Page");
			screenshot = utilities.captureScreenshot(webDriver, "Service Recovery");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Service Recovery Page");
		}
		employnavigations.clkChecklists(webDriver);
		logger.info("Clicked on Checklists Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Checklists Tab in left pane");
		employnavigations.clkPlusicon(webDriver);
		logger.info("Clicked on Plus icon");
		test.log(LogStatus.INFO, "Clicked on Plus icon");
		employnavigations.clkChecklists(webDriver);
		logger.info("Checklists Tab Clicked");
		test.log(LogStatus.INFO, "Checklists Tab Clicked");
		employnavigations.clkEditicon(webDriver);
		logger.info("Clicked on Edit icon");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		employnavigations.clkChecklists(webDriver);
		employnavigations.clkDeleteicon(webDriver);
		logger.info("Clicked on Delete icon in check list");
		test.log(LogStatus.INFO, "Clicked on Delete icon in checklist");
		employnavigations.clkNoBtn(webDriver);
		logger.info("Clicked on'No' Button");
		test.log(LogStatus.INFO, "Clicked on'No' Button Clicked");
		employnavigations.clkChecklists(webDriver);
		Boolean verifychecklists = employnavigations.verifyCheckList(webDriver);
		if (verifychecklists == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Checklist Page");
			screenshot = utilities.captureScreenshot(webDriver, "checklists");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Checklist Page");
		}
		employnavigations.clkPreventiveMaintenance(webDriver);
		logger.info("Clicked on Preventive Maintenance tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Preventive Maintenance tab in left pane");
		employnavigations.clkPMPlusIcon(webDriver);
		logger.info("Clicked on Plus icon");
		test.log(LogStatus.INFO, "Clicked on Plus icon");
		employnavigations.clkPreventiveMaintenance(webDriver);
		logger.info("Clicked on Preventive Maintenance tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Preventive Maintenance tab in left pane");
		employnavigations.clkEditicon(webDriver);
		logger.info("Clicked on Edit icon");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		employnavigations.clkPreventiveMaintenance(webDriver);
		employnavigations.clkDeleteicon(webDriver);
		logger.info("Clicked on Delete icon in Preventive Maintenance");
		test.log(LogStatus.INFO, "Clicked on Delete icon in Preventive Maintenance");
		employnavigations.clkNoBtn(webDriver);
		logger.info("Clicked on'No' Button");
		test.log(LogStatus.INFO, "Clicked on'No' Button");
		Boolean verifyPM = employnavigations.verifyPM(webDriver);
		if (verifyPM == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Preventive Maintenance Page");
			screenshot = utilities.captureScreenshot(webDriver, "Preventive Maintenance");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is  not Navigated to Preventive Maintenance Page");
		}
		employnavigations.clkInspection(webDriver);
		logger.info("Clicked on Inspection tab");
		test.log(LogStatus.INFO, "Clicked on Inspection tab");
		employnavigations.clkInspectionPlusIcon(webDriver);
		logger.info("Clicked on Plus icon");
		test.log(LogStatus.INFO, "Clicked on Plus icon");
		employnavigations.clkInspection(webDriver);
		logger.info("Clicked on Inspection tab");
		test.log(LogStatus.INFO, "Clicked on Inspection tab");
		employnavigations.clkEditicon(webDriver);
		logger.info("Clicked on Edit icon");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		employnavigations.clkInspection(webDriver);
		employnavigations.clkDeleteicon(webDriver);
		logger.info("Clicked on Delete icon in Inspection");
		test.log(LogStatus.INFO, "Clicked on Delete icon in Inspection");
		employnavigations.clkNoBtn(webDriver);
		logger.info("Clicked on'No' Button ");
		test.log(LogStatus.INFO, "Clicked on'No' Button");
		Boolean verifyInspection = employnavigations.verifyInspection(webDriver);
		if (verifyInspection == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Inspection Page");
			screenshot = utilities.captureScreenshot(webDriver, "Inspection");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Inspection Page");
		}
		employnavigations.clkDashboards(webDriver);
		logger.info("Clicked on DashBoards tab");
		test.log(LogStatus.INFO, "Clicked on Dashboards tab");
		Boolean verifyDashboard = employnavigations.verifyDashBoards(webDriver);
		if (verifyDashboard == true) {
			test.log(LogStatus.PASS, "Navigated to DashBoard");
			screenshot = utilities.captureScreenshot(webDriver, "DashBoard");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Failed  DashBoard navigations");
		}
		employnavigations.clkReports(webDriver);
		logger.info("Clicked on Reports tab");
		test.log(LogStatus.INFO, "Clicked on Reports tab");
		Boolean verifyReport = employnavigations.verifyReports(webDriver);
		if (verifyReport == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Reports Page");
			screenshot = utilities.captureScreenshot(webDriver, "Report");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Reports Page");
		}
		employnavigations.createNoteAndTasks(webDriver);
		logger.info("Clicked on Creating Note And Tasks tab");
		test.log(LogStatus.INFO, "Clicked on  Creating Notes and Tasks");
		Boolean verifycreatetask = employnavigations.verifyCreateNoteAndTask(webDriver);
		if (verifycreatetask == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Creating Notes and Tasks Page");
			screenshot = utilities.captureScreenshot(webDriver, " Create Task and Note");
			test.log(LogStatus.INFO, "Screenshot taken : " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Creating Notes and Tasks Page");
		}
		test.log(LogStatus.PASS, "Testcase is Passed");
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
