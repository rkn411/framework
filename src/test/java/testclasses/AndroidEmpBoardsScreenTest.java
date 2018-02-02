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

import pageclasses.AndroidEmpBoardsScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidEmpBoardsScreenTest extends BaseClass {

	// create variable for Itest results
	ITestResult result;
	ExtentTest test;
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidEmpBoardsScreenTest.class);
	// create object for LoginScreenPageObjects class
	AndroidEmpBoardsScreen empBoards = new AndroidEmpBoardsScreen(driver);
	// create object for navigationsPageObjects class-
	ConfigFileUtility configfile = new ConfigFileUtility();
	Utilities utilities=new Utilities();
	// create variable version as integer
	int version = 10;
	public String screenShot;
	DesiredCapabilities caps;

	// constructor
	AndroidEmpBoardsScreenTest() throws Exception {
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
	public void clickingMsgBtn(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Message Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empBoards.clkBoardsBtn(driver);
			test.log(LogStatus.INFO, "Boards Button is Clicked");
			empBoards.clkHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Hotel Button");
			empBoards.clkMessageBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Message Button");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyComentBtnWithValidData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Comment Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empBoards.clkCommentBtn(driver);
			test.log(LogStatus.INFO, "Comments button is clicked");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empBoards.clkDeptAndLocationsBtn(driver);
			test.log(LogStatus.INFO, "Department & Location Tags is clicked");
			empBoards.clkHouseKeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Menu is opened");
			empBoards.clkBathCounterToggle(driver);
			test.log(LogStatus.INFO, "Bath Counter toggle is selected");
			empBoards.clkBathMatToggle(driver);
			test.log(LogStatus.INFO, "Bath Mat toggle is selected");
			empBoards.clkHouseKeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Menu is Closed");
			empBoards.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Loations* Button is Clicked");
			empBoards.clkGuestAreaBtn(driver);
			test.log(LogStatus.INFO, "Guest Area Menu is Opened");
			empBoards.clkBarToggle(driver);
			test.log(LogStatus.INFO, "Bar Toggle is Selected");
			empBoards.clkBoardRoomToggle(driver);
			test.log(LogStatus.INFO, "Board Room Toggle is Selected");
			empBoards.clkGuestAreaBtn(driver);
			test.log(LogStatus.INFO, "Guest Area Menu is Closed");
			empBoards.clkEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button is Clicked");
			empBoards.clkGroupEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Group Equipment Menu is Opened");
			empBoards.clkEq1Toggle(driver);
			test.log(LogStatus.INFO, "Eq1 Toggle is Selected");
			empBoards.clkEq2Toggle(driver);
			test.log(LogStatus.INFO, "Eq2 Toggle is Selected");
			empBoards.clkGroupEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Group Equipment Menu is Closed");
			empBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			test.log(LogStatus.INFO, "Verified Department & Location Tags By Selecting Data With ,Cancel, Button");
			empBoards.clkDeptAndLocationsBtn(driver);
			test.log(LogStatus.INFO, "Department & Location Tags is clicked");
			empBoards.clkHouseKeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Menu is opened");
			empBoards.clkBathCounterToggle(driver);
			test.log(LogStatus.INFO, "Bath Counter toggle is selected");
			empBoards.clkBathMatToggle(driver);
			test.log(LogStatus.INFO, "Bath Mat toggle is selected");
			empBoards.clkHouseKeepingBtn(driver);
			test.log(LogStatus.INFO, "House Keeping Menu is Closed");
			empBoards.clkLocationsBtn(driver);
			test.log(LogStatus.INFO, "Loations* Button is Clicked");
			empBoards.clkGuestAreaBtn(driver);
			test.log(LogStatus.INFO, "Guest Area Menu is Opened");
			empBoards.clkBarToggle(driver);
			test.log(LogStatus.INFO, "Bar Toggle is Selected");
			empBoards.clkBoardRoomToggle(driver);
			test.log(LogStatus.INFO, "Board Room Toggle is Selected");
			empBoards.clkGuestAreaBtn(driver);
			test.log(LogStatus.INFO, "Guest Area Menu is Closed");
			empBoards.clkEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Equipment Button is Clicked");
			empBoards.clkGroupEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Group Equipment Menu is Opened");
			empBoards.clkEq1Toggle(driver);
			test.log(LogStatus.INFO, "Eq1 Toggle is Selected");
			empBoards.clkEq2Toggle(driver);
			test.log(LogStatus.INFO, "Eq2 Toggle is Selected");
			empBoards.clkGroupEquipmentBtn(driver);
			test.log(LogStatus.INFO, "Group Equipment Menu is Closed");
			empBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			String strverify = empBoards.verification(driver);
            if (strverify.equalsIgnoreCase("pass")) {
                test.log(LogStatus.PASS,"Verified Toggles Count Is Displayed In Department & Location Tags With 'Save' Button");
            } else {
                test.log(LogStatus.FAIL,"Verified Toggles Count Is Not Displayed In Department & Location Tags With 'Save' Button");
            }
			empBoards.clkCopyToBTn(driver);
			test.log(LogStatus.INFO, "CopyTo Button is Clicked");
			empBoards.clkCourtneyJarrodToggle(driver);
			test.log(LogStatus.INFO, "Courtney Jarrod Toggle is Highlighted");
			empBoards.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			empBoards.clkCopyToBTn(driver);
			test.log(LogStatus.INFO, "CopyTo Button is Clicked");
			empBoards.clkCourtneyJarrodToggle(driver);
			test.log(LogStatus.INFO, "Courtney Jarrod Toggle is Highlighted");
			empBoards.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			test.log(LogStatus.INFO, "Selected Toggles Count Is Displayed In Copy To With 'Save' Button");
			empBoards.clkTextboxField(driver);
			test.log(LogStatus.INFO, "Entering Text Into TextBox");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empBoards.clkSaveBtn(driver);
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
			test = utilities.reportsFile("Employee_Verify Edit Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empBoards.clkNoteBtn(driver);
			test.log(LogStatus.INFO, "Edit Button is Clicked");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empBoards.clkAssignToBtn(driver);
			test.log(LogStatus.INFO, "AssignTo Button is Clicked");
			String strverify = empBoards.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Assign To Button Is Verified");
				empBoards.clkCancelBtn(driver);
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				empBoards.clkCancelBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Cancel Button");
				test.log(LogStatus.PASS, "Edit Icon Functionality Is Verified");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Verification For Assign To Button Is Failed");
				empBoards.clkCancelBtn(driver);
				screenShot=utilities.captureScreenshot(driver, "ScreenShot");
				test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
				empBoards.clkCancelBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Cancel Button");
				test.log(LogStatus.PASS, "Edit Icon Functionality Is Verified");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
		} else {
			System.out.println("Not an Android");
		}
	}
	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyFlagBtnFunctionality(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Flag Icon Functionality In Boards Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empBoards.clkFlagBtn(driver);
			test.log(LogStatus.INFO, "Flag button is Clicked");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empBoards.clkCancelBtn(driver);
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

