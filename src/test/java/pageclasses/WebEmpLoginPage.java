package pageclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;
public class WebEmpLoginPage extends BaseClass {
	public WebDriver driver = null;
	public static final By HOTELIDFLD = By.xpath("//input[@type='text']");
	public static final By USERNAMEFLD = By.xpath(".//*[@id='login-form']/fieldset/section[2]/label[2]/input");
	public static final By PASSWORDFLD = By.xpath(".//*[@id='login-form']/fieldset/section[3]/label[2]/input");
	public static final By SIGNINCHKBOX = By.xpath(".//*[@id='login-form']/fieldset/section[4]/label/i");
	public static final By SIGNINBTN = By.xpath("//button[@type='submit']");
	public static final By ALERTMSG = By.xpath(".//*[@id='content']/div/div[2]/div[2]/ul/li");
	public static final By HOTELTAPLOGO = By.xpath(".//*[@id='logo']/img");
	public static final By EMP1 = By.xpath(".//*[@id='left-panel']/nav/ul/li[3]/a/span[1]");
	// Constructor
	public WebEmpLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// method to get error message
	public String getAlertMsg(WebDriver driver) {
		String strerrormsg = null;
		{
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
	// method to enter text in email id field
	public void fillHotelIdFld(WebDriver driver, String hotelid) {
		if (hotelid != null) {
			try {
				waitForExpectedElement(driver, HOTELIDFLD);
				driver.findElement(HOTELIDFLD).clear();
				driver.findElement(HOTELIDFLD).sendKeys(hotelid);
			} catch (Exception e) {
				e.getMessage();
			}
		} else
			try {
				waitForExpectedElement(driver, HOTELIDFLD);
				driver.findElement(HOTELIDFLD).clear();
				driver.findElement(HOTELIDFLD).sendKeys(hotelid);
			} catch (Exception e) {
				e.getMessage();
			}
	}
	// method to enter text in username field
	public void fillUsernameFld(WebDriver driver, String username) {
		if (username != null) {
			try {
				waitForExpectedElement(driver, USERNAMEFLD);
				driver.findElement(USERNAMEFLD).clear();
				driver.findElement(USERNAMEFLD).sendKeys(username);
			} catch (Exception e) {
				e.getMessage();
			}
		} else
			try {
				waitForExpectedElement(driver, USERNAMEFLD);
				driver.findElement(USERNAMEFLD).clear();
				driver.findElement(USERNAMEFLD).sendKeys(username);
			} catch (Exception e) {
				e.getMessage();
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
		} else
			try {
				waitForExpectedElement(driver, PASSWORDFLD);
				driver.findElement(PASSWORDFLD).clear();
				driver.findElement(PASSWORDFLD).sendKeys(Password);
			} catch (Exception e) {
				e.getMessage();
			}
	}
	// method to clk on signin button
	public void clkSignInBtn(WebDriver driver) {
		waitForExpectedElement(driver, SIGNINBTN);
		driver.findElement(SIGNINBTN).click();
	}
	// method to clk chkbox
	public void clkChkBox(WebDriver driver) {
		waitForExpectedElement(driver, SIGNINCHKBOX);
		driver.findElement(SIGNINCHKBOX).click();
	}
	// method to verify the page is navigated to home page
	public String verification(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, HOTELTAPLOGO);
			strtext = "pass";
		} catch (Exception e) {
			e.getMessage();
			strtext = "fail";
		}
		return strtext;
	}
	// Method to verify employ login
	public boolean employVerification(WebDriver driver) {
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
	// Method to verify employ login
	public void employlogin(WebDriver driver) {
		waitForExpectedElement(driver, HOTELIDFLD);
		driver.findElement(HOTELIDFLD).sendKeys("hotel14");
		waitForExpectedElement(driver, USERNAMEFLD);
		driver.findElement(USERNAMEFLD).sendKeys("emp1");
		waitForExpectedElement(driver, PASSWORDFLD);
		driver.findElement(PASSWORDFLD).sendKeys("brad");
		waitForExpectedElement(driver, SIGNINCHKBOX);
		driver.findElement(SIGNINCHKBOX).click();
		waitForExpectedElement(driver, SIGNINBTN);
		driver.findElement(SIGNINBTN).click();
	}
}
