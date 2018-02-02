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

import pageclasses.IosAdminToDoPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosAdminToDoPageTest extends BaseClass {
	public ExtentTest test;
	public ExtentReports reports;
	ITestResult result;
	Logger logger = Logger.getLogger(IosAdminToDoPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	Utilities utilities = new Utilities();
	IosAdminEmployeeLogin adminLogin = new IosAdminEmployeeLogin();
	IosAdminToDoPage adminToDo = new IosAdminToDoPage(driver);
	public String OverDueCount;
	public String TodayCount;
	public String FutureCount;
	public String displayMessage;
	Date dt = new Date();
	String dateForSubject = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(dt);
	String taskSubject = "Testing_QA_exampleLocation Subject " + dateForSubject;
   public String screenShotName;
	public IosAdminToDoPageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
	//@Parameters("mobilePlatform")
	@BeforeClass
	public void setUp() throws Exception {//String mobilePlatform
		//if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		String ipaPath = utilities.ipaPath();
		Boolean alertStatus = true;
		iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
		logger.info("App is Launched ");
		//}else{
			
		//}
	}
	//@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void adminLogin() throws Exception {//String mobilePlatform
	//	if(mobilePlatform.equalsIgnoreCase("iOS")){
		adminLogin.adminLogin();
		//}else{
			
		//}
	}
	//@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void createNewTask() throws Exception {//String mobilePlatform
		//if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Admin Create NewTask Functionality");
		adminToDo.clkAddBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Add Button");
		adminToDo.clkConvertTask(driver, "down");
		adminToDo.clkTaskFromBtn(driver, "up");
		adminToDo.clkTaskFrom_QADeptToggle(driver, "down");
		test.log(LogStatus.INFO, "Selected a value(qadepartment) from department");
		logger.info("Page is Scrolled down");
		logger.info("Okay");
		adminToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		adminToDo.clkTask_DeptLctnsBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Dept and Locations Button");
		logger.info("Okay");
		adminToDo.clkTask_DeptLctns_FrontDeskBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Front Desk Button");
		logger.info("Okay");
		adminToDo.clkTask_DeptLctns_FrontDesk_ADARoomToggle(driver);
		test.log(LogStatus.INFO, "Clicked on ADARoom Toggle");
		logger.info("Okay");
		adminToDo.clkTask_LocationsTab(driver);
		test.log(LogStatus.INFO, "Clicked on Locations Tab");
		logger.info("Okay");
		adminToDo.clkTask_LocationsTab_RoomsBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Rooms Button");
		logger.info("Okay");
		adminToDo.clkTask_LocationsTab_Room2Toggle(driver);
		test.log(LogStatus.INFO, "Clicked on Room2 Toggle");
		logger.info("Okay");
		adminToDo.clkTask_Locationstab_Room3Toggle(driver);
		test.log(LogStatus.INFO, "Clicked on Room3 Toggle");
		logger.info("Okay");
		adminToDo.clkTask_LocationsTab_Room4Toggle(driver);
		test.log(LogStatus.INFO, "Clicked on Room4 Toggle");
		logger.info("Okay");
		adminToDo.clkTask_Eqpmntstab(driver);
		test.log(LogStatus.INFO, "Clicked on Equipments Tab");
		logger.info("Okay");
		adminToDo.clkTask_Eqpmtstab_GroupeqpmntToggle(driver);
		test.log(LogStatus.INFO, "Clicked on Groups Button");
		logger.info("Okay");
		adminToDo.clkTask_Eqpmtstab_Groupeqpmnt_EQtoggle(driver);
		test.log(LogStatus.INFO, "Clicked on EQ Toggle");
		logger.info("Okay");
		adminToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		adminToDo.clkTask_CopyToBtn(driver);
		test.log(LogStatus.INFO, "Clicked on CopyTo Button");
		logger.info("Okay");
		adminToDo.scrollTask_DownToDeaprtments(driver, "down");
		test.log(LogStatus.INFO, "Scrolled down the screen to enable QA Departments toggle in CopyTo");
		logger.info("Okay");
		adminToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		adminToDo.clkTask_AssignToBtn(driver);
		test.log(LogStatus.INFO, "Clicked on AssignTo button");
		logger.info("Okay");
		adminToDo.scrollTask_DownToDeaprtments(driver, "down");
		test.log(LogStatus.INFO, "Scrolled down the screen to enable Departments toggle in AssignedTo");
		logger.info("Okay");
		adminToDo.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		adminToDo.fillTask_SubjectFld(driver, taskSubject);
		test.log(LogStatus.INFO, "Filled the subject field with : " + taskSubject);
		logger.info("Okay");
		adminToDo.datepicker(driver, "down");
		logger.info("Okay");
		adminToDo.fillTask_TaskDecriptionFld(driver, cfru.getProperty("TextToTaskDescription"));
		test.log(LogStatus.INFO,"Filled the Taskdescription field with : " + cfru.getProperty("TextToTaskDescription"));
		logger.info("Okay");
		adminToDo.clkTask_PostBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Post Button");
		logger.info("Okay");
		displayMessage = adminToDo.gettingSuccessMsgText(driver);
		test.log(LogStatus.INFO, "After completion of task the message is :  " + displayMessage);
		logger.info(displayMessage);
		adminToDo.clkAlertOkBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Alert ok Button");
		test.log(LogStatus.PASS, "Test is Passed");
		utilities.endReport();
		logger.info("Task is created succuessfully");
	//	}else{
			
	//	}
	}
