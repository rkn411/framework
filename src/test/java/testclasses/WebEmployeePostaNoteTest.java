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

import pageclasses.WebEmpLoginPage;
import pageclasses.WebEmpPostaNotePage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Singleton;
import utilities.Utilities;

public class WebEmployeePostaNoteTest extends BaseClass {
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebEmployeePostaNoteTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebEmpPostaNotePage Emppostnote = new WebEmpPostaNotePage(webDriver);
	WebEmpLoginPage emplogin = new WebEmpLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	static Date dt = new Date();
	static String dateForSubject = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(dt);
	static String taskSubject = "Testing_QA_exampleLocation Subject " + dateForSubject;
	static String noteSubject = "Testing_QA_example for Note Creation" + dateForSubject;
	// constructor
	WebEmployeePostaNoteTest() throws Exception {
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
		test = utilities.reportsFile("Employee_Verify New Note Functionality with Blank Data");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		emplogin.employlogin(webDriver);
		Emppostnote.clkEmp1(webDriver);
		logger.info("Clicked on Emp1 Button");
		test.log(LogStatus.INFO, "Clicked on Emp1 Button");
		Emppostnote.clkPostaNoteBtn(webDriver);
		logger.info("Clicked on Post a Note Button");
		test.log(LogStatus.INFO, "Clicked on Post a Note Button");
		alertMessage = Emppostnote.getAlertrMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		String screenshot = utilities.captureScreenshot(webDriver, "alertmessage");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 2)
	public void verifyNewNoteWithValidData() {
		test = utilities.reportsFile("Employee_Verify New Note Functionality With Valid Data");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Emppostnote.clkEmp1(webDriver);
		logger.info("Clicked on Emp1 Button");
		test.log(LogStatus.INFO, "Clicked on Emp1 Button");
    	Emppostnote.clkDeptLocationTagIcon(webDriver);
		logger.info("Clicked on Department and location Tag");
		test.log(LogStatus.INFO, "Clicked on Department and location Tag");
		Emppostnote.clkDepartmentsTab(webDriver);
		logger.info("Clicked on Departments Tab");
		test.log(LogStatus.INFO, "Clicked on Departments Tab");
		Emppostnote.clkLostandFoundTab(webDriver);
		logger.info("Clicked on Lost&Found Tab");
		test.log(LogStatus.INFO, "Clicked on Lost&Found Tab");
		Emppostnote.clkFoundChkbox(webDriver);
		logger.info("Clicked on Found Checkbox");
		test.log(LogStatus.INFO, "Clicked on Found Checkbox");
		Emppostnote.clkLocationsTab(webDriver);
		logger.info("Clicked on Locations Tab");
		test.log(LogStatus.INFO, "Clicked on Locations Tab");
		Emppostnote.clkExteriorTab(webDriver);
		logger.info("Clicked on Exterior Tab");
		test.log(LogStatus.INFO, "Clicked on Exterior Tab");
		Emppostnote.clkContainerChkbox(webDriver);
		logger.info("Clicked on Container Checkbox ");
		test.log(LogStatus.INFO, "Clicked on Container Checkbox");
		Emppostnote.clkEquipment(webDriver);
		logger.info("Clicked on Equipments Tab");
		test.log(LogStatus.INFO, "Clicked on Equipments Tab");
		Emppostnote.clkGroupEquipment(webDriver);
		logger.info("Clicked on Group equipment");
		test.log(LogStatus.INFO, "Clicked on Group equipment");
		Emppostnote.clkGroupEquipmentCheckBox(webDriver);
		Emppostnote.clkSaveBtn(webDriver);
		logger.info("Clicked on Save Button");
		test.log(LogStatus.INFO, "Clicked on Save Button");
		String text = Emppostnote.getDeptandLocationText(webDriver);
		test.log(LogStatus.PASS, "Selected Departments,Location & Equipments values  are : " + text);
		String deptlocations = utilities.captureScreenshot(webDriver, "deptloca");
		test.log(LogStatus.INFO, "Screen Shot is taken " + deptlocations);
		Emppostnote.clkCopyTo(webDriver);
		logger.info("Clicked on Usersicon in Copy To");
		test.log(LogStatus.INFO, "Clicked on Usersicon in Copy To ");
		Emppostnote.clkFrontdeskchkbox(webDriver);
		logger.info("Clicked on Frontdesk checkbox");
		test.log(LogStatus.INFO, "Clicked on Frontdesk checkbox");
		Emppostnote.clkSaveBtn(webDriver);
		logger.info("Clicked on Save Button");
		test.log(LogStatus.INFO, "Clicked on Save Button");
		String text1 = Emppostnote.getCopyTotext(webDriver);
		test.log(LogStatus.PASS, "Selected Copy To value is : " + text1);
		String screenshotcopyto = utilities.captureScreenshot(webDriver, "copyto");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshotcopyto);
		Emppostnote.enterTextIntoTaskTextBoxFld(webDriver, noteSubject);
		logger.info("Textbox Filled with data");
		test.log(LogStatus.INFO, "Textbox Filled with : " + noteSubject);
		String screenshottext = utilities.captureScreenshot(webDriver, "Text");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshottext);
		Emppostnote.clkPostaNoteBtn(webDriver);
		logger.info("CLicked on Post a note Button");
		test.log(LogStatus.INFO, "Clicked on Post a note Button");
		Emppostnote.clkFrontDeskTab(webDriver);
		logger.info("Clicked on Front Desk Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Front Desk Tab in left pane");
		boolean strverify = Emppostnote.postanoteVerification(webDriver, noteSubject, "Note is Created");
		if (strverify == true) {
			test.log(LogStatus.PASS, "Employ Post a Note Functionality Verified");
			String note = utilities.captureScreenshot(webDriver, "note");
			test.log(LogStatus.INFO, "Screen Shot is taken " + note);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Employ Post a Note Functionality Failed");
		}
		utilities.endReport();
	}
	@Test(priority = 3)
	public void verifyCreateNewTaskFunctionalityWithBlankData() {
		test = utilities.reportsFile("Employee_Verify New Task Functionality with Blank Data");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Emppostnote.clkEmp1(webDriver);
		logger.info("Clicked on Alex Button");
		test.log(LogStatus.INFO, "Clicked on Alex button");
		Emppostnote.clkConverttoTaskBtn(webDriver);
		logger.info("Clicked on Convert To Task Button ");
		test.log(LogStatus.INFO, "Clicked on Convert To Task Button");
		Emppostnote.clkPostaTaskBtn(webDriver);
		logger.info("Clicked on Post a Task Button");
		test.log(LogStatus.INFO, "Clicked on Post a Task Button");
		alertMessage = Emppostnote.getAlertrMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		String screenshot = utilities.captureScreenshot(webDriver, "alertmessage");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();
	}
	@Test(priority = 4)
	public void verifyCreateNewTaskFunctionalityWithData() {
		test = utilities.reportsFile("Employee_Verify New Task Functionality with Valid Data");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Emppostnote.clkEmp1(webDriver);
		Emppostnote.clkDeptLocationTagIcon(webDriver);
		logger.info("Clicked on Department and location Tag");
		test.log(LogStatus.INFO, "Clicked on Department and location Tag");
		Emppostnote.clkDepartmentsTab(webDriver);
		logger.info("Clicked on Departments Tab ");
		test.log(LogStatus.INFO, "Clicked on Departments Tab");
		Emppostnote.clkLostandFoundTab(webDriver);
		logger.info("Clicked on Lost&Found Tab");
		test.log(LogStatus.INFO, "Clicked on Lost&Found Tab");
		Emppostnote.clkFoundChkbox(webDriver);
		logger.info("Clicked on Found Checkbox");
		test.log(LogStatus.INFO, "Clicked on Found Checkbox");
		Emppostnote.clkLocationsTab(webDriver);
		logger.info("Clicked on Locations Tab");
		test.log(LogStatus.INFO, "Clicked on Locations Tab");
		Emppostnote.clkExteriorTab(webDriver);
		logger.info("Clicked on Exterior Tab");
		test.log(LogStatus.INFO, "Clicked on Exterior Tab");
		Emppostnote.clkContainerChkbox(webDriver);
		logger.info("Clicked on Container Checkbox");
		test.log(LogStatus.INFO, "Clicked on Container Checkbox");
		Emppostnote.clkEquipment(webDriver);
		logger.info("Clicked on Equipments Tab");
		test.log(LogStatus.INFO, "Clicked on Equipments Tab");
		Emppostnote.clkGroupEquipment(webDriver);
		logger.info("Clicked on Group equipment");
		test.log(LogStatus.INFO, "Clicked on Group equipment");
		Emppostnote.clkGroupEquipmentCheckBox(webDriver);
		Emppostnote.clkSaveBtn(webDriver);
		logger.info("Clicked on Save Button");
		test.log(LogStatus.INFO, "Clicked on Save Button");
		String text = Emppostnote.getDeptandLocationText(webDriver);
		test.log(LogStatus.PASS, "Selected Departments,Location & Equipments values are : " + text);
		String screenshotdept = utilities.captureScreenshot(webDriver, "department&location");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshotdept);
		test.log(LogStatus.PASS, "Selected  Checkboxes are Displayed in Departments&Locations Field ");
		Emppostnote.clkCopyTo(webDriver);
		logger.info("Clicked on Usersicon in Copy To");
		test.log(LogStatus.INFO, "Clicked on Usersicon in Copy To");
		Emppostnote.clkFrontdeskchkbox(webDriver);
		logger.info("Clicked on Frontdesk checkbox  in Users Window");
		test.log(LogStatus.INFO, "Clicked on Frontdesk checkbox  in Users Window");
		Emppostnote.clkSaveBtn(webDriver);
		logger.info("Clicked on Save Button");
		test.log(LogStatus.INFO, "Clicked on Save Button");
		String text1 = Emppostnote.getCopyTotext(webDriver);
		test.log(LogStatus.PASS, "Selected Copy To value is : " + text1);
		String screenshotcopyto = utilities.captureScreenshot(webDriver, "copyto");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshotcopyto);;
		Emppostnote.clkAssignTo(webDriver);
		logger.info("Clicked on Assign to");
		test.log(LogStatus.INFO, "Clicked on Assign to");
		test.log(LogStatus.INFO, "Selected Name is Displayed in AssignTo Field");
		Emppostnote.enterTextinSubjectField(webDriver, taskSubject);
		logger.info("Subject Field is Filled with Text");
		test.log(LogStatus.INFO, "Subject Field is Filled with: " + taskSubject);
		String screenshottext = utilities.captureScreenshot(webDriver, "text");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshottext);
		Emppostnote.clkDueDateFld(webDriver);
		logger.info("Selected Due Date Value");
		test.log(LogStatus.INFO, "Selected Due Date Value");
		Emppostnote.clkCalenderOk(webDriver);
		logger.info("Clicked on Ok Button ");
		test.log(LogStatus.INFO, "Clicked on Ok Button");
		Emppostnote.enterTextTaskTextBoxFld(webDriver);
		logger.info("Textbox Field is Filled with data");
		test.log(LogStatus.INFO, "Textbox Field is Filled with Data");
		Emppostnote.clkPostaTaskBtn(webDriver);
		logger.info("Clicked on Post a Task Button");
		test.log(LogStatus.INFO, "Clicked on Post a Task Button");
		Emppostnote.clkFrontDeskTab(webDriver);
		logger.info("Clicked on Lost and Found");
		test.log(LogStatus.INFO, "Clicked on Lost and Found");
		boolean strverify = Emppostnote.postataskVerification(webDriver, taskSubject, "taskmessage");
		if (strverify == true) {
			test.log(LogStatus.PASS, "Employ Post a Note Functionality Verified");
			String note = utilities.captureScreenshot(webDriver, "note");
			test.log(LogStatus.INFO, "Screen Shot is taken " + note);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Employ Post a Note Functionality Failed");
		}
		utilities.endReport();
	}
	@Test(priority = 5)
	public void verifyTodoFunctionalityWithData() throws Exception {
		test = utilities.reportsFile("Employee_Verify To do Functionality");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Emppostnote.clkEmp1(webDriver);
		Emppostnote.clkOverdueBtn(webDriver);
		logger.info("Okay");
		String OverDueCount = Emppostnote.gettingTextFromOverDueToDo(webDriver);
		Pattern p = Pattern.compile("(\\d+)");
		Matcher m = p.matcher(OverDueCount);
		while (m.find()) {
			test.log(LogStatus.INFO, "Tasks in the OverDue tweaky are: " + m.group(1));
			logger.info(m.group(1));
		}
		String FutureCount = Emppostnote.gettingTextFromFutureToDo(webDriver);
		Pattern ptr = Pattern.compile("(\\d+)");
		Matcher mchr = ptr.matcher(FutureCount);
		while (mchr.find()) {
			test.log(LogStatus.INFO, "Tasks in the Future tweaky are: " + mchr.group(1));
			logger.info(mchr.group(1));
		}
		Emppostnote.verifyCreatedTasks(webDriver, taskSubject, "Task is Created");
		test.log(LogStatus.INFO, "Task is Created" + taskSubject);
		String screenshottext = utilities.captureScreenshot(webDriver, "ScreenShot");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshottext);
		test.log(LogStatus.PASS, "Task is Verified" + taskSubject);
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
	public void tearDown() {
		webDriver.quit();
    	utilities.endReport();
	}
}
