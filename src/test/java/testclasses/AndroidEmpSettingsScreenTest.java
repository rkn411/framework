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

import pageclasses.AndroidEmpSettingsScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidEmpSettingsScreenTest extends BaseClass {

	// create variable for Itest results
	ITestResult result;
	ExtentTest test;
	Utilities utilities=new Utilities();
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidEmpSettingsScreenTest.class);
	// create object for EmployeeSettingsScreenPage class
	AndroidEmpSettingsScreen empSettings = new AndroidEmpSettingsScreen(driver);
	// create object for navigationsPageObjects class
	ConfigFileUtility configfile = new ConfigFileUtility();
	// create variable version as integer
	int version = 11;
	DesiredCapabilities caps;
	public String alertMessage = null;
	public String screenShot;

	// constructor
	AndroidEmpSettingsScreenTest() throws Exception {
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
	public void verifyProfileScreenWithBlankData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Profile Screen In Settings With Blank Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("click on settings button");
			empSettings.clkSettingsBtn(driver);
			logger.info("Settings button Clicked");
			test.log(LogStatus.INFO, "Settings Button Clicked");
			logger.info("Click on Profile");
			empSettings.clkProfileBtn(driver);
			logger.info("Profile Button Clicked");
			test.log(LogStatus.INFO, "Profile Button Clicked");
			logger.info("Enter FullName");
			empSettings.clkFullNameFld(driver);
			test.log(LogStatus.INFO, "Full Name field is Cleared");
			logger.info("Enter Last Name");
			empSettings.clkLastNameFld(driver);
			test.log(LogStatus.INFO, "Last Name Field is Cleared");
			logger.info("Click on Language");
			key(driver);
			empSettings.clkLanguageBtn(driver);
			test.log(LogStatus.INFO, "Language Button Is Clicked");
			empSettings.clkSelectLanguageBtn(driver);
			test.log(LogStatus.INFO, " Selected Language Button Is Highlighted");
			empSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			String strprofile = empSettings.verification(driver);
            if (strprofile.equalsIgnoreCase("pass")) {
            test.log(LogStatus.PASS,"Verified Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }else{
                test.log(LogStatus.FAIL,"Failed Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empSettings.clkChangeImageTxt(driver);
			test.log(LogStatus.INFO, "Clicked On Change Image Text");
			empSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			empSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Save Button");
			String strverify = empSettings.profileVerification(driver);
			if (strverify.equalsIgnoreCase("fail")) {
				test.log(LogStatus.FAIL, "Blank Data In Profile Verification Failed");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			} else {
				test.log(LogStatus.PASS, "Verified Blank Data In Profile");
				test.log(LogStatus.PASS, "Testcase is Passed");
			}
			
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void verifyProfileScreenWithValidData(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Profile Screen In Settings With Valid Data ");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Click on Profile");
			empSettings.clkProfileBtn(driver);
			logger.info("Profile Button Clicked");
			test.log(LogStatus.INFO, "Profile Button Clicked");
			logger.info("Enter FullName");
			empSettings.fillFullNameFld(driver);
			test.log(LogStatus.INFO, "Full Name field is filled");
			logger.info("Enter Last Name");
			empSettings.fillLastNameFld(driver);
			test.log(LogStatus.INFO, "Last Name Field is filled");
			logger.info("Click on Language");
			key(driver);
			empSettings.clkLanguageBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Language Button");
			empSettings.clkSelectLanguageBtn(driver);
			test.log(LogStatus.INFO, "Selected Language Button Is Highlighted");
			empSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			String strprofile = empSettings.verification(driver);
            if (strprofile.equalsIgnoreCase("pass")) {
            test.log(LogStatus.PASS,"Verified Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }else{
                test.log(LogStatus.FAIL,"Failed Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empSettings.clkChangeImageTxt(driver);
			test.log(LogStatus.INFO, "Clicked On Change Image Text");
			empSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			empSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Save Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyAccountsScreen(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Accounts Screen Functionality In Settings");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empSettings.clkAccountBtn(driver);
			logger.info("Leave All Fields As Empty & Click on Save Button");
			empSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Save Button");
			alertMessage = empSettings.getErrorMsg(driver);
			String strerrormsg = empSettings.accountsVerification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
                test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
                }else{
                    test.log(LogStatus.FAIL, "Alert pop up message not displayed");
                };
			empSettings.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Ok Button");
			logger.info("Fill Old Password Field");
			empSettings.clkOldPasswordFld(driver, "brad");
			test.log(LogStatus.INFO, "Old Password Field Is Filled With Data");
			logger.info("Fill New Password Field");
			empSettings.clkNewPasswordFld(driver, "brad");
			test.log(LogStatus.INFO, "New Password Field Is Filled With Data");
			logger.info("Fill Confirm Password Field");
			empSettings.clkConfirmPasswordFld(driver, "brad");
			test.log(LogStatus.INFO, "Confirm Password Field Is Filled With Data");
			logger.info("Click On Cancel Button");
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			empSettings.clkCancelBtn(driver);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empSettings.clkAccountBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Accounts Button");
			logger.info("Fill Old Password Field");
			empSettings.clkOldPasswordFld(driver, "brad");
			test.log(LogStatus.INFO, "Old Password Field Is Filled With Data");
			logger.info("Fill New Password Field");
			empSettings.clkNewPasswordFld(driver, "brad");
			test.log(LogStatus.INFO, "New Password Field Is Filled With Data");
			logger.info("Fill Confirm Password Field");
			empSettings.clkConfirmPasswordFld(driver, "brad");
			test.log(LogStatus.INFO, "Confirm Password Field Is Filled With Data");
			empSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Save Button");
			test.log(LogStatus.PASS,"Verify Account Details With Filling Old Password,New Password & Confirm Password With 'Save' Button");
			empSettings.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyNotificationToggle(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Notifications Toggle In Settings Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empSettings.clkNotificationsToggle(driver);
			test.log(LogStatus.INFO, "Clicked on Notifications Toggle");
			empSettings.clkNotificationsToggle(driver);
			test.log(LogStatus.PASS, "Notifications Toggle is Clicked");
			test.log(LogStatus.PASS, "Testcase is Passed");
			utilities.endReport();
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 5, retryAnalyzer = Retry.class)
	public void verifyChangeHotelScreen(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reportsFile("Employee_Verify Change Hotel Screen In Settings Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empSettings.clkChangeHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Change Hotel Button");
			empSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			empSettings.clkChangeHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Change Hotel Button");
			empSettings.clkGrandHotelBtn(driver);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			empSettings.clkSaveBtn(driver);
			empSettings.clkChangeHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Change Hotel Button");
			String strverify = empSettings.grandHotelVerification(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Verified Change Hotel Functionality ");
				empSettings.clkCancelBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Cancel Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Change Hotel Verification Failed");
				empSettings.clkCancelBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Cancel Button");
				test.log(LogStatus.FAIL, "Testcase is Failed");
			}
		} else {
			System.out.println("Not an Android");
		}
	}

	@Parameters("platform")
	@Test(priority = 6, retryAnalyzer = Retry.class)
	public void verityLogoutBtn(String platform) {
		if (platform.equalsIgnoreCase("android")) {
			test = utilities.reports.startTest("Employee_Verify Logout Button Functionality In Settings Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			empSettings.clkLogoutBtn(driver);
			test.log(LogStatus.INFO, "Logout Button is Clicked");
			String strverify = empSettings.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Verified Logout Functionality");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Logout Verification Failed");
				test.log(LogStatus.FAIL, "Testcase is Failed");
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
