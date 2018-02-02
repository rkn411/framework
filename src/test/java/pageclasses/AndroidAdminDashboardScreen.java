package pageclasses;


import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;
import utilities.Utilities;

public class AndroidAdminDashboardScreen extends BaseClass {
	public AppiumDriver driver;
	public static final By DASHBOARD_BOARDSBTN = By.xpath("//android.widget.TextView[@text='Boards']");
	public static final By DASHBOARD_TODOBTN = By.xpath("//android.widget.TextView[@text='To do']");
	public static final By DASHBOARD_ADDBTN = By.xpath("//android.widget.TextView[@text='Add']");
	public static final By DASHBOARD_SETTINGSBTN = By.xpath("//android.widget.TextView[@text='Settings']");
	public static final By DASHBOARD_HEADERTXT = By.xpath("//android.widget.TextView[@index='0']");

	// Constructor
	public AndroidAdminDashboardScreen(AppiumDriver driver) {
		this.driver = driver;
	}

	public String verifications(AppiumDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, DASHBOARD_HEADERTXT);
			strval = "pass";
		} catch (Exception e) {
			e.getMessage();
			strval = "fail";
		}
		return strval;
	}

	// method to click on boards button
	public void clkBoardsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_BOARDSBTN);
			driver.findElement(DASHBOARD_BOARDSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on to do button
	public void clkToDoBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_TODOBTN);
			driver.findElement(DASHBOARD_TODOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on Add button
	public void clkAddBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_ADDBTN);
			driver.findElement(DASHBOARD_ADDBTN).click();
				} catch (Exception e) {
			e.getMessage();
		}
		}
	// method to click on settings screen
	public void clkSettingsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_SETTINGSBTN);
			driver.findElement(DASHBOARD_SETTINGSBTN).click();
			} catch (Exception e) {
			e.getMessage();
		}
	}
}
