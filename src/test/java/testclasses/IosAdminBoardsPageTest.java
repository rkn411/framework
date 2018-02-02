package testclasses;

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

import pageclasses.IosAdminBoardsPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosAdminBoardsPageTest extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	Logger logger = Logger.getLogger(IosAdminBoardsPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosAdminBoardsPage adminBoards = new IosAdminBoardsPage(driver);
	IosAdminEmployeeLogin adminLogin = new IosAdminEmployeeLogin();
	Utilities utilities = new Utilities();
	public String alertMessage;
	public String screenShotName;

	IosAdminBoardsPageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
	@Parameters("mobilePlatform")
	@BeforeClass
	public void setUp(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		String ipaPath = utilities.ipaPath();
		cfru.loadPropertyFile();
		Boolean alertStatus = true;
		iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
		logger.info("App is Launched ");
		adminLogin.adminLogin();
		test = utilities.reportsFile("Verify Admin Boards Page Functionality");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		}else{
			
		}
    }
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyMessage(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test.log(LogStatus.INFO, "Verify Message icon");
		adminBoards.clkAdmin_Boards_AlexHotelBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Hotel Button on Admin Boards page is Clicked");
		adminBoards.clkAdmin_ALexHotel_MessageBtn(driver,"down");
		test.log(LogStatus.INFO, "Message button in Hotel page is Clicked ");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		logger.info("Okay");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyWriteCommentEithValidData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		logger.info("Okay");
		test.log(LogStatus.INFO, "Verify Chat functionality with valid data");
	    adminBoards.clkAdmin_ALexHotel_WriteCommentBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Write comment button in Hotel page is Clicked");
		adminBoards.clkAdmin_DeptLctnTagsBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Department location tags button is Clicked ");
		adminBoards.clkAdmin_DeptLctnTagsFrntDeskBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Front Desk Button in Department location tag is Clicked ");
		adminBoards.clkAdmin_AmShiftToggle(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "AMShift Toggle is Enabled ");
		adminBoards.clkAdmin_BookingToggle(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Booking Toggle is Enabled ");
		adminBoards.clkAdmin_LocationsTab(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Locations tab is Clicked ");
		adminBoards.clkAdmin_LocationsTabGuestArea(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Locations tab guest Area is Clicked ");
		adminBoards.clkAdmin_LocationsTabGuestAreasBarToggle(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Locations Tab Guest Areas Bar toggle is Enabled ");
		adminBoards.clkAdmin_LocationsTabGuestAreasBoardToggle(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Locations Tab Guest Areas Boards toggle is Enabled ");
		adminBoards.clkAdmin_LocationsTabGuestAreasBedRoomToggle(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Locations Tab Guest Areas BedRoom toggle is Enabled ");
		adminBoards.clkAdmin_EquipmentTab(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Equipment tab is Clicked ");
		adminBoards.clkAdmin_EquipmentTabFrstGrpBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Equipment tab fristgrp Button is Clicked ");
		adminBoards.clkAdmin_EquipmentTabFrstGrpTestBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Equipment tab fristgrp test Button is Clicked ");
		adminBoards.clkAdmin_SaveBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Save Button is Clicked");
		adminBoards.clkAdmin_CopyBtn(driver);
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.INFO, "Copy Button is Clicked");
		adminBoards.clkAdmin_CopyToAdminToggle(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "CopyTo Admin Button is Clicked");
		adminBoards.clkAdmin_CopyToManagerToggle(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "CopyTo Manager Toggle  is Enabled");
		adminBoards.clkAdmin_SaveBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on Save button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		adminBoards.fillFldEnterCommentTxtBox(driver, "Hi from Testing team");
		test.log(LogStatus.INFO, "Entered Text in Comment text box ");
		adminBoards.clkAdmin_SaveBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Save button is Clicked");
		test.log(LogStatus.INFO, "Comment Posted Successful");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test Case is Passed");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyWriteCommentEithInValidData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		logger.info("Okay");
		test.log(LogStatus.INFO, "Verify Chat functionality with Blank data");
		adminBoards.clkAdmin_ALexHotel_WriteCommentBtn(driver);
		test.log(LogStatus.INFO, "Write comment button in Hotel page is Clicked");
		test.log(LogStatus.INFO, "All fields leave as blank");
		adminBoards.clkAdmin_SaveBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Save button is Clicked");
		Thread.sleep(6000);
		alertMessage = adminBoards.alertMessage(driver);
		logger.info(alertMessage);
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
		adminBoards.alertOkBtn(driver);
		test.log(LogStatus.PASS, "Test Case is Passed");
		logger.info("Okay");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyConvertTaskWithValidData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test.log(LogStatus.INFO, "Verify Convert Task Functionality in Admin Boards Page With Valid Data");
		adminBoards.clkAdmin_ConvertTask(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on Convert Task");
		logger.info("Okay");
		adminBoards.clkAdmin_AssignToBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "AssignTo button  is Clicked");
		test.log(LogStatus.INFO, "Employee Admin Toggle  is Enabled");
		adminBoards.clkAdmin_CancelBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Cancel button is Clicked");
		logger.info("Okay");
		adminBoards.clkAdmin_PostBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Post button is Clicked");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test case is passed");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void verifyConvertTaskWithBlankData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test.log(LogStatus.INFO, "Verify Convert Task Functionality in Admin Boards Page With Blank Data");
		adminBoards.clkAdmin_ConvertTask(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Clicked on Convert Task");
		logger.info("Okay");
		adminBoards.clkAdmin_SaveBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Save button is Clicked");
		logger.info("Okay");
		logger.info("Okay");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.PASS, "Test case is passed");
		utilities.endReport();
	     }else{
			
		}
	}
	@AfterClass
	public void tearDown() {
		driver.closeApp();
	}
}
