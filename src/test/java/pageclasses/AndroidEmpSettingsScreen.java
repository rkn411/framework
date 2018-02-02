package pageclasses;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;
import utilities.Utilities;

public class AndroidEmpSettingsScreen extends BaseClass {
	
	//create driver
	public AppiumDriver driver;
	public static final By SETTINGSBTN=By.xpath("//android.widget.TextView[@text='Settings']");
	public static final By HOTELIDFLD = By.xpath("//android.widget.EditText[@index='0']");
	public static final By SETTINGSBTN_PROFILEBTN=By.xpath("//android.widget.TextView[@text='Profile']");
	public static final By SETTINGSBTN_ACCOUNTBTN=By.xpath("//android.widget.TextView[@text='Account']");
	public static final By SETTINGSBTN_NOTIFICATIONTOGGLE=By.xpath("//android.widget.Switch[@index='1']");
	public static final By SETTINGSBTN_CHANGEHOTELBTN=By.xpath("//android.widget.TextView[@text='Change Hotel']");
	public static final By SETTINGSBTN_LOGOUTBTN=By.xpath("//android.widget.TextView[@text='Log out']");
	public static final By SETTINGSBTN_PROFILEBTN_FULLNAMEFLD=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.EditText[1]");
	public static final By SETTINGSBTN_PROFILEBTN_LASTNAMEFLD=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.EditText[1]");
	public static final By SETTINGSBTN_PROFILEBTN_LANGUAGEBTN=By.xpath("//android.widget.TextView[@text='Language']");
	public static final By SETTINGSBTN_PROFILEBTN_LANGUAGE_ENGLISH=By.xpath("//android.widget.TextView[@text='English']");
	public static final By SETTINGSBTN_PROFILEBTN_CHANGEIMAGEBTN=By.xpath("//android.widget.TextView[@text='Change Image']");
	public static final By SETTINGSBTN_ACCOUNTBTN_OLDPASSWORDFLD=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.EditText[1]");//xpath pending
	public static final By SETTINGSBTN_ACCOUNTBTN_NEWPASSWORDFLD=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.EditText[1]");//xpath pending 
	public static final By SETTINGSBTN_ACCOUNTBTN_CONFIRMNEWPASSWORDFLD=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.EditText[1]");//xpath pending
	public static final By SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL=By.xpath("//android.widget.TextView[@text='Grand Hotel']");
	public static final By SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL_SAVE=By.xpath("//android.widget.TextView[@text='Save']");
	public static final By SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL_CANCEL=By.xpath("//android.widget.TextView[@text='Cancel']");
	public static final By CLKOKBTN=By.xpath("//android.widget.Button[@text='OK']");
	public static final By SETTINGS_PROFILE_CHANGEIMAGETXT=By.xpath("//android.widget.TextView[@text='Change Image']");
	public static final By SETTINGS_PROFILE_CHANGEIMAGETXT_CANCELBTN=By.xpath("//android.widget.TextView[@text='Cancel']");
	public static final By GETTINGERRORTEXT = By.id("android:id/message");
	public static final By GRANDHOTEL=By.xpath("//android.widget.TextView[@index='1']");
	public static final By SETTINGS_PROFILETXT=By.xpath("//android.widget.TextView[@text='Profile']");

	// Constructor
	public AndroidEmpSettingsScreen(AppiumDriver driver) {
		this.driver = driver;
	}

	// method to verify logout functionality
	public String verifications(AppiumDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, HOTELIDFLD);
			strval = "pass";
		} catch (Exception e) {
			e.getMessage();
			strval = "fail";
		}
		return strval;
	}

	// method to verify grand hotel in change hotel
	public String grandHotelVerification(AppiumDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, GRANDHOTEL);
			strval = "pass";
		} catch (Exception e) {
			e.getMessage();
			strval = "fail";
		}
		return strval;
	}

	// method to verify profile screen with blank values
	public String profileVerification(AppiumDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN);
			strval = "fail";
		} catch (Exception e) {
			e.getMessage();
			strval = "pass";
		}
		return strval;
	}

	// method to get error message
	public String getErrorMsg(AppiumDriver driver) {
		String strerrormsg = null;
		try {
			strerrormsg = driver.findElement(GETTINGERRORTEXT).getText();
			System.out.println("string is: " + strerrormsg);

		} catch (Exception e) {
			e.getMessage();
		}
		return strerrormsg;
	}

	// method to click change image text
	public void clkChangeImageTxt(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGS_PROFILE_CHANGEIMAGETXT);
			driver.findElement(SETTINGS_PROFILE_CHANGEIMAGETXT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click settings button
	public void clkSettingsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN);
			driver.findElement(SETTINGSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click profile button
	public void clkProfileBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN);
			driver.findElement(SETTINGSBTN_PROFILEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click account button
	public void clkAccountBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_ACCOUNTBTN);
			driver.findElement(SETTINGSBTN_ACCOUNTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click notifications toggle button
	public void clkNotificationsToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_NOTIFICATIONTOGGLE);
			driver.findElement(SETTINGSBTN_NOTIFICATIONTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click change hotel button
	public void clkChangeHotelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_CHANGEHOTELBTN);
			driver.findElement(SETTINGSBTN_CHANGEHOTELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click logout button
	public void clkLogoutBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_LOGOUTBTN);
			driver.findElement(SETTINGSBTN_LOGOUTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click full name field
	public void fillFullNameFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN_FULLNAMEFLD);
			driver.findElement(SETTINGSBTN_PROFILEBTN_FULLNAMEFLD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click last name field
	public void fillLastNameFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN_LASTNAMEFLD);
			driver.findElement(SETTINGSBTN_PROFILEBTN_LASTNAMEFLD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click language field
	public void clkLanguageBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN_LANGUAGEBTN);
			driver.findElement(SETTINGSBTN_PROFILEBTN_LANGUAGEBTN).click();
			driver.findElement(SETTINGSBTN_PROFILEBTN_LANGUAGEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click and select language field
	public void clkSelectLanguageBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN_LANGUAGE_ENGLISH);
			driver.findElement(SETTINGSBTN_PROFILEBTN_LANGUAGE_ENGLISH).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click change image link
	public void clkChangeImageLink(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN_CHANGEIMAGEBTN);
			driver.findElement(SETTINGSBTN_PROFILEBTN_CHANGEIMAGEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click and enter old password field
	public void clkOldPasswordFld(AppiumDriver driver, String password) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_ACCOUNTBTN_OLDPASSWORDFLD);
			driver.findElement(SETTINGSBTN_ACCOUNTBTN_OLDPASSWORDFLD).sendKeys(password);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click and enter new password Fld
	public void clkNewPasswordFld(AppiumDriver driver, String username) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_ACCOUNTBTN_NEWPASSWORDFLD);
			driver.findElement(SETTINGSBTN_ACCOUNTBTN_NEWPASSWORDFLD).sendKeys(username);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click and enter confirm new password field
	public void clkConfirmPasswordFld(AppiumDriver driver, String cnfmpasswd) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_ACCOUNTBTN_CONFIRMNEWPASSWORDFLD);
			driver.findElement(SETTINGSBTN_ACCOUNTBTN_CONFIRMNEWPASSWORDFLD).sendKeys(cnfmpasswd);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click alex hotel button
	public void clkGrandHotelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL);
			driver.findElement(SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click save button
	public void clkSaveBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL_SAVE);
			driver.findElement(SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL_SAVE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click cancel button
	public void clkCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL_CANCEL);
			driver.findElement(SETTINGSBTN_CHANGEHOTEL_GRANDHOTEL_CANCEL).click();
		} catch (Exception e) {
			e.getMessage();
		}
		}

	// method to click ok button
	public void clkOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, CLKOKBTN);
			driver.findElement(CLKOKBTN).click();
			} catch (Exception e) {
			e.getMessage();
		}
		}

	// method to click full name field
	public void clkFullNameFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN_FULLNAMEFLD);
			driver.findElement(SETTINGSBTN_PROFILEBTN_FULLNAMEFLD).clear();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click last name field
	public void clkLastNameFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN_PROFILEBTN_LASTNAMEFLD);
			driver.findElement(SETTINGSBTN_PROFILEBTN_LASTNAMEFLD).clear();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to verify buttons in dashboard screen
    public String verification(AppiumDriver driver) {
        String strval = null;
        try {
            waitForExpectedElement(driver, SETTINGS_PROFILETXT);
            strval = "pass";
        } catch (Exception e) {
            e.getMessage();
            strval = "fail";
        }
        return strval;
    }
  //method to add verifications in login screen
    public String accountsVerification(AppiumDriver driver){
        String strerrormsg=null;
        try{
            waitForExpectedElement(driver, GETTINGERRORTEXT);
            strerrormsg = "pass";
        } catch (Exception e) {
            e.getMessage();
            strerrormsg = "fail";
            
        }
        return strerrormsg;
        
    }
}
