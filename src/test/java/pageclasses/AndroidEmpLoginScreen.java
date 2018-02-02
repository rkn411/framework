package pageclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;
import utilities.Utilities;

public class AndroidEmpLoginScreen extends BaseClass {
	// create driver
	public AppiumDriver driver;
	public static final By EMPLOYEEBTN = By.xpath("//android.view.ViewGroup[@index='0']");
	public static final By HOTEL_IDFLD = By.xpath("//android.widget.EditText[@index='0']");
	public static final By USERNAMEFLD = By.xpath("//android.view.ViewGroup[@index='3']");
	public static final By EMPPASSWORDFLD = By.xpath("//android.view.ViewGroup[@index='4']");
	public static final By EMPLOYEE_BTN = By.xpath("//android.view.ViewGroup[@index='2']");
	public static final By GETTINGERRORTEXT = By.id("android:id/message");
	public static final By SIGNIN_BTN = By.xpath("//android.widget.TextView[@text='Sign In']");
	public static final By CLKOKBTN = By.xpath("//android.widget.Button[@text='OK']");
	public static final By SETTINGSBTN = By.xpath("//android.widget.TextView[@text='Settings']");
	public static final By SETTINGSBTN_LOGOUTBTN = By.xpath("//android.widget.TextView[@text='Log out']");
	public static final By DASHBOARD_BOARDSBTN = By.xpath("//android.widget.TextView[@text='Boards']");

	// Constructor
	public AndroidEmpLoginScreen(AppiumDriver driver) {
		this.driver = driver;
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
    
	//method to login
    public void login(AppiumDriver driver,String username,String hotelname,String emppassword){
        try{
            waitForExpectedElement(driver, HOTEL_IDFLD);
            driver.findElement(HOTEL_IDFLD).clear();
            driver.findElement(HOTEL_IDFLD).sendKeys(username);
            key(driver);
            waitForExpectedElement(driver, USERNAMEFLD);
            driver.findElement(USERNAMEFLD).clear();
            driver.findElement(USERNAMEFLD).sendKeys(hotelname);
            waitForExpectedElement(driver, EMPPASSWORDFLD);
            driver.findElement(EMPPASSWORDFLD).clear();
            driver.findElement(EMPPASSWORDFLD).sendKeys(emppassword);
            waitForExpectedElement(driver, SIGNIN_BTN);
            driver.findElement(SIGNIN_BTN).click();
        } catch (Exception e) {
            e.getMessage();
        }
    }
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

	// method for click hotelid
	public void clkEmployeeBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, EMPLOYEEBTN);
			driver.findElement(EMPLOYEEBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to get error message
	public void getErrorTxt(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, GETTINGERRORTEXT);
			driver.findElement(GETTINGERRORTEXT).getText();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	public void clkOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, CLKOKBTN);
			driver.findElement(CLKOKBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	public void clkSigninBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, SIGNIN_BTN);
			driver.findElement(SIGNIN_BTN).click();
			} catch (Exception e) {
			e.getMessage();
		}
		}

	// to verify hotelid field
	public void fillHotelidFld(AppiumDriver driver, String username) {
		if (username != null) {
			try {
				waitForExpectedElement(driver, HOTEL_IDFLD);
				driver.findElement(HOTEL_IDFLD).clear();
				driver.findElement(HOTEL_IDFLD).sendKeys(username);
				key(driver);
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Element Not Found");
			}
		} else {
			try {
				waitForExpectedElement(driver, HOTEL_IDFLD);
				driver.findElement(HOTEL_IDFLD).clear();
				driver.findElement(HOTEL_IDFLD).sendKeys(username);
				key(driver);
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Element Not Found");
			}

		}
	}

	// to verify user name field
	public void fillUserNameFld(AppiumDriver driver, String hotelname) {
		if (hotelname != null) {
			try {
				waitForExpectedElement(driver, USERNAMEFLD);
				driver.findElement(USERNAMEFLD).clear();
				driver.findElement(USERNAMEFLD).sendKeys(hotelname);
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Element Not Found");
			}
		} else {
			try {
				waitForExpectedElement(driver, USERNAMEFLD);
				driver.findElement(USERNAMEFLD).clear();
				driver.findElement(USERNAMEFLD).sendKeys(hotelname);
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Element Not Found");
			}
		}
	}

	// to verify emppassword field
	public void fillemppasswordFld(AppiumDriver driver, String emppassword) {
		if (emppassword != null) {
			try {
				waitForExpectedElement(driver, EMPPASSWORDFLD);
				driver.findElement(EMPPASSWORDFLD).clear();
				driver.findElement(EMPPASSWORDFLD).sendKeys(emppassword);
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Element Not Found");
			}
		} else {
			try {
				waitForExpectedElement(driver, EMPPASSWORDFLD);
				driver.findElement(EMPPASSWORDFLD).clear();
				driver.findElement(EMPPASSWORDFLD).sendKeys(emppassword);
			} catch (Exception e) {
				e.getMessage();
				System.out.println("Element Not Found");
			}
		}
	}

	// method to click logout
	public void logout(AppiumDriver driver) {

		try {
			waitForExpectedElement(driver, SETTINGSBTN);
			driver.findElement(SETTINGSBTN).click();
			waitForExpectedElement(driver, SETTINGSBTN_LOGOUTBTN);
			driver.findElement(SETTINGSBTN_LOGOUTBTN).click();

		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}

	}

	// method to get error message
	public String getAlertMessage(AppiumDriver driver) {
		String alertMessage = null;
		try {
			waitForExpectedElement(driver, GETTINGERRORTEXT);
			alertMessage = driver.findElement(GETTINGERRORTEXT).getText();
			System.out.println(alertMessage);
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
		return alertMessage;
	}

}
