package pageclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;
public class WebAdminLoginPage extends BaseClass {
	public WebDriver driver = null;
	public static final By IAMADMINLNK = By.linkText("I am an Admin");
	public static final By EMAILFLD = By.xpath("//input[@type='text']");
	public static final By PASSWORDFLD = By.xpath(".//*[@id='login-form']/fieldset/section[2]/label[2]/input");
	public static final By SIGNINCHKBOX = By.xpath(".//*[@id='login-form']/fieldset/section[3]/label/i");
	public static final By SIGNINBTN = By.xpath("//button[@type='submit']");
	public static final By ALERTMSG = By.xpath(".//*[@id='content']/div/div[2]/div[2]/ul/li");
	public static final By FORGOTPASSWORDLNK = By.linkText("I forgot my password?");
	public static final By HEADER = By.xpath("//form[@id='login-form']");
	public static final By HOTELTAPLOGO = By.xpath(".//*[@id='logo']/img");
	public static final By ALEX = By.xpath(".//*[@id='left-panel']/nav/ul/li[1]/a/span[1]");
	// Constructor
	public WebAdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// method to get error message
	public String getAlertMsg(WebDriver driver) {
		String strerrormsg = null;
		{
			waitForExpectedElement(driver, ALERTMSG);
			strerrormsg = driver.findElement(ALERTMSG).getText();
			System.out.println("alert message: " + strerrormsg);
		}
		return strerrormsg;
	}
	// Method to verify the Login test
	public Boolean verify(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, ALERTMSG);
			driver.findElement(ALERTMSG).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(ALERTMSG).isDisplayed();
	}
	// method to click on I am Admin Link
	public void clkIAmAdminLnk(WebDriver driver) {
		waitForExpectedElement(driver, IAMADMINLNK);
		driver.findElement(IAMADMINLNK).click();
	}
	// method to enter text in email id field
	public void fillEmailidFld(WebDriver driver, String Emailid) {
		if (Emailid != null) {
			try {
				waitForExpectedElement(driver, EMAILFLD);
				driver.findElement(EMAILFLD).clear();
				driver.findElement(EMAILFLD).sendKeys(Emailid);
			} catch (Exception e) {
				e.getMessage();
			}
		} else {
			try {
				waitForExpectedElement(driver, EMAILFLD);
				driver.findElement(EMAILFLD).clear();
				driver.findElement(EMAILFLD).sendKeys(Emailid);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
	// method to enter text in password field
	public void fillPasswordFld(WebDriver driver, String Password) {
		if (Password != null) {
			try {
				waitForExpectedElement(driver, PASSWORDFLD);
				driver.findElement(PASSWORDFLD).clear();
				driver.findElement(PASSWORDFLD).sendKeys(Password);
			} catch (Exception e) {
				e.getMessage();
			}
		} else {
			try {
				waitForExpectedElement(driver, PASSWORDFLD);
				driver.findElement(PASSWORDFLD).clear();
				driver.findElement(PASSWORDFLD).sendKeys(Password);
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
	// method to clk on signin button
	public void clkSignInBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, SIGNINBTN);
			driver.findElement(SIGNINBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to clk chkbox
	public void clkChkBox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, SIGNINCHKBOX);
			driver.findElement(SIGNINCHKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// methodclk i forgot my password link
	public void clkForgotPasswordLink(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FORGOTPASSWORDLNK);
			driver.findElement(FORGOTPASSWORDLNK).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to verify the page is navigated to home page
	public String verification(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, ALEX);
			strtext = "pass";
		} catch (Exception e) {
			e.getMessage();
			strtext = "fail";
		}
		return strtext;
	}
	// Method to click on Alex
	public boolean adminVerification(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, ALEX);
			driver.findElement(ALEX).click();
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
	// Method to verify Forgot Password Page
	public Boolean verifyForgotPassword(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, HEADER);
			driver.findElement(HEADER).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(HEADER).isDisplayed();
	}
	// Method for login
	public void login(WebDriver driver) {
		try {
			waitForExpectedElement(driver, IAMADMINLNK);
			driver.findElement(IAMADMINLNK).click();
			driver.findElement(EMAILFLD).sendKeys("alex@mailinator.com");
			driver.findElement(PASSWORDFLD).sendKeys("alex");
			driver.findElement(SIGNINCHKBOX).click();
			driver.findElement(SIGNINBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

