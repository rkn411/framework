package pageclasses;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;

public class WebAdminNavigationsPage extends BaseClass {
	WebDriver driver;
	public static final By CHECKLISTS =By.xpath("//a[@href='/checklists']");
	public static final By CHECKLISTS_PLUSICON =By.xpath("//i[@class='fa margin-right-13 pull-right fa-plus-circle group-icon']");
	public static final String CHECKLISTS_EDITICON ="//a[@class='fa fa-edit']";
	public static final String CHECKLISTS_DELETEICON ="//span[@class='fa fa-trash deleteConfirm']";
	public static final By CHECKLISTS_SAVEBTN =By.xpath("//button[@class='btn btn-primary']");
	public static final By ALEXBUTTON =By.xpath("//i[@class='fa fa-lg fa-fw fa fa-home']");
	public static final By EDIT_CHECKLIST_CHECKLISTNAME =By.xpath("//input[@placeholder='Checklist name ...']");
	public static final By EDIT_CHECKLIST_TEXTFEILD2 =By.xpath("//textarea[@placeholder='Description']");
	public static final By EDIT_ASSIGNEDTOBTN =By.xpath("(//label[@class='select']/select)[position()='1']");
	public static final By EDIT_TASK_TEXTFEILD =By.xpath("//input[@placeholder='Add task and press [Enter]']");
	public static final By EDIT_TASK_DELETEICON =By.xpath("//i[@class='fa fa-trash']");
	public static final By EDIT_DATESFORFIRSTCHKLIST_START =By.xpath("(//input[@class='react-date-field__input'])[position()='1']");
	public static final By EDIT_DATESFORFIRSTCHKLIST_DUE =By.xpath("(//input[@class='react-date-field__input'])[position()='2']");
	public static final By EDIT_REPEAT_REPEATFLD =By.xpath("(//section[@class='col col-sm-4'])[position()='3']/label/select");
	public static final By EDIT_REPEAT_FUTURETODO_CHKLST =By.xpath("//input[@name='futureTodo']");
	public static final By DATEICON =By.xpath("//div[@class='react-date-field__calendar-icon']");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN =By.xpath("//button[contains(.,'OK')]");// ("//button[contains(@class,'react-date-picker__footer-button')]");
	public static final By DELETEPOPUP_YESBTN =By.xpath("//button[@class='btn btn-sm btn-primary']");
	public static final By DELETEPOPUP_NOBTN =By.xpath("//button[@class='btn btn-sm btn-default']");
	public static final By NEVERRADIOBTN =By.xpath("(//input[@name='radio-inline'])[position()='1']");
	public static final By ONRADIOBTN =By.xpath("(//input[@name='radio-inline'])[position()='2']");
	public static final By DELETE_TXTFLD =By.xpath("//input[@class='smart-form client-form']");
	public static final String CHECKLIST_NAME ="//table[@class='table table-bordered whiteBackground']/tbody/tr/td[1]";
	public static final By EDITCHECKLIST_NAME =By.xpath("//table[@class='table table-bordered whiteBackground']/tbody/tr[1]/td[1]");
	public static final By EDITPM_NAME =By.xpath("//table[@class='table table-bordered whiteBackground']/tbody/tr[1]/td[1]");
	public static final By CONVERTTOTASK_DUEDATEFLD =By.xpath("(//div[@class='react-date-field__calendar-icon'])[position()='2']");
	public static final By CONVERTTOTASK_STARTDATEFLD =By.xpath("(//div[@class='react-date-field__calendar-icon'])[position()='1']");
	public static final By PREVENTIVEMAINTAINANCE_BTN =By.xpath("//i[@class='fa fa-lg fa-fw fa-wrench_won_left']");
	public static final By PREVENTIVEMAINTAINANCE_NAMEFLD =By.xpath("//input[@placeholder='PM name ...']");
	public static final By PREVENTIVEMAINTAINANCE_DESCRIPTIONFLD =By.xpath("//textarea[@placeholder='Description']");
	public static final By PREVENTIVEMAINTAINANCE_EDIT_DROPDOWN =By.xpath("//label[@class='select']");
	public static final By INSPECTIONSTAB = By.xpath("//a[@href='/inspections']");
	public static final By INSPECTIONS_PLUS_INSPECTIONNAMEFLD =By.xpath("//input[@placeholder='Inspection name ...']");
	public static final By INSPECTIONS_PLUS_DESCRIPTIONFLD =By.xpath("//textarea[@placeholder='Description']");
	public static final By DASHBOARDBTN =By.xpath("//i[@class='fa fa-lg fa-fw fa fa-tachometer_won_left']");
	public static final By DASHBOARD_TASKS =By.xpath("//a[@href='/dashboard/tasks']");
	public static final By DASHBOARD_MAINTAINANCE =By.xpath("//a[@href='/dashboard/maintenance']");
	public static final By DASHBOARD_COMPLAINTS =By.xpath("//a[@href='/dashboard/complaints']");
	public static final By DASHBOARD_ROOMLOGS =By.xpath("//a[@href='/dashboard/roomlogs']");
	public static final By REPORTSTAB =By.xpath("//i[@class='fa fa-lg fa-fw fa fa-files-o_won_left']");
	public static final By CREATINGNOTEANDTASK =By.xpath("//i[@class='fa fa-lg fa-fw fa-file-video-o']");
	public static final By FRONTDESK_TAB =By.xpath("//a[@href='/boards/departments/704']");
	public static final By HOUSEKEEPING_TAB =By.xpath("//a[@href='/boards/departments/705']");
	public static final By MAINTAINANCE_TAB =By.xpath("//a[@href='/boards/departments/706']");
	public static final By LOSTANDFOUND_TAB =By.xpath("//a[@href='/boards/departments/707']");
	public static final By HOTEL_TAB =By.xpath("//a[@href='/boards/departments/708']");
	public static final By SALES_TAB =By.xpath("//a[@href='/boards/departments/714']");
	public static final By SECURITY_TAB =By.xpath("//a[@href='/boards/departments/715']");
	public static final By SERVICERECOVERY_TAB =By.xpath("//a[@href='/boards/srp']");
	public static final By MENULIST_VERIFY =By.xpath("//div[@class='col-md-8 marbot10']");
	public static final By HEADER =By.xpath("//h1[@class='page-title txt-color-blueDark']/div/i");
	// Constructor
	public WebAdminNavigationsPage(WebDriver driver) {
		this.driver = driver;
	}
	public Boolean verification(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, MENULIST_VERIFY);
			driver.findElement(MENULIST_VERIFY).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(MENULIST_VERIFY).isDisplayed();
	}
	// Method to Verify the Test
	public Boolean verify(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, HEADER);
			driver.findElement(HEADER).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(HEADER).isDisplayed();
	}
	// Method to click on Checklists in side menu
	public void clkChecklists(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHECKLISTS);
			driver.findElement(CHECKLISTS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click plus icon
	public void clkPlusicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHECKLISTS_PLUSICON);
			driver.findElement(CHECKLISTS_PLUSICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Edit icon
	public void clkEditicon(WebDriver driver, String edit_name) {
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLISTS_EDITICON));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLISTS_EDITICON));
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLISTS_EDITICON.replace("//a[@class='fa fa-edit']",
						"(//a[@class='fa fa-edit'])[position()=" + i + "]");
				String strtable = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String editchecklist = driver.findElement(By.xpath(strtable)).getText();
				System.out.println(driver.findElement(By.xpath(strtable)).getText());
				if (editchecklist.contains(edit_name)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath(str)).click();
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to edit Checklistname
	public void editChecklistName(WebDriver driver, String Editchecklist_name) {
		try {
			waitForExpectedElement(driver, EDIT_CHECKLIST_CHECKLISTNAME);
			driver.findElement(EDIT_CHECKLIST_CHECKLISTNAME).clear();
			driver.findElement(EDIT_CHECKLIST_CHECKLISTNAME).sendKeys(Editchecklist_name);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Delete icon
	public void clkDeleteicon(WebDriver driver, String edit_name) {
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLISTS_DELETEICON), 180);
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLISTS_DELETEICON));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLISTS_DELETEICON.replace("//span[@class='fa fa-trash deleteConfirm']",
						"(//span[@class='fa fa-trash deleteConfirm'])[position()=" + i + "]");
				String strtable = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String editchecklist = driver.findElement(By.xpath(strtable)).getText();
				System.out.println(driver.findElement(By.xpath(strtable)).getText());
				if (editchecklist.contains(edit_name)) {
					Thread.sleep(3000);
					driver.findElement(By.xpath(str)).click();
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Save icon
	public void clkSaveBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHECKLISTS_SAVEBTN);
			driver.findElement(CHECKLISTS_SAVEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Alex Button
	public void clkAlex(WebDriver driver) {
		try {
			waitForExpectedElement(driver, ALEXBUTTON);
			driver.findElement(ALEXBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to send text in to TextField
	public void fillChecklistName(WebDriver driver, String Checklist_name) {
		try {
			waitForExpectedElement(driver, EDIT_CHECKLIST_CHECKLISTNAME);
			driver.findElement(EDIT_CHECKLIST_CHECKLISTNAME).sendKeys(Checklist_name);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click calender icon
	public void clkDateicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DATEICON);
			driver.findElement(DATEICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on in calender popup
	public void clkCalenderOk(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to send text in to TextField
	public void fillChecklistDescription(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_CHECKLIST_TEXTFEILD2);
			driver.findElement(EDIT_CHECKLIST_TEXTFEILD2).sendKeys("Entering text in to textfield ");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to clk AssignTo
	public void clkAssignToBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_ASSIGNEDTOBTN, 100);
			driver.findElement(EDIT_ASSIGNEDTOBTN).click();
			driver.findElement(EDIT_ASSIGNEDTOBTN).sendKeys(Keys.DOWN);
			driver.findElement(EDIT_ASSIGNEDTOBTN).sendKeys(Keys.DOWN);
			driver.findElement(EDIT_ASSIGNEDTOBTN).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to send text in to TextField
	public void fillDataInEditTaskTextField(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_TASK_TEXTFEILD);
			driver.findElement(EDIT_TASK_TEXTFEILD).sendKeys("New Task");
			driver.findElement(EDIT_TASK_TEXTFEILD).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click delete icon in edit task field
	public void clkDeleteiconInEditTask(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_TASK_DELETEICON);
			driver.findElement(EDIT_TASK_DELETEICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click start date
	public void clkStartDateFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_STARTDATEFLD);
			driver.findElement(CONVERTTOTASK_STARTDATEFLD).click();
			List<WebElement> ls = driver.findElements(By.xpath("//div[@class='react-date-picker__month-view-day-text']"));
			System.out.println("Elements : " + ls.size());
			waitForExpectedElement(driver,By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]"));
			driver.findElement(By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]")).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click repeat feild
	public void clkRepeatFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_REPEAT_REPEATFLD);
			driver.findElement(EDIT_REPEAT_REPEATFLD).click();
			driver.findElement(EDIT_REPEAT_REPEATFLD).sendKeys(Keys.DOWN);
			driver.findElement(EDIT_REPEAT_REPEATFLD).sendKeys(Keys.DOWN);
			driver.findElement(EDIT_REPEAT_REPEATFLD).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Future todo Checklist
	public void clkFutureTodoChklst(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_REPEAT_FUTURETODO_CHKLST);
			Thread.sleep(3000);
			driver.findElement(EDIT_REPEAT_FUTURETODO_CHKLST).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Yes Button in Delete popup
	public void clkYesBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DELETEPOPUP_YESBTN);
			driver.findElement(DELETEPOPUP_YESBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click No Button in Delete popup
	public void clkNoBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DELETEPOPUP_NOBTN);
			driver.findElement(DELETEPOPUP_NOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click No Button in Delete popup
	public void clkNeverRadioBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, NEVERRADIOBTN);
			driver.findElement(NEVERRADIOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click No Button in Delete popup
	public void clkOnRadioBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, ONRADIOBTN);
			driver.findElement(ONRADIOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click preventive maintainance tab
	public void clkPreventiveMaintainance(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PREVENTIVEMAINTAINANCE_BTN);
			driver.findElement(PREVENTIVEMAINTAINANCE_BTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to edit PM Name Field
	public void EditPmNameFld(WebDriver driver, String EditPM_name) {
		try {
			waitForExpectedElement(driver, PREVENTIVEMAINTAINANCE_NAMEFLD);
			driver.findElement(PREVENTIVEMAINTAINANCE_NAMEFLD).clear();
			driver.findElement(PREVENTIVEMAINTAINANCE_NAMEFLD).sendKeys(EditPM_name);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to fill pm name field
	public void fillPmNameFld(WebDriver driver, String PreventiveMaintainance_name) {
		try {
			waitForExpectedElement(driver, PREVENTIVEMAINTAINANCE_NAMEFLD);
			driver.findElement(PREVENTIVEMAINTAINANCE_NAMEFLD).sendKeys(PreventiveMaintainance_name);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// Method to Fill Description Field
	public void fillDescriptionFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PREVENTIVEMAINTAINANCE_DESCRIPTIONFLD);
			driver.findElement(PREVENTIVEMAINTAINANCE_DESCRIPTIONFLD).sendKeys("Entering Text in to Description Field");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click No Button in Delete popup
	public void clkDropdown(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PREVENTIVEMAINTAINANCE_EDIT_DROPDOWN);
			driver.findElement(PREVENTIVEMAINTAINANCE_EDIT_DROPDOWN).click();
			driver.findElement(PREVENTIVEMAINTAINANCE_EDIT_DROPDOWN).sendKeys(Keys.DOWN);
			driver.findElement(PREVENTIVEMAINTAINANCE_EDIT_DROPDOWN).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click inspections Tab
	public void clkInspectionsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, INSPECTIONSTAB);
			driver.findElement(INSPECTIONSTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Fill Inspection name field
	public void fillInspectionnameFld(WebDriver driver, String Inspections_name) {
		try {
			waitForExpectedElement(driver, INSPECTIONS_PLUS_INSPECTIONNAMEFLD);
			driver.findElement(INSPECTIONS_PLUS_INSPECTIONNAMEFLD).sendKeys(Inspections_name);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to change the Inspection name Field
	public void editInspectionnameFld(WebDriver driver, String EditInspections_name) {
		try {
			waitForExpectedElement(driver, INSPECTIONS_PLUS_INSPECTIONNAMEFLD);
			driver.findElement(INSPECTIONS_PLUS_INSPECTIONNAMEFLD).clear();
			driver.findElement(INSPECTIONS_PLUS_INSPECTIONNAMEFLD).sendKeys(EditInspections_name);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Fill Inspection description field
	public void fillInspectionDescFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, INSPECTIONS_PLUS_DESCRIPTIONFLD);
			driver.findElement(INSPECTIONS_PLUS_DESCRIPTIONFLD).sendKeys("test");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to clk Dashboard tab
	public void clkDashBoardTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARDBTN);
			driver.findElement(DASHBOARDBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click tasks in dashboard
	public void clkTasks(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_TASKS);
			driver.findElement(DASHBOARD_TASKS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Maintainance in dashboard
	public void clkMaintainance(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_MAINTAINANCE);
			driver.findElement(DASHBOARD_MAINTAINANCE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Complaints in dashboard
	public void clkComplaints(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_COMPLAINTS);
			driver.findElement(DASHBOARD_COMPLAINTS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click roomlogs in dashboard
	public void clkRoomlogs(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DASHBOARD_ROOMLOGS);
			driver.findElement(DASHBOARD_ROOMLOGS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click reports tab
	public void clkReports(WebDriver driver) {
		try {
			waitForExpectedElement(driver, REPORTSTAB);
			driver.findElement(REPORTSTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click converting note and task
	public void clkCreatingNoteandTask(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CREATINGNOTEANDTASK);
			driver.findElement(CREATINGNOTEANDTASK).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click FrontDesk
	public void clkFrontDesKTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FRONTDESK_TAB);
			driver.findElement(FRONTDESK_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click HouseKeeping tab
	public void clkHouseKeepingTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, HOUSEKEEPING_TAB);
			driver.findElement(HOUSEKEEPING_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Maintainance tab
	public void clkMaintainanceTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, MAINTAINANCE_TAB);
			driver.findElement(MAINTAINANCE_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Lost and Found tab
	public void clkLostandFoundTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, LOSTANDFOUND_TAB);
			driver.findElement(LOSTANDFOUND_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Hotel tab
	public void clkHotelTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, HOTEL_TAB);
			driver.findElement(HOTEL_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
   // Method to click Sales tab
	public void clkSalesTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, SALES_TAB);
			driver.findElement(SALES_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Security Tab
	public void clkSecurityTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, SECURITY_TAB);
			driver.findElement(SECURITY_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click service recovery Tab
	public void clkServiceRecoveryTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, SERVICERECOVERY_TAB);
			driver.findElement(SERVICERECOVERY_TAB).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to enter Delete
	public void fillDeleteField(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DELETE_TXTFLD, 180);
			driver.findElement(DELETE_TXTFLD).sendKeys("DELETE");
			// Thread.sleep(5000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click Duedate field
	public void clkDueDateFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD).click();
			List<WebElement> ls = driver
					.findElements(By.xpath("//div[@class='react-date-picker__month-view-day-text']"));
			System.out.println("Elements : " + ls.size());
			waitForExpectedElement(driver,
					By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]"));
			driver.findElement(By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]"))
					.click();
			waitForExpectedElement(driver,
					By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]"));
			driver.findElement(By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]"))
					.click();
			Thread.sleep(5000);
			}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to verify Checklist name
	public boolean checklistVerification(WebDriver driver, String Checklist_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String Checklistname = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (Checklistname.contains(Checklist_name)) {
					strverify = true;
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to verify Edited Checklist Name
	public boolean editChecklistVerification(WebDriver driver, String Editchecklist_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String editchecklist = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (editchecklist.contains(Editchecklist_name)) {
					strverify = true;
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to Delete the Checklist
	public Boolean deleteChecklistVerification(WebDriver driver, String Checklist_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String deletechecklist = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (deletechecklist.contains(Checklist_name)) {
					strverify = false;
					break;
				}
			}
			strverify = true;
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to verify PM name Creted
	public boolean pmListVerification(WebDriver driver, String PreventiveMaintainance_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String Createpm = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (Createpm.contains(PreventiveMaintainance_name)) {
					strverify = true;
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to Verify Wheather the Pm List Name is Updated or not
	public boolean editPMnameVerification(WebDriver driver, String EditPM_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String Editpm = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (Editpm.contains(EditPM_name)) {
					strverify = true;
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to verify Preventive maintainance list is deleted or not
	public boolean deletePMlistVerification(WebDriver driver, String PreventiveMaintainance_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String deletepm = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (deletepm.contains(PreventiveMaintainance_name)) {
					strverify = false;
					break;
				}
			}
			strverify = true;
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// method to verify Whether the Inspection list is created or not
	public boolean inspectionListVerification(WebDriver driver, String Inspections_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String createinspection = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (createinspection.contains(Inspections_name)) {
					strverify = true;
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// method to verify Whether the Inspection name is Updated or Not
	public boolean editInspectionVerification(WebDriver driver, String EditInspections_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String editinspection = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (editinspection.contains(EditInspections_name)) {
					strverify = true;
					break;
				}
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// method to verify Whether the Inspection name is Updated or Not
	public boolean deleteInspectionVerification(WebDriver driver, String EditInspections_name) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, By.xpath(CHECKLIST_NAME));
			List<WebElement> strval = driver.findElements(By.xpath(CHECKLIST_NAME));
			System.out.println("size is :" + strval.size());
			for (int i = 1; i <= strval.size(); i++) {
				String str = CHECKLIST_NAME.replace("tr", "tr[" + i + "]");
				String deleteinspection = driver.findElement(By.xpath(str)).getText();
				System.out.println(driver.findElement(By.xpath(str)).getText());
				if (deleteinspection.contains(EditInspections_name)) {
					strverify = false;
					break;
				}
			}
			strverify = true;
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}

}

