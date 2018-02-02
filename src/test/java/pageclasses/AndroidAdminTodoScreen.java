package pageclasses;

import java.awt.TextField;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import utilities.BaseClass;
import utilities.Utilities;

public class AndroidAdminTodoScreen extends BaseClass {
	// create driver
	public AppiumDriver driver;
	public static final By TODOBTN = By.xpath("//android.view.ViewGroup[@index='1']");
	public static final By TODOBTN_ALEX = By.xpath("//android.widget.TextView[@text='Alex']");
	public static final By TODOBTN_ALEX_OVERDUEBTN = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
	public static final By TODOBTN_ALEX_TODAYBTN = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]");
	public static final By TODOBTN_ALEX_FUTUREBTN = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.TextView[1]");
	public static final By TODOBTN_ALEX_BACK = By.xpath("//android.widget.TextView[@text='Back']");
	public static final By ADDBTN = By.xpath("//android.widget.TextView[@text='Add']");
	public static final By ADD_POSTBTN = By.xpath("//android.widget.TextView[@text='Post']");
	public static final By ADD_GUESTCOMPLAINTTOGGLE = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.Switch[1]");
	public static final By ADD_NOTEFIELD = By.xpath("//android.widget.EditText[@text='Enter Note']");
	public static final By ADD_CONVERTTOTASK = By.xpath("//android.widget.TextView[@text='Convert to Task']");
	public static final By ADD_POSTBTN_GETERRORMESSAGETXT = By.xpath("//android.widget.TextView[@text='Please select note From']");
	public static final By ADD_POSTBTN_CLKERRORMESSAGEOKBTN = By.id("android:id/button1");
	public static final By ADD_CONVERTTOTASK_TASKFROMBTN = By.xpath("//android.widget.TextView[@text='Task From']");
	public static final By ADD_CONVERTTOTASK_ASSIGNTOBTN = By.xpath("//android.widget.TextView[@text='Assign To']");
	public static final By ADD_CONVERTTOTASK_SUBJECTFLD = By.xpath("//android.widget.EditText[@index='6']");
	public static final By ADD_CONVERTTOTASK__DUEDATEFLD = By.xpath("//android.widget.ImageView[@index='1']");
	public static final By ADD_CONVERTTOTASK_TASKDESCRIPTIONFLD = By.xpath("//android.widget.EditText[@index='10']");
	public static final By ADD_CONVERTTOTASK_CONVERTTONOTETXT = By.xpath("//android.widget.TextView[@text='Convert To Note']");
	public static final By ADD_ERRORMSG = By.xpath("//android.widget.TextView[@text='Please select note From']");
	public static final By ADD_NOTEFROM_DEPARTMENTS = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.Switch[1]");
	public static final By ADD_NEWNOTE_NOTETXTFLD = By.xpath("//android.widget.EditText[@index='5']");
	public static final By BOARDS_ALEX_COMMENT_COPYTO_ADMINHOTELTOGGLE = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.Switch[1]");
	public static final By GETTINGERRORTEXT = By.id("android:id/message");
	public static final By GETTINGSUCEESSTEXT = By.id("android:id/message");
	public static final By CLICKING_BTNS = By.xpath("//android.widget.TextView[@index='0']");
	public static final By GETTING_BUTTONSLIST = By.xpath("//android.widget.TextView[@index='1']");
	public static final By ALEX_TOGGLE = By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Switch[1]");
	
	// Constructor
	public AndroidAdminTodoScreen(AppiumDriver driver) {
		this.driver = driver;
	}
	//method to get error message
		public String getErrorMsg(AppiumDriver driver) {
			String strerrormsg = null;
			try {
				waitForExpectedElement(driver,(GETTINGERRORTEXT));
				strerrormsg = driver.findElement(GETTINGERRORTEXT).getText();
				System.out.println("string is: " + strerrormsg);
				
			} catch (Exception e) {
				e.getMessage();
			}
			return strerrormsg;
		}
		//method to get error message
				public String getSuceessMsg(AppiumDriver driver) {
					String strerrormsg = null;
					try {
						waitForExpectedElement(driver,(GETTINGSUCEESSTEXT));
						strerrormsg = driver.findElement(GETTINGSUCEESSTEXT).getText();
						System.out.println("string is: " + strerrormsg);
						
					} catch (Exception e) {
						e.getMessage();
					}
					return strerrormsg;
				}
		// method to click on overdue field
		public String getOverDueTaskCount(AppiumDriver driver) {
			String overDueCount=null;
			try {
				waitForExpectedElement(driver,(TODOBTN_ALEX_OVERDUEBTN));
				overDueCount= driver.findElement(TODOBTN_ALEX_OVERDUEBTN).getText();
				} catch (Exception e) {
				e.getMessage();
			}
			return overDueCount;
		}
		public String getFutureTaskCount(AppiumDriver driver) {
			String futureCount=null;
			try {
				waitForExpectedElement(driver, (TODOBTN_ALEX_FUTUREBTN));
				futureCount=driver.findElement(TODOBTN_ALEX_FUTUREBTN).getText();
			} catch (Exception e) {
				e.getMessage();
			}
			return futureCount;
		}

	    //method to click today field
		public String getTodayTaskCount(AppiumDriver driver) {
			String todayCount=null;
			try {
				waitForExpectedElement(driver, (TODOBTN_ALEX_TODAYBTN));
				todayCount=driver.findElement(TODOBTN_ALEX_TODAYBTN).getText();
			} catch (Exception e) {
				e.getMessage();
			}
			return todayCount;
		}
	// method to click on overdue field
	public void clkOverdueBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver,(TODOBTN_ALEX_OVERDUEBTN));
			driver.findElement(TODOBTN_ALEX_OVERDUEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
		}
    //method to click today field
	public void clkTodayBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, (TODOBTN_ALEX_TODAYBTN));
			driver.findElement(TODOBTN_ALEX_TODAYBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method for getting error messages text while giving invalid credentials
	public String sucessTextmsg(AppiumDriver driver) {
		String stremailerror = null;
		waitForExpectedElement(driver, (GETTINGERRORTEXT));
		stremailerror = driver.findElement(GETTINGERRORTEXT).getText();
		System.out.println("string is: " + stremailerror);
		return stremailerror;
	}
	// method to get text for overdue
	public void getOverdueText(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, (TODOBTN_ALEX_OVERDUEBTN));
			String str = driver.findElement(TODOBTN_ALEX_OVERDUEBTN).getText();
			System.out.println(str);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on admin toggle
	public void clkAdminBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, (BOARDS_ALEX_COMMENT_COPYTO_ADMINHOTELTOGGLE));
			driver.findElement(BOARDS_ALEX_COMMENT_COPYTO_ADMINHOTELTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
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
	// method to click guest complaint toggle
	public void clkGuestComplaintToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_GUESTCOMPLAINTTOGGLE);
			driver.findElement(ADD_GUESTCOMPLAINTTOGGLE).click();
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
	// method to get error message for please select note from field 
	public void getErrorMsgTxt(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_POSTBTN_GETERRORMESSAGETXT);
			driver.findElement(ADD_POSTBTN_GETERRORMESSAGETXT).getText();
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
	public void clkSubjectFld(AppiumDriver driver, String taskSubject) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_SUBJECTFLD);
			driver.findElement(ADD_CONVERTTOTASK_SUBJECTFLD).sendKeys(taskSubject);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click and enter text to task description field
	public void clkTaskDescriptionFld(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_TASKDESCRIPTIONFLD);
			driver.findElement(ADD_CONVERTTOTASK_TASKDESCRIPTIONFLD).sendKeys("Entering Text Into Task Description Field");
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
	//method to verify whether the post is posted or not
	public void ClkButtonsInTodoScreen(AppiumDriver driver, String taskSubject) {
		waitForExpectedElement(driver, CLICKING_BTNS);
		List<AndroidElement> textFields = driver.findElements(CLICKING_BTNS);
		System.out.println(textFields.size());
		for (int i = 3; i < textFields.size(); i++) {
			textFields.get(i).click();
			textFields = driver.findElements(CLICKING_BTNS);
			driver.scrollTo(taskSubject);
			List<AndroidElement> printText = driver.findElements(GETTING_BUTTONSLIST);
			for (AndroidElement button : printText) {
				if (button.getText().toString().contains(taskSubject)) {
					System.out.println("Task is Created");
					continue;
				}
				else{
					System.out.println("Task is Not Created");
				}
			}
		}
	}
	//method to click on Alex toggle
	public void clkAlexToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ALEX_TOGGLE);
			driver.findElement(ALEX_TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

