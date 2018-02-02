package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;
import utilities.Utilities;

public class AndroidAdminLoginScreen extends BaseClass {

	public AppiumDriver driver;
	public static final By ADMIN_BTN = By.xpath("//android.widget.TextView[@text='Admin']");
	public static final By EMAILADDRESSFLD = By.xpath("//android.widget.EditText[@index='0']");
	public static final By PASSWORDFIELD = By.xpath("//android.view.ViewGroup[@index='3']");
	public static final By SIGNIN_BTN = By.xpath("//android.widget.TextView[@text='Sign In']");
	public static final By LINK_FORGOTPASSWORD = By.xpath("//android.widget.TextView[@text='Forgot Password']");
	public static final By EMPLOYEE_BTN = By.xpath("//android.view.ViewGroup[@index='2']");
	public static final By GETTINGERRORTEXT = By.id("android:id/message");
	public static final By CLKOKBTN = By.xpath("//android.widget.Button[@text='OK']");
	public static final By LINK_FORGOTPASSWORD_CANCELBTN = By.xpath("//android.widget.TextView[@text='Cancel']");
	public static final By DASHBOARD_BOARDSBTN = By.xpath("//android.widget.TextView[@text='Boards']");
	public static final By FORGOTPASSWORD_EMAIL = By.xpath("//android.widget.EditText[@index='0']");
	public static final By SETTINGSBTN_LOGOUTBTN=By.xpath("//android.widget.TextView[@text='Log out']");
    public static final By SETTINGSBTN=By.xpath("//android.widget.TextView[@text='Settings']");
	// Constructor
	public AndroidAdminLoginScreen(AppiumDriver driver) {
		this.driver = driver;
	}

	// method to verify forgot password screen verification
	public String verifications(AppiumDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, DASHBOARD_BOARDSBTN);
			strval = "pass";
		} catch (Exception e) {
			e.getMessage();
			strval = "fail";
		}
		return strval;
	}
	// method to verify forgot password screen
	public String forgotPasswordFldVerification(AppiumDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, FORGOTPASSWORD_EMAIL);
			strval = "pass";
		} catch (Exception e) {
			e.getMessage();
			strval = "fail";
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
	// method to click sign in button
	public void clkSigninBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SIGNIN_BTN);
			driver.findElement(SIGNIN_BTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
		}
	// method to click admin button
	public void clkAdminBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADMIN_BTN);
			driver.findElement(ADMIN_BTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click forgot password link
	public void linkFrgtPasswd(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, LINK_FORGOTPASSWORD);
			driver.findElement(LINK_FORGOTPASSWORD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click cancel button
	public void clkCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, LINK_FORGOTPASSWORD_CANCELBTN);
			driver.findElement(LINK_FORGOTPASSWORD_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on ok button
	public void clkOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, CLKOKBTN);
			driver.findElement(CLKOKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// to verify login functionality with valid and invalid data
	public void fillEmailFld(AppiumDriver driver, String username) {
		if (username != null) {
			try {
				waitForExpectedElement(driver, EMAILADDRESSFLD);
				driver.findElement(EMAILADDRESSFLD).clear();
				driver.findElement(EMAILADDRESSFLD).sendKeys(username);
				key(driver);
			} catch (Exception e) {
				e.getMessage();
			}
		} else {
			try {
				waitForExpectedElement(driver, EMAILADDRESSFLD);
				driver.findElement(EMAILADDRESSFLD).clear();
				driver.findElement(EMAILADDRESSFLD).sendKeys(username);
				key(driver);
			} catch (Exception e) {
				e.getMessage();
			}

		}
	}
	// method to verify password field
	public void fillPasswordFld(AppiumDriver driver, String password) {
		if (password != null) {
			try {
				waitForExpectedElement(driver, PASSWORDFIELD);
				driver.findElement(PASSWORDFIELD).clear();
				driver.findElement(PASSWORDFIELD).sendKeys(password);
				key(driver);
			} catch (Exception e) {
				e.getMessage();
			}
		} else {
			try {
				waitForExpectedElement(driver, PASSWORDFIELD);
				driver.findElement(PASSWORDFIELD).clear();
				driver.findElement(PASSWORDFIELD).sendKeys(password);
				key(driver);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
	//method to do login functionality
	public void login(AppiumDriver driver, String username, String password) {
		try {
			waitForExpectedElement(driver, ADMIN_BTN);
			driver.findElement(ADMIN_BTN).click();
			waitForExpectedElement(driver, EMAILADDRESSFLD);
			driver.findElement(EMAILADDRESSFLD).clear();
			driver.findElement(EMAILADDRESSFLD).sendKeys(username);
			waitForExpectedElement(driver, PASSWORDFIELD);
			driver.findElement(PASSWORDFIELD).clear();
			driver.findElement(PASSWORDFIELD).sendKeys(password);
			key(driver);
			waitForExpectedElement(driver, SIGNIN_BTN);
			driver.findElement(SIGNIN_BTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click logout button
	public void logout(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SETTINGSBTN);
			driver.findElement(SETTINGSBTN).click();
			waitForExpectedElement(driver, SETTINGSBTN_LOGOUTBTN);
			driver.findElement(SETTINGSBTN_LOGOUTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	//method to add verifications in login screen
    public String verification(AppiumDriver driver){
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
