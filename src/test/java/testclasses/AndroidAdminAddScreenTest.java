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

import pageclasses.AndroidAdminAddScreen;
import pageclasses.AndroidAdminBoardsScreen;
import pageclasses.AndroidAdminTodoScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidAdminAddScreenTest extends BaseClass {

	ITestResult result;
	ExtentTest test;
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidAdminAddScreenTest.class);
	AndroidAdminBoardsScreen adminBoards = new AndroidAdminBoardsScreen(driver);
	// create object for Add Screen class
	AndroidAdminAddScreen adminAdd = new AndroidAdminAddScreen(driver);
	// create object for navigationsPageObjects class
	ConfigFileUtility configfile = new ConfigFileUtility();
	AndroidAdminTodoScreen adminTodo = new AndroidAdminTodoScreen(driver);
	Utilities utilities=new Utilities();
	// create variable version as integer
	int version = 11;
	public String screenShot;
	static Date dt = new Date();
	static String dateForSubject = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(dt);
	static String taskSubject = "Testing_QA_exampleLocation Subject " + dateForSubject;
	public String alertMessage = null;
	DesiredCapabilities caps;

	// constructor
	AndroidAdminAddScreenTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		configfile.loadPropertyFile();
	}
	@Parameters("platform")
	@BeforeClass
	public void launchApplication(String platform) throws Exception {
		if (platform.equalsIgnoreCase("android")) {
			androidMobileNativeAppCapabilities(version);
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyNewNoteWithBlankValues(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify New Note Functionality With Blank Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminAdd.clkAddBtn(driver);
			test.log(LogStatus.INFO, "Add Button is Clicked");
			adminAdd.clkPostBtn(driver);
			String alertMessage = adminAdd.getAlertMessage(driver);
			String strerrormsg = adminAdd.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				adminAdd.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Alert pop up not displayed Message");
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				adminAdd.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyNewNoteWithValidData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify New Note Functionality With Valid Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminAdd.clkNoteFromBtn(driver);
			test.log(LogStatus.INFO, "Note From Button is Clicked");
			adminAdd.clkDepartmentsBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Toogle is Selected");
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			adminBoards.clkDeptAndLocationsBtn(driver);
			test.log(LogStatus.INFO, "Department & Location Tags is clicked");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is opened");
			adminBoards.clkToggle1(driver);
			test.log(LogStatus.INFO, "911 toggle is selected");
			adminBoards.clkToggle2(driver);
			test.log(LogStatus.INFO, "ADAroom toggle is selected");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is Closed");
			adminBoards.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Loations* Button is Clicked");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Opened");
			adminBoards.clkRoomToggle1(driver);
			test.log(LogStatus.INFO, "Room101 Toggle is Selected");
			adminBoards.clkRoomToggle2(driver);
			test.log(LogStatus.INFO, "Room102 Toggle is Selected");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Closed");
			adminBoards.clkEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button is Clicked");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Opened");
			adminBoards.clkTest3Toggle(driver);
			test.log(LogStatus.INFO, "Test3 Toggle is Selected");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Closed");
			adminBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			test.log(LogStatus.INFO, "Verified  Department & Location Tags By Selecting Data With 'Cancel' Button");
			adminBoards.clkDeptAndLocationsBtn(driver);
			test.log(LogStatus.INFO, "Department & Location Tags is clicked");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is opened");
			adminBoards.clkToggle1(driver);
			test.log(LogStatus.INFO, "911 toggle is selected");
			adminBoards.clkToggle2(driver);
			test.log(LogStatus.INFO, "ADAroom toggle is selected");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is Closed");
			adminBoards.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Loations* Button is Clicked");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Opened");
			adminBoards.clkRoomToggle1(driver);
			test.log(LogStatus.INFO, "Room101 Toggle is Selected");
			adminBoards.clkRoomToggle2(driver);
			test.log(LogStatus.INFO, "Room102 Toggle is Selected");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Closed");
			adminBoards.clkEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button is Clicked");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Opened");
			adminBoards.clkTest3Toggle(driver);
			test.log(LogStatus.INFO, "Test3 Toggle is Selected");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Closed");
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			String strverify = adminBoards.verification(driver);
            if (strverify.equalsIgnoreCase("pass")) {
                test.log(LogStatus.PASS,"Verified Toggles Count Is Displayed In Department & Location Tags With 'Save' Button");
            } else {
                test.log(LogStatus.FAIL,"Verified Toggles Count Is Not Displayed In Department & Location Tags With 'Save' Button");
            }
			adminBoards.clkCopyToBTn(driver);
			test.log(LogStatus.INFO, "CopyTo Button is Clicked");
			adminBoards.clkAdminHotelToggle(driver);
			test.log(LogStatus.INFO, "Somu Nookal Toggle is Clicked");
			adminBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			adminBoards.clkCopyToBTn(driver);
			test.log(LogStatus.INFO, "CopyTo Button is Clicked");
			adminBoards.clkAdminHotelToggle(driver);
			test.log(LogStatus.INFO, "Somu Nookal Toggle is Clicked");
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			test.log(LogStatus.INFO, "Selected Toggles Count Is Displayed In Copy To With 'Save' Button");
			adminAdd.clkGuestComplaintToggle(driver);
			test.log(LogStatus.INFO, "Guest Complaint Toggle is Selected");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminAdd.clkNoteFld(driver);
			test.log(LogStatus.INFO, "Entertig Text Into Note Field");
			key(driver);
			adminAdd.clkPostBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Post Button");
			String alertMessage = adminAdd.getAlertMessage(driver);
			String strerrormsg = adminAdd.verification(driver);
            if(strerrormsg.equalsIgnoreCase("pass")){
			test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminAdd.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
            }else{
            	test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
    			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
    			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
    			adminAdd.clkOkBtn(driver);
    			test.log(LogStatus.INFO, "Clicked on Ok Button");
    			test.log(LogStatus.FAIL, "Testcase is Failed");
    			utilities.endReport();
            }
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyNewTaskFunctionalityWithBlankData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify New Task Functionality With Blank Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminBoards.clkBoardsBtn(driver);
			test.log(LogStatus.INFO, "Boards Button clicked");
			adminAdd.clkAddBtn(driver);
			adminAdd.clkConvertToTaskTxt(driver);
			test.log(LogStatus.INFO, "Convert To Task Link is Clicked");
			adminAdd.clkPostBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Post Button");
			String alertMessage= adminAdd.getAlertMessage(driver);
			String strerrormsg = adminAdd.verification(driver);
			if (strerrormsg.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				adminAdd.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Alert pop up not displayed a message as : " + alertMessage);
				screenShot = utilities.captureScreenshot(driver, "ScreenShot");
				adminAdd.clkOkBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Ok Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyNewTaskFunctionalityWithValidData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify New Task With Valid Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminTodo.clkDueDateFld(driver);
			test.log(LogStatus.INFO, "Clicked on Due Date Field");
			adminBoards.clkMonthIcon(driver);
			test.log(LogStatus.INFO, "Clicked on Month Icon");
			adminBoards.clkDateIcon(driver);
			test.log(LogStatus.INFO, "Selecting Date");
			adminBoards.clkCalenderOkBtn(driver);
			adminBoards.clkClockOkBtn(driver);
			adminTodo.clkTaskFrom(driver);
			test.log(LogStatus.INFO, "Task From Button is Clicked");
			adminTodo.clkDepartmentsBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Togggle is Selected");
			adminBoards.clkSaveBtn(driver);
			adminBoards.clkDeptAndLocationsBtn(driver);
			test.log(LogStatus.INFO, "Department & Location Tags is clicked");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is opened");
			adminBoards.clkToggle1(driver);
			test.log(LogStatus.INFO, "911 toggle is selected");
			adminBoards.clkToggle2(driver);
			test.log(LogStatus.INFO, "ADAroom toggle is selected");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is Closed");
			adminBoards.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Loations* Button is Clicked");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Opened");
			adminBoards.clkRoomToggle1(driver);
			test.log(LogStatus.INFO, "Room101 Toggle is Selected");
			adminBoards.clkRoomToggle2(driver);
			test.log(LogStatus.INFO, "Room102 Toggle is Selected");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Closed");
			adminBoards.clkEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button is Clicked");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Opened");
			adminBoards.clkTest3Toggle(driver);
			test.log(LogStatus.INFO, "Test3 Toggle is Selected");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Closed");
			adminBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Cancel Button is Clicked");
			test.log(LogStatus.INFO, "Verified  Department & Location Tags By Selecting Data With 'Cancel' Button");
			adminBoards.clkDeptAndLocationsBtn(driver);
			test.log(LogStatus.INFO, "Department & Location Tags is clicked");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is opened");
			adminBoards.clkToggle1(driver);
			test.log(LogStatus.INFO, "911 toggle is selected");
			adminBoards.clkToggle2(driver);
			test.log(LogStatus.INFO, "ADAroom toggle is selected");
			adminBoards.clkFrontDeskBtn(driver);
			test.log(LogStatus.INFO, "Front Desk Menu is Closed");
			adminBoards.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Loations* Button is Clicked");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Opened");
			adminBoards.clkRoomToggle1(driver);
			test.log(LogStatus.INFO, "Room101 Toggle is Selected");
			adminBoards.clkRoomToggle2(driver);
			test.log(LogStatus.INFO, "Room102 Toggle is Selected");
			adminBoards.clkRoomsBtn(driver);
			test.log(LogStatus.INFO, "Rooms Menu is Closed");
			adminBoards.clkEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button is Clicked");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Opened");
			adminBoards.clkTest3Toggle(driver);
			test.log(LogStatus.INFO, "Test3 Toggle is Selected");
			adminBoards.clkFirstGroupBtn(driver);
			test.log(LogStatus.INFO, "First Group Menu is Closed");
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			String strverify = adminBoards.verification(driver);
            if (strverify.equalsIgnoreCase("pass")) {
                test.log(LogStatus.PASS,"Verified Toggles Count Is Displayed In Department & Location Tags With 'Save' Button");
            } else {
                test.log(LogStatus.FAIL,"Verified Toggles Count Is Not Displayed In Department & Location Tags With 'Save' Button");
            }
			adminBoards.clkCopyToBTn(driver);
			test.log(LogStatus.INFO, "CopyTo Button is Clicked");
			adminBoards.clkAdminHotelToggle(driver);
			test.log(LogStatus.INFO, "Somu Nookal Toggle is Clicked");
			adminBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Cancel Button is Clicked");
			adminBoards.clkCopyToBTn(driver);
			test.log(LogStatus.INFO, "CopyTo Button is Clicked");
			adminTodo.clkAdminBtn(driver);
			test.log(LogStatus.INFO, "Manager Hotel Toggle is Clicked");
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			adminTodo.clkGuestComplaintToggle(driver);
			adminTodo.clkAssignToBtn(driver);
			test.log(LogStatus.INFO, "Assign To Button is Clicked");
			adminTodo.clkAlexToggle(driver);
			test.log(LogStatus.INFO, "Alex Toggle is Selected");
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			test.log(LogStatus.INFO, "Selected Toggles Count Is Displayed In Copy To & Assign To With 'Save' Button");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminTodo.clkSubjectFld(driver, taskSubject);
			test.log(LogStatus.INFO, "Entered Text Into Subject Field");
			key(driver);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminAdd.clkTaskDescriptionFld(driver);
			test.log(LogStatus.INFO, "Entered Text Into Task Description Field");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminTodo.clkPostBtn(driver);
			alertMessage = adminTodo.getErrorMsg(driver);
			adminTodo.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Ok Button is Clicked");
			if (alertMessage.contains("Post added successfully")) {
				test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
				test.log(LogStatus.PASS, "Test is Passed");
				utilities.endReport();
			} else {
				test.log(LogStatus.FAIL, "Alert Popup Message Not Displayed");
				test.log(LogStatus.FAIL, "Test is Failed");
				utilities.endReport();
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
				test = utilities.reportsFile("Admin_Verify Todo Screen Functionality");
				test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
				adminAdd.clkToDoBtn(driver);
				adminBoards.clkHotelBtn(driver);
				adminTodo.clkOverdueBtn(driver);
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				String overDueCount = adminTodo.getOverDueTaskCount(driver);
				Pattern p = Pattern.compile("(\\d+)");
				Matcher m = p.matcher(overDueCount);
				while (m.find()) {
					test.log(LogStatus.INFO, "Tasks in the OverDue tweaky are: " + m.group(1));
					logger.info(m.group(1));
				}
				String todayCount = adminTodo.getTodayTaskCount(driver);
				Pattern ptrn = Pattern.compile("(\\d+)");
				Matcher mtchr = ptrn.matcher(todayCount);
				while (mtchr.find()) {
					test.log(LogStatus.INFO, "Tasks in the Today tweaky are: " + mtchr.group(1));
					logger.info(mtchr.group(1));
				}
				String futureCount = adminTodo.getFutureTaskCount(driver);
				Pattern ptr = Pattern.compile("(\\d+)");
				Matcher mchr = ptr.matcher(futureCount);
				while (mchr.find()) {
					test.log(LogStatus.INFO, "Tasks in the Future tweaky are: " + mchr.group(1));
					logger.info(mchr.group(1));
				}
				adminTodo.ClkButtonsInTodoScreen(driver, taskSubject);
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
