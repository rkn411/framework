package testclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

import pageclasses.IosEmpToDoPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosEmpToDoPageTest extends BaseClass {
	public ExtentTest test;
	public ExtentReports reports;
	ITestResult result;
	Logger logger = Logger.getLogger(IosEmpToDoPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	Utilities utilities = new Utilities();
	IosAdminEmployeeLogin empLogin = new IosAdminEmployeeLogin();
	IosEmpToDoPage empToDo = new IosEmpToDoPage(driver);
	public String OverDueCount;
	public String TodayCount;
	public String FutureCount;
	public String alertMessage;
	public String screenShotName;
	Date dt = new Date();
	String dateForSubject = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(dt);
	String taskSubject = "Testing_QA_exampleLocation Subject " + dateForSubject;

	public IosEmpToDoPageTest() {
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
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void empLogin(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		empLogin.employeeLogin();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void createNewTask(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Employee Create NewTask Functionality");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		empToDo.clkAddBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Add Button");
		empToDo.clkConvertTask(driver, "down");
		test.log(LogStatus.INFO, "Clicked on Convert Task");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		empToDo.clkTaskFromBtn(driver, "up");
		test.log(LogStatus.INFO, "Clicked on Task from button");
		Thread.sleep(8500);
		empToDo.clkTaskFrom_QADeptToggle(driver, "down");
		test.log(LogStatus.INFO, "Clicked on QADept Toggle");
		logger.info("Page is Scrolled down");
		logger.info("Okay");
		empToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		empToDo.clkTask_DeptLctnsBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Dept and Locations Bumtton");
		logger.info("Okay");
		empToDo.clkTask_DeptLctns_FrontDeskBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Front Desk Button");
		logger.info("Okay");
		empToDo.clkTask_DeptLctns_FrontDesk_ADARoomToggle(driver);
		test.log(LogStatus.INFO, "Clicked on ADARoom Toggle");
		logger.info("Okay");
		empToDo.clkTask_LocationsTab(driver);
		test.log(LogStatus.INFO, "Clicked on Locations Tab");
		logger.info("Okay");
		empToDo.clkTask_LocationsTab_RoomsBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Rooms Button");
		logger.info("Okay");
		empToDo.clkTask_LocationsTab_Room2Toggle(driver);
		test.log(LogStatus.INFO, "Clicked on Room2 Toggle");
		logger.info("Okay");
		empToDo.clkTask_Locationstab_Room3Toggle(driver);
		test.log(LogStatus.INFO, "Clicked on Room3 Toggle");
		logger.info("Okay");
		empToDo.clkTask_LocationsTab_Room4Toggle(driver);
		test.log(LogStatus.INFO, "Clicked on Room4 Toggle");
		logger.info("Okay");
		empToDo.clkTask_Eqpmntstab(driver);
		test.log(LogStatus.INFO, "Clicked on Equipments Tab");
		logger.info("Okay");
		empToDo.clkTask_Eqpmtstab_GroupeqpmntToggle(driver);
		test.log(LogStatus.INFO, "Clicked on Groups Button");
		logger.info("Okay");
		empToDo.clkTask_Eqpmtstab_Groupeqpmnt_EQtoggle(driver);
		test.log(LogStatus.INFO, "Clicked on EQ Toggle");
		logger.info("Okay");
		empToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		empToDo.clkTask_CopyToBtn(driver);
		test.log(LogStatus.INFO, "Clicked on CopyTo Button");
		logger.info("Okay");
		empToDo.scrollTask_DownToDeaprtments(driver, "down");
		test.log(LogStatus.INFO, "Scrolled down the screen to enable QA Departments toggle in CopyTo");
		logger.info("Okay");
		empToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		empToDo.clkTask_AssignToBtn(driver);
		test.log(LogStatus.INFO, "Clicked on AssignTo button");
		logger.info("Okay");
		empToDo.scrollTask_DownToDeaprtments(driver, "down");
		test.log(LogStatus.INFO, "Enabled Departments toggle in AssignedTo");
		logger.info("Okay");
		empToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		empToDo.fillTask_SubjectFld(driver, taskSubject);
		test.log(LogStatus.INFO, "Filled the subject field with : " + taskSubject);
		logger.info("Okay");
		Thread.sleep(6300);
		empToDo.datepicker(driver, "down");
		test.log(LogStatus.INFO, "Scrolled down to date picker and selected the date");
		logger.info("Okay");
		empToDo.fillTask_TaskDecriptionFld(driver, cfru.getProperty("TextToTaskDescription"));
		test.log(LogStatus.INFO,"Filled the Taskdescription field with : " + cfru.getProperty("TextToTaskDescription"));
		logger.info("Okay");
		empToDo.clkTask_PostBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Post Button");
		logger.info("Okay");
		alertMessage = empToDo.gettingSuccessMsgText(driver);
		if(alertMessage.contains("Post added successfully")){
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.PASS, "Alert Message is Displaying as : " + alertMessage);
			test.log(LogStatus.PASS, "Test Case is Passed");
			empToDo.clkAlertOkBtn(driver);
			logger.info("Okay");
			}else{
				screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
				test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
				test.log(LogStatus.FAIL, "Alert Message is Displaying as : " + alertMessage);
				test.log(LogStatus.FAIL, "Test Case is Failed");
				empToDo.clkAlertOkBtn(driver);
				logger.info("Okay");
			}
			utilities.endReport();
		utilities.endReport();
		logger.info("Task is created succuessfully");
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyToDo(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		if (alertMessage.contains("Post added successfully")) {
			test = utilities.reportsFile("Verify Employee_ToDo Functionality");
			test.log(LogStatus.INFO, "App is Launched in iPhone");
			empToDo.clkTodoBtn(driver);
			test.log(LogStatus.INFO, "Clicked on ToDo Button");
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			empToDo.clkDeptBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Dept Button");
			logger.info("Okay");
			empToDo.clkOverDueBtn(driver);
			test.log(LogStatus.INFO, "Clicked on OverDue Button");
			logger.info("Okay");
			logger.info("Okay");
			OverDueCount = empToDo.gettingTextFromOverDueToDo(driver);
			Pattern p = Pattern.compile("(\\d+)");
			Matcher m = p.matcher(OverDueCount);
			while (m.find()) {
				test.log(LogStatus.INFO, "Tasks in the OverDue tweaky are: " + m.group(1));
				logger.info(m.group(1));
			}
			TodayCount = empToDo.gettingTextFromTodayToDo(driver);
			Pattern ptrn = Pattern.compile("(\\d+)");
			Matcher mtchr = ptrn.matcher(TodayCount);
			while (mtchr.find()) {
				test.log(LogStatus.INFO, "Tasks in the Today tweaky are: " + mtchr.group(1));
				logger.info(mtchr.group(1));
			}
			FutureCount = empToDo.gettingTextFromFutureToDo(driver);
			Pattern ptr = Pattern.compile("(\\d+)");
			Matcher mchr = ptr.matcher(FutureCount);
			while (mchr.find()) {
				test.log(LogStatus.INFO, "Tasks in the Future tweaky are: " + mchr.group(1));
				logger.info(mchr.group(1));
			}
			empToDo.clkOverDueBtn(driver);
			empToDo.verifyCreatedTasks(driver, taskSubject, "Task is Created");
			test.log(LogStatus.INFO, "Task is verified");
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.PASS, "Test is Passed");
			utilities.endReport();
			logger.info("Okay");
		} else {
			logger.info(alertMessage);
			test.log(LogStatus.INFO, alertMessage);
			test.log(LogStatus.FAIL, "Test is Failed");
			utilities.endReport();
			logger.info("Task is Not Created ");
		}
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void createNewTaskWithBlankData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Employee Create NewTask Functionality with blank data");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		empToDo.clkAddBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Add Button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		empToDo.clkConvertTask(driver, "down");
		test.log(LogStatus.INFO, "Scrolled down the screen for Convert Task Button");
		empToDo.clkTask_PostBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Post Button");
		logger.info("Okay");
		alertMessage = empToDo.gettingSuccessMsgText(driver);
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.INFO, "After completion of task the message is :  " + alertMessage);
		logger.info(alertMessage);
		empToDo.clkAlertOkBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Alert ok Button");
		test.log(LogStatus.PASS, "Test is Passed");
		utilities.endReport();
		}else{
			
		}
	}
	@AfterClass
	public void tearDown() throws Exception {
		driver.closeApp();
	}
}