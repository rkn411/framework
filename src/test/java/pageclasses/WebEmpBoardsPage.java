package pageclasses;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseClass;
import utilities.Utilities;
public class WebEmpBoardsPage extends BaseClass {
	WebDriver driver;
	public static final By QADEPARTMENT1 =By.xpath(".//*[@id='left-panel']/nav/ul/li[1]/a/span[1]");
	public static final By BOARDS_SIDEMENU_FRONTDESK =By.xpath("//a[@href = '/boards/departments/958']/span[contains(text(),'Front Desk')]");
	public static final By BOARDS_FRONTDESK_MARKASREAD =By.xpath("//ul[@class ='links done']//span[contains(text(),'Mark as read')]");
	public static final By BOARDS_FRONTDESK_MARKASUNREAD =By.xpath("//ul[@class ='links done']//span[contains(text(),'Mark as unread')]");
	public static final By BOARDS_FRONTDESK_COMMENT =By.xpath("(//i [@class='fa fa-comment-o'])[position()='1']");
	public static final By COMMENTS_WRITEACOMMENT =By.xpath("(//textarea[@class='ce form-control description-entry'])[position()=2]");
	public static final By BOARDS_FRONTDESK_COMMENT_WRITECOMMENT =By.xpath("(//textarea[@placeholder='Write a note or create a task by selecting one Department tag and one Location tag. If this is a guest complaint, check off the Guest Complaint box'])[position()='2']");
	public static final By BOARDS_FRONTDESK_COMMENT_CANCELBUTTON =By.xpath("(//button[contains(text(),'Cancel')])[position() ='1']");
	public static final By BOARDS_FRONTDESK_COMMENT_COMMENTBUTTON =By.xpath("//button[@class='send pull-right btn btn-primary']");
	public static final By BOARDS_DUEDATEFLD =By.xpath("(//div[@class='react-date-field__calendar-icon'])[position()='2']");
	public static final By CONVERTTOTASK_DUEDATEFLD =By.xpath("//html/body/section/div/div[1]/div/div/div/article/div/div/div[2]/div[2]/div/div[7]/div/form/label/div/div[2]");// div[@class='react-date-field__calendar-icon']");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN=By.xpath("//button[contains(.,'OK')]");
	public static final By BOARDS_FRONTDESK_EDIT =By.xpath("(//i [@class='fa fa-edit'])[position()='1']");
	public static final By RESOLVEDBTN =By.xpath("(//button[@class='pull-right btn btn-success'])[position()='1']");
	public static final By UNRESOLVED_DROPDOWN =By.xpath("//button[@id='resolution_type_dropdown']");
	public static final By UNRESOLVED_DROPDOWN_GUESTISVERYHAPPY =By.xpath("//a[contains(text(),'Guest is very happy')]");
	public static final By UNRESOLVED_DROPDOWN_UNRESOLVED =By.xpath("//a[contains(text(),'Unresolved')]");
	public static final By UNRESOLVEDBTN =By.xpath("(//button[@class='pull-right btn btn-danger'])[position()='1']");
	public static final By UNRESOLVED_DOLLARSFLD =By.xpath("//input[@placeholder='Cost']");
	public static final By EDIT_ASSIGNEDTOBTN=By.xpath("(//section[@class='col col-8']/label/select)[position()='1']");
	public static final By BOARDS_FRONTDESK_EDIT_DUEDATE =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[3]/div/div[6]/div/form/label/div/input");
	public static final By BOARDS_FRONTDESK_EDIT_SAVEBUTTON =By.xpath("//button[contains(@class,'btn btn-primary btn-sm')]");
	public static final By BOARDS_FRONTDESK_EDIT_CANCELBUTTON =By.xpath("//button[contains(@class,'btn btn-default btn-sm')]");
	public static final By BOARDS_FRONTDESK_VIEWCOMMENTS =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[6]/div/div[8]/ul/a");
	public static final By BOARDS_FRONTDESK_UNRESOLVEDBUTTON =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[3]/div/div[5]/div[1]/div[2]/button");
	public static final By BOARDS_FRONTDESK_UNRESOLVEDBUTTON_COST =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[3]/div/div[5]/div[1]/div[2]/div/form/span/span[1]/span/input");
	public static final By BOARDS_FRONTDESK_UNRESOLVEDBUTTON_DROPDOWN =By.xpath(".//*[@id='resolution_type_dropdown']");
	public static final By BOARDS_FRONTDESK_UNRESOLVEDBUTTON_DROPDOWNOPTION =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[3]/div/div[5]/div[1]/div[2]/div/form/span/span[2]/div/ul/li[3]/a");
	public static final By BOARDS_FRONTDESK_UNRESOLVEDBUTTON_CANCELBUTTON =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[3]/div/div[5]/div[1]/div[2]/div/form/span/span[3]/div/button[1]");
	public static final By BOARDS_FRONTDESK_UNRESOLVEDBUTTON_SAVEBUTTON =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[3]/div/div[5]/div[1]/div[2]/div/form/span/span[3]/div/button[2]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK =By.xpath("//button[contains(text(),'Convert to task')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG =By.xpath("//div[@class = 'content']/span[contains(text(),'Click to select Department & Location tags')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_DEPARTMENT =By.xpath(".//*[@id='tags-tabs-list-tab-dept']");
	public static final By BOARDS_FRONTDESK__CONVERTTASK_DEPTANDLOCATIONTAG_PLUSICON =By.xpath(".//*[@id='tags-tabs-list-pane-2']/div/div/ul/li/header/a/i");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_FRONTDESKTAB =By.linkText("Front Desk");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_DEPARTMENT_CHKBOXOPTION =By.xpath("//label[contains(.,'CashDeposit')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_LOCATIONTAB =By.xpath(".//*[@id='tags-tabs-list-tab-area']");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_LOCATIONTAB_EXTERIOR =By.linkText("Exterior");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHKBOX =By.xpath("//label[contains(.,'DriveWay')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENTTAB =By.xpath(".//*[@id='tags-tabs-list-tab-equip']");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENTTAB = By.linkText("Group_Equipment");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENT_GROUPEQUIPCHKBOX = By.xpath("//label[contains(.,'equipm_of_Group_Equipment')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_CANCELBUTTON =By.xpath("//button[contains(@class ,'btn btn-default') and contains(text(), 'Cancel')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_SAVEBUTTON =By.xpath("//button[contains(@class ,'btn btn-primary')and contains(text(), 'Save')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_COPYTO =By.xpath("//div[@class='content' ]//span[contains(text(),'Click to Copy to')]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_COPYTO_CHECKBOX =By.xpath("(//label[@class='checkbox'])[position()=30]");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_COPYTO_CANCELBUTTON =By.xpath("//button[@class='btn btn-default']");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_COPYTO_SAVEBUTTON =By.xpath("//button[@class='btn btn-primary']");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_ASSIGNTO =By.xpath("(//select[@role = 'button'])[position() ='1']");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_SUBJECT =By.xpath("(//input[@placeholder='Subject'])[position()='2']");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_DUEDATE =By.xpath("//input[@placeholder ='Due Date']");
	public static final By BOARDS_FRONTDESK_CONVERTTASK_POSTATASK =By.xpath("//button[@class='btn pull-right btn-primary btn-sm']");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_FRWD_ARW =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[1]/div[4]/svg/path[1]");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_DATE =By.xpath("//div[contains,(.,'3')]");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[2]/div[2]/div[2]/input");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_TIME_DOWNARROW =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/svg");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN =By.xpath("//button[contains(.,'OK')]");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_CANCELBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[3]/button[4]");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_CLEARBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[3]/button[2]");
	public static final By BOARDS_FRONTDESK_CONVERTTOTASK_DUEDATEFLD_CALENDER_BACKWWRDARW =By.xpath(".//*[@id='boardclass']/article/div/div/div[1]/div/form/fieldset/div/section[3]/label/div/div[3]/div/div/div[1]/div[2]/svg/path[1]");
	public static final By MSGICON_VERIFICATION =By.xpath("(//span[text()='Mark as read'])[position()=1]");
	public static final By COMMENT_VERIFICATION =By.xpath("//span[@class='inner-text comment-description']");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_SAVEBUTTON =By.xpath("//button[@class='btn btn-primary']");
	public static final By TEXT =By.xpath("(//div[@class='row pull-left show'])[position()='2']");
	public static final By EMP1 =By.xpath("//i[@class='fa fa-lg fa-fw fa fa-home']");
	public static final By GETMOREBTN =By.xpath("//button[@class='pull-right btn btn-default']");
	public static final By CANCELBTN =By.xpath("//button[@class='btn btn-default']");
	// Constructor
	public WebEmpBoardsPage(WebDriver driver) {
		this.driver = driver;
	}
	// Method to click on Emp1
	public void clkEmp1(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP1);
			driver.findElement(EMP1).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Alex
	public void clkCancelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CANCELBTN);
			driver.findElement(CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click alex button
	public void clkHotelbtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, QADEPARTMENT1);
			driver.findElement(QADEPARTMENT1).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click GetmoreButton button
	public void clkGetMoreBtn(WebDriver driver) {
		try {
			Utilities.scrollingToBottomofAPage(driver);
			waitForExpectedElement(driver, GETMOREBTN);
			driver.findElement(GETMOREBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on cancelbtn
	public void clkSaveBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_SAVEBUTTON);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_SAVEBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to verify Unresolved Functionality
	public boolean unresolvedVerification(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, TEXT);
			Thread.sleep(10000);
			// driver.findElement(TEXT).click();
			String strval = driver.findElement(TEXT).getText();
			System.out.println("string is: " + strval);
			if (strval.contains("Guest is very happy")) {
				strverify = true;
			} else {
				strverify = false;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to click on departments&locations field
	public void clkDeptAndLocationsBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on departments tab in the popup
	public void clkOnDepartmentttab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_DEPARTMENT);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_DEPARTMENT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to select option in departments tab
	public void clkFrontdesktab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_FRONTDESKTAB);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_FRONTDESKTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to select option in departments tab
	public void clkFrontdeskchkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_DEPARTMENT_CHKBOXOPTION);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_DEPARTMENT_CHKBOXOPTION).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Location tab
	public void clkLocationtab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_LOCATIONTAB);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_LOCATIONTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Exterior tab
	public void clkExteriortab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_LOCATIONTAB_EXTERIOR);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_LOCATIONTAB_EXTERIOR).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Exterior options checkbox
	public void clkExteriorchkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver,BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHKBOX);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Equipment tab
	public void clkEquipmentsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENTTAB);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENTTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Group Equipment tab
	public void clkGroupEquipmentsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENTTAB);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENTTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Equipment options check box
	public void clkGroupEquipChkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver,BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENT_GROUPEQUIPCHKBOX);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPANDLOCATIONTAGS_EQUIPMENT_GROUPEQUIPMENT_GROUPEQUIPCHKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Cancel button
	public void clkCancelButton(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_CANCELBUTTON);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_CANCELBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Save button
	public void clkSavebutton(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_SAVEBUTTON);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_DEPTANDLOCATIONTAG_SAVEBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Copyto
	public void clkCopyto(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_COPYTO);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_COPYTO).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on option in Users Popup
	public void clkUsersChkBox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_COPYTO_CHECKBOX);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_COPYTO_CHECKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Assignto dropdown
	public void clkAssignto(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_ASSIGNTO);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_ASSIGNTO).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
 // Method to enter Subject
	public void fillSubject(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_SUBJECT);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_SUBJECT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to edit Duedate
	public void editDuedate(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_EDIT_DUEDATE);
			driver.findElement(BOARDS_FRONTDESK_EDIT_DUEDATE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Save edited fields in Edit screen
	public void clkSaveEditpage(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_EDIT_SAVEBUTTON);
			driver.findElement(BOARDS_FRONTDESK_EDIT_SAVEBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Cancel button in Edit screen
	public void clkCancelEditPage(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_EDIT_CANCELBUTTON);
			driver.findElement(BOARDS_FRONTDESK_EDIT_CANCELBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Cost in Unresolved screen
	public void fillUnresolvedCost(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDBUTTON_COST);
			driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDBUTTON_COST).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Unresolved dropdown
	public void clkUnresolveddropdown(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDBUTTON_DROPDOWN);
			driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDBUTTON_DROPDOWN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Select Unresolved dropdown options
	public void clkUnresolvedOption(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDBUTTON_DROPDOWNOPTION);
			driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDBUTTON_DROPDOWNOPTION).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click cancel button
	public void clkUnresolvedCancel(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDBUTTON_CANCELBUTTON);
			driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDBUTTON_CANCELBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click Save button
	public void clkUnresolvedSave(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_UNRESOLVEDBUTTON_SAVEBUTTON);
			driver.findElement(BOARDS_FRONTDESK_UNRESOLVEDBUTTON_SAVEBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Mark as Unread
	public void clkMarkasUnread(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_MARKASUNREAD);
			driver.findElement(BOARDS_FRONTDESK_MARKASUNREAD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Mark as Read
	public void clkMarkasRead(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_MARKASREAD);
			driver.findElement(BOARDS_FRONTDESK_MARKASREAD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Comment icon
	public boolean clkOnCommentIcon(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT);
			driver.findElement(BOARDS_FRONTDESK_COMMENT).click();
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method to Click on Cancel button in comments section
	public void clkCommentCancelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_CANCELBUTTON);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_CANCELBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Save button in comments section
	public void clkCommentButton(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_COMMENTBUTTON);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_COMMENTBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to write in text are of comment section
	public void fillCommentTextarea(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_COMMENT_WRITECOMMENT);
			driver.findElement(BOARDS_FRONTDESK_COMMENT_WRITECOMMENT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Edit button
	public void clkEditButton(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_EDIT);
			driver.findElement(BOARDS_FRONTDESK_EDIT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to select the Emp1 from the dropdown list
	public void clkEmp1InEdit(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_ASSIGNEDTOBTN);
			driver.findElement(EDIT_ASSIGNEDTOBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click cancel button in edit
	public void clkCancelBtninEdit(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_EDIT_CANCELBUTTON);
			driver.findElement(BOARDS_FRONTDESK_EDIT_CANCELBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click save button in edit
	public void clkSaveBtnInEdit(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_EDIT_SAVEBUTTON);
			driver.findElement(BOARDS_FRONTDESK_EDIT_SAVEBUTTON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click Assign to
	public void clkAssignToInEdit(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_ASSIGNEDTOBTN);
			driver.findElement(EDIT_ASSIGNEDTOBTN).click();
			driver.findElement(EDIT_ASSIGNEDTOBTN).sendKeys(Keys.DOWN);
			driver.findElement(EDIT_ASSIGNEDTOBTN).sendKeys(Keys.DOWN);
			driver.findElement(EDIT_ASSIGNEDTOBTN).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Convert to task button
	public boolean clkOnConvertToTaskButton(WebDriver driver) {
		boolean strverify = false;
		try {
			if (waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK).isDisplayed() == true) {
				driver.findElement(BOARDS_FRONTDESK_CONVERTTASK).click();
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// method to click post a task
	public void clkPostaTask(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_FRONTDESK_CONVERTTASK_POSTATASK);
			driver.findElement(BOARDS_FRONTDESK_CONVERTTASK_POSTATASK).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Verify Msg Icon functionality
	public Boolean msgiconVerification(WebDriver driver) {
		String strtext = null;
		try {
			waitForExpectedElement(driver, MSGICON_VERIFICATION);
			driver.findElement(MSGICON_VERIFICATION).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(MSGICON_VERIFICATION).isDisplayed();
	}
	// Method to verify Comment icon Functionality
	public boolean commenticonVerification(WebDriver driver) {
		String strverify = null;
		try {
			waitForExpectedElement(driver, COMMENT_VERIFICATION);
			driver.findElement(COMMENT_VERIFICATION).isDisplayed();
		} catch (Exception e) {
			e.getMessage();
		}
		return driver.findElement(COMMENT_VERIFICATION).isDisplayed();
	}
	// method to click on edit icon
	public void enterComment(WebDriver driver) {
		try {
			waitForExpectedElement(driver, COMMENTS_WRITEACOMMENT);
			driver.findElement(COMMENTS_WRITEACOMMENT).sendKeys("Entering text in to Comment Textbox");
		} catch (Exception e) {

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
	public void clkDateFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_DUEDATEFLD);
			driver.findElement(BOARDS_DUEDATEFLD).click();
			List<WebElement> ls = driver
					.findElements(By.xpath("//div[@class='react-date-picker__month-view-day-text']"));
			System.out.println("Elements : " + ls.size());
			waitForExpectedElement(driver,
					By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]"));
			driver.findElement(By.xpath("(//div[@class='react-date-picker__month-view-day-text'])[position()=42]"))
					.click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void clkCalenderOk(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// method to click on resolved button
	public boolean clkResolvedBtn(WebDriver driver) {
		boolean verify = false;
		try {
			if (waitForExpectedElement(driver, RESOLVEDBTN).isDisplayed() == true) {
				waitForExpectedElement(driver, RESOLVEDBTN);
				driver.findElement(RESOLVEDBTN).click();
				verify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return verify;
	}
	// method to click save btn in calender
	public void clkDropDownInUnresolved(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UNRESOLVED_DROPDOWN);
			driver.findElement(UNRESOLVED_DROPDOWN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Unresolved
	public void clkUnresolvedFromDropdown(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UNRESOLVED_DROPDOWN_UNRESOLVED);
			driver.findElement(UNRESOLVED_DROPDOWN_UNRESOLVED).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click save btn in calender
	public boolean clkUnresolvedButton(WebDriver driver) {
		boolean verify = false;
		try {
		if (waitForExpectedElement(driver, UNRESOLVEDBTN).isDisplayed() == true) {
				waitForExpectedElement(driver, UNRESOLVEDBTN);
				driver.findElement(UNRESOLVEDBTN).click();
				verify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return verify;
	}
	// method to click save btn in calender
	public void clkDollarsFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UNRESOLVED_DOLLARSFLD);
			driver.findElement(UNRESOLVED_DOLLARSFLD).click();
			driver.findElement(UNRESOLVED_DOLLARSFLD).clear();
			driver.findElement(UNRESOLVED_DOLLARSFLD).sendKeys("500");

		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Guest is Very Happy in dropdown
	public void clkGuestisVeryHappy(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UNRESOLVED_DROPDOWN_GUESTISVERYHAPPY);
			driver.findElement(UNRESOLVED_DROPDOWN_GUESTISVERYHAPPY).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}