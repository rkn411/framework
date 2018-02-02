package pageclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;
public class WebEmpSettingsPage extends BaseClass {
	WebDriver driver;
	public static final By PROFILEIMG =By.xpath(".//*[@id='mobile-profile-img']/li/a/div/div/img");
	public static final By PROFILETAB =By.xpath(".//*[@id='user-settings-tab-profile']");
	public static final By PROFILEIMG_PROFILE_FIRSTNAMEFLD =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[1]/div/input");
	public static final By PROFILEIMG_PROFILE_LASTNAMEFLD =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[2]/div/input");
	public static final By PROFILEIMG_PROFILE_EMAILFLD =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[3]/div/span");
	public static final By PROFILEIMG_PROFILE_LANGUAGE =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[4]/div/label/select");
	public static final By PROFILEIMG_PROFILE_LANGUAGE_VALUE =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[4]/div/label/select/option[2]");
	public static final By PROFILEIMG_PROFILE_UPLOADIMGBTN =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[5]/div/div/a/button");
	public static final By PROFILEIMG_PROFILE_REMOVEIMG =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[5]/div/div/div/div/div[2]/span");
	public static final By UPDATEPROFILEBTN =By.xpath("html/body/div[2]/div/div[2]/div/div/div[3]/div/button[2]");
	public static final By CANCELBTN =By.xpath("html/body/div[2]/div/div[2]/div/div/div[3]/div/button[1]");
	public static final By PROFILEIMG_ACCOUNTTAB =By.xpath(".//*[@id='user-settings-tab-account']");
	public static final By PROFILEIMG_ACCOUNTTAB_OLDPASSWORD =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[1]/div/input");
	public static final By PROFILEIMG_ACCOUNTTAB_NEWPASSWORD =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[2]/div/input");
	public static final By PROFILEIMG_ACCOUNTTAB_CONFIRMPASSWORD =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[3]/div/input");
	public static final By PROFILEIMG_NOTIFICATIONSBTN =By.xpath(".//*[@id='user-settings-tab-notifications']");
	public static final By PROFILEIMG_NOTIFICATIONS_NOTIFICATIONTOGGLE =By.xpath(".//*[@id='user-settings-pane-notifications']/div/form/div/div/span");
	public static final By ALERTMSG =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[1]/ul/li");
	public static final By SIGNOUTBTN =By.xpath(".//*[@id='logout']/span/a/i");
	public static final By CLOSESYM =By.xpath("html/body/div[2]/div/div[2]/div/div/div[1]/button");
	public static final By NAME =By.xpath("//div[@class='col-md-8 marbot10']");
	public static final By MYPROFILESETTINGS =By.xpath("html/body/div[2]/div/div[2]/div/div/div[1]/h4");
	public static final By EMP1 =By.xpath(".//*[@id='left-panel']/nav/ul/li[3]/a/span[1]");
	public static final By HEADER =By.xpath("//form[@id='login-form']");
	public WebEmpSettingsPage(WebDriver driver) {
		this.driver = driver;
	}
	// Method to click on profile icon
	public void clkProfileBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG);
			driver.findElement(PROFILEIMG).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to verify homepage
	public Boolean verifyLoginPage(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, HEADER);
			driver.findElement(HEADER).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(HEADER).isDisplayed();
	}
	// Method to fill firstname field
	public void fillFirstnameFld(WebDriver driver, String empfirstname) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_FIRSTNAMEFLD);
			driver.findElement(PROFILEIMG_PROFILE_FIRSTNAMEFLD).click();
			driver.findElement(PROFILEIMG_PROFILE_FIRSTNAMEFLD).clear();
			driver.findElement(PROFILEIMG_PROFILE_FIRSTNAMEFLD).sendKeys(empfirstname);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to fill Lastname field
	public void fillLastnameFld(WebDriver driver, String emplastname) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_LASTNAMEFLD);
			driver.findElement(PROFILEIMG_PROFILE_LASTNAMEFLD).clear();
			driver.findElement(PROFILEIMG_PROFILE_LASTNAMEFLD).sendKeys(emplastname);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to fill email field
	public void fillEmailFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_EMAILFLD);
			driver.findElement(PROFILEIMG_PROFILE_EMAILFLD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to get error message
	public String getAlertMsg(WebDriver driver) {
		String strerrormsg = null;
		try {
			strerrormsg = driver.findElement(ALERTMSG).getText();
			System.out.println("string is: " + strerrormsg);

		} catch (Exception e) {
			e.getMessage();
		}
		return strerrormsg;
	}
	// Method to click on Language dropdown
	public void clkLanguagesdropdown(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_LANGUAGE);
			driver.findElement(PROFILEIMG_PROFILE_LANGUAGE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to select value from drop down
	public void clkSelectLanguage(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_LANGUAGE_VALUE);
			driver.findElement(PROFILEIMG_PROFILE_LANGUAGE_VALUE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click update profile button
	public void clkUpdateProfileBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UPDATEPROFILEBTN);
			driver.findElement(UPDATEPROFILEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on cancel button
	public void clkCancelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CANCELBTN);
			driver.findElement(CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Accounts tab
	public void clkAccountstab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNTTAB);
			driver.findElement(PROFILEIMG_ACCOUNTTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter old password field
	public void fillOldPasswordField(WebDriver driver, String password) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNTTAB_OLDPASSWORD);
			driver.findElement(PROFILEIMG_ACCOUNTTAB_OLDPASSWORD).click();
			// driver.findElement(PROFILEIMG_ACCOUNTTAB_OLDPASSWORD).clear();
			driver.findElement(PROFILEIMG_ACCOUNTTAB_OLDPASSWORD).sendKeys(password);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter new password field
	public void fillNewPasswordField(WebDriver driver, String username) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNTTAB_NEWPASSWORD);
			driver.findElement(PROFILEIMG_ACCOUNTTAB_NEWPASSWORD).click();
			driver.findElement(PROFILEIMG_ACCOUNTTAB_NEWPASSWORD).sendKeys(username);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter confirm new password field
	public void fillConfirmPasswordField(WebDriver driver, String cnfmpasswd) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNTTAB_CONFIRMPASSWORD);
			driver.findElement(PROFILEIMG_ACCOUNTTAB_CONFIRMPASSWORD).click();
			driver.findElement(PROFILEIMG_ACCOUNTTAB_CONFIRMPASSWORD).sendKeys(cnfmpasswd);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on notifications btn
	public void clkNotificationsBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_NOTIFICATIONSBTN);
			driver.findElement(PROFILEIMG_NOTIFICATIONSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on notifications btn
	public void clkNotificationsToggle(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_NOTIFICATIONS_NOTIFICATIONTOGGLE);
			driver.findElement(PROFILEIMG_NOTIFICATIONS_NOTIFICATIONTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click the signout button
	public void clkSignoutBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, SIGNOUTBTN);
			driver.findElement(SIGNOUTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click the X symbol in My profile settings popup
	public void clkCloseSym(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CLOSESYM);
			driver.findElement(CLOSESYM).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to verify Employ settings
	public boolean verificationname(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, NAME);
			String strval = driver.findElement(NAME).getText();
			System.out.println("string is: " + strval);
			if (strval.contains("emp1")) {
				strverify = true;
			} else {
				strverify = false;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to verify Employ settings
	public boolean verification(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, EMP1);
			driver.findElement(EMP1).click();
			String strval = driver.findElement(EMP1).getText();
			System.out.println("string is: " + strval);
			if (strval.contains("emp1")) {
				strverify = true;
			} else {
				strverify = false;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to verify Employ settings
	public boolean employVerification(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, MYPROFILESETTINGS);
			driver.findElement(MYPROFILESETTINGS).click();
			String strval = driver.findElement(MYPROFILESETTINGS).getText();
			System.out.println("string is: " + strval);
			if (strval.contains("My Profile Settings")) {
				strverify = true;
			} else {
				strverify = false;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
}
