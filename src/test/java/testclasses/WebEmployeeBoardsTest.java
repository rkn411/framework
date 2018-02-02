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

import pageclasses.WebEmpBoardsPage;
import pageclasses.WebEmpLoginPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Singleton;
import utilities.Utilities;
public class WebEmployeeBoardsTest extends BaseClass {
	Logger logger = Logger.getLogger(WebEmployeeBoardsTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebEmpBoardsPage EmpBoards = new WebEmpBoardsPage(webDriver);
	WebEmpLoginPage emplogin = new WebEmpLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	// constructor
	WebEmployeeBoardsTest() throws Exception {
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
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void clickingMsgBtn() {
		test = utilities.reportsFile("Employee_Verify Message Icon Functionality In  Boards Screen");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		emplogin.employlogin(webDriver);
		EmpBoards.clkEmp1(webDriver);
		EmpBoards.clkMarkasRead(webDriver);
		logger.info("Clicked on Mark as read");
		test.log(LogStatus.INFO, "Clicked on Mark as read");
		EmpBoards.clkMarkasUnread(webDriver);
		logger.info("Clicked on Mark as unread");
		test.log(LogStatus.INFO, "Clicked on Mark as unread");
		boolean strverify = EmpBoards.msgiconVerification(webDriver);
		if (strverify == true) {
			test.log(LogStatus.PASS, "Message icon functionality Verified");
			String screenshotName = utilities.captureScreenshot(webDriver, "HomePage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshotName);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Message icon functionality Failed");
		}
		utilities.endReport();
	}
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyCommentBtnWithValidData() {
		test = utilities.reportsFile("Employee_Verify Comment Icon Functionality In Employee Boards Screen");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		EmpBoards.clkOnCommentIcon(webDriver);
		logger.info("Clicked on Comments icon ");
		test.log(LogStatus.INFO, "Clicked on Comments icon");
		EmpBoards.clkCommentCancelBtn(webDriver);
		logger.info("Clicked on 'Cancel' Button");
		test.log(LogStatus.INFO, "Clicked on 'Cancel' Button");
		EmpBoards.clkOnCommentIcon(webDriver);
		logger.info("Clicked on Comments icon");
		test.log(LogStatus.INFO, "Clicked on Comments icon");
		EmpBoards.enterComment(webDriver);
		logger.info("Text Entered in to Write comment Textbox Field");
		test.log(LogStatus.INFO, "Text Entered in to Comment Field");
		EmpBoards.clkCommentButton(webDriver);
		logger.info("Cliced on Comments Button");
		test.log(LogStatus.INFO, "Clicked on Comments button");
		boolean commentsicon = EmpBoards.commenticonVerification(webDriver);
		if (commentsicon == true) {
			test.log(LogStatus.PASS, "Comments Icon Functionality Verified");
			String Scrrenshotcommentsicon = utilities.captureScreenshot(webDriver, "commentsicon");
			test.log(LogStatus.INFO, "Screen Shot is taken " + Scrrenshotcommentsicon);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Comments Icon Functionality Failed");
		}
		utilities.endReport();
	}
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyEditBtnFunctionality() {
		test = utilities.reportsFile("Employee_Verify Edit Button Functionality ");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		EmpBoards.clkEmp1(webDriver);
		EmpBoards.clkEditButton(webDriver);
		logger.info("Clicked on Edit icon");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		EmpBoards.clkAssignToInEdit(webDriver);
		logger.info("Clicked on Assign To");
		test.log(LogStatus.INFO, "Clicked on Assigned To Field");
		EmpBoards.clkCancelBtninEdit(webDriver);
		logger.info("Clicked on 'Cancel' Button");
		test.log(LogStatus.INFO, "Clicked on 'Cancel' Button");
		EmpBoards.clkEditButton(webDriver);
		logger.info("Clicked on Edit icon");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		EmpBoards.clkAssignToInEdit(webDriver);
		logger.info("Clicked on Assign To field");
		test.log(LogStatus.INFO, "Clicked on Assigned To Field ");
		EmpBoards.clkSaveBtnInEdit(webDriver);
		logger.info("Clicked on'Save' Button");
		test.log(LogStatus.INFO, "Clicked on'Save' Button");
		test.log(LogStatus.PASS, "Edit Button Functionality is Verified");
		String ScreenshotEditicon = utilities.captureScreenshot(webDriver, "commentsicon");
		test.log(LogStatus.INFO, "Screen Shot is taken " + ScreenshotEditicon);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyUnresolvedButtonFunctionality() {
		test = utilities.reportsFile("Employee_Verify Unresolved Button Functionality ");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		boolean verify = EmpBoards.clkResolvedBtn(webDriver);
		if (verify == true) {
			logger.info("Clicked on Resolved Button");
			test.log(LogStatus.INFO, "Clicked on Resolved Button");
			EmpBoards.clkDropDownInUnresolved(webDriver);
			logger.info("Clicked on Dropdown in Unresolved");
			test.log(LogStatus.INFO, "Clicked on Dropdown in Unresolved");
			EmpBoards.clkUnresolvedFromDropdown(webDriver);
			logger.info("Selected Unresolved from the dropdown");
			test.log(LogStatus.INFO, "Selected Unresolved from the dropdown");
			EmpBoards.clkSaveBtn(webDriver);
			logger.info("Clicked on'Save' Button");
			test.log(LogStatus.INFO, "Clicked on'Save' Button");
		}
		boolean verifyunresolved = EmpBoards.clkUnresolvedButton(webDriver);
		if (verify == true) {
			logger.info("Clicked on Unresolved Button");
			test.log(LogStatus.INFO, "Clicked on Unresolved Button");
			EmpBoards.clkDollarsFld(webDriver);
			logger.info("Clicked on Dollars Field");
			test.log(LogStatus.INFO, "Clicked on Dollars Field");
			EmpBoards.clkDropDownInUnresolved(webDriver);
			logger.info("Clicked on Dropdown in Unresolved");
			test.log(LogStatus.INFO, "Clicked on Dropdown in Unresolved");
			EmpBoards.clkGuestisVeryHappy(webDriver);
			logger.info("Selected Guest is very Happy from the Dropdown");
			test.log(LogStatus.INFO, "Selected Guest is very Happy from the Dropdown");
			EmpBoards.clkSaveBtn(webDriver);
			logger.info("Clicked on'Save' Button");
			test.log(LogStatus.INFO, "Clicked on'Save' Button");
			boolean unresolved = EmpBoards.unresolvedVerification(webDriver);
			if (unresolved == true) {
				test.log(LogStatus.PASS, "Unresolved Button Functionality Verified");
				String unresolvedBtn = utilities.captureScreenshot(webDriver, "profilePage");
				test.log(LogStatus.INFO, "Screen Shot is taken " + unresolvedBtn);
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Unresolved Button Functionality  Verification Failed");
			}
		}
		test.log(LogStatus.SKIP, "Resolved and Unresolved Buttons are not displayed");
		utilities.endReport();
	}
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void verifyConverttotaskFunctionality() {
		test = utilities.reportsFile("Employee_Verify Convert to task Functionality in Employee Boards screen");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		boolean verify = EmpBoards.clkOnConvertToTaskButton(webDriver);
		if (verify == true) {
			logger.info("Clicked on Convert to task  icon");
			test.log(LogStatus.INFO, "Clicked on Convert to task  icon");
			EmpBoards.clkDeptAndLocationsBtn(webDriver);
			logger.info("Clicked on Department and location tag");
			test.log(LogStatus.INFO, "Clicked on Department and location tag");
			EmpBoards.clkOnDepartmentttab(webDriver);
			logger.info("Clicked on Departments tab");
			test.log(LogStatus.INFO, "Clicked on Departments tab");
			EmpBoards.clkFrontdesktab(webDriver);
			logger.info("Clicked on Front desk Tab");
			test.log(LogStatus.INFO, "Clicked on Front Desk Tab");
			EmpBoards.clkFrontdeskchkbox(webDriver);
			logger.info("Clicked on FrontDesk Checkbox");
			test.log(LogStatus.INFO, "Clicked on FrontDesk Checkbox");
			EmpBoards.clkLocationtab(webDriver);
			logger.info("Clicked on Location tab");
			test.log(LogStatus.INFO, "Clicked on Location tab");
			EmpBoards.clkExteriortab(webDriver);
			logger.info("Clicked on Exterior tab");
			test.log(LogStatus.INFO, "Clicked on Exterior tab");
			EmpBoards.clkExteriorchkbox(webDriver);
			logger.info("Clicked on Driveaway checkbox");
			test.log(LogStatus.INFO, "Clicked on Driveaway checkbox");
			EmpBoards.clkEquipmentsTab(webDriver);
			logger.info("Clicked on Equipments tab");
			test.log(LogStatus.INFO, "Clicked on Equipments tab");
			EmpBoards.clkGroupEquipmentsTab(webDriver);
			logger.info("Clicked on GroupEquipments tab");
			test.log(LogStatus.INFO, "Clicked on GroupEquipments tab");
			EmpBoards.clkGroupEquipChkbox(webDriver);
			logger.info("Clicked on equipm_of_Group_Equipment Checkbox");
			test.log(LogStatus.INFO, "Clicked on equipm_of_Group_Equipment Checkbox");
			EmpBoards.clkSavebutton(webDriver);
			logger.info("Clicked on'Save' Button");
			test.log(LogStatus.INFO, "Clicked on'Save' Button");
			test.log(LogStatus.PASS, "Selected Checkboxes is Displayed in the Departments & Locations Field ");
			String deptlocations = utilities.captureScreenshot(webDriver, "deptloca");
			test.log(LogStatus.INFO, "Screen Shot is taken " + deptlocations);
			EmpBoards.clkCopyto(webDriver);
			logger.info("Clicked on CopyTo field");
			test.log(LogStatus.INFO, "Clicked on CopyTo field");
			EmpBoards.clkUsersChkBox(webDriver);
			logger.info("Clicked on Checkbox ");
			test.log(LogStatus.INFO, "Clicked on Checkbox Clicked");
			EmpBoards.clkSavebutton(webDriver);
			logger.info("Clicked on'Save' Button");
			test.log(LogStatus.INFO, "Clicked on'Save' Button");
			test.log(LogStatus.PASS, "Selected Checkbox is Displayed in the Copy To Field ");
			String copyto = utilities.captureScreenshot(webDriver, "copyto");
			test.log(LogStatus.INFO, "Screen Shot is taken " + copyto);
			EmpBoards.clkAssignToInEdit(webDriver);
			logger.info("Selected emp1 Dropdown");
			test.log(LogStatus.INFO, "Selected Name is Displayed in AssignTo Field");
			EmpBoards.clkDateFld(webDriver);
			logger.info("Selected Due Date Value");
			test.log(LogStatus.INFO, "Selected Due Date Value");
			EmpBoards.clkCalenderOk(webDriver);
			logger.info("Clicked on Ok Button");
			test.log(LogStatus.INFO, "Clicked on Ok Button ");
			EmpBoards.fillSubject(webDriver);
			logger.info("Subject Field is Filled With data");
			test.log(LogStatus.INFO, "Subject Field is Filled With data");
			EmpBoards.fillCommentTextarea(webDriver);
			logger.info("Comment Field is Filled with data");
			test.log(LogStatus.INFO, "Comment Field is Filled with data");
			EmpBoards.clkPostaTask(webDriver);
			logger.info("Clicked on Post a Task Button");
			test.log(LogStatus.INFO, "Clicked on Post a Task Button");
		} else {
			test.log(LogStatus.INFO, "Convert to Task is not displayed");
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