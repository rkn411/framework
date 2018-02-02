package pageclasses;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import utilities.BaseClass;
import utilities.Utilities;

public class AndroidEmpAddScreen extends BaseClass
{
		public AppiumDriver driver;
		public static final By ADDBTN=By.xpath("//android.widget.TextView[@text='Add']");
		public static final By BOARDSBTN=By.xpath("//android.view.ViewGroup[@index='0']");
		public static final By ADD_NOTEFROMBTN=By.xpath("//android.widget.TextView[@text='Note From']");
		public static final By ADD_DEPARTMENTSANDLOCATIONSBTN=By.xpath("//android.widget.TextView[@text='Department & Location Tags']");
		public static final By ADD_GUESTCOMPLAINTTOGGLE=By.xpath("//android.view.ViewGroup[@index='3']/android.widget.Switch[@index='1']");
		public static final By ADD_PRIVATETOGGLE=By.xpath("//android.view.ViewGroup[@index='4']/android.widget.Switch[@index='1']");
		public static final By ADD_NOTE_ENTERNOTEFIELD=By.xpath("//android.widget.EditText[@text='Enter Note']");
		public static final By ADD_CONVERTTOTASK_LNK=By.xpath("//android.widget.TextView[@text='Convert to Task']");
		public static final By ADD_CONVERTTOTASK_ASSIGNTO=By.xpath("//android.widget.TextView[@text='Assign To']");
		public static final By ADD_CONVERTTOTASK_SUBJECTFIELD=By.xpath("//android.widget.EditText[@text='Enter Subject']");
		public static final By ADD_CONVERTTOTASK_DUE_CALENDERICON=By.xpath("//android.widget.ImageView[@index='1']");
		public static final By ADD_CONVERTTOTASK_TASKDESCRIPTIONFIELD=By.xpath("//android.widget.EditText[@text='Enter Task Description']");
		public static final By ADD_CONVERTTONOTE_LNK=By.xpath("//android.widget.TextView[@text='Convert To Note']");
		public static final By ADD_ATTACHFILE_SYM=By.xpath("//android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='7']/android.widget.TextView[@index='0']");
		public static final By ADD_POSTBTN=By.xpath("//android.widget.TextView[@text='Post']");
		public static final By ADD_NOTEFROM_HOUSEKEEPINGTOGGLE=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.Switch[@index='0']");
		public static final By ADD_DEPARTMENTSANDLOCATIONS_DEPARTMENTSBTN=By.xpath("//android.widget.TextView[@text='Departments *']");
		public static final By ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPINGBTN=By.xpath("//android.widget.TextView[@text='House Keeping']");
		public static final By ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHCOUNTERTOGGLE=By.xpath("//android.view.ViewGroup[@index='0']/android.widget.Switch[@index='0']");
	    public static final By ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHMATTOGGLE=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.Switch[@index='0']");
	    public static final By ADD_DEPTANDLOCATIONTAGS__LOCATIONSBTN=By.xpath("//android.widget.TextView[@text='Locations *']");
	    public static final By ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREASBTN=By.xpath("//android.widget.TextView[@text='Guest Areas']");
	    public static final By ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREAS_BARTOGGLE=By.xpath("//android.view.ViewGroup[@index='0']/android.widget.Switch[@index='0']");
	    public static final By ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREAS_BOARDROOMTOGGLE=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.Switch[@index='0']");
	    public static final By ADD_DEPTANDLOCATIONTAGS__EQUIPMENTBTN=By.xpath("//android.widget.TextView[@text='Equipment']");
	    public static final By ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENTBUTTON=By.xpath("//android.widget.TextView[@text='Group_Equipment']");
	    public static final By ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ1TOGGLE=By.xpath("//android.view.ViewGroup[@index='1']/android.widget.Switch[@index='0']");
	    public static final By ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ2TOGGLE=By.xpath("//android.view.ViewGroup[@index='2']/android.widget.Switch[@index='0']");
	    public static final By ADD_CANCELBTN=By.xpath("//android.widget.TextView[@text='Cancel']");
	    public static final By ADD_SAVEBTN=By.xpath("//android.widget.TextView[@text='Save']");
	    public static final By ADD_COPYTOBTN=By.xpath("//android.widget.TextView[@text='Copy To']");
	    public static final By ADD_COPYTO_COURTNEYJARRODTOGGLE=By.xpath("//android.view.ViewGroup[@index='5']/android.widget.Switch[@index='0']");
	    public static final By OKBUTTON=By.xpath("//android.widget.Button[@text='OK']");
	    public static final By PLEASESELECTMESSAGE=By.xpath("//android.widget.TextView[@text='Please select note From']");
	    public static final By ADD_ATTACHFILE_CANCELBTN=By.xpath("//android.widget.TextView[@text='Cancel']");
	    public static final By ADD_CREATENEWNOTE_ERRORPOPUP=By.xpath("//android.widget.TextView[@text='Please select task From']");  
	    public static final By ADD_CONVERTTOTASK_TASKFROM=By.xpath("//android.widget.TextView[@text='Task From']");
	    public static final By ADD_POSTSUCCESSMESSAGE=By.xpath("//android.widget.TextView[@text='Post added successfully']");	    
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
	    public static final By ADD_CONVERTTOTASK__DUEDATEFLD=By.xpath("//android.widget.ImageView[@index='1']");
	    public static final By GETTINGERRORTEXT = By.id("android:id/message");
	    public static final By BOARDS_COMMENT_COUNT=By.xpath("//android.view.ViewGroup[@index='1']");

	// Constructor
	public AndroidEmpAddScreen(AppiumDriver driver) {
		this.driver = driver;
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
		return alertMessage ;
	}
	// method to verify count in boards
    public String deptverification(AppiumDriver driver) {
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

	// method for selecting month
	public void clkMonthIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH, 60);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON_MONTH).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method for click unflag
	public void clkUnflagYesBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_FLAG_UNFLAGYESBTN);
			driver.findElement(BOARDS_FRONTDESK_FLAG_UNFLAGYESBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	public void clkCheckBox(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CHECKBOX);
			driver.findElement(BOARDS_FRONTDESK_CHECKBOX).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on task expiry date field
	public void clkTaskExpiryDateField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATEFIELD).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click date icon
	public void clkDateIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATEICON).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}

	}

	// method to click on ok button
	public void clkCalenderOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on calender cancel buttom
	public void clkCalenderCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on clock icon
	public void clkClockIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCKICON).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on clock icon
	public void clkClockOkBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on clock icon
	public void clkClockCancelBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN);
			driver.findElement(BOARDS_FRONTDESK_NOTE_EDITTASKDATE_TASKEXPIRYDATE_DATE_OK_CLOCK_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on clock icon
	public void clkFlagExpiryDateField(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD);
			driver.findElement(BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATEFIELD).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on clock icon
	public void clkFlagExpiryDateIcon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON);
			driver.findElement(BOARDS_FRONTDESK_FLAG_SETFLAG_FLAGEXPIRYDATE_DATEICON).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click error message
	public String PostSuccessMessage(AppiumDriver driver) {
		String strsuccessmessage = null;
		try {
			waitForExpectedElement(driver, ADD_POSTSUCCESSMESSAGE);
			strsuccessmessage = driver.findElement(ADD_POSTSUCCESSMESSAGE).getText();
			System.out.println(strsuccessmessage);
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
		return strsuccessmessage;
	}

	// method to click error message
	public String ErrormessageincreatenewNote(AppiumDriver driver) {
		String strerrormessage = null;
		try {
			waitForExpectedElement(driver, ADD_CREATENEWNOTE_ERRORPOPUP);
			strerrormessage = driver.findElement(ADD_CREATENEWNOTE_ERRORPOPUP).getText();
			System.out.println();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
		return strerrormessage;
	}

	// method to click cancel in avatar popup
	public void clkCancelPopup(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_ATTACHFILE_CANCELBTN);
			driver.findElement(ADD_ATTACHFILE_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	public void clkBoardsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDSBTN);
			driver.findElement(BOARDSBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Add icon
	public void clkAddBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADDBTN);
			driver.findElement(ADDBTN).click();

		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on text box field
	public void clkDueDateFld(AppiumDriver driver) {
		try {

			waitForExpectedElement(driver, ADD_CONVERTTOTASK__DUEDATEFLD, 60);
			driver.findElement(ADD_CONVERTTOTASK__DUEDATEFLD).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on note from
	public void clkOKButton(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, OKBUTTON);
			driver.findElement(OKBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click error message
	public String Errormessage(AppiumDriver driver) {
		String strerrormessage = null;
		try {
			waitForExpectedElement(driver, PLEASESELECTMESSAGE);
			strerrormessage = driver.findElement(PLEASESELECTMESSAGE).getText();
			System.out.println();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
		return strerrormessage;
	}

	// method to click on note from
	public void clkNoteFrom(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_NOTEFROMBTN);
			driver.findElement(ADD_NOTEFROMBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Housekeeping toggle
	public void clkToggle(AppiumDriver driver) {
		List<WebElement> Textfeild = driver.findElements(By.className("android.widget.Switch"));
		for (WebElement toggles : Textfeild) {
			toggles.click();
		}

	}

	// method to click on SaveBtn
	public void clkSaveBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_SAVEBTN);
			driver.findElement(ADD_SAVEBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on cancelbtn
	public void clkCancelbtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CANCELBTN);
			driver.findElement(ADD_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on cancelbtn
	public void clkDeptandLocationtags(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPARTMENTSANDLOCATIONSBTN);
			driver.findElement(ADD_DEPARTMENTSANDLOCATIONSBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Departments btn
	public void clkDepartmentBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPARTMENTSANDLOCATIONS_DEPARTMENTSBTN);
			driver.findElement(ADD_DEPARTMENTSANDLOCATIONS_DEPARTMENTSBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Housekeeping button
	public void clkHousekeepingBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPINGBTN);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPINGBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on BathCounter toggle
	public void clkBathCounterToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHCOUNTERTOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHCOUNTERTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on BathMat Toggle
	public void clkBAthMatToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHMATTOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS_DEPARTMENTS_HOUSEKEEPING_BATHMATTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on locations btn
	public void clkLocationsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS__LOCATIONSBTN);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS__LOCATIONSBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on guestareas
	public void clkGuestAreasBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREASBTN);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREASBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on bar toggle
	public void clkBarToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREAS_BARTOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREAS_BARTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on boardroom toggle
	public void clkBoardRoomToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREAS_BOARDROOMTOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS_LOCATIONS_GUESTAREAS_BOARDROOMTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Equipments button
	public void clkEquipmentsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS__EQUIPMENTBTN);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS__EQUIPMENTBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on GroupEquipments button
	public void clkGroupEquipmentsBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENTBUTTON);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENTBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on eq1 Toggle
	public void clkEq1Toggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ1TOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ1TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on eq2 Toggle
	public void clkEq2Toggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ2TOGGLE);
			driver.findElement(ADD_DEPTANDLOCATIONTAGS__EQUIPMENT_GROUPEQUIPMENT_EQ2TOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Copyto btn
	public void clkCopyToBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_COPYTOBTN);
			driver.findElement(ADD_COPYTOBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Courtneyjarrod Toggle
	public void clkCourtneyToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_COPYTO_COURTNEYJARRODTOGGLE);
			driver.findElement(ADD_COPYTO_COURTNEYJARRODTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on Guest Complaint toggle
	public void clkGuestComplaintToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_GUESTCOMPLAINTTOGGLE);
			driver.findElement(ADD_GUESTCOMPLAINTTOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to click on private toggle
	public void clkPrivateToggle(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_PRIVATETOGGLE);
			driver.findElement(ADD_PRIVATETOGGLE).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to enter text in note field
	public void EntertextNote(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_NOTE_ENTERNOTEFIELD);
			driver.findElement(ADD_NOTE_ENTERNOTEFIELD).sendKeys("Entering Text Into Note Field");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to clk on convert to task link
	public void clkConvertToTaskLnk(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_LNK);
			driver.findElement(ADD_CONVERTTOTASK_LNK).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}
	// method to clk on Task from

	public void clkTaskFrom(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_TASKFROM);
			driver.findElement(ADD_CONVERTTOTASK_TASKFROM).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to clk on AssignTo
	public void clkAsignTo(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_ASSIGNTO);
			driver.findElement(ADD_CONVERTTOTASK_ASSIGNTO).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to enter data in subject field
	public void EnterTextInSubject(AppiumDriver driver, String taskSubject) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_SUBJECTFIELD);
			driver.findElement(ADD_CONVERTTOTASK_SUBJECTFIELD).sendKeys(taskSubject);
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to clk Calender icon
	public void clkCalendericon(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_DUE_CALENDERICON);
			driver.findElement(ADD_CONVERTTOTASK_DUE_CALENDERICON).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to enter text in task description
	public void EnterTextInTaskDescription(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_CONVERTTOTASK_TASKDESCRIPTIONFIELD);
			driver.findElement(ADD_CONVERTTOTASK_TASKDESCRIPTIONFIELD).sendKeys("Entering Text into Task Description Field");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to clk Convert to Note Link
	public void clkConvertToNoteLink(AppiumDriver driver) {
		try {
			// driver.scrollTo("Convert To Note");
			waitForExpectedElement(driver, ADD_CONVERTTONOTE_LNK);
			driver.findElement(ADD_CONVERTTONOTE_LNK).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to clk Attachfile Symbol
	public void clkAttachfileSym(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_ATTACHFILE_SYM);
			driver.findElement(ADD_ATTACHFILE_SYM).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

	// method to clk Post Button
	public void clkPostBtn(AppiumDriver driver) {
		try {
			waitForExpectedElement(driver, ADD_POSTBTN);
			driver.findElement(ADD_POSTBTN).click();
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Element Not Found");
		}
	}

}