//	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyToDo() throws Exception {//String mobilePlatform
	//	if(mobilePlatform.equalsIgnoreCase("iOS")){
		if (displayMessage.contains("Post added successfully")) {
			test = utilities.reportsFile("Verify Admin_ToDo Functionality");
			adminToDo.clkTodoBtn(driver);
			test.log(LogStatus.INFO, "Clicked on ToDo Button");
			logger.info("Okay");
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			adminToDo.clkDeptBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Dept Button");
			logger.info("Okay");
			adminToDo.clkOverDueBtn(driver);
			test.log(LogStatus.INFO, "Clicked on OverDue Button");
			logger.info("Okay");
			logger.info("Okay");
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			OverDueCount = adminToDo.gettingTextFromOverDueToDo(driver);
			Pattern p = Pattern.compile("(\\d+)");
			Matcher m = p.matcher(OverDueCount);
			while (m.find()) {
				test.log(LogStatus.INFO, "Tasks in the OverDue tweaky are: " + m.group(1));
				logger.info(m.group(1));
			}
			TodayCount = adminToDo.gettingTextFromTodayToDo(driver);
			Pattern ptrn = Pattern.compile("(\\d+)");
			Matcher mtchr = ptrn.matcher(TodayCount);
			while (mtchr.find()) {
				test.log(LogStatus.INFO, "Tasks in the Today tweaky are: " + mtchr.group(1));
				logger.info(mtchr.group(1));
			}
			FutureCount = adminToDo.gettingTextFromFutureToDo(driver);
			Pattern ptr = Pattern.compile("(\\d+)");
			Matcher mchr = ptr.matcher(FutureCount);
			while (mchr.find()) {
				test.log(LogStatus.INFO, "Tasks in the Future tweaky are: " + mchr.group(1));
				logger.info(mchr.group(1));
			}
			adminToDo.clkOverDueBtn(driver);
			adminToDo.verifyCreatedTasks(driver, taskSubject, "Task is Created :"+taskSubject);
			test.log(LogStatus.INFO, "Task is verified : "+taskSubject);
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
			logger.info("Okay");
		} else {
			logger.info(displayMessage);
			test.log(LogStatus.INFO, displayMessage);
			test.log(LogStatus.FAIL, "Testcase is Failed");
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			utilities.endReport();
			logger.info("Task is Not Created");
		}
	//	}else{
			
		//}
	}
	@AfterClass
	public void tearDown() throws Exception {
		driver.closeApp();
	}
}
