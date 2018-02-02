package pageclasses;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;
public class AndroidAdminBoardsScreen extends BaseClass{
		//create driver
		public AppiumDriver driver;
		public static final By BOARDSBTN=By.xpath("//android.view.ViewGroup[@index='0']");
		public static final By BOARDS_ALEX_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_COMMENTBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_ALEX_FLAGBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_AGAINFLAGBTN=By.xpath("//android.view.ViewGroup[@index='14']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_COMMENTSTXT_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_COMMENTSTXT_COMMENTSBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_COMMENTSTXT_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_ALEX_COMMENTSTXT_FLAGBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_COMMENTSTXT_AGAINFLAGBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDTXT_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDTXT_COMMENTSBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDTXT_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDTXT_FLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDTXT_AGAINFLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='15']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDENTXT_MESSAGEBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDENTXT_COMMENTSBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDENTXT_NOTEBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDENTXT_FLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By BOARDS_ALEX_UNRESOLVEDENTXT_AGAINFLAGBTNBTN=By.xpath("//android.view.ViewGroup[@index='16']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']");
		public static final By HOTELBTN=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]");
		public static final By BOARDS_ALEX_SEARCHBTN=By.xpath("//android.widget.TextView[@index='0']");
		public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGSBTN=By.xpath("//android.widget.TextView[@text='Department & Location Tags']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTSBTN=By.xpath("//android.widget.TextView[@text='Departments *']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESKBTN=By.xpath("//android.widget.TextView[@text='Front Desk']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESK_911TOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.Switch[1]");//xpath pending
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESK_ADAROOMTOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Switch[1]");//xpath pending
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONSBTN=By.xpath("//android.widget.TextView[@text='Locations *']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMSBTN=By.xpath("//android.widget.TextView[@text='Rooms']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMS_ROOM101TOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.Switch[1]");//XPATH PENDING
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMS_ROOM102TOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.Switch[1]");//XPATH PENDING
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENTBTN=By.xpath("//android.widget.TextView[@text='Equipment']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_FIRSTGROUPBTN=By.xpath("//android.widget.TextView[@text='First group']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_FIRSTGROUP_TEST3TOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.Switch[1]");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_CANCELBTN=By.xpath("//android.widget.TextView[@text='Cancel']");
	    public static final By BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_SAVEBTN=By.xpath("//android.widget.TextView[@text='Save']");
	    public static final By BOARDS_ALEX_COMMENT_COPYTOBTN=By.xpath("//android.widget.TextView[@text='Copy To']");
	    public static final By BOARDS_ALEX_COMMENT_COPYTO_ADMINHOTELTOGGLE=By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.Switch[1]");//XPATH PENDING
	    public static final By BOARDS_ALEX_COMMENT_TEXTBOXFIELD=By.xpath("//android.widget.EditText[@index='3']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_ASSIGNTOBTN=By.xpath("//android.widget.TextView[@text='Assign To']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_ASSIGNTO_ALEXBTN=By.xpath("android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.Switch[1]");//xpath pending
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD=By.xpath("//android.view.ViewGroup[@index='0']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH=By.id("android:id/next");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON=By.xpath("//android.view.View[@text='1']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN=By.xpath("//android.widget.Button[@index='1']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN=By.xpath("//android.widget.Button[@index='0']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON=By.xpath("//android.widget.RadialTimePickerView$RadialPickerTouchHelper[@index='18']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN=By.xpath("//android.widget.Button[@text='Cancel']");
	    public static final By BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN=By.xpath("//android.widget.Button[@text='OK']");
	    public static final By BOARDS_ALEX_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD=By.xpath("//android.view.ViewGroup[@index='0']");
	    public static final By BOARDS_ALEX_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON=By.xpath("//android.view.View[@index='10']");
	    public static final By BOARDS_ALEX_FLAG_UNFLAGYESBTN=By.xpath("//android.widget.TextView[@text='Yes']");
	    public static final By BOARDS_ALEX_FLAG_UNFLAGNOBTN=By.xpath("//android.widget.TextView[@text='No']");
	    public static final By BOARDS_ALEX_CHECKBOX=By.xpath("//android.widget.TextView[@index='0']");
	    public static final By BOARDS_ALEX_COMMENTSCOUNT=By.xpath("//android.widget.TextView[@index='0']");
	    public static final By BOARDS_LIST =By.xpath("/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[1]");   
	    public static final By BOARDS_UNRESOLVED=By.xpath("//android.widget.TextView[@index='0']");
	    public static final By BOARDS_EDIT_ASSIGNTO=By.xpath("//android.widget.TextView[@text='Assign To']");
	    public static final By BOARDS_COMMENT_COUNT=By.xpath("//android.view.ViewGroup[@index='1']");
	// Constructor
	public AndroidAdminBoardsScreen(AppiumDriver driver) {
		this.driver = driver;
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
	// method to verify assign to in boards
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
		try {
			waitForExpectedElement(driver, BOARDSBTN);
			driver.findElement(BOARDSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on comment Button
	public void clkCommentBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, (BOARDS_ALEX_COMMENTSCOUNT));
			String strcount = driver.findElement(BOARDS_ALEX_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_ALEX_COMMENTSTXT_MESSAGEBTN);
				driver.findElement(BOARDS_ALEX_COMMENTSTXT_MESSAGEBTN).click();
				} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDTXT_COMMENTSBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDTXT_COMMENTSBTN).click();
				} else {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDENTXT_COMMENTSBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDENTXT_COMMENTSBTN).click();
				}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENTBTN);
			driver.findElement(BOARDS_ALEX_COMMENTBTN).click();
			e.getMessage();
		}
	}

