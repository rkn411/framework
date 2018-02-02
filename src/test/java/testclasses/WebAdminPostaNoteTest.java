package testclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import pageclasses.WebAdminPostaNotePage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Singleton;
import utilities.Utilities;

public class WebAdminPostaNoteTest extends BaseClass {
	static Date dt = new Date();
	static String dateForSubject = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(dt);
	static String taskSubject = "Testing_QA_exampleLocation Subject " + dateForSubject;
	static String noteSubject = "Testing_QA_example for Note Creation" + dateForSubject;
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebAdminPostaNoteTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebAdminPostaNotePage Adminnote = new WebAdminPostaNotePage(webDriver);
	WebAdminLoginPage adminlogin = new WebAdminLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	// constructor
	WebAdminPostaNoteTest() throws Exception {
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
	public void verifyNewNoteWithBlankData() {
		test = utilities.reportsFile("Admin_Verify New Note Functionality with Blank Data");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		adminlogin.login(webDriver);
		Adminnote.clkAlex(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		Adminnote.clkPostaNoteBtn(webDriver);
		test.log(LogStatus.INFO, "Clicked on Post a Note Button ");
		alertMessage = Adminnote.getAlertrMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		String screenshot = utilities.captureScreenshot(webDriver, "alertmessage");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 2)
	public void verifyNewNoteWithValidData() {
		test = utilities.reportsFile("Admin_Verify New Note Functionality With Valid Data");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Adminnote.clkAlex(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		Adminnote.clkDeptLocationTagIcon(webDriver);
		logger.info("Clicked on Department and location Tag ");
		test.log(LogStatus.INFO, "Clicked on Department and location Tag ");
		Adminnote.clkDepartmentsTab(webDriver);
		logger.info("Clicked on Departments Tab");
		test.log(LogStatus.INFO, "Clicked on Departments Tab");
		Adminnote.clkLostandFoundTab(webDriver);
		logger.info("Clicked on Lost&Found Tab ");
		test.log(LogStatus.INFO, "Clicked on Lost&Found Tab ");
		Adminnote.clkFoundChkbox(webDriver);
		logger.info("Clicked on Found Checkbox ");
		test.log(LogStatus.INFO, "Clicked on Found Checkbox ");
		Adminnote.clkLocationsTab(webDriver);
		logger.info("Clicked on Locations Tab");
		test.log(LogStatus.INFO, "Clicked on Locations Tab");
		Adminnote.clkExteriorTab(webDriver);
		logger.info("Clicked on Exterior Tab ");
		test.log(LogStatus.INFO, "Clicked on Exterior Tab ");
		Adminnote.clkContainerChkbox(webDriver);
		logger.info("Clicked on Container Checkbox");
		test.log(LogStatus.INFO, "Clicked on Container Checkbox");
		Adminnote.clkEquipmentTab(webDriver);
		logger.info("Clicked on Equipments Tab ");
		test.log(LogStatus.INFO, "Clicked on Equipments Tab ");
		Adminnote.clkFirstgroupTab(webDriver);
		logger.info("Clicked on Firstgroup Tab ");
		test.log(LogStatus.INFO, "Clicked on Firstgroup Tab ");
		Adminnote.clkTest3chkbox(webDriver);
		logger.info("Clicked on Test3 CheckBox ");
		test.log(LogStatus.INFO, "Clicked on Test3 CheckBox ");
		Adminnote.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		String text = Adminnote.getDeptandLocationText(webDriver);
		test.log(LogStatus.PASS, "Selected Departments,Location & Equipments values are : " + text);
		String deptlocations = utilities.captureScreenshot(webDriver, "deptloca");
		test.log(LogStatus.INFO, "Screen Shot is taken " + deptlocations);
		Adminnote.clkCopyTo(webDriver);
		logger.info("Clicked on Copy To Field");
		test.log(LogStatus.INFO, "Clicked on Copy To Field");
		Adminnote.clkFrontdeskchkbox(webDriver);
		logger.info("Clicked on FrontDesk CheckBox");
		test.log(LogStatus.INFO, "Clicked on FrontDesk CheckBox");
		Adminnote.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		String text1 = Adminnote.getCopyTotext(webDriver);
		test.log(LogStatus.PASS, "Selected Copy To value is : " + text1);
		String copyto = utilities.captureScreenshot(webDriver, "copyto");
		test.log(LogStatus.INFO, "Screen Shot is taken " + copyto);
		Adminnote.enterTextIntoTaskTextBoxFld(webDriver, noteSubject);
		logger.info("TextBox is Filled with Data");
		test.log(LogStatus.INFO, "TextBox is Filled with Data :" + noteSubject);
		String screenshottext = utilities.captureScreenshot(webDriver, "Text");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshottext);
		Adminnote.clkPostaNoteBtn(webDriver);
		logger.info("Clicked on Post a Note Button ");
		test.log(LogStatus.INFO, "Clicked on Post a Note Button ");
		Adminnote.clkFrontDeskTab(webDriver);
		logger.info("Clicked Front Desk Tab in left pane");
		test.log(LogStatus.INFO, "Clicked Front Desk Tab in left pane");
		boolean strverify = Adminnote.postanoteVerification(webDriver, noteSubject, "Note is Created");
		if (strverify == true) {
			test.log(LogStatus.PASS, "Verified Post a Note Functionality ");
			String note = utilities.captureScreenshot(webDriver, "note");
			test.log(LogStatus.INFO, "Screen Shot is taken " + note);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Post a Note Functionality Failed");
		}
		utilities.endReport();
	}
	@Test(priority = 3)
	public void verifyCreateNewTaskFunctionalityWithBlankData() {
		test = utilities.reportsFile("Admin_Verify New Task Functionality with Blank Data");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Adminnote.clkAlex(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex Button");
		Adminnote.clkConverttoTaskBtn(webDriver);
		test.log(LogStatus.INFO, "Clicked on Convert To Task button");
		Adminnote.clkPostaTaskBtn(webDriver);
		logger.info("Clicked on Post a Task Button");
		test.log(LogStatus.INFO, "Clicked on Post a Task Button");
		alertMessage = Adminnote.getAlertrMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		String screenshot = utilities.captureScreenshot(webDriver, "alertmessage");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 4)
	public void verifyCreateNewTaskFunctionalityWithData() {
		test = utilities.reportsFile("Admin_Verify New Task Functionality with Valid Data");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Adminnote.clkDeptLocationTagIcon(webDriver);
		logger.info("Clicked on Department and location Tag ");
		test.log(LogStatus.INFO, "Clicked on Department and location Tag ");
		Adminnote.clkDepartmentsTab(webDriver);
		logger.info("Clicked on Departments Tab");
		test.log(LogStatus.INFO, "Clicked on Departments Tab");
		Adminnote.clkLostandFoundTab(webDriver);
		logger.info("Clicked on Lost&Found Tab ");
		test.log(LogStatus.INFO, "Clicked on Lost&Found Tab ");
		Adminnote.clkFoundChkbox(webDriver);
		logger.info("Clicked on Found Checkbox ");
		test.log(LogStatus.INFO, "Clicked on Found Checkbox ");
		Adminnote.clkLocationsTab(webDriver);
		logger.info("Clicked on Locations Tab");
		test.log(LogStatus.INFO, "Clicked on Locations Tab");
		Adminnote.clkExteriorTab(webDriver);
		logger.info("Clicked on Exterior Tab ");
		test.log(LogStatus.INFO, "Clicked on Exterior Tab ");
		Adminnote.clkContainerChkbox(webDriver);
		logger.info("Clicked on Container Checkbox");
		test.log(LogStatus.INFO, "Clicked on Container Checkbox");
		Adminnote.clkEquipmentTab(webDriver);
		logger.info("Clicked on Equipments Tab ");
		test.log(LogStatus.INFO, "Clicked on Equipments Tab ");
		Adminnote.clkFirstgroupTab(webDriver);
		logger.info("Clicked on Firstgroup Tab ");
		test.log(LogStatus.INFO, "Clicked on Firstgroup Tab ");
		Adminnote.clkTest3chkbox(webDriver);
		logger.info("Clicked on Test3 CheckBox ");
		test.log(LogStatus.INFO, "Clicked on Test3 CheckBox ");
		Adminnote.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		String text = Adminnote.getDeptandLocationText(webDriver);
		test.log(LogStatus.PASS, "Selected Departments,Location & Equipments values are : " + text);
		String deptlocations = utilities.captureScreenshot(webDriver, "deptloca");
		test.log(LogStatus.INFO, "Screen Shot is taken " + deptlocations);
		Adminnote.clkCopyTo(webDriver);
		logger.info("Clicked on Copy To");
		test.log(LogStatus.INFO, "Clicked on Copy To");
		Adminnote.clkFrontdeskchkbox(webDriver);
		logger.info("Clicked on Frontdesk Checkbox");
		test.log(LogStatus.INFO, "Clicked on Frontdesk Checkbox");
		Adminnote.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		String text1 = Adminnote.getCopyTotext(webDriver);
		test.log(LogStatus.PASS, "Selected Copy To value is : " + text1);
		String copyto = utilities.captureScreenshot(webDriver, "copyto");
		test.log(LogStatus.INFO, "Screen Shot is taken " + copyto);
		Adminnote.clkAssignTo(webDriver);
		logger.info("Clicked on Assign To Field");
		test.log(LogStatus.INFO, "Clicked on Assign To Field");
		test.log(LogStatus.INFO, "Selected Name is Displayed in AssignTo Field");
		Adminnote.enterTextinSubjectField(webDriver, taskSubject);
		logger.info("Subject Field is Filled");
		test.log(LogStatus.INFO, "Subject Field is Filled With :" + taskSubject);
		Adminnote.clkDueDateFld(webDriver);
		logger.info("Selected Due Date Value");
		test.log(LogStatus.PASS, "Selected Due Date Value");
		Adminnote.clkCalenderOk(webDriver);
		logger.info("Clicked on 'Ok' Button");
		test.log(LogStatus.INFO, "Clicked on 'Ok' Button");
		Adminnote.enterTextTaskTextBoxFld(webDriver);
		logger.info("TextField is Filled With Data");
		test.log(LogStatus.INFO, "TextField is Filled With Data");
		Adminnote.clkPostaTaskBtn(webDriver);
		logger.info("Clicked on Post a Task Button");
		test.log(LogStatus.INFO, "Clicked on Post a Task Button");
		Adminnote.clkFrontDeskTab(webDriver);
		logger.info("Clicked on Frontdesk tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Frontdesk tab in left pane");
		boolean strverify = Adminnote.postataskVerification(webDriver, taskSubject, "taskmessage");
		if (strverify == true) {
			test.log(LogStatus.PASS, "Admin Post a Note Functionality Verified");
			String note = utilities.captureScreenshot(webDriver, "note");
			test.log(LogStatus.INFO, "Screen Shot is taken " + note);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Admin Post a Note Functionality Failed");
		}
		utilities.endReport();
	}
	@Test(priority = 5)
	public void verifyTodoFunctionalityWithData() throws Exception {
		test = utilities.reportsFile("Admin_Verify To do Functionality");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Adminnote.clkAlex(webDriver);
		Adminnote.clkOverdueBtn(webDriver);
		logger.info("Okay");
		String OverDueCount = Adminnote.gettingTextFromOverDueToDo(webDriver);
		Pattern p = Pattern.compile("(\\d+)");
		Matcher m = p.matcher(OverDueCount);
		while (m.find()) {
			test.log(LogStatus.INFO, "Tasks in the OverDue tweaky are: " + m.group(1));
			logger.info(m.group(1));
		}
	    String FutureCount = Adminnote.gettingTextFromFutureToDo(webDriver);
		Pattern ptr = Pattern.compile("(\\d+)");
		Matcher mchr = ptr.matcher(FutureCount);
		while (mchr.find()) {
			test.log(LogStatus.INFO, "Tasks in the Future tweaky are: " + mchr.group(1));
			logger.info(mchr.group(1));
		}
		Adminnote.verifyCreatedTasks(webDriver, taskSubject, "Task is Created");
		test.log(LogStatus.INFO, "Task is Created :" + taskSubject);
		String screenshottext = utilities.captureScreenshot(webDriver, "ScreenShot");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshottext);
		logger.info("Task is Created");
		test.log(LogStatus.PASS, "Task is Verified :" + taskSubject);
		logger.info("Task is Created");
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
		logger.info("Okay");
	}
	@AfterMethod
	public void result(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test failed");
		}
		utilities.endReport();
	}
	@AfterClass
	public void tearDown() 
	{
		webDriver.quit();
		utilities.endReport();
	}
}
