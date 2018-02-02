package pageclasses;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;
import utilities.Utilities;
public class AndroidAdminAddScreen extends BaseClass {
	//create driver
	public AppiumDriver driver;
	public static final By ADDBTN=By.xpath("//android.widget.TextView[@text='Add']");
	public static final By ADD_POSTBTN=By.xpath("//android.widget.TextView[@text='Post']");
	public static final By ADD_NOTEFROMBTN=By.xpath("//android.widget.TextView[@text='Note From']");
	public static final By ADD_GUESTCOMPLAINTTOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.Switch[1]");
	public static final By ADD_NOTEFIELD=By.xpath("//android.widget.EditText[@text='Enter Note']");
	public static final By ADD_CONVERTTOTASK=By.xpath("//android.widget.TextView[@text='Convert to Task']");
	public static final By ADD_POSTBTN_GETERRORMESSAGETXT=By.xpath("//android.widget.TextView[@text='Please select note From']");
	public static final By ADD_POSTBTN_CLKERRORMESSAGEOKBTN=By.xpath("//android.widget.Button[@text='OK']");
	public static final By ADD_CONVERTTOTASK_TASKFROMBTN=By.xpath("//android.widget.TextView[@text='Task From']");
	public static final By ADD_CONVERTTOTASK_ASSIGNTOBTN=By.xpath("//android.widget.TextView[@text='Assign To']");
	public static final By ADD_CONVERTTOTASK_SUBJECTFLD=By.xpath("//android.widget.EditText[@index='6']");
	public static final By ADD_CONVERTTOTASK__DUEDATEFLD=By.xpath("//android.widget.ImageView[@index='1']");
	public static final By ADD_CONVERTTOTASK_TASKDESCRIPTIONFLD=By.xpath("//android.widget.EditText[@index='10']");
	public static final By ADD_CONVERTTOTASK_CONVERTTONOTETXT=By.xpath("//android.widget.TextView[@text='Convert To Note']");
	public static final By ADD_NOTEFROM_DEPARTMENTS=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.Switch[1]");
	public static final By ADD_NEWNOTE_NOTETXTFLD=By.xpath("//android.widget.EditText[@index='5']");
	public static final By GETTINGERRORTEXT = By.id("android:id/message");
	public static final By DASHBOARD_TODOBTN = By.xpath("//android.widget.TextView[@text='To do']");
	public static final By BOARDS_COMMENT_COUNT=By.xpath("//android.view.ViewGroup[@index='1']");
	// Constructor
	public AndroidAdminAddScreen(AppiumDriver driver) {
		this.driver = driver;
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
	// method to get error message
	public String getAlertMessage(AppiumDriver driver) {
		String alertMessage = null;
		try {
			waitForExpectedElement(driver, GETTINGERRORTEXT);
			alertMessage = driver.findElement(GETTINGERRORTEXT).getText();
			System.out.println("string is: " + alertMessage);
		} catch (Exception e) {
			e.getMessage();
		}
		return alertMessage;
	}
	//method to add verifications in login screen
	public String verification(AppiumDriver driver) {
		String strerrormsg = null;
		try {
			waitForExpectedElement(driver, GETTINGERRORTEXT);
			strerrormsg = "pass";
		} catch (Exception e) {
			e.getMessage();
			strerrormsg = "fail";
		}
		return strerrormsg;
	}
	// method to click on departments field
	public void clkDepartmentsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_NOTEFROM_DEPARTMENTS);
			driver.findElement(ADD_NOTEFROM_DEPARTMENTS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on due date field
	public void clkDueDateFld(AppiumDriver driver) {
		try {

			waitForExpectedElement(driver, ADD_CONVERTTOTASK__DUEDATEFLD, 60);
			driver.findElement(ADD_CONVERTTOTASK__DUEDATEFLD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on text box field
	public void clkTextboxField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_NEWNOTE_NOTETXTFLD);
			driver.findElement(ADD_NEWNOTE_NOTETXTFLD).sendKeys("qwerty");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click add button
	public void clkAddBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADDBTN);
			driver.findElement(ADDBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click post button
	public void clkPostBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_POSTBTN);
			driver.findElement(ADD_POSTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click note from button
	public void clkNoteFromBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_NOTEFROMBTN);
			driver.findElement(ADD_NOTEFROMBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click guest complaint toggle
	public void clkGuestComplaintToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_GUESTCOMPLAINTTOGGLE);
			driver.findElement(ADD_GUESTCOMPLAINTTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter text to note field
	public void clkNoteFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_NOTEFIELD);
			driver.findElement(ADD_NOTEFIELD).clear();
			driver.findElement(ADD_NOTEFIELD).sendKeys("Entering Text Into Note Field");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click convert to task text
	public void clkConvertToTaskTxt(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK);
			driver.findElement(ADD_CONVERTTOTASK).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to get error message text
	public void getErrorMsgTxt(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_POSTBTN_GETERRORMESSAGETXT);
			driver.findElement(ADD_POSTBTN_GETERRORMESSAGETXT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click ok button
	public void clkOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_POSTBTN_CLKERRORMESSAGEOKBTN);
			driver.findElement(ADD_POSTBTN_CLKERRORMESSAGEOKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click task from text
	public void clkTaskFrom(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_TASKFROMBTN);
			driver.findElement(ADD_CONVERTTOTASK_TASKFROMBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click assign to button
	public void clkAssignToBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_ASSIGNTOBTN);
			driver.findElement(ADD_CONVERTTOTASK_ASSIGNTOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter text to subject field
	public void clkSubjectFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_SUBJECTFLD);
			driver.findElement(ADD_CONVERTTOTASK_SUBJECTFLD).sendKeys("Enter Text Into Subject Field");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter text to task description field
	public void clkTaskDescriptionFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_TASKDESCRIPTIONFLD);
			driver.findElement(ADD_CONVERTTOTASK_TASKDESCRIPTIONFLD).click();
			driver.findElement(ADD_CONVERTTOTASK_TASKDESCRIPTIONFLD).sendKeys("Entering Some Text Into Task Description Field");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on convert to note text
	public void clkConvertToTask(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_CONVERTTONOTETXT);
			driver.findElement(ADD_CONVERTTOTASK_CONVERTTONOTETXT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}