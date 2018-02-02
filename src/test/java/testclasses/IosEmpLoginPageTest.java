
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

import pageclasses.IosLoginPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class IosEmpLoginPageTest extends BaseClass {
	public ExtentTest test;
	public ExtentReports reports;
	ITestResult result;
	Logger logger = Logger.getLogger(IosEmpLoginPageTest.class);
	ConfigFileUtility cfru = new ConfigFileUtility();
	IosLoginPage login = new IosLoginPage(driver);
	Utilities utilities = new Utilities();
	public String alertMessage;
   public String screenShotName;
	public IosEmpLoginPageTest() {
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
		logger.info("Appium is launched ");
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void empLoginVerifyWithBlankData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
        cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Employee Login with Blank Values");
		test.log(LogStatus.INFO, "App is Launched in iPhone");
		login.clkEmployeeBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Employee button is Clicked");
		login.empHotelIDFill("", driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Hotel Id fld is filled with Blank Value");
		login.fillEmpUserNmaeFld("", driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Emp User Name fld is filled with Blank Value");
		login.fillEmpPasswordFld("", driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Emp Password Fld is filled with Blank Value");
		login.empSignInBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Sign Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
			if (alertMessage.contains("Please, enter credentials")) {
				logger.info("Okay");
				test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				login.employeeAlertOkBtn(driver);
				test.log(LogStatus.PASS, "Test Case is Passed");
				utilities.endReport();
			} else {
				test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				login.employeeAlertOkBtn(driver);
				test.log(LogStatus.FAIL, "Test Case is Failed");
				utilities.endReport();
			}
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void empLoginVerifyWithBlankEmailUserNameValidPassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Employee Login With Blank HotelId, UserName and ValidPassword");
		login.clkEmployeeBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Employee Button is clicked");
		login.empHotelIDFill("", driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "HotelID Field is Filled with blank value");
		login.fillEmpUserNmaeFld("", driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "UserName Field is Filled with blank value");
		login.fillEmpPasswordFld(cfru.getProperty("EmpPassWord"), driver);
		test.log(LogStatus.INFO, "Password Field is Filled with valid password");
		login.empSignInBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if (alertMessage.contains("Please, enter credentials")) {
			logger.info("Okay");
			test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.employeeAlertOkBtn(driver);
			test.log(LogStatus.PASS, "Test Case is Passed");
			utilities.endReport();
		} else {
			test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.employeeAlertOkBtn(driver);
			test.log(LogStatus.PASS, "Test Case is Failed");
			utilities.endReport();
		}
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void empLoginVerifyWithValidHotelIdUserNameInValidPassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Login With Valid HotelId, UserName and InValid Password ");
		login.clkEmployeeBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Employee button is Clicked");
		login.empHotelIDFill(cfru.getProperty("EmpHotelId"), driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Hotel Id fld is filled with valid HotelId");
		login.fillEmpUserNmaeFld(cfru.getProperty("EmpUserName"), driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Emp User Name fld is filled with valid Username");
		login.fillEmpPasswordFld("chandra234rgtf@", driver);
		test.log(LogStatus.INFO, "PassWord Field is Filled with invalid password");
		login.empSignInBtn(driver);
		logger.info("Okay");
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if (alertMessage.contains("Cannot sign you in. Please, try again")) {
			logger.info("Okay");
			test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.employeeAlertOkBtn(driver);
			test.log(LogStatus.PASS, "Test Case is Passed");
			utilities.endReport();
		} else {
			test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.employeeAlertOkBtn(driver);
			test.log(LogStatus.FAIL, "Test Case is Failed");
			utilities.endReport();
		}
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void empLoginVerifyWithInValidHotelIdUserNamePassword(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Login With InValid HotelId, UserName and Password ");
		login.clkEmployeeBtn(driver);
		test.log(LogStatus.INFO, "Employee button is Clicked");
		login.empHotelIDFill("chandra", driver);
		test.log(LogStatus.INFO, "Hotel Id fld is filled with Invalid HotelId");
		login.fillEmpUserNmaeFld("UserName", driver);
		test.log(LogStatus.INFO, "Emp User Name fld is filled with Invalid Username");
		login.fillEmpPasswordFld("PassWord", driver);
		test.log(LogStatus.INFO, "Emp Password Fld is filled with Invalid Password");
		login.empSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
		if (alertMessage.contains("Cannot sign you in. Please, try again")) {
			logger.info("Okay");
			test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.employeeAlertOkBtn(driver);
			test.log(LogStatus.PASS, "Test Case is Passed");
			utilities.endReport();
		} else {
			test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
			screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
			test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
			login.employeeAlertOkBtn(driver);
			test.log(LogStatus.FAIL, "Test Case is Failed");
			utilities.endReport();
		}
		}else{
			
		}
	}
	@Parameters("mobilePlatform")
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void empLoginVerifyWithValidHotelIdPasswordInvalidUserName(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		test = utilities.reportsFile("Verify Login With Valid HotelId, Password and Invalid UserName");
		login.clkEmployeeBtn(driver);
		test.log(LogStatus.INFO, "Employee button is Clicked");
		login.empHotelIDFill(cfru.getProperty("EmpHotelId"), driver);
		test.log(LogStatus.INFO, "Hotel Id fld is filled with valid HotelId");
		login.fillEmpUserNmaeFld("chandra", driver);
		test.log(LogStatus.INFO, "Emp UserName Fld is filled with Invalid Username");
		login.fillEmpPasswordFld("PassWord", driver);
		test.log(LogStatus.INFO, "Emp Password Fld is filled with Invalid Password");
		login.empSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign In Button is Clicked");
		screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with InValid UserName");
		test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
		alertMessage = login.alertMessage(driver);
		logger.info(alertMessage);
			if (alertMessage.contains("Cannot sign you in. Please, try again")) {
				logger.info("Okay");
				test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				login.employeeAlertOkBtn(driver);
				test.log(LogStatus.PASS, "Test Case is Passed");
				utilities.endReport();
			} else {
				test.log(LogStatus.INFO, "Alert Message is Displaying as : " + alertMessage);
				screenShotName = utilities.captureScreenshot(driver, "Sceen Shot For Employee Login with Blank Data");
				test.log(LogStatus.INFO, "Screen Shot taken : " + screenShotName);
				login.employeeAlertOkBtn(driver);
				test.log(LogStatus.FAIL, "Test Case is Failed");
				utilities.endReport();
			}
		} else {

		}
	}
	@Parameters("mobilePlatform")
   @Test(priority = 6, retryAnalyzer = Retry.class)
	public void empLoginVerifyWithValidData(String mobilePlatform) throws Exception {
		if(mobilePlatform.equalsIgnoreCase("iOS")){
		cfru.loadPropertyFile();
		test = utilities.reportsFile("Verify Employee Login with Valid data");
		login.clkEmployeeBtn(driver);
		test.log(LogStatus.INFO, "Employee button is Clicked");
		login.empHotelIDFill(cfru.getProperty("EmpHotelId"), driver);
		test.log(LogStatus.INFO, "Hotel Id fld is filled with valid HotelId");
		login.fillEmpUserNmaeFld(cfru.getProperty("EmpUserName"), driver);
		test.log(LogStatus.INFO, "Emp User Name fld is filled with valid Username");
		login.fillEmpPasswordFld(cfru.getProperty("EmpPassWord"), driver);
		test.log(LogStatus.INFO, "Emp Password Fld is filled with valid Password");
		login.empSignInBtn(driver);
		test.log(LogStatus.INFO, "Sign Button is Clicked");
		boolean loginStatus=login.admnLoginVerify(driver);
		if(loginStatus==true){
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Valid Data");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.PASS, "Employee Logged in Successfully");
			test.log(LogStatus.PASS, "Test Case is Passed");
			logger.info("okay");
		}else{
			screenShotName=utilities.captureScreenshot(driver, "Sceen Shot For Admin Login with Valid Data");
			test.log(LogStatus.INFO, "Screen Shot taken : "+screenShotName);
			test.log(LogStatus.PASS, "Employee is not Logged in Successfully");
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
