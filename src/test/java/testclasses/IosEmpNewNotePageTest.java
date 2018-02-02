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
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosEmpNewNotePageTest extends BaseClass {
	ExtentTest test;
	ITestResult result;
	Logger logger = Logger.getLogger(IosEmpNewNotePageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosNewNotePage newNote = new IosNewNotePage(driver);
	IosAdminEmployeeLogin login = new IosAdminEmployeeLogin();
	Utilities utilities = new Utilities();
	public String alertMessage;
    public String screenShotName;
	IosEmpNewNotePageTest() {
		PropertyConfigurator.configure("log4j.properties");
	}
	@Parameters("mobilePlatform")
	@BeforeClass
	public void setUp(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		String ipaPath = utilities.ipaPath();
		Boolean alertStatus = false;
		iOSMobileNativeAppCapabilities(ipaPath, cfru.getProperty("iphone5UDID"), alertStatus);
		logger.info("App Launched ");
		login.employeeLogin();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyNewNoteCreateWithBlankFields(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Employee_New note Creation with Blank Data");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		newNote.clkADDSymbol(driver);
		test.log(LogStatus.INFO, "Clicked on ADD symbol");
		test.log(LogStatus.INFO, "All Fields are leaved as Blank");
		logger.info("Clicked ADD symbol");
		newNote.clkPost(driver);
		test.log(LogStatus.INFO, "Clicked post button");
		alertMessage = newNote.alertMessage(driver);
		logger.info(alertMessage);
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		test.log(LogStatus.INFO, "Alert Pop up Displayed a Message as : " + alertMessage);
		test.log(LogStatus.PASS, "Test Case is Passed");
		newNote.alertOkBtn(driver);
		logger.info("Okay");
		utilities.endReport();
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyNewNoteCreate(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Employee_New note Creation with valid data");
		newNote.clkADDSymbol(driver);
		test.log(LogStatus.INFO, "Clicked on ADD symbol");
		logger.info("Clicked ADD symbol");
		newNote.clkNoteFromBtn(driver);
		test.log(LogStatus.INFO, "Clicked note form button");
		logger.info("Clicked note form button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		newNote.clkDptEmpValueToggle(driver);
		test.log(LogStatus.INFO, "Clicked deportment employee value toggle");
		logger.info("Clicked deportment employee value toggle");
		newNote.clkDptDptValueToggle(driver);
		test.log(LogStatus.INFO, "Clicked deportment value toggle");
		logger.info("Clicked deportment value toggle");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked save button");
		logger.info("Clicked save button");
		newNote.clkDptValueToggle(driver);
		test.log(LogStatus.INFO, "Clicked deportment employee value toggle");
		logger.info("Clicked deportment employee value toggle");
		newNote.clkDptTab(driver);
		test.log(LogStatus.INFO, "Clicked deportment tab");
		logger.info("Clicked deportment tab");
		newNote.clkFrontEndDesk(driver);
		test.log(LogStatus.INFO, "Clicked front end desk");
		logger.info("Clicked front end desk");
		newNote.clkDptValueToggle(driver);
		test.log(LogStatus.INFO, "Clicked deportment employee value toggle");
		logger.info("Clicked deportment employee value toggle");
		newNote.locationTab(driver);
		test.log(LogStatus.INFO, "Clicked location tab");
		logger.info("location tab");
		newNote.clkLocation(driver);
		test.log(LogStatus.INFO, "Clicked location tab");
		logger.info("Clicked location tab");
		newNote.clkLocation_Und(driver);
		test.log(LogStatus.INFO, "Selected Toggle From Locations");
		logger.info("Clicked  und location tab");
		newNote.clkLocation_under(driver);
		test.log(LogStatus.INFO, "Selected Toggle From Locations");
		logger.info("Clicked under location tab");
		newNote.clkEquipmnetTab(driver);
		test.log(LogStatus.INFO, "Clicked equipment tab");
		logger.info("Clicked equipment tab");
		newNote.clkEquipmnetTabFirstGrp(driver);
		test.log(LogStatus.INFO, "Clicked equipment first tab");
		logger.info("Clicked equipment first tab");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked save button");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		newNote.clkCopyTo(driver);
		test.log(LogStatus.INFO, "Clicked copy to button");
		logger.info("Clicked copy to button");
		newNote.clkCpoyToValue(driver);
		test.log(LogStatus.INFO, "Clicked copy to value button");
		logger.info("Clicked copy to value button");
		newNote.clkSaveBtn(driver);
		test.log(LogStatus.INFO, "Clicked save button");
		logger.info("Clicked save button");
		newNote.clkGuestComplaint(driver);
		test.log(LogStatus.INFO, "Clicked guest complaint button");
		logger.info("Clicked guest complaint button");
		newNote.fillEnterNoteFld("Hi From Note to test", driver);
		test.log(LogStatus.INFO, "Enter note field filled ");
		logger.info("Enter note field filled ");
		newNote.clkPost(driver);
		test.log(LogStatus.INFO, "Clicked post button");
		logger.info("Okay");
		alertMessage = newNote.alertMessage(driver);
		logger.info(alertMessage);
		if(alertMessage.contains("Post added successfully")){
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		logger.info("Okay");
		test.log(LogStatus.PASS, "Alert Pop up Displayed a Message as : " + alertMessage);
		test.log(LogStatus.PASS, "Test Case is Passed");
		logger.info("Okay");
		}else{
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			logger.info("Okay");
			test.log(LogStatus.INFO, "Alert Pop up Displayed a Message as : " + alertMessage);
			test.log(LogStatus.FAIL, "Test Case is Failed");
			logger.info("Okay");
		}
		utilities.endReport();
		}else{
			
		}
	}
	@AfterClass
	public void tearDown() {
		
		driver.closeApp();
	}
}
