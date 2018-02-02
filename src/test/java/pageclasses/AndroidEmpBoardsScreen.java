package pageclasses;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import utilities.BaseClass;
import utilities.Utilities;

public class AndroidEmpBoardsScreen extends BaseClass
{
		//create driver
		public AppiumDriver driver;
		public static final By BOARDSBTN=By.xpath("//android.view.ViewGroup[@index='0']");
		public static final By BOARDS_FRONTDESK_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_COMMENTBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_FRONTDESK_FLAGBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_AGAINFLAGBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_COMMENTSTXT_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_COMMENTSTXT_COMMENTSBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_COMMENTSTXT_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_FRONTDESK_COMMENTSTXT_FLAGBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_COMMENTSTXT_AGAINFLAGBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDTXT_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDTXT_COMMENTSBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDTXT_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDTXT_FLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDTXT_AGAINFLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDENTXT_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDENTXT_COMMENTSBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDENTXT_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDENTXT_FLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESK_UNRESOLVEDENTXT_AGAINFLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_FRONTDESKBTN=By.xpath("//android.widget.TextView[@text='Front Desk']");
		public static final By BOARDS_FRONTDESK_SEARCHBTN=By.xpath("//android.widget.TextView[@index='0']");
		public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGSBTN=By.xpath("//android.widget.TextView[@text='Department & Location Tags']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTSBTN=By.xpath("//android.widget.TextView[@text='Departments *']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPINGBTN=By.xpath("//android.widget.TextView[@text='House Keeping']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHCOUNTERTOGGLE=By.xpath("//android.view.ViewGroup[@index='0']/android.widget.Switch[@index='0']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHMATTOGGLE=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.Switch[@index='0']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONSBTN=By.xpath("//android.widget.TextView[@text='Locations *']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREASBTN=By.xpath("//android.widget.TextView[@text='Guest Areas']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREAS_BARTOGGLE=By.xpath("//android.view.ViewGroup[@index='0']/android.widget.Switch[@index='0']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREAS_BOARDROOMTOGGLE=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.Switch[@index='0']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENTBTN=By.xpath("//android.widget.TextView[@text='Equipment']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENTBUTTON=By.xpath("//android.widget.TextView[@text='Group_Equipment']");
	    public static final By ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ1TOGGLE=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.Switch[@index='0']");
	    public static final By ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ2TOGGLE=By.xpath("//android.view.ViewGroup[@index='2']/android.widget.Switch[@index='0']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_CANCELBTN=By.xpath("//android.widget.TextView[@text='Cancel']");
	    public static final By BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_SAVEBTN=By.xpath("//android.widget.TextView[@text='Save']");
	    public static final By BOARDS_FRONTDESK_COMMENT_COPYTOBTN=By.xpath("//android.widget.TextView[@text='Copy To']");
	    public static final By ADD_COPYTO_COURTNEYJARRODTOGGLE=By.xpath("//android.view.ViewGroup[@index='5']/android.widget.Switch[@index='0']");
	    public static final By BOARDS_FRONTDESK_COMMENT_COPYTO_ADMINHOTELTOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.Switch[1]");
	    public static final By BOARDS_FRONTDESK_COMMENT_TEXTBOXFIELD=By.xpath("//android.widget.EditText[@index='3']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_ASSIGNTOBTN=By.xpath("//android.widget.TextView[@text='Assign To']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_ASSIGNTO_FRONTDESKBTN=By.xpath("android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.Switch[1]");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD=By.xpath("//android.view.ViewGroup[@index='0']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH=By.id("android:id/next");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON=By.xpath("//android.view.View[@text='1']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN=By.xpath("//android.widget.Button[@index='1']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN=By.xpath("//android.widget.Button[@index='0']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON=By.xpath("//android.widget.RadialTimePickerView$RadialPickerTouchHelper[@index='18']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN=By.xpath("//android.widget.Button[@text='Cancel']");
	    public static final By BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN=By.xpath("//android.widget.Button[@text='OK']");
	    public static final By BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD=By.xpath("//android.view.ViewGroup[@index='0']");
	    public static final By BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON=By.xpath("//android.view.View[@index='10']");
	    public static final By BOARDS_FRONTDESK_FLAG_UNFLAGYESBTN=By.xpath("//android.widget.TextView[@text='Yes']");
	    public static final By BOARDS_FRONTDESK_FLAG_UNFLAGNOBTN=By.xpath("//android.widget.TextView[@text='No']");
	    public static final By BOARDS_FRONTDESK_CHECKBOX=By.xpath("//android.widget.TextView[@index='0']");
	    public static final By BOARDS_FRONTDESK_COMMENTSCOUNT=By.xpath("//android.widget.TextView[@index='0']");   
	    public static final By BOARDS_UNRESOLVED=By.xpath("//android.widget.TextView[@index='0']");
	    public static final By BOARDS_EDIT_ASSIGNTO=By.xpath("//android.widget.TextView[@text='Assign To']");
	    public static final By BOARDS_COMMENT_COUNT=By.xpath("//android.view.ViewGroup[@index='1']");
	    
	// Constructor
	public AndroidEmpBoardsScreen(AppiumDriver driver) {
		this.driver = driver;
	}
	// method to verify assign to button in boards screen
	public String verifications(AppiumDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, BOARDS_EDIT_ASSIGNTO);
			strval = "pass";
		} catch (Exception e) {
			e.getMessage();
			strval = "fail";
		}
		return strval;
	}
	// method to click on boards button
	public void clkBoardsBtn(AppiumDriver driver) {
		waitForExpectedElement(driver, BOARDSBTN);
		driver.findElement(BOARDSBTN).click();
	}
	// method to click on comments button in boards
	public void clkCommentBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, (BOARDS_FRONTDESK_COMMENTSCOUNT));
			String strcount = driver.findElement(BOARDS_FRONTDESK_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENTSTXT_MESSAGEBTN);
				driver.findElement(BOARDS_FRONTDESK_COMMENTSTXT_MESSAGEBTN).click();
				} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDTXT_COMMENTSBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDTXT_COMMENTSBTN).click();
			} else {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDENTXT_COMMENTSBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDENTXT_COMMENTSBTN).click();
				}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENTBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENTBTN).click();
			e.getMessage();
		}
	}
	// method for selecting month
	public void clkMonthIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH, 60);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method for click unflag
	public void clkUnflagYesBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_FLAG_UNFLAGYESBTN);
			driver.findElement(BOARDS_FRONTDESK_FLAG_UNFLAGYESBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method for clicking hotel button
	public void clkHotelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESKBTN);
			driver.findElement(BOARDS_FRONTDESKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method for search
	public void clkSearchBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_SEARCHBTN);
			driver.findElement(BOARDS_FRONTDESK_SEARCHBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on departments&locations
	public void clkDeptAndLocationsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGSBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on departments
	public void clkDepartmentsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTSBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on house keeping
	public void clkHouseKeepingBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPINGBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPINGBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on bath counter toggle
	public void clkBathCounterToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver,BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHCOUNTERTOGGLE);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHCOUNTERTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on toggle bathmat
	public void clkBathMatToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver,BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHMATTOGGLE);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHMATTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on locations
	public void clkLocationsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONSBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on rooms
	public void clkGuestAreaBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREASBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREASBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on bar toggle
	public void clkBarToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver,
					BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREAS_BARTOGGLE);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREAS_BARTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on board room toggle
	public void clkBoardRoomToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver,BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREAS_BOARDROOMTOGGLE);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_GUESTAREAS_BOARDROOMTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on equipment button
	public void clkEquipmentBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENTBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on group equipment button
	public void clkGroupEquipmentBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver,
					BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENTBUTTON);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENTBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on eq1 Toggle
	public void clkEq1Toggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ1TOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ1TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on eq2 Toggle
	public void clkEq2Toggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ2TOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ2TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on cancel button
	public void clkCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_CANCELBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_CANCELBTN).click();
			} catch (Exception e) {
			e.getMessage();
		}
		}
	// method to click on cancel button
	public void clkSaveBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_SAVEBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_DEPT_AND_LOCATIONTAGS_SAVEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on copyto button
	public void clkCopyToBTn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_COPYTOBTN);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_COPYTOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on admin hotel toggle
	public void clkCourtneyJarrodToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_COPYTO_COURTNEYJARRODTOGGLE);
			driver.findElement(ADD_COPYTO_COURTNEYJARRODTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on text box field
	public void clkTextboxField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_TEXTBOXFIELD);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_TEXTBOXFIELD).sendKeys("Entering text into textbox field ");
			} catch (Exception e) {
			e.getMessage();
		}
		}
	// method to click on assignto button
	public void clkAssignToBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_ASSIGNTOBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_ASSIGNTOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on assignto FRONTDESK button
	public void clkFrontDeskBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_ASSIGNTO_FRONTDESKBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_ASSIGNTO_FRONTDESKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on task expiry date field
	public void clkTaskExpiryDateField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click date icon
	public void clkDateIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON).click();
		} catch (Exception e) {
			e.getMessage();
		}

	}
	// method to click on calender ok button
	public void clkCalenderOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on calender cancel buttom
	public void clkCalenderCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock icon
	public void clkClockIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock ok button
	public void clkClockOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock cancel button
	public void clkClockCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock expiry date field
	public void clkFlagExpiryDateField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD);
			driver.findElement(BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock expiry date icon
	public void clkFlagExpiryDateIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON);
			driver.findElement(BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on message button
	public void clkMessageBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, (BOARDS_FRONTDESK_COMMENTSCOUNT));
			String strcount = driver.findElement(BOARDS_FRONTDESK_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENTSTXT_MESSAGEBTN);
				driver.findElement(BOARDS_FRONTDESK_COMMENTSTXT_MESSAGEBTN).click();
			} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDTXT_MESSAGEBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDTXT_MESSAGEBTN).click();
			} else {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDENTXT_MESSAGEBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDENTXT_MESSAGEBTN).click();
			}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_MESSAGEBTN);
			driver.findElement(BOARDS_FRONTDESK_MESSAGEBTN).click();
			e.getMessage();
		}
	}
	// method to click on note button
	public void clkNoteBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENTSCOUNT);
			String strcount = driver.findElement(BOARDS_FRONTDESK_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENTSTXT_NOTEBTN);
				driver.findElement(BOARDS_FRONTDESK_COMMENTSTXT_NOTEBTN).click();
			} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDTXT_NOTEBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDTXT_NOTEBTN).click();
			} else {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDENTXT_NOTEBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDENTXT_NOTEBTN).click();
			}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTEBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTEBTN).click();
			e.getMessage();
		}
	}
	// method to click on Flag button
	public void clkFlagBtn(AppiumDriver driver) {
	try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENTSCOUNT);
			String strcount = driver.findElement(BOARDS_FRONTDESK_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENTSTXT_FLAGBTN);
				driver.findElement(BOARDS_FRONTDESK_COMMENTSTXT_FLAGBTN).click();
			} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDTXT_FLAGBTNBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDTXT_FLAGBTNBTN).click();
			} else {
				waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDENTXT_FLAGBTNBTN);
				driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDENTXT_FLAGBTNBTN).click();
			}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_FLAGBTN);
			driver.findElement(BOARDS_FRONTDESK_FLAGBTN).click();
			e.getMessage();
		}
	}
	// method to verify count in boards
    public String verification(AppiumDriver driver) {
        String strverify = null;
        try {
            waitForExpectedElement(driver, BOARDS_COMMENT_COUNT);
            strverify = "pass";
        } catch (Exception e) {
            e.getMessage();
            strverify = "fail";
        }
        return strverify;
    }
}

