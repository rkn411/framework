package testclasses;

import java.util.concurrent.TimeUnit;
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
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Singleton;
import utilities.Utilities;

public class WebEmployeeLoginTest extends BaseClass {
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebEmployeeLoginTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebEmpLoginPage Employlogin = new WebEmpLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	// constructor
	WebEmployeeLoginTest() throws Exception {
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
	public void verifyEmployeeLoginWithBlankData() {
		test = utilities.reportsFile("Employee_Verify Login Functionality with Blank Data");
		test.log(LogStatus.INFO, "Application Is opened in Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, " ");
		test.log(LogStatus.INFO, "Hotelid Field is Filled with Blank Data");
		logger.info("HotelID Field is Filled with Blank Data");
		Employlogin.fillUsernameFld(webDriver, " ");
		test.log(LogStatus.INFO, "Username Field is Filled with Blank Data");
		logger.info("Username Field is Filled with Blank Data");
		Employlogin.fillPasswordFld(webDriver, " ");
		test.log(LogStatus.INFO, "Password Field is Filled with Blank Data");
		logger.info("Password Field is Filled with Blank Data");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = Employlogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = Employlogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	// method to check hotel id,user name and password with invalid data
	@Test(priority = 2)
	public void verifyEmployeeLoginWithInValidData() {
		test = utilities.reportsFile("Employee_Verify Login Functionality with Invalid HotelID ,Username and Password");
		test.log(LogStatus.INFO, "Application Is opened in Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, configfile.getProperty("invalidhotelid"));
		test.log(LogStatus.INFO,"HotelId Field is Filled With Invalid HotelId : " + configfile.getProperty("invalidhotelid"));
		logger.info("HotelId Field is Filled With Invalid HotelId");
		Employlogin.fillUsernameFld(webDriver, configfile.getProperty("invalidusername"));
		test.log(LogStatus.INFO,"Username Field is Filled With Invalid Username : " + configfile.getProperty("invalidusername"));
		logger.info("Username Field is Filled With Invalid Username");
		Employlogin.fillPasswordFld(webDriver, configfile.getProperty("invalidemppassword"));
		test.log(LogStatus.INFO,"Password Field is Filled With Invalid Password : " + configfile.getProperty("invalidemppassword"));
		logger.info("Password Field is Filled With Invalid Password ");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = Employlogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = Employlogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	// method to check valid hotel id, invalid user name and password
	@Test(priority = 3)
	public void verifyWithValidHotelidInvalidPasswdAndUsername() {
		test = utilities.reportsFile("Employee_Verify Login Functionality with valid HotelID ,invalid Username and Password");
		test.log(LogStatus.INFO, "Application Is Opened in Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, configfile.getProperty("validhotelid"));
		test.log(LogStatus.INFO,"HotelId Field is Filled With Valid HotelId : " + configfile.getProperty("validhotelid"));
		logger.info("HotelId Field is Filled With Valid HotelId");
		Employlogin.fillUsernameFld(webDriver, configfile.getProperty("invalidusername"));
		test.log(LogStatus.INFO,"Username Field is Filled With Invalid Username : " + configfile.getProperty("invalidusername"));
		logger.info("Username Field is Filled With Invalid Username");
		Employlogin.fillPasswordFld(webDriver, configfile.getProperty("invalidemppassword"));
		test.log(LogStatus.INFO,"Password Field is Filled With Invalid Password :" + configfile.getProperty("invalidemppassword"));
		logger.info("Password Field is Filled With Invalid Password");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = Employlogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = Employlogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	// Method to check with invalid hotelid & password and valid username
	@Test(priority = 4)
	public void verifyWithInValidHotelidAndPasswdAndValidUsername() {
		test = utilities.reportsFile("Employee_Verify Login Functionality with invalid HotelID and password ,valid Username");
		test.log(LogStatus.INFO, "Application Is opened in Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, configfile.getProperty("invalidhotelid"));
		test.log(LogStatus.INFO,"HotelId Field is Filled With InValid HotelId : " + configfile.getProperty("invalidhotelid"));
		logger.info("HotelId Field is Filled With InValid HotelId");
		Employlogin.fillUsernameFld(webDriver, configfile.getProperty("validusername"));
		test.log(LogStatus.INFO,"Username Field is Filled With valid Username : " + configfile.getProperty("validusername"));
		logger.info("Username Field is Filled With valid Username ");
		Employlogin.fillPasswordFld(webDriver, configfile.getProperty("invalidemppassword"));
		test.log(LogStatus.INFO,"Password Field is Filled With Invalid Password : " + configfile.getProperty("invalidemppassword"));
		logger.info("Password Field is Filled With Invalid Password");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = Employlogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = Employlogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	// Method to Employee_Verify login screen with invalid hotelid and blank
	// username&Password
	@Test(priority = 5)
	public void verifyWithInValidHotelidAndblankPasswdAndUsername() {
		test = utilities.reportsFile("Employee_Verify Login Functionality with invalid HotelID ,blank Username and Password");
		test.log(LogStatus.INFO, "Application Is opened in Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, configfile.getProperty("invalidhotelid"));
		test.log(LogStatus.INFO,"HotelId Field is Filled with InValid HotelId : " + configfile.getProperty("invalidhotelid"));
		logger.info("HotelId Field is Filled with InValid HotelId");
		Employlogin.fillUsernameFld(webDriver, " ");
		test.log(LogStatus.INFO, "Username Field is Filled with Blank Data");
		logger.info("Username Field is Filled with Blank Data");
		Employlogin.fillPasswordFld(webDriver, " ");
		test.log(LogStatus.INFO, "Password Field is Filled with Blank Data");
		logger.info("Password Field is Filled with Blank Data");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = Employlogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = Employlogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	// Method to Employee_Verify login screen with valid username and blank
	// password&hotelid
	@Test(priority = 6)
	public void verifyWithValidUsernameAndblankPasswdAndHotelid() {
		test = utilities.reportsFile("Employee_Verify Login Functionality with valid Username and blank Password & HotelId");
		test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, " ");
		test.log(LogStatus.INFO, "Hotelid Field is Filled with Blank Data ");
		logger.info("Hotelid Field is Filled with Blank Data");
		Employlogin.fillUsernameFld(webDriver, configfile.getProperty("validusername"));
		test.log(LogStatus.INFO,"Username Field Filled With Valid Username : " + configfile.getProperty("validusername"));
		logger.info("Username Field Filled With Valid Username");
		Employlogin.fillPasswordFld(webDriver, " ");
		test.log(LogStatus.INFO, "Password Field is Filled with Blank Data");
		logger.info("Password Field is Filled with Blank Data");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = Employlogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = Employlogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	// Method to Employee_Verifye login with Blank HotelID,VAlid Password &
	// Username
	@Test(priority = 7)
	public void verifyWithBlankHotelidAndValidUsernameAndPassword() {
		test = utilities.reportsFile("Employee_Verify Login screen with blank hotelid and valid username&password");
		test.log(LogStatus.INFO, "Application Is opened in Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, " ");
		test.log(LogStatus.INFO, "Hotelid Field is Filled with Blank Data ");
		logger.info("Hotelid Field is Filled with Blank Data");
		Employlogin.fillUsernameFld(webDriver, configfile.getProperty("validusername"));
		test.log(LogStatus.INFO,"Username Field is Filled with Valid Username : " + configfile.getProperty("validusername"));
		logger.info("Username Field is Filled with Valid Username");
		Employlogin.fillPasswordFld(webDriver, configfile.getProperty("validemppassword"));
		test.log(LogStatus.INFO,"Password Field is Filled With Valid Password :" + configfile.getProperty("validemppassword"));
		logger.info("Password Field is Filled With Valid Password");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		String alertMessage = Employlogin.getAlertMsg(webDriver);
		test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
		boolean strtext = Employlogin.verify(webDriver);
		if (strtext == true) {
			String AlertMsg1 = utilities.captureScreenshot(webDriver, "alert");
			test.log(LogStatus.INFO, "Screen Shot is taken " + AlertMsg1);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Alert Message Not Displayed ");
		}
		utilities.endReport();
	}
	// Method To Verify Emp Login with Valid data
	@Test(priority = 8)
	public void verifyWithValidData() {
		test = utilities.reportsFile("Employee_Verify Login screen valid data");
		test.log(LogStatus.INFO, "Application Is opened in Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		Employlogin.fillHotelIdFld(webDriver, configfile.getProperty("validhotelid"));
		test.log(LogStatus.INFO,"HotelID Field is Filled With Valid Hotel ID : " + configfile.getProperty("validhotelid"));
		logger.info("HotelID Field is Filled With Valid hotel ID ");
		Employlogin.fillUsernameFld(webDriver, configfile.getProperty("validusername"));
		test.log(LogStatus.INFO,"Username Field is Filled With Valid Username : " + configfile.getProperty("validusername"));
		logger.info("HotelID Field is Filled With ValidUsername ");
		Employlogin.fillPasswordFld(webDriver, configfile.getProperty("validemppassword"));
		test.log(LogStatus.INFO,"Password Field is Filled With Valid Password :" + configfile.getProperty("validemppassword"));
		logger.info("Password Field is Filled With Valid Password");
		Employlogin.clkChkBox(webDriver);
		logger.info("Clicked on Stay Signed in CheckBox");
		test.log(LogStatus.INFO, "Clicked on Stay Signed in CheckBox");
		Employlogin.clkSignInBtn(webDriver);
		logger.info("Clicked on SignIn Button");
		test.log(LogStatus.INFO, "Clicked on SignIn Button");
		boolean EmpUsername = Employlogin.employVerification(webDriver);
		if (EmpUsername == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Home Page");
			String HomePage = utilities.captureScreenshot(webDriver, "Home Page");
			test.log(LogStatus.INFO, "Screen Shot is taken " + HomePage);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Home Page");
		}
		utilities.endReport();
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