package testclasses;
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

import pageclasses.AndroidAdminBoardsScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidAdminBoardsScreenTest extends BaseClass {

	// create variable for Itest results
	ITestResult result;
	ExtentTest test;
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidAdminBoardsScreenTest.class);
	// create object for LoginScreenPageObjects class
	AndroidAdminBoardsScreen adminBoards = new AndroidAdminBoardsScreen(driver);
	Utilities utilities =new Utilities();
	// create object for navigationsPageObjects class-
	ConfigFileUtility configfile = new ConfigFileUtility();
	// create variable version as integer
	int version = 11;
	DesiredCapabilities caps;
	public String screenShot;

	// constructor
	AndroidAdminBoardsScreenTest() throws Exception {
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
	public void clickingMsgBtn(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Message Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminBoards.clkBoardsBtn(driver);
			test.log(LogStatus.INFO, "Boards Button is Clicked");
			adminBoards.clkHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Hotel Button");
			adminBoards.clkMessageBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Message Button");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyComentBtnWithValidData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Comment Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminBoards.clkCommentBtn(driver);
			test.log(LogStatus.INFO, "Comments button is clicked");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
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
			test.log(LogStatus.INFO, "Verified Department & Location Tags By Selecting Data With 'Cancel' Button");
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
			test.log(LogStatus.INFO, "Admin Hotel Toggle is Highlighted");
			adminBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			adminBoards.clkCopyToBTn(driver);
			test.log(LogStatus.INFO, "CopyTo Button is Clicked");
			adminBoards.clkAdminHotelToggle(driver);
			test.log(LogStatus.INFO, "Admin Hotel Toggle is Highlighted");
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			test.log(LogStatus.INFO, "Selected Toggles Count Is Displayed In Copy To With 'Save' Button");
			adminBoards.clkTextboxField(driver);
			test.log(LogStatus.INFO, "Entering Text Into TextBox");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			test.log(LogStatus.PASS, "Comment Icon Functionality Is Verified");
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
			} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyEditBtnFunctionality(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Edit Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminBoards.clkNoteBtn(driver);
			test.log(LogStatus.INFO, "Edit Button is Clicked");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminBoards.clkAssignToBtn(driver);
			test.log(LogStatus.INFO, "AssignTo Button is Clicked");
			String strverify = adminBoards.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Assign To Button Is Verified");
				adminBoards.clkCancelBtn(driver);
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				adminBoards.clkCancelBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Cancel Button");
				test.log(LogStatus.PASS, "Edit Icon Functionality Is Verified");
				test.log(LogStatus.PASS, "Testcase is Passed");
				utilities.endReport();
			} else {
				test.log(LogStatus.FAIL, "Verification For Assign To Button Is Failed");
				
			}
			
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyFlagBtnFunctionality(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Admin_Verify Flag Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminBoards.clkFlagBtn(driver);
			test.log(LogStatus.INFO, "Flag button is Clicked");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			test.log(LogStatus.PASS, "Flag Icon Functionality Is Verified");
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
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