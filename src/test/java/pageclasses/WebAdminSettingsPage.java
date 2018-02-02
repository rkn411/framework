package pageclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;
public class WebAdminSettingsPage extends BaseClass {
	WebDriver driver;
	public static final By PROFILEIMG =By.xpath(".//*[@id='mobile-profile-img']/li/a/div/div/img");
	public static final By PROFILEIMG_PROFILE_FIRSTNAMEFLD =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[1]/div/input");
	public static final By PROFILEIMG_PROFILE_LASTNAMEFLD =By.xpath("//input[@placeholder='Last Name']");
	public static final By PROFILEIMG_PROFILE_EMAILFLD =By.xpath("//span[@class='form-control']");
	public static final By PROFILEIMG_PROFILE_LANGUAGE =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[4]/div/label/select");
	public static final By PROFILEIMG_PROFILE_LANGUAGE_ENGLISH =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[4]/div/label/select/option[2]");
	public static final By PROFILEIMG_PROFILE_UPLOADIMGBTN =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[5]/div/div/a/button");
	public static final By PROFILEIMG_PROFILE_REMOVEIMG =By.xpath(".//*[@id='user-settings-pane-profile']/div/form/fieldset/div[5]/div/div/div/div/div[2]/span");
	public static final By UPDATEPROFILEBTN =By.xpath("html/body/div[2]/div/div[2]/div/div/div[3]/div/button[2]");
	public static final By CANCELBTN =By.xpath("html/body/div[2]/div/div[2]/div/div/div[3]/div/button[1]");
	public static final By PROFILEIMG_ACCOUNTBTN =By.xpath(".//*[@id='user-settings-tab-account']");
	public static final By PROFILEIMG_ACCOUNT_OLDPASSWORDFLD =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[1]/div/input");
	public static final By PROFILEIMG_ACCOUNT_NEWPASSWORDFLD =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[2]/div/input");
	public static final By PROFILEIMG_ACCOUNT_CONFIRMPASSWORDFLD =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[3]/div/input");
	public static final By PROFILEIMG_NOTIFICATIONSBTN =By.xpath(".//*[@id='user-settings-tab-notifications']");
	public static final By PROFILEIMG_NOTIFICATIONS_NOTIFICATIONTOGGLE =By.xpath(".//*[@id='user-settings-pane-notifications']/div/form/div/div/span");
	public static final By ALERTMSG =By.xpath(".//*[@id='user-settings-pane-account']/div/form/fieldset/div[1]/ul/li");
	public static final By SIGNOUTBTN =By.xpath(".//*[@id='logout']/span/a/i");
	public static final By CHANGEHOTEL =By.xpath(".//*[@id='header']/div[2]/span/span/i");
	public static final By HOTEL =By.xpath(".//*[@id='header']/div[2]/span/ul/li[1]/a");
	public static final By CLOSESYM =By.xpath("html/body/div[2]/div/div[2]/div/div/div[1]/button");
	public static final By MYPROFILESETTINGS =By.xpath("html/body/div[2]/div/div[2]/div/div/div[1]/h4");
	public static final By NAME =By.xpath("//div[@class='col-md-8 marbot10']");
	public static final By ALEX =By.xpath(".//*[@id='left-panel']/nav/ul/li[1]/a/span[1]");
	public static final By HEADER =By.xpath("//form[@id='login-form']");
	public static final By HOTELNAME =By.xpath("//span[@class='project-selector dropdown-toggle']");
	public WebAdminSettingsPage(WebDriver driver) {
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
	public void fillFirstnameFld(WebDriver driver, String firstname) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_FIRSTNAMEFLD);
			// driver.findElement(PROFILEIMG_PROFILE_FIRSTNAMEFLD).click();
			driver.findElement(PROFILEIMG_PROFILE_FIRSTNAMEFLD).clear();
			driver.findElement(PROFILEIMG_PROFILE_FIRSTNAMEFLD).sendKeys(firstname);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to fill Lastnamefield
	public void fillLastnameFld(WebDriver driver, String lastname) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_LASTNAMEFLD);
			// driver.findElement(PROFILEIMG_PROFILE_LASTNAMEFLD).click();
			driver.findElement(PROFILEIMG_PROFILE_FIRSTNAMEFLD).clear();
			driver.findElement(PROFILEIMG_PROFILE_LASTNAMEFLD).sendKeys(lastname);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to fill email field
	public String getEmailFld(WebDriver driver) {
		String stremail = null;
		try {
			driver.findElement(PROFILEIMG_PROFILE_EMAILFLD).click();
			stremail = driver.findElement(PROFILEIMG_PROFILE_EMAILFLD).getText();
			System.out.println("string is: " + stremail);
		} catch (Exception e) {
			e.getMessage();
		}
		return stremail;
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
	// Method to clk Languages btn
	public void clkLanguagesBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_LANGUAGE);
			driver.findElement(PROFILEIMG_PROFILE_LANGUAGE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to select english language
	public void clkSelectLanguageBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_PROFILE_LANGUAGE_ENGLISH);
			driver.findElement(PROFILEIMG_PROFILE_LANGUAGE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click update profile btn
	public void clkUpdateProfileBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UPDATEPROFILEBTN);
			driver.findElement(UPDATEPROFILEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click cancel btn
	public void clkCancelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CANCELBTN);
			driver.findElement(CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Accounts tab
	public void clkAccountstab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNTBTN);
			driver.findElement(PROFILEIMG_ACCOUNTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter old password field
    public void fillOldPasswordField(WebDriver driver, String oldPassword) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNT_OLDPASSWORDFLD);
			driver.findElement(PROFILEIMG_ACCOUNT_OLDPASSWORDFLD).click();
			driver.findElement(PROFILEIMG_ACCOUNT_OLDPASSWORDFLD).sendKeys(oldPassword);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter new password field
	public void fillNewPasswordField(WebDriver driver, String newPassword) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNT_NEWPASSWORDFLD);
			driver.findElement(PROFILEIMG_ACCOUNT_NEWPASSWORDFLD).click();
			driver.findElement(PROFILEIMG_ACCOUNT_NEWPASSWORDFLD).sendKeys(newPassword);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter confirm new password field
	public void fillConfirmPasswordField(WebDriver driver, String confirmPassword) {
		try {
			waitForExpectedElement(driver, PROFILEIMG_ACCOUNT_CONFIRMPASSWORDFLD);
			driver.findElement(PROFILEIMG_ACCOUNT_CONFIRMPASSWORDFLD).click();
			driver.findElement(PROFILEIMG_ACCOUNT_CONFIRMPASSWORDFLD).sendKeys(confirmPassword);
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
	// method to click on change hotel
	public void clkChangeHotelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHANGEHOTEL);
			driver.findElement(CHANGEHOTEL).click();
			Thread.sleep(6000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to select the required hotel
	public void clkHotelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, HOTEL);
			driver.findElement(HOTEL).click();
			Thread.sleep(6000);
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
	// method for profile verification
	public Boolean profileVerification(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, NAME);
			driver.findElement(NAME).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(NAME).isDisplayed();
	}
	// Method to click on Alex
	public boolean adminPageVerification(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, ALEX);
			// driver.findElement(ALEX).click();
			String strval = driver.findElement(ALEX).getText();
			System.out.println("string is: " + strval);
			if (strval.contains("Alex")) {
				strverify = true;
			} else {
				strverify = false;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to click on Mark Hotel
	public boolean verifyHotelName(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, NAME);
			String strval = driver.findElement(NAME).getText();
			System.out.println("string is: " + strval);
			if (strval.contains("Mark")) {
				strverify = true;
			} else {
				strverify = false;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to verify admin settings
	public boolean adminVerification(WebDriver driver) {
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
	// method to select language from the dropdown
	public void selectlanguage(WebDriver driver) {
		String strval = null;
		try {
			if (strval.contains("English")) {
				waitForExpectedElement(driver, PROFILEIMG_PROFILE_LANGUAGE_ENGLISH);
				driver.findElement(PROFILEIMG_PROFILE_LANGUAGE_ENGLISH).click();
			} else {
				waitForExpectedElement(driver, MYPROFILESETTINGS);
				driver.findElement(MYPROFILESETTINGS).click();
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to get error message
	public String gethotelname(WebDriver driver) {
		String name = null;
		{
			name = driver.findElement(HOTELNAME).getText();
			System.out.println("Hotel Name is: " + name);
		}
		return name;
	}
	public Boolean verification(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, HOTELNAME);
			driver.findElement(HOTELNAME).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(HOTELNAME).isDisplayed();
	}
}
