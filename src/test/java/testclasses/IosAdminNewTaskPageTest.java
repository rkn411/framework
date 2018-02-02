package testclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageclasses.IosNewNotePage;
import pageclasses.IosNewTaskPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosAdminNewTaskPageTest extends BaseClass {
	ExtentTest test;
	ITestResult result;
	Logger logger = Logger.getLogger(IosAdminNewTaskPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosNewTaskPage newTask = new IosNewTaskPage(driver);
	IosNewNotePage newNote = new IosNewNotePage(driver);
	IosAdminEmployeeLogin login = new IosAdminEmployeeLogin();
	Utilities utilities = new Utilities();
	public String alertMessage;
	public String screenShotName;

	IosAdminNewTaskPageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
//	@Parameters("mobilePaltform")
	@BeforeClass
	public void setUp() throws Exception {//String mobilePlatform
	//	if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		String ipaPath = utilities.ipaPath();
		Boolean alertStatus = false;
		iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
		logger.info("App is Launched");
		//}else{
			
		//}
	}
//	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void newTaskCreatewithInvalidData() throws Exception {//String mobilePlatform
	//	if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Admin_New Task Creation with Valid data");
		newNote.clkADDSymbol(driver);
		test.log(LogStatus.INFO, "Clicked on Add Button");
		logger.info("Clicked on ADD symbol");
		newTask.clkConvertTask(driver, "down");
		test.log(LogStatus.INFO, "Clicked on Convert Task");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		newTask.clkTaskFromBtn(driver, "up");
		test.log(LogStatus.INFO, "Clicked on TaskFrom Button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		newNote.clkDptDptValueToggle(driver);
		test.log(LogStatus.INFO, "Department Toggle is Enabled");
		logger.info("Okay");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on Save Button");
		logger.info("Okay");
		newNote.clkDptValueToggle(driver);
		test.log(LogStatus.INFO, "Clicked on Dept and Locations button");
		logger.info("Okay");
		newNote.clkDptTab(driver);
		test.log(LogStatus.INFO, "Clicked on Front Desk in Departments Tab");
		logger.info("Clicked deportment tab");
		newNote.clkFrontEndDesk(driver);
		test.log(LogStatus.INFO, "Clicked on Toggle from Front Desk ");
		logger.info("Clicked front end desk");
		newNote.locationTab(driver);
		test.log(LogStatus.INFO, "Clicked on Locations Tab");
		logger.info("Okay");
		newNote.clkLocation(driver);
		test.log(LogStatus.INFO, "Clicked on Rooms in Locations Tab");
		logger.info("Okay");
		newNote.clkLocation_Und(driver);
		test.log(LogStatus.INFO, "Clicked on Toggle from Rooms List");
		logger.info("okay");
		newNote.clkEquipmnetTab(driver);
		test.log(LogStatus.INFO, "Clicked on Equipments Tab");
		logger.info("Okay");
		newNote.clkEquipmnetTabFirstGrp(driver);
		test.log(LogStatus.INFO, "Clicked on First Group");
		logger.info("Clicked equipment first tab");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on save button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		logger.info("Okay");
		newNote.clkCopyTo(driver);
		test.log(LogStatus.INFO, "Clicked on CopyTo button");
		logger.info("okay");
		newNote.clkCpoyToValue(driver);
		test.log(LogStatus.INFO, "Clicked on Toggle in CopyTo");
		logger.info("Okay");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on save button");
		logger.info("okay");
		newNote.clkGuestComplaint(driver);
		test.log(LogStatus.INFO, "Clicked on Guest Complaint button");
		logger.info("Okay");
		newTask.clkAssignTo(driver);
		test.log(LogStatus.INFO, "Clicked on AssignTo button");
		logger.info("Okay");
		newTask.clkToggleSwtchUndrEmp(driver);
		test.log(LogStatus.INFO, "Clicked on Toogle in Assign To");
		logger.info("Okay");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked on save button");
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		newTask.fillSubjectTxtBox(driver, cfru.getProperty("TextToSubjectField"));
		test.log(LogStatus.INFO, "Filled the subject field with Subject : "+cfru.getProperty("TextToSubjectField"));
		newTask.scrollDownTODue(driver);
		logger.info("Okay");
		newTask.selectDate(driver);
		logger.info("Okay");
		newTask.fillTaskDscrptonTxtBox(driver, cfru.getProperty("TextToTaskDescription"));
		test.log(LogStatus.INFO, "Filled the Task Description Field : "+cfru.getProperty("TextToTaskDescription"));
		logger.info("Okay");
		newNote.clkPost(driver);
		test.log(LogStatus.INFO, "Clicked on Post button");
		alertMessage = newTask.alertMessage(driver);
		logger.info(alertMessage);
		if(alertMessage.contains("Post added successfully")){
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Alert pop up Displayed a message as : " + alertMessage);
		test.log(LogStatus.PASS, "Test Case is Passed");
		newTask.clkAlertOk(driver);
		logger.info("Okay");
		}else{
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.FAIL, "Alert pop up Displayed a message as : " + alertMessage);
			test.log(LogStatus.FAIL, "Test Case is Failed");
			newTask.clkAlertOk(driver);
			logger.info("Okay");
		}
		utilities.endReport();
	//	}else{
			
	//	}
	}
	//@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void newTaskCreateWithValidData() throws Exception {//String mobilePlatform
		//if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Admin_New Task Creation with Invalid data");
		login.adminLogin();
		newNote.clkADDSymbol(driver);
		test.log(LogStatus.INFO, "Clicked on Add Button");
		logger.info("Clicked ADD symbol");
		newTask.clkConvertTask(driver, "down");
		test.log(LogStatus.INFO, "Clicked on Convert Task");
		logger.info("Okay");
		newNote.clkPost(driver);
		test.log(LogStatus.INFO, "Clicked on Post button");
		alertMessage = newTask.alertMessage(driver);
		logger.info(alertMessage);
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Alert pop up Displayed a message as : " + alertMessage);
		test.log(LogStatus.PASS, "Test Case is Passed");
		newTask.clkAlertOk(driver);
		logger.info("Okay");
		utilities.endReport();
		//}else{
			
		//}
	}
	@AfterClass
	public void tearDown() {
		driver.closeApp();
	}
}