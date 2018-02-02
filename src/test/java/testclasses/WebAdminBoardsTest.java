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

import pageclasses.WebAdminBoardsPage;
import pageclasses.WebAdminLoginPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Singleton;
import utilities.Utilities;

public class WebAdminBoardsTest extends BaseClass {
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebAdminBoardsTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebAdminBoardsPage AdminBoards = new WebAdminBoardsPage(webDriver);
	WebAdminLoginPage adminlogin = new WebAdminLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	// constructor
	WebAdminBoardsTest() throws Exception {
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
			webDriver = Singleton.getInstanceChrome(utilities.chromedriverpath+"chromedriver");
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
			webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}
	}
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyMessageBtnFunctionality() {
		test = utilities.reportsFile("Admin_Verify Message Icon Functionality In Boards Screen");
	    test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		adminlogin.login(webDriver);
		AdminBoards.clkAlexbtn(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		AdminBoards.clkMessageUnread(webDriver);
		logger.info("Clicked on Message Unread");
		test.log(LogStatus.INFO, "Clicked on Message Unread");
		AdminBoards.clkMsgread(webDriver);
		logger.info("Clicked on Message Read");
		test.log(LogStatus.INFO, "Clicked on Message Read");
		boolean strverify = AdminBoards.msgiconVerification(webDriver);
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
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyCommentBtnFunctionality() {
		test = utilities.reportsFile("Admin_Verify Comment Icon Functionality In Boards Screen");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminBoards.clkAlexbtn(webDriver);
		AdminBoards.clkCommentsicon(webDriver);
		logger.info("Clicked on Comments Icon");
		test.log(LogStatus.INFO, "Clicked on Comments Icon");
		AdminBoards.clkCancelBtninComment(webDriver);
		logger.info("Clicked on 'Cancel' Button");
		test.log(LogStatus.INFO, "Clicked on 'Cancel' Button");
		AdminBoards.clkCommentsicon(webDriver);
		logger.info("Clicked on Comments Icon");
		test.log(LogStatus.INFO, "Clicked on Comments Icon");
		AdminBoards.enterComment(webDriver);
		logger.info("Comment Field is Filled");
		test.log(LogStatus.INFO, "Comment Field is Filled");
		AdminBoards.clkCommentBtn(webDriver);
		logger.info("Clicked on Comments Button");
		test.log(LogStatus.INFO, "Clicked on Comments Button");
		boolean commentsicon = AdminBoards.commenticonVerification(webDriver);
		if (commentsicon == true) {
			test.log(LogStatus.PASS, "Comments Icon Functionality Verified");
			String Screenshotcommentsicon = utilities.captureScreenshot(webDriver, "commentsicon");
			test.log(LogStatus.INFO, "Screen Shot is taken " + Screenshotcommentsicon);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Comments Icon Functionality Failed");
		}
		utilities.endReport();
	}
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void verifyFlagBtnFunctionality() {
		test = utilities.reportsFile("Admin_Verify Flag Button Functionality ");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminBoards.clkAlexbtn(webDriver);
		AdminBoards.clkFlagicon(webDriver);
		logger.info("Clicked on Flag Icon");
		test.log(LogStatus.INFO, "Clicked on Flag Icon");
		AdminBoards.clkFlagCancel(webDriver);
		logger.info("Clicked on 'Cancel' Button ");
		test.log(LogStatus.INFO, "Clicked on 'Cancel' Button");
		AdminBoards.clkAlexbtn(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		AdminBoards.clkFlagicon(webDriver);
		logger.info("Clicked on Flag icon");
		test.log(LogStatus.INFO, "Clicked on Flag icon");
		AdminBoards.clkFlagExpiryFld(webDriver);
		logger.info("Clicked on Flag Expiry Field");
		test.log(LogStatus.INFO, "Clicked on Flag Expiry Field");
		AdminBoards.selectDate(webDriver);
		logger.info("Date Value Selected");
		test.log(LogStatus.INFO, "Date Value Selected");
		AdminBoards.clkFlaginPopup(webDriver);
		AdminBoards.clkFlagSave(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		AdminBoards.clkUnflagBtn(webDriver);
		logger.info("Clicked on Unflag Button");
		test.log(LogStatus.INFO, "Clicked on Unflag Button");
		AdminBoards.clkFlagSave(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		test.log(LogStatus.PASS, "Verified Flag Button Functionality");
		String Scrrenshotflagbutton = utilities.captureScreenshot(webDriver, "Flagicon");
		test.log(LogStatus.INFO, "Screen Shot is taken " + Scrrenshotflagbutton);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 6, retryAnalyzer = Retry.class)
	public void verifyEditBtnFunctionality() {
		test = utilities.reportsFile("Admin_Verify Edit Button Functionality ");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminBoards.clkAlexbtn(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		AdminBoards.clkEditicon(webDriver);
		logger.info("Clicked on Edit icon");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		AdminBoards.clkAssignToInEdit(webDriver);
		logger.info("Clicked on Assigned To Field ");
		test.log(LogStatus.INFO, "Clicked on Assigned To Field ");
		AdminBoards.clkCancelBtninEdit(webDriver);
		logger.info("Clicked on 'Cancel' Button");
		test.log(LogStatus.INFO, "Clicked on 'Cancel' Button");
		AdminBoards.clkEditicon(webDriver);
		logger.info("Clicked on Edit icon");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		AdminBoards.clkAssignToInEdit(webDriver);
		logger.info("Assigned To Field Clicked ");
		test.log(LogStatus.INFO, "Assigned To Field Clicked ");
		AdminBoards.clkSaveBtnInEdit(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		test.log(LogStatus.PASS, "Verified Edit Button Functionality");
		String Screenshoteditbutton = utilities.captureScreenshot(webDriver, "Edit");
		test.log(LogStatus.INFO, "Screen Shot is taken " + Screenshoteditbutton);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyUnresolvedButtonFunctionality() {
		test = utilities.reportsFile("Admin_Verify Unresolved Button Functionality ");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		AdminBoards.clkAlexbtn(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		AdminBoards.clkUnresolvedButton(webDriver);
		logger.info("Clicked on Unresolved Button");
		test.log(LogStatus.INFO, "Clicked on Unresolved Button");
		AdminBoards.clkDollarsFld(webDriver);
		logger.info("Clicked on Dollars Field ");
		test.log(LogStatus.INFO, "Clicked on Dollars Field ");
		AdminBoards.clkDropDownInUnresolved(webDriver);
		logger.info("Clicked on Dropdown in Unresolved");
		test.log(LogStatus.INFO, "Clicked on Dropdown in Unresolved");
		AdminBoards.clkGuestisVeryHappy(webDriver);
		logger.info("Selected Guest is very Happy from the Dropdown");
		test.log(LogStatus.INFO, "Selected Guest is very Happy from the Dropdown");
		AdminBoards.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		boolean unresolved = AdminBoards.unresolvedVerification(webDriver);
		if (unresolved == true) {
			test.log(LogStatus.PASS, "Admin Unresolved Button Functionality Verified");
			String resolvedbtn = utilities.captureScreenshot(webDriver, "profilePage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + resolvedbtn);
		} else {
			test.log(LogStatus.FAIL, "Admin Unresolved Button Functionality Failed");
		}
		AdminBoards.clkResolvedBtn(webDriver);
		logger.info("Clicked on Resolved Button");
		test.log(LogStatus.INFO, "Clicked on Resolved Button");
		AdminBoards.clkDropDownInUnresolved(webDriver);
		logger.info("Clicked on Dropdown in Unresolved");
		test.log(LogStatus.INFO, "Clicked on Dropdown in Unresolved");
		AdminBoards.clkUnresolvedFromDropdown(webDriver);
		logger.info("Selected Unresolved from the dropdown");
		test.log(LogStatus.INFO, "Selected Unresolved from the dropdown");
		AdminBoards.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		test.log(LogStatus.PASS, "Admin resolved Button Functionality Verified");
		String unresolvedBtn = utilities.captureScreenshot(webDriver, "unresolved");
		test.log(LogStatus.INFO, "Screen Shot is taken " + unresolvedBtn);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyConverttotaskFunctionality() {
		test = utilities.reportsFile("Admin_Verify Convert to task Functionality ");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		boolean verify = AdminBoards.clkConverttotaskicon(webDriver);
		if (verify == true) {
			logger.info("Clicked on Convert To Task Icon");
			test.log(LogStatus.INFO, "Clicked on Convert To Task Icon");
			AdminBoards.clkDeptandLocationtags(webDriver);
			logger.info("Clicked on Department and location tag ");
			test.log(LogStatus.INFO, "Clicked on Department and location tag ");
			AdminBoards.clkDepartmentsTab(webDriver);
			logger.info("Clicked on Departments tab ");
			test.log(LogStatus.INFO, "Clicked on Departments tab ");
			AdminBoards.clkHouseKeeping(webDriver);
			logger.info("Clicked on House Keeping tab");
			test.log(LogStatus.INFO, "Clicked on House Keeping tab");
			AdminBoards.clkBathcounterChkbox(webDriver);
			logger.info("Clicked on BathCounter Checkbox");
			test.log(LogStatus.INFO, "Clicked on BathCounter Checkbox");
			AdminBoards.clkLocationsTab(webDriver);
			logger.info("Clicked on Locations Tab");
			test.log(LogStatus.INFO, "Clicked on Locations Tab");
			AdminBoards.clkExteriorTab(webDriver);
			logger.info("Clicked on Exterior Tab");
			test.log(LogStatus.INFO, "Clicked on Exterior Tab");
			AdminBoards.clkDriveawayChkbox(webDriver);
			logger.info("Clicked on Driveaway Checkbox");
			test.log(LogStatus.INFO, "Clicked on Driveaway Checkbox");
			AdminBoards.clkEquipmentsTab(webDriver);
			logger.info("Clicked on Equipments Tab");
			test.log(LogStatus.INFO, "Clicked on Equipments Tab");
			AdminBoards.clkFirstGroupTab(webDriver);
			logger.info("Clicked on FirstGroup Tab");
			test.log(LogStatus.INFO, "Clicked on FirstGroup Tab");
			AdminBoards.clkTest3ChkBox(webDriver);
			logger.info("Clicked on Test3 Checkbox");
			test.log(LogStatus.INFO, "Clicked on Test3 Checkbox");
			AdminBoards.clkSaveBtn(webDriver);
			logger.info("Clicked on 'Save' Button");
			test.log(LogStatus.INFO, "Clicked on 'Save' Button");
			test.log(LogStatus.PASS, "Selected Departments,Location & Equipments values ");
			String deptlocations = utilities.captureScreenshot(webDriver, "deptloca");
			test.log(LogStatus.INFO, "Screen Shot is taken " + deptlocations);
			AdminBoards.clkCopyTo(webDriver);
			logger.info("CopyTo field Clicked");
			test.log(LogStatus.INFO, "CopyTo field Clicked");
			AdminBoards.clkChkBox(webDriver);
			logger.info("Clicked on CheckBox");
			test.log(LogStatus.INFO, "Clicked on CheckBox");
			AdminBoards.clkSaveBtn(webDriver);
			logger.info("Clicked on 'Save' Button");
			test.log(LogStatus.INFO, "Clicked on 'Save' Button");
			test.log(LogStatus.PASS, "Selected Copy To value ");
			String copyto = utilities.captureScreenshot(webDriver, "copyto");
			test.log(LogStatus.INFO, "Screen Shot is taken " + copyto);
			AdminBoards.clkAssignTo(driver);
			logger.info("Clicked on Assign To Field");
			test.log(LogStatus.INFO, "Clicked on Assign To Field");
			test.log(LogStatus.PASS, "Selected Assign To value ");
			String AssignTo = utilities.captureScreenshot(webDriver, "Assignto");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AssignTo);
			AdminBoards.fillSubjectFld(webDriver);
			logger.info("Text Entered in to Subject Field");
			AdminBoards.clkDueDateFld(webDriver);
			logger.info("Selected DueDate value");
			AdminBoards.clkCalenderOk(webDriver);
			logger.info("Ok Button in Calender Popup is Clicked");
			test.log(LogStatus.INFO, "Clicked on 'Ok' Button");
			AdminBoards.fillTextFld(webDriver);
			logger.info("Text Field is Filled With Data");
			test.log(LogStatus.INFO, "Text Field is Filled With Data");
			AdminBoards.clkPostaTask(webDriver);
			logger.info("Post a Task Button Clicked");
			test.log(LogStatus.INFO, "Post a Task Button Clicked");
			String converttotask = utilities.captureScreenshot(webDriver, "converttotask");
		} else {
			test.log(LogStatus.INFO, "Convert to Task is not displayed");
		}
		test.log(LogStatus.PASS, "Test case passed");
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