	// method for selecting month
	public void clkMonthIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method for click unflag
	public void clkUnflagYesBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_FLAG_UNFLAGYESBTN);
			driver.findElement(BOARDS_ALEX_FLAG_UNFLAGYESBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method for clicking hotel
	public void clkHotelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, HOTELBTN);
			driver.findElement(HOTELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method for search
	public void clkSearchBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_SEARCHBTN);
			driver.findElement(BOARDS_ALEX_SEARCHBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on departments&locations
	public void clkDeptAndLocationsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGSBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on departments
	public void clkDepartmentsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTSBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on front desk
	public void clkFrontDeskBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESKBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on 911 toggle
	public void clkToggle1(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESK_911TOGGLE);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESK_911TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on toggle adaroom
	public void clkToggle2(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver,BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESK_ADAROOMTOGGLE);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_DEPARTMENTS_FRONTDESK_ADAROOMTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on locations button
	public void clkLocationsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONSBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on rooms button
	public void clkRoomsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMSBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMSBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on room 101 toggle
	public void clkRoomToggle1(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMS_ROOM101TOGGLE);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMS_ROOM101TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on room 102 toggle
	public void clkRoomToggle2(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMS_ROOM102TOGGLE);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_LOCATIONS_ROOMS_ROOM102TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on equipment button
	public void clkEquipmentBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENTBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on first group button
	public void clkFirstGroupBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_FIRSTGROUPBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_FIRSTGROUPBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on test3 toggle
	public void clkTest3Toggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_FIRSTGROUP_TEST3TOGGLE);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_EQUIPMENT_FIRSTGROUP_TEST3TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on cancel button
	public void clkCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_CANCELBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_CANCELBTN).click();
			} catch (Exception e) {
			e.getMessage();
		}
		}
	// method to click on save button
	public void clkSaveBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_SAVEBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_DEPT_AND_LOCATIONTAGS_SAVEBTN).click();
			} catch (Exception e) {
			e.getMessage();
		}
		}
	// method to click on copy to button
	public void clkCopyToBTn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_COPYTOBTN);
			driver.findElement(BOARDS_ALEX_COMMENT_COPYTOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on admin hotel toggle
	public void clkAdminHotelToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_COPYTO_ADMINHOTELTOGGLE);
			driver.findElement(BOARDS_ALEX_COMMENT_COPYTO_ADMINHOTELTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on text box field
	public void clkTextboxField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENT_TEXTBOXFIELD);
			driver.findElement(BOARDS_ALEX_COMMENT_TEXTBOXFIELD).sendKeys("Entering text into textbox field ");
			} catch (Exception e) {
			e.getMessage();
		}
		}
	// method to click on assign to button
	public void clkAssignToBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_ASSIGNTOBTN);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_ASSIGNTOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on alex button in assign to
	public void clkAlexBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_ASSIGNTO_ALEXBTN);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_ASSIGNTO_ALEXBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on task expiry date field
	public void clkTaskExpiryDateField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click date icon
	public void clkDateIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON).click();
		} catch (Exception e) {
			e.getMessage();
		}

	}
	// method to click on calender ok button
	public void clkCalenderOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on calender cancel buttom
	public void clkCalenderCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock icon
	public void clkClockIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock ok button
	public void clkClockOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock cancel button
	public void clkClockCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN);
			driver.findElement(BOARDS_ALEX_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock expiry date field
	public void clkFlagExpiryDateField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD);
			driver.findElement(BOARDS_ALEX_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on clock expiry date icon
	public void clkFlagExpiryDateIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON);
			driver.findElement(BOARDS_ALEX_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on message button
	public void clkMessageBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, (BOARDS_ALEX_COMMENTSCOUNT));
			String strcount = driver.findElement(BOARDS_ALEX_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_ALEX_COMMENTSTXT_MESSAGEBTN);
				driver.findElement(BOARDS_ALEX_COMMENTSTXT_MESSAGEBTN).click();
					} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDTXT_MESSAGEBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDTXT_MESSAGEBTN).click();
				} else {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDENTXT_MESSAGEBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDENTXT_MESSAGEBTN).click();
					}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_ALEX_MESSAGEBTN);
			driver.findElement(BOARDS_ALEX_MESSAGEBTN).click();
			e.getMessage();
		}
		}
	// method to click on note button
	public void clkNoteBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENTSCOUNT);
			String strcount = driver.findElement(BOARDS_ALEX_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_ALEX_COMMENTSTXT_NOTEBTN);
				driver.findElement(BOARDS_ALEX_COMMENTSTXT_NOTEBTN).click();
			} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDTXT_NOTEBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDTXT_NOTEBTN).click();
			} else {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDENTXT_NOTEBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDENTXT_NOTEBTN).click();
			}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_ALEX_NOTEBTN);
			driver.findElement(BOARDS_ALEX_NOTEBTN).click();
				e.getMessage();
		}
		}
	// method to click on Flag button
	public void clkFlagBtn(AppiumDriver driver) {
			try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENTSCOUNT);
			String strcount = driver.findElement(BOARDS_ALEX_COMMENTSCOUNT).getText();
			System.out.println("string is: " + strcount);
			if (strcount.contains("Comments")) {
				waitForExpectedElement(driver, BOARDS_ALEX_COMMENTSTXT_FLAGBTN);
				driver.findElement(BOARDS_ALEX_COMMENTSTXT_FLAGBTN).click();
				} else if (driver.findElement(BOARDS_UNRESOLVED).isDisplayed() == true) {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDTXT_FLAGBTNBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDTXT_FLAGBTNBTN).click();
				} else {
				waitForExpectedElement(driver, BOARDS_ALEX_UNRESOLVEDENTXT_FLAGBTNBTN);
				driver.findElement(BOARDS_ALEX_UNRESOLVEDENTXT_FLAGBTNBTN).click();
				}
		} catch (Exception e) {
			waitForExpectedElement(driver, BOARDS_ALEX_FLAGBTN);
			driver.findElement(BOARDS_ALEX_FLAGBTN).click();
			e.getMessage();
		}
		}
}
