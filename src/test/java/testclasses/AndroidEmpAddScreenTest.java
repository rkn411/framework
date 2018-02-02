package testclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageclasses.AndroidEmpAddScreen;
import pageclasses.AndroidEmpTodoScreen;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidEmpAddScreenTest extends utilities.BaseClass {

	Logger logger = Logger.getLogger(AndroidEmpAddScreenTest.class);
	// create object for emp add page
	AndroidEmpAddScreen empAdd = new AndroidEmpAddScreen(driver);
	// create object for emp login page
	AndroidEmpTodoScreen empTodo = new AndroidEmpTodoScreen(driver);
	// create object for configfile property
	ConfigFileUtility configfile = new ConfigFileUtility();
	// Android version
	int version = 10;
	ExtentTest test;
	Utilities utilities=new Utilities();
	DesiredCapabilities caps;
	public String screenShot;

	static Date dt = new Date();
	static String dateForSubject = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(dt);
	static String taskSubject = "Testing_QA_exampleLocation Subject " + dateForSubject;
	public String alertMessage = null;

	// Constructor and Load the Config file and log4j.
	AndroidEmpAddScreenTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		configfile.loadPropertyFile();
	}
	@Parameters("platform")
	@BeforeClass
	public void launchApplication(String platform) throws Exception {
		if (platform.equalsIgnoreCase("android")) {
			//service.start();
			androidMobileNativeAppCapabilities(version);
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void VerifyNoteFunctionalitywithBlankData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Note Functionality With Blank Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empAdd.clkAddBtn(driver);
			test.log(LogStatus.INFO, "Add Button clicked");
			empAdd.clkPostBtn(driver);
			test.log(LogStatus.INFO, "Post  Button clicked");
			String alertMessage = empAdd.getAlertMessage(driver);
			String strerrormsg = empAdd.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				empAdd.clkOKButton(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Alert pop up not displayed Message");
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				empAdd.clkOKButton(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
		} else {
			System.out.println("Not an Android");
		}
	}
    @Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void VerifyNoteWithValiddata(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Note Functionality With Valid Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empAdd.clkAddBtn(driver);
			test.log(LogStatus.INFO, "Add Button clicked");
			empAdd.clkNoteFrom(driver);
			test.log(LogStatus.INFO, "NoteFrom Clicked");
			empAdd.clkToggle(driver);
			test.log(LogStatus.INFO, "Toggle clicked");
			empAdd.clkCancelbtn(driver);
			test.log(LogStatus.INFO, "Cancel Button Clicked");
			empAdd.clkNoteFrom(driver);
			test.log(LogStatus.INFO, "NoteFrom Clicked");
			empAdd.clkToggle(driver);
			test.log(LogStatus.INFO, " Toggle clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button Clicked");
			empAdd.clkDeptandLocationtags(driver);
			test.log(LogStatus.INFO, "Departments and Locations Tags Clicked");
			empAdd.clkDepartmentBtn(driver);
			test.log(LogStatus.INFO, "Departments Button Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkBathCounterToggle(driver);
			test.log(LogStatus.INFO, "BathCounter Toggle Clicked");
			empAdd.clkBAthMatToggle(driver);
			test.log(LogStatus.INFO, "BathMat Toggle Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Locations button Clicked");
			empAdd.clkGuestAreasBtn(driver);
			test.log(LogStatus.INFO, "GuestAreasButton Clicked");
			empAdd.clkBarToggle(driver);
			test.log(LogStatus.INFO, "Bar Toggle Clicked");
			empAdd.clkBoardRoomToggle(driver);
			test.log(LogStatus.INFO, "BoardRoom Toggle Clicked");
			empAdd.clkEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button Clicked");
			empAdd.clkGroupEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Group Equipments Button Clicked");
			empAdd.clkEq1Toggle(driver);
			test.log(LogStatus.INFO, "Eq1Toggle Clicked");
			empAdd.clkEq2Toggle(driver);
			test.log(LogStatus.INFO, "Eq2Toggle Clicked");
			empAdd.clkGroupEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Group Equipments Button Clicked");
			empAdd.clkCancelbtn(driver);
			test.log(LogStatus.INFO, "Cancel Button Clicked");
			test.log(LogStatus.INFO, "Verified  Department & Location Tags By Selecting Data With 'Cancel' Button");
			empAdd.clkDeptandLocationtags(driver);
			test.log(LogStatus.INFO, "Departments and Locations Tags Clicked");
			empAdd.clkDepartmentBtn(driver);
			test.log(LogStatus.INFO, "Departments Button Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkBathCounterToggle(driver);
			test.log(LogStatus.INFO, "BathCounter Toggle Clicked");
			empAdd.clkBAthMatToggle(driver);
			test.log(LogStatus.INFO, "BathMat Toggle Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Locations button Clicked");
			empAdd.clkGuestAreasBtn(driver);
			test.log(LogStatus.INFO, "GuestAreasButton Clicked");
			empAdd.clkBarToggle(driver);
			test.log(LogStatus.INFO, "Bar Toggle Clicked");
			empAdd.clkBoardRoomToggle(driver);
			test.log(LogStatus.INFO, "BoardRoom Toggle Clicked");
			empAdd.clkEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button Clicked");
			empAdd.clkGroupEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Group Equipments Button Clicked");
			empAdd.clkEq1Toggle(driver);
			test.log(LogStatus.INFO, "Eq1Toggle Clicked");
			empAdd.clkEq2Toggle(driver);
			test.log(LogStatus.INFO, "Eq2Toggle Clicked");
			empAdd.clkGroupEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Group Equipments Button Clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button Clicked");
			String strverify = empAdd.deptverification(driver);
            if (strverify.equalsIgnoreCase("pass")) {
                test.log(LogStatus.PASS,"Verified Toggles Count Is Displayed In Department & Location Tags With 'Save' Button");
            } else {
                test.log(LogStatus.FAIL,"Verified Toggles Count Is Not Displayed In Department & Location Tags With 'Save' Button");
            }
			empAdd.clkCopyToBtn(driver);
			test.log(LogStatus.INFO, "CopyTo Button Clicked");
			empAdd.clkCancelbtn(driver);
			test.log(LogStatus.INFO, "Cancel Button Clicked");
			empAdd.clkCopyToBtn(driver);
			test.log(LogStatus.INFO, "CopyTo Button Clicked");
			empAdd.clkCourtneyToggle(driver);
			test.log(LogStatus.INFO, "Courtney Toggle Clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button Clicked");
			test.log(LogStatus.PASS, "Selected Toggles Count Is Displayed In Copy To With 'Save' Button");
			empAdd.clkGuestComplaintToggle(driver);
			test.log(LogStatus.INFO, "Guest Complaint Toggle Clicked");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empAdd.EntertextNote(driver);
			test.log(LogStatus.INFO, "Note Entered");
			empAdd.clkPostBtn(driver);
			test.log(LogStatus.INFO, "Post Button Clicked");
			String alertMessage = empAdd.getAlertMessage(driver);
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empAdd.clkOKButton(driver);
			test.log(LogStatus.INFO, "OK Button Clicked");
			test.log(LogStatus.PASS, "Verified Note Functionality with Validdata");
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void NewTAskFunctionalitywithblankData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify New Task  Functionality With Blank Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empAdd.clkBoardsBtn(driver);
			test.log(LogStatus.INFO, "Boards Button clicked");
			empAdd.clkAddBtn(driver);
			test.log(LogStatus.INFO, "Add Button clicked");
			empAdd.clkConvertToTaskLnk(driver);
			test.log(LogStatus.INFO, "Convert to Task link Clicked");
			empAdd.clkPostBtn(driver);
			String alertMessage = empAdd.getAlertMessage(driver);
			String strerrormsg = empAdd.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				empAdd.clkOKButton(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Alert pop up not displayed Message");
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				empAdd.clkOKButton(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void NewTAskFunctionalitywithValidData(String platform) throws Exception {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify New Task With Valid Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empAdd.clkDueDateFld(driver);
			test.log(LogStatus.INFO, "Clicking on Due Date Field");
			empAdd.clkMonthIcon(driver);
			test.log(LogStatus.INFO, "Clicking on Month Icon");
			empAdd.clkMonthIcon(driver);
			test.log(LogStatus.INFO, "Clicking on Month Icon");
			empAdd.clkDateIcon(driver);
			test.log(LogStatus.INFO, "Selecting Date");
			empAdd.clkCalenderOkBtn(driver);
			test.log(LogStatus.INFO, "Ok Button");
			empAdd.clkClockOkBtn(driver);
			test.log(LogStatus.INFO, "Ok Button");
			empAdd.clkTaskFrom(driver);
			test.log(LogStatus.INFO, "Task From Button is Clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button is Clicked");
			empAdd.clkTaskFrom(driver);
			test.log(LogStatus.INFO, "Task From Button is Clicked");
			empAdd.clkToggle(driver);
			test.log(LogStatus.INFO, "Housekeeping Toggle clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button is Clicked");
			empAdd.clkDeptandLocationtags(driver);
			test.log(LogStatus.INFO, "Department & Location Tags is clicked");
			empAdd.clkDepartmentBtn(driver);
			test.log(LogStatus.INFO, "Departments Button Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkBathCounterToggle(driver);
			test.log(LogStatus.INFO, "BathCounter Toggle Clicked");
			empAdd.clkBAthMatToggle(driver);
			test.log(LogStatus.INFO, "BathMat Toggle Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Locations button Clicked");
			empAdd.clkGuestAreasBtn(driver);
			test.log(LogStatus.INFO, "GuestAreasButton Clicked");
			empAdd.clkBarToggle(driver);
			test.log(LogStatus.INFO, "Bar Toggle Clicked");
			empAdd.clkBoardRoomToggle(driver);
			test.log(LogStatus.INFO, "BoardRoom Toggle Clicked");
			empAdd.clkEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button Clicked");
			empAdd.clkGroupEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Group Equipments Button Clicked");
			empAdd.clkEq1Toggle(driver);
			test.log(LogStatus.INFO, "Eq1Toggle Clicked");
			empAdd.clkEq2Toggle(driver);
			test.log(LogStatus.INFO, "Eq2Toggle Clicked");
			empAdd.clkGroupEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Group Equipments Button Clicked");
			empAdd.clkCancelbtn(driver);
			test.log(LogStatus.INFO, "Cancel Button Clicked");
			test.log(LogStatus.INFO, "Verified  Department & Location Tags By Selecting Data With 'Cancel' Button");
			empAdd.clkDeptandLocationtags(driver);
			test.log(LogStatus.INFO, "Departments and Locations Tags Clicked");
			empAdd.clkDepartmentBtn(driver);
			test.log(LogStatus.INFO, "Departments Button Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkBathCounterToggle(driver);
			test.log(LogStatus.INFO, "BathCounter Toggle Clicked");
			empAdd.clkBAthMatToggle(driver);
			test.log(LogStatus.INFO, "BathMat Toggle Clicked");
			empAdd.clkHousekeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Button Clicked");
			empAdd.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Locations button Clicked");
			empAdd.clkGuestAreasBtn(driver);
			test.log(LogStatus.INFO, "GuestAreasButton Clicked");
			empAdd.clkBarToggle(driver);
			test.log(LogStatus.INFO, "Bar Toggle Clicked");
			empAdd.clkBoardRoomToggle(driver);
			test.log(LogStatus.INFO, "BoardRoom Toggle Clicked");
			empAdd.clkEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button Clicked");
			empAdd.clkGroupEquipmentsBtn(driver);
			test.log(LogStatus.INFO, "Group Equipments Button Clicked");
			empAdd.clkEq1Toggle(driver);
			test.log(LogStatus.INFO, "Eq1Toggle Clicked");
			empAdd.clkEq2Toggle(driver);
			test.log(LogStatus.INFO, "Eq2Toggle Clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button Clicked");
			String strverify = empAdd.deptverification(driver);
            if (strverify.equalsIgnoreCase("pass")) {
                test.log(LogStatus.PASS,"Verified Toggles Count Is Displayed In Department & Location Tags With 'Save' Button");
            } else {
                test.log(LogStatus.FAIL,"Verified Toggles Count Is Not Displayed In Department & Location Tags With 'Save' Button");
            }
			empAdd.clkCopyToBtn(driver);
			test.log(LogStatus.INFO, "CopyTo Button Clicked");
			empAdd.clkCancelbtn(driver);
			test.log(LogStatus.INFO, "Cancel Button Clicked");
			empAdd.clkCopyToBtn(driver);
			test.log(LogStatus.INFO, "CopyTo Button Clicked");
			empAdd.clkCourtneyToggle(driver);
			test.log(LogStatus.INFO, "CopyTo Button Clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button Clicked");
			empAdd.clkGuestComplaintToggle(driver);
			test.log(LogStatus.INFO, "Guest Complaint Toggle Clicked");
			empAdd.clkAsignTo(driver);
			test.log(LogStatus.INFO, "Click Assign To Clicked");
			empTodo.clkEmp1Toggle(driver);
			test.log(LogStatus.INFO, "Emp1 Toggle Clicked");
			empAdd.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Save Button Clicked");
			test.log(LogStatus.INFO, "Clicked on Save Button");
			test.log(LogStatus.INFO, "Selected Toggles Count Is Displayed In Copy To & Assign To With 'Save' Button");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empAdd.EnterTextInSubject(driver, taskSubject);
			test.log(LogStatus.INFO, "Note Entered");
			key(driver);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empAdd.EnterTextInTaskDescription(driver);
			test.log(LogStatus.INFO, " Text Entered Into Task Description Field");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empAdd.clkPostBtn(driver);
			alertMessage = empAdd.PostSuccessMessage(driver);
			if (alertMessage.contains("Post added successfully")) {
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				empAdd.clkOKButton(driver);
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Alert Popup Message Not Displayed");
				empAdd.clkOKButton(driver);
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void todoScreenFunctionality(String platform) throws Exception {
		if (platform.equalsIgnoreCase("android")) {
			if (alertMessage.contains("Post added successfully")) {
				test =utilities.reportsFile("Employee_Verify Todo Screen Functionality");
				test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
				empTodo.clkTodoBtn(driver);
				empTodo.clkHotelBtn(driver);
				empTodo.clkOverDueBtn(driver);
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				String overDueCount = empTodo.getOverDueTaskCount(driver);
				Pattern p = Pattern.compile("(\\d+)");
				Matcher m = p.matcher(overDueCount);
				while (m.find()) {
					test.log(LogStatus.INFO, "Tasks in the OverDue tweaky are: " + m.group(1));
					logger.info(m.group(1));
				}
				String todayCount = empTodo.getTodayTaskCount(driver);
				Pattern ptrn = Pattern.compile("(\\d+)");
				Matcher mtchr = ptrn.matcher(todayCount);
				while (mtchr.find()) {
					test.log(LogStatus.INFO, "Tasks in the Today tweaky are: " + mtchr.group(1));
					logger.info(mtchr.group(1));
				}
				String futureCount = empTodo.getFutureTaskCount(driver);
				Pattern ptr = Pattern.compile("(\\d+)");
				Matcher mchr = ptr.matcher(futureCount);
				while (mchr.find()) {
					test.log(LogStatus.INFO, "Tasks in the Future tweaky are: " + mchr.group(1));
					logger.info(mchr.group(1));
				}
				empTodo.clkFeatureBtn(driver, taskSubject);
				test.log(LogStatus.PASS, "Task is Verified");
				test.log(LogStatus.PASS, "Testcase is Passed");
				utilities.endReport();
			}
		} else {
			System.out.println("Not an Android");
		}
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
		driver.closeApp();
	}

}

