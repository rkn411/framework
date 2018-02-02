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

import pageclasses.AndroidAdminSettingsScreen;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Utilities;

public class AndroidAdminSettingsScreenTest extends BaseClass {

	// create variable for Itest results
	ITestResult result;
	ExtentTest test;
	Utilities utilities=new Utilities();
	// creating object logger logger class
	Logger logger = Logger.getLogger(AndroidAdminSettingsScreenTest.class);
	// create object for LoginScreenPageObjects class
	AndroidAdminSettingsScreen adminSettings = new AndroidAdminSettingsScreen(driver);
	// create object for navigationsPageObjects class
	ConfigFileUtility configfile = new ConfigFileUtility();
	// create variable version as integer
	int version = 10;
	public String screenShot;
	DesiredCapabilities caps;
	public String alertMessage = null;
	public String screenshotDashboard;

	// constructor
	AndroidAdminSettingsScreenTest() throws Exception {
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
			test = utilities.reportsFile("Admin_Verify Profile Screen In Settings With Blank Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("click on settings button");
			adminSettings.clkSettingsBtn(driver);
			logger.info("Settings button Clicked");
			test.log(LogStatus.INFO, "Settings Button Clicked");
			logger.info("Click on Profile");
			adminSettings.clkProfileBtn(driver);
			logger.info("Profile Button Clicked");
			test.log(LogStatus.INFO, "Profile Button Clicked");
			logger.info("Enter FullName");
			adminSettings.clkFullNameFld(driver);
			test.log(LogStatus.INFO, "Full Name field is filled");
			logger.info("Enter Last Name");
			adminSettings.clkLastNameFld(driver);
			test.log(LogStatus.INFO, "Last Name Field is filled");
			adminSettings.fillEmailidFld(driver);
			test.log(LogStatus.INFO, "Verified Email Address field");
			key(driver);
			adminSettings.clkLanguageBtn(driver);
			logger.info("Click on Language");
			test.log(LogStatus.INFO, "Clicked on Language Button");
			adminSettings.clkSelectLanguageBtn(driver);
			test.log(LogStatus.INFO, "Selected Language Button Is Highlighted");
			adminSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			String strprofile = adminSettings.verification(driver);
            if (strprofile.equalsIgnoreCase("pass")) {
            test.log(LogStatus.PASS,"Verified Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }else{
                test.log(LogStatus.FAIL,"Failed Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminSettings.clkChangeImageTxt(driver);
			test.log(LogStatus.INFO, "Clicked On Change Image Text");
			adminSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			adminSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Save Button");
			String strverify = adminSettings.profileVerification(driver);
			if (strverify.equalsIgnoreCase("fail")) {
				test.log(LogStatus.FAIL, "Blank Data In Profile Verification Failed");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.PASS, "Verified Blank Data In Profile");
				test.log(LogStatus.FAIL, "Testcase is Failed");
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
			test = utilities.reportsFile("Admin_Verify Profile Screen In Settings With Valid Data");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			logger.info("Click on Profile");
			adminSettings.clkProfileBtn(driver);
			logger.info("Profile Button Clicked");
			test.log(LogStatus.INFO, "Profile Button Clicked");
			logger.info("Enter FullName");
			adminSettings.fillFullNameFld(driver);
			test.log(LogStatus.INFO, "Full Name field is filled");
			logger.info("Enter Last Name");
			adminSettings.fillLastNameFld(driver);
			test.log(LogStatus.INFO, "Last Name Field is filled");
			adminSettings.fillEmailidFld(driver);
			test.log(LogStatus.INFO, "Verified Email Address field");
			key(driver);
			logger.info("Click on Language");
			adminSettings.clkLanguageBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Language Button");
			adminSettings.clkSelectLanguageBtn(driver);
			test.log(LogStatus.INFO, "Selected Language Button Is Highlighted");
			adminSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			String strprofile = adminSettings.verification(driver);
            if (strprofile.equalsIgnoreCase("pass")) {
            test.log(LogStatus.PASS,"Verified Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }else{
                test.log(LogStatus.FAIL,"Failed Employee Profile Screen In Settings With Selected Data And 'Save' Button");
            }
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminSettings.clkChangeImageTxt(driver);
			test.log(LogStatus.INFO, "Clicked On Change Image Text");
			adminSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			adminSettings.clkSaveBtn(driver);
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
			test = utilities.reportsFile("Admin_Verify Accounts Screen In Settings");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminSettings.clkAccountBtn(driver);
			logger.info("Leave All Fields As Empty & Click on Save Button");
			adminSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Save Button");
			alertMessage = adminSettings.getErrorMsg(driver);
			String strerrormsg = adminSettings.accountsVerification(driver);
            if (strerrormsg.equalsIgnoreCase("pass")) {
                test.log(LogStatus.PASS, "Alert pop up displayed a message as : " + alertMessage);
                }else{
                    test.log(LogStatus.FAIL, "Alert pop up message not displayed");
                }
			adminSettings.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Ok Button");
			logger.info("Fill Old Password Field");
			adminSettings.clkOldPasswordFld(driver, "alex");
			test.log(LogStatus.INFO, "Old Password Field Is Filled With Data");
			logger.info("Fill New Password Field");
			adminSettings.clkNewPasswordFld(driver, "alex");
			test.log(LogStatus.INFO, "New Password Field Is Filled With Data");
			logger.info("Fill Confirm Password Field");
			adminSettings.clkConfirmPasswordFld(driver, "alex");
			test.log(LogStatus.INFO, "Confirm Password Field Is Filled With Data");
			logger.info("Click On Cancel Button");
			adminSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminSettings.clkAccountBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Accounts Button");
			logger.info("Fill Old Password Field");
			adminSettings.clkOldPasswordFld(driver, "alex");
			test.log(LogStatus.INFO, "Old Password Field Is Filled With Data");
			logger.info("Fill New Password Field");
			adminSettings.clkNewPasswordFld(driver, "alex");
			test.log(LogStatus.INFO, "New Password Field Is Filled With Data");
			logger.info("Fill Confirm Password Field");
			adminSettings.clkConfirmPasswordFld(driver, "alex");
			test.log(LogStatus.INFO, "Confirm Password Field Is Filled With Data");
			adminSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked On Save Button");
			test.log(LogStatus.PASS,"Verify Account Details With Filling Old Password,New Password & Confirm Password With 'Save' Button");
			adminSettings.clkOkBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Ok Button");
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminSettings.clkCancelBtn(driver);
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
			test = utilities.reportsFile("Admin_Verify Notifications Toggle In Settings Screen");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminSettings.clkNotificationsToggle(driver);
			test.log(LogStatus.INFO, "Clicked on Notifications Toggle");
			adminSettings.clkNotificationsToggle(driver);
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
			test = utilities.reportsFile("Admin_Verify Change Hotel Screen In Settings");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminSettings.clkChangeHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Change Hotel Button");
			adminSettings.clkAlexHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Alex Hotel ");
			adminSettings.clkCancelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Cancel Button");
			adminSettings.clkChangeHotelBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Change Hotel Button");
			adminSettings.clkAlexHotelBtn(driver);
			screenShot=utilities.captureScreenshot(driver, "ScreenShot");
			test.log(LogStatus.INFO, "Screenshot Taken : " + screenShot);
			adminSettings.clkSaveBtn(driver);
			test.log(LogStatus.INFO, "Clicked on Save Button");
			adminSettings.clkChangeHotelBtn(driver);
			String strverify = adminSettings.alexHotelVerification(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Verified Change Hotel Functionality ");
				adminSettings.clkCancelBtn(driver);
				test.log(LogStatus.INFO, "Clicked on Cancel Button");
				test.log(LogStatus.PASS, "Testcase is Passed");
			} else {
				test.log(LogStatus.FAIL, "Change Hotel Verification Failed");
				adminSettings.clkCancelBtn(driver);
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
			test = utilities.reports.startTest("Admin_Verify Logout Button In Settings");
			test.log(LogStatus.INFO, "Application Is Running On ANDROID Device");
			adminSettings.clkLogoutBtn(driver);
			test.log(LogStatus.INFO, "Logout Button is Clicked");

			String strverify = adminSettings.verifications(driver);
			if (strverify.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, "Verified Logout ");
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