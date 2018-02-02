package pageclasses;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;
import utilities.Utilities;
public class WebEmpPostaNotePage extends BaseClass {
	WebDriver driver;
	public static final By EMP1 =By.xpath("//i[@class='fa fa-lg fa-fw fa fa-home']");
	public static final By POSTANOTEBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[5]/div/button[1]");
	public static final By CONVERTTOTASKBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[5]/div/button[2]");
	public static final By CANCELBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[5]/div/button[3]");
	public static final By ALERTMESSAGE =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/div");
	public static final By POSTATASKBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[5]/div/button[1]");
	public static final By PRIVATECHKBOX =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[1]/div/label[3]/i");
	public static final By GUESTCHKBOX =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[1]/div/label[2]/i");
	public static final By POSTANOTE_DEPARTMENTANDLOCATIONS_TAGICON =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[2]/label/i[1]");
	public static final By POSTANOTE_CLICKTOCOPYTO =By.xpath("(//div[@class='content'])[position()='2']");
	public static final By POSTANOTE_ATTACHICON =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[5]/div/div/a/i");
	public static final By POSTANOTE_TAGS_DEPARTMENTTAB =By.xpath(".//*[@id='tags-tabs-list-tab-dept']");
	public static final By POSTANOTE_TAGS_LOCATIONTAB =By.xpath(".//*[@id='tags-tabs-list-tab-area']");
	public static final By POSTANOTE_TAGS_EQUIPMENTTAB =By.xpath(".//*[@id='tags-tabs-list-tab-equip']");
	public static final By POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB =By.xpath(".//*[@id='tags-tabs-list-tab-3']");
	public static final By POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB_FOUNDCHECKBOX =By.xpath(".//*[@id='tags-tabs-list-pane-3']/div/div/ul/li/div/fieldset/section/div[1]/label/i");
	public static final By POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB_LOSTCHECKBOX =By.xpath("..//*[@id='tags-tabs-list-pane-3']/div/div/ul/li/div/fieldset/section/div[2]/label/i");
	public static final By POSTANOTE_TAGS_SAVEBTN =By.xpath("//html/body/div[2]/div/div[2]/div/div/div[3]/div/div/div/button[2]");
	public static final By POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR =By.linkText("Exterior");
	public static final By POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR_CONTAINERCHECKBOX =By.xpath("//label[contains(.,'Container')]");
	public static final By POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHECKBOX =By.xpath(".//*[@id='tags-tabs-list-pane-3']/div/div/ul/li/div/fieldset/section/div[2]/label/i");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_EQUIPMENTTAB =By.xpath(".//*[@id='tags-tabs-list-tab-equip']");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_GROUPEQUIPMENTTAB =By.linkText("Group_Equipment");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_GROUPEQUIPMENT_GROUPEQUIPCHKBOX =By.xpath("//label[contains(.,'equipm_of_Group_Equipment')]");
	public static final By POSTANOTE_TAGS_CANCELBTN =By.xpath("//button[@class='btn btn-default']");
	public static final By POSTANOTE_CLICKTOCOPY_USERSICON_USERSPOPUP_FRONTDESKCHKBOX =By.xpath("//html/body/div[2]/div/div[2]/div/div/div[2]/form/div/div/ul/li/fieldset/section/div[15]/label/i");
	public static final By CONVERTTOTASK_ASSIGNTO =By.xpath("//select[@role='button']");
	public static final By CONVERTTOTASK_ASSIGNTO_ALEX =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/div/section[1]/label/select/option[3]");
	public static final By CONVERTTOTASK_SUBJECTFLD =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[2]/label/input");
	public static final By CONVERTTOTASK_DUEDATEFLD =By.xpath("//div[@class='react-date-field__calendar-icon']");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_FRWD_ARW =By.cssSelector("div.react-date-picker__nav-bar-arrow.react-date-picker__nav-bar-arrow--next > svg");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_DATE =By.xpath("//div[3]/button[3]");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[2]/div[2]/div[2]/input");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME_DOWNARROW =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/svg");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN=By.xpath("//button[contains(.,'OK')]");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_CANCELBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[3]/button[4]");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_CLEARBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[3]/button[2]");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_BACKWWRDARW =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[1]/div[2]/svg/path[1]");
	public static final By POSTANOTE_TEXTBOX =By.xpath("//textarea[@placeholder='Write a note or create a task by selecting one Department tag and one Location tag. If this is a guest complaint, check off the Guest Complaint box']");
	public static final By DEPARTMENTANDLOCATION_EDITICON =By.xpath("//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/section[2]/label/i[2]");
	public static final By DEPARTMENTANDLOCATION_DEPARTMENTSBTN =By.xpath(".//*[@id='tags-tabs-list-tab-dept']");
	public static final By DEPARTMENTANDLOCATION_DEPARTMENTSBTN_FRONTDESK =By.xpath(".//*[@id='tags-tabs-list-tab-1']");
	public static final By DEPARTMENTANDLOCATION_DEPARTMENTSBTN_FRONTDESK_911CHKBOX =By.xpath(".//*[@id='tags-tabs-list-pane-1']/div/div/ul/li/div/fieldset/section/div[1]/label/i");
	public static final By DEPARTMENTANDLOCATION_LOCATIONSBTN =By.xpath(".//*[@id='tags-tabs-list-tab-area']");
	public static final By DEPARTMENTANDLOCATION_LOCATIONSBTN_ROOMS =By.xpath(".//*[@id='tags-tabs-list-tab-1']");
	public static final By DEPARTMENTANDLOCATION_LOCATIONSBTN_ROOMS_ROOM101 =By.xpath(".//*[@id='tags-tabs-list-pane-1']/div/div/ul/li/div/fieldset/section/div[1]/label/i");
	public static final By DEPARTMENTANDLOCATION_EQUIPMENTTAB =By.xpath(".//*[@id='tags-tabs-list-tab-equip']");
	public static final By DEPARTMENTANDLOCATION_EQUIPMENTTAB_FIRSTGROUP =By.xpath(".//*[@id='tags-tabs-list-tab-1']");
	public static final By DEPARTMENTANDLOCATION_EQUIPMENTTAB_FIRSTGROUP_TEST3CHKBOX =By.xpath(".//*[@id='tags-tabs-list-pane-1']/div/div/ul/li/div/fieldset/section/div/label/i");
    public static final By OVERDUECOUNT =By.xpath("//h5[@class='todo-group-title txt-color-red']");
	public static final By FUTURECOUNT =By.xpath("//h5[@class='todo-group-title txt-color-black']");
	public static final By POSTNAME =By.xpath("//span[@class='inner-text']");
	public static final By TASKNAME =By.xpath("//div[@class='subject open']");
	public static final By FRONTDESK_TAB =By.xpath("//a[@href='/boards/departments/958']");
	public static final By OVERDUEBTN =By.xpath("(//a[@class='collapse-btn'])[position()='1']");
	public static final By FUTUREBTN =By.xpath("(//a[@class='collapse-btn'])[position()='2']");
	public static final By TODOLIST =By.xpath("//a[@class='todo-subject']");
	public static final By DEPTANDLOCATEXT =By.xpath("(//div[@class='text text-tags'])[position()='1']");
	public static final By COPYTOTEXT =By.xpath("(//label[@class='label contenteditable'])[position()='2']");
	public static final By ASSIGNTOTEXT =By.xpath("//select[@role='button']");
	// Constructor
	public WebEmpPostaNotePage(WebDriver driver) {
		this.driver = driver;
	}
	// Method to click on Alex
	public void clkEmp1(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP1);
			driver.findElement(EMP1).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to get department and location text
	public String getDeptandLocationText(WebDriver driver) {
		String strtext = null;
		try {
				strtext = driver.findElement(DEPTANDLOCATEXT).getText();
				System.out.println(" Selected Departments,Locations & Equipment is : " + strtext);
		} catch (Exception e) {
			e.getMessage();
		}
		return strtext;
	}
	// Method to get CopyTo
	public String getCopyTotext(WebDriver driver) {
		String strtext = null;
		try {
				strtext = driver.findElement(COPYTOTEXT).getText();
				System.out.println(" Selected  Copy To Name is : " + strtext);
		} catch (Exception e) {
			e.getMessage();
		}
		return strtext;
	}
	// Method to get Assign To
	public String getAssignTotext(WebDriver driver) {
		String strtext = null;
		try {
				strtext = driver.findElement(ASSIGNTOTEXT).getText();
				System.out.println(" Selected  Assign To Name is : " + strtext);
		} catch (Exception e) {
			e.getMessage();
		}
		return strtext;
	}
	// Method to click on Post a Note Button
	public void clkPostaNoteBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTEBTN);
			driver.findElement(POSTANOTEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Convert to task Button
	public void clkConverttoTaskBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASKBTN);
			driver.findElement(CONVERTTOTASKBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Cancel Button
	public void clkCancelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CANCELBTN);
			driver.findElement(CANCELBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// method to get error message
	public String getAlertrMsg(WebDriver driver) {
		String strerrormsg = null;
		try {
			strerrormsg = driver.findElement(ALERTMESSAGE).getText();
			System.out.println("alert message: " + strerrormsg);
			// driver.findElement(By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/div/button[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getMessage();
		}
		return strerrormsg;
	}
	// Method to click on post a Task Button
	public void clkPostaTaskBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTATASKBTN);
			driver.findElement(POSTATASKBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Private Checkbox
	public void clkPrivateChkBox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PRIVATECHKBOX);
			driver.findElement(PRIVATECHKBOX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Guest Complaint checkbox
	public void clkGuestComplaintChkBox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, GUESTCHKBOX);
			driver.findElement(GUESTCHKBOX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Departments and Locations Tag
	public void clkDeptLocationTagIcon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_DEPARTMENTANDLOCATIONS_TAGICON);
			driver.findElement(POSTANOTE_DEPARTMENTANDLOCATIONS_TAGICON).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Copyto
	public void clkCopyTo(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_CLICKTOCOPYTO);
			driver.findElement(POSTANOTE_CLICKTOCOPYTO).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Attachicon
	public void clkAttachicon(WebDriver driver) {
		try {
    		waitForExpectedElement(driver, POSTANOTE_ATTACHICON);
			driver.findElement(POSTANOTE_ATTACHICON).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Department Tab
	public void clkDepartmentsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_DEPARTMENTTAB);
			driver.findElement(POSTANOTE_TAGS_DEPARTMENTTAB).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Location Tab
	public void clkLocationsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_LOCATIONTAB);
			driver.findElement(POSTANOTE_TAGS_LOCATIONTAB).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click Equipments Tab
	public void clkEquipmentTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_EQUIPMENTTAB);
			driver.findElement(POSTANOTE_TAGS_EQUIPMENTTAB).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Lost and Found Tab
	public void clkLostandFoundTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB);
			driver.findElement(POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Found Checkbox
	public void clkFoundChkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB_FOUNDCHECKBOX);
			driver.findElement(POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB_FOUNDCHECKBOX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on lost checkbox
	public void clklostChkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB_LOSTCHECKBOX);
			driver.findElement(POSTANOTE_TAGS_DEPARTMENTTAB_LOSTANDFOUNDTAB_LOSTCHECKBOX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Save Button
	public void clkSaveBtn(WebDriver driver) {
		try {
    		waitForExpectedElement(driver, POSTANOTE_TAGS_SAVEBTN);
			driver.findElement(POSTANOTE_TAGS_SAVEBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Exterior tab
	public void clkExteriorTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR);
			driver.findElement(POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Roomstab
	public void clkRoomsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATION_LOCATIONSBTN_ROOMS);
			driver.findElement(DEPARTMENTANDLOCATION_LOCATIONSBTN_ROOMS).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on room101 checkbox
	public void clkRoom101chkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATION_LOCATIONSBTN_ROOMS_ROOM101);
			driver.findElement(DEPARTMENTANDLOCATION_LOCATIONSBTN_ROOMS_ROOM101).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Container Checkbox
	public void clkContainerChkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR_CONTAINERCHECKBOX);
			driver.findElement(POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR_CONTAINERCHECKBOX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Driveaway checkbox
	public void clkDriveawayChkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHECKBOX);
			driver.findElement(POSTANOTE_TAGS_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHECKBOX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on firstgroup tab
	public void clkEquipment(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_EQUIPMENTTAB);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_EQUIPMENTTAB).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on GroupEqipment
	public void clkGroupEquipment(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_GROUPEQUIPMENTTAB);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_GROUPEQUIPMENTTAB).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Test3 Checkbox
	public void clkGroupEquipmentCheckBox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_GROUPEQUIPMENT_GROUPEQUIPCHKBOX);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_GROUPEQUIPMENT_GROUPEQUIPCHKBOX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on cancel button
	public void clkTagsCancelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TAGS_CANCELBTN);
			driver.findElement(POSTANOTE_TAGS_CANCELBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Met
	public void clkFrontdeskchkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_CLICKTOCOPY_USERSICON_USERSPOPUP_FRONTDESKCHKBOX);
			Thread.sleep(5000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					driver.findElement(POSTANOTE_CLICKTOCOPY_USERSICON_USERSPOPUP_FRONTDESKCHKBOX));
			driver.findElement(POSTANOTE_CLICKTOCOPY_USERSICON_USERSPOPUP_FRONTDESKCHKBOX).click();
			Thread.sleep(5000);
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void clkAssignTo(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_ASSIGNTO);
			driver.findElement(CONVERTTOTASK_ASSIGNTO).click();
			driver.findElement(CONVERTTOTASK_ASSIGNTO).sendKeys(Keys.DOWN);
			driver.findElement(CONVERTTOTASK_ASSIGNTO).sendKeys(Keys.DOWN);
			driver.findElement(CONVERTTOTASK_ASSIGNTO).sendKeys(Keys.ENTER);
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void clkAlexInAssign(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_ASSIGNTO_ALEX);
			driver.findElement(CONVERTTOTASK_ASSIGNTO_ALEX).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void enterTextinSubjectField(WebDriver driver, String taskSubject) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_SUBJECTFLD);
			driver.findElement(CONVERTTOTASK_SUBJECTFLD).sendKeys(taskSubject);
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
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
			Thread.sleep(5000);
	}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void clkForwardArrow(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_FRWD_ARW);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_FRWD_ARW).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void selectdate(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_DATE);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_DATE).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void enterTime(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME).click();
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME).clear();
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME).sendKeys("05:00");
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void clkDownArrow(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME_DOWNARROW);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME_DOWNARROW).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void clkCalenderOk(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public void clkCalenderCancel(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_CANCELBTN);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_CANCELBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// method to enter subject
	public void enterTextIntoTaskTextBoxFld(WebDriver driver, String noteSubject) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TEXTBOX);
			driver.findElement(POSTANOTE_TEXTBOX).sendKeys(noteSubject);
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// method to enter subject
	public void enterTextTaskTextBoxFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, POSTANOTE_TEXTBOX);
			driver.findElement(POSTANOTE_TEXTBOX).sendKeys("New task");
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	public String gettingTextFromOverDueToDo(WebDriver driver) {
		try {
			waitForExpectedElement(driver, OVERDUECOUNT);
			driver.findElement(OVERDUECOUNT).getText();
		}
		catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(OVERDUECOUNT).getText();
	}
    public String gettingTextFromFutureToDo(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FUTURECOUNT);
			driver.findElement(FUTURECOUNT).getText();
		}
		catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(FUTURECOUNT).getText();
	}
	// Method to click on Private Checkbox
	public void clkOverdueBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, OVERDUEBTN);
			driver.findElement(OVERDUEBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Private Checkbox
	public void clkFutureBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FUTUREBTN);
			driver.findElement(FUTUREBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on overdue field
	public String getOverDueTaskCount(WebDriver driver) {
		String overDueCount = null;
		try {
			waitForExpectedElement(driver, (OVERDUECOUNT));
			overDueCount = driver.findElement(OVERDUECOUNT).getText();
		} catch (Exception e) {
			e.getMessage();
		}
		return overDueCount;
	}
	public String getFutureTaskCount(WebDriver driver) {
		String futureCount = null;
		try {
			waitForExpectedElement(driver, (FUTURECOUNT));
			futureCount = driver.findElement(FUTURECOUNT).getText();
		} catch (Exception e) {
			e.getMessage();
		}
		return futureCount;
	}
	// Method to click FrontDesk
	public void clkFrontDeskTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FRONTDESK_TAB);
			driver.findElement(FRONTDESK_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to verify a post
	public boolean postanoteVerification(WebDriver driver, String noteSubject, String noteMessage) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, POSTNAME);
			List<WebElement> elements = driver.findElements(POSTNAME);
			for (WebElement element : elements) {
				Utilities.scrollingToBottomofAPage(driver);
				if (element.getText().toString().contains(noteSubject)) {
					System.out.println(noteMessage);
					strverify = true;
					break;
				} else {
					strverify = false;
				}
			}

		} catch (Exception e) {
		}
		return strverify;
	}
	// method to verify a task
	public boolean postataskVerification(WebDriver driver, String taskSubject, String TaskMessage) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, TASKNAME);
			List<WebElement> elements = driver.findElements(TASKNAME);
			for (WebElement element : elements) {
				Utilities.scrollingToBottomofAPage(driver);
				if (element.getText().toString().contains(taskSubject)) {
					System.out.println(TaskMessage);
					strverify = true;
					break;
				} else {
					strverify = false;
				}

			}
		}
	catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	public void verifyCreatedTasks(WebDriver driver, String subject, String taskProgressMessage) throws Exception {
		try {
			waitForExpectedElement(driver, TODOLIST);
			List<WebElement> elements = driver.findElements(TODOLIST);
			for (WebElement element : elements) {
				if (element.getText().toString().contains(subject)) {
					System.out.println(taskProgressMessage);
					continue;
				}
			}
		} catch (Exception e) {
		}

	}
}

