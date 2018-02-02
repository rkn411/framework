package pageclasses;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.BaseClass;

public class WebAdminBoardsPage extends BaseClass {
	WebDriver driver;
	public static final By ALEXBTN =By.xpath(".//*[@id='left-panel']/nav/ul/li[1]/a/span[1]");
	public static final By BOARDS_ALEX_MESSAGEBTNUNREAD =By.xpath("(//span[text()='Mark as unread'])[position()=1]");
	public static final By BOARDS_ALEX_MESSAGEBTNREAD =By.xpath("(//span[text()='Mark as read'])[position()=1]");
	public static final By BOARDS_ALEX_COMMENTBTN =By.xpath("//i[@class='fa fa-comment-o']");
	public static final By BOARDS_ALEX_FLAGBTN =By.xpath("(//span[text()='Flag'])[position()=1]");
	public static final By BOARDS_ALEX_EDITICON =By.xpath("(//i[@class='fa fa-edit'])[position()='1']");
	public static final By COMMENTS_WRITEACOMMENT =By.xpath("(//textarea[@class='ce form-control description-entry'])[position()=2]");
	public static final By COMMENTS_CANCELBTN =By.xpath("(//button[@class='pull-right margin-right-13 btn btn-default'])[position()=1]");
	public static final By COMMENTS_COMMENTBTN =By.xpath("(//button[@class='send pull-right btn btn-primary'])[position()=1]");
	public static final By COMMENTS_ADDTAGSICON =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[8]/ul/li/div[2]/div[2]/a[1]/i");
	public static final By COMMENTS_ADDUSERSICON =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[8]/ul/li/div[2]/div[2]/a[2]/i");
	public static final By COMMENTS_ATTACHMENTICON =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[8]/ul/li/div[2]/div[2]/div/a/i");
	public static final By FLAG_FLAGPOPUP_CLOSESYM =By.xpath("html/body/div[2]/div/div[2]/div/div/div[1]/button");
	public static final By FLAG_FLAGPOPUP_CANCELBTN =By.xpath("//button[@class='btn btn-sm btn-default']");
	public static final By FLAG_FLAGPOPUP_SAVEBTN =By.xpath("//div[@class='modal-footer']/span/button[1]");
	public static final By FLAG_FLAGEXPIRYDATEFLD =By.xpath("//input[@class='flag-due-input']");
	public static final By FLAG_FLAGEXPIRYDATEFLD_NEXTARROW =By.xpath("//a[@class='react-datepicker__navigation react-datepicker__navigation--next']");
	public static final By FLAG_FLAGEXPIRYDATEFLD_DATE =By.xpath("//div[@aria-label='day-26']");
	public static final By UNFLAG_ALERTTEXT =By.xpath("html/body/div[2]/div/div[2]/div/div/div[2]");
	public static final By EDIT_ASSIGNEDTOBTN=By.xpath("(//section[@class='col col-8']/label/select)[position()='1']");
	public static final By EDIT_ASSIGNEDTO_ALEX =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[6]/div/form/div/section[1]/label/select/option[3]");
	public static final By EDIT__CANCELBTN =By.xpath("//button[@class='btn btn-default btn-sm']");
	public static final By EDIT__SAVEBTN =By.xpath("//button[@class='btn btn-primary btn-sm']");
	public static final By EDIT_DUEDATEFLD =By.xpath("(//div[@class='react-date-field__calendar-icon'])[position()='2']");
	public static final By EDIT_CALENDER_NEXTARROW =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[6]/div/form/label/div/div[3]/div/div/div[1]/div[4]/svg/path[1]");
	public static final By EDIT_CALENDER_DATE =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[6]/div/form/label/div/div[3]/div/div/div[2]/div[1]/div[7]/div[8]/div");
	public static final By EDIT_CALENDER_SAVEBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[6]/div/form/button[1]");
	public static final By EDIT_CALENDER_CANCELBTN =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[6]/div/form/button[2]");
	public static final By EDIT_CALENDER_ALERTMSG =By.xpath(".//*[@id='boardclass']/article/div/div/div[2]/div[1]/div/div[6]/div/form/div[1]");
	public static final By UNRESOLVEDBTN =By.xpath("(//button[@class='pull-right btn btn-danger'])[position()='1']");
	public static final By UNRESOLVED_DROPDOWN =By.xpath("//button[@id='resolution_type_dropdown']");
	public static final By UNRESOLVED_DROPDOWN_GUESTISVERYHAPPY =By.xpath("//a[contains(text(),'Guest is very happy')]");
	public static final By UNRESOLVED_DROPDOWN_UNRESOLVED =By.xpath("//a[contains(text(),'Unresolved')]");
	public static final By UNRESOLVED_DOLLARSFLD =By.xpath("//input[@placeholder='Cost']");
	public static final By DEPARTMENTANDLOCATIONTAG =By.xpath("(//i[@class='icon-prepend fa fa-tags'])[position()='2']");
	public static final By DEPARTMENT_TAB =By.xpath("//a[@id='tags-tabs-list-tab-dept']");
	public static final By DEPARTMENT_HOUSEKEEPING =By.linkText("House Keeping");
	public static final By DEPARTMENT_HOUSEKEEPING_BATHCOUNTERCHKBOX =By.xpath("//label[contains(.,'BathCounter')]");
	public static final By DEPARTMENT_HOUSEKEEPING_PLUSICON =By.xpath(".//*[@id='tags-tabs-list-pane-2']/div/div/ul/li/header/a/i");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB =By.xpath("//a[@id='tags-tabs-list-tab-area']");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB_EXTERIOR =By.linkText("Exterior");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHKBOX =By.xpath("//label[contains(.,'DriveWay')]");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB_EXTERIOR_PLUSICON =By.xpath(".//*[@id='tags-tabs-list-pane-3']/div/div/ul/li/header/a/i");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_EQUIPMENTTAB =By.xpath("//a[@id='tags-tabs-list-tab-equip']");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_FIRSTGROUP =By.linkText("First group");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_FIRSTGROUP_TEST3CHKBOX =By.xpath("//label[contains(.,'Test3')]");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_GROUPEQUIPMENT_PLUSICON =By.xpath(".//*[@id='tags-tabs-list-pane-3']/div/div/ul/li/header/a/i");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_CANCELBUTTON =By.xpath("//button[@class='btn btn-default']");
	public static final By DEPARTMENTANDLOCATIONTAGSPOPUP_SAVEBUTTON =By.xpath("//button[@class='btn btn-primary']");
	public static final By COPYTO =By.xpath("(//i[@class='icon-prepend fa fa-users'])[position()='2']");
	public static final By COPYTO_USERSPOPUP_CHECKBOX =By.xpath("(//label[@class='checkbox'])[position()=30]");
	public static final By COPYTO_USERSPOPUP_CANCELBUTTON =By.xpath("//button[@class='btn btn-default']");
	public static final By COPYTO_USERSPOPUP_SAVEBUTTON =By.xpath("//button[@class='btn btn-primary']");
	public static final By SUBJECTFLD =By.xpath("(//input[@placeholder='Subject'])[position()='2']");
	public static final By TEXTAREAFLD =By.xpath("(//textarea[@placeholder='Write a note or create a task by selecting one Department tag and one Location tag. If this is a guest complaint, check off the Guest Complaint box'])[position()='2']");
	public static final By CONVERTTOTASK_CANCELBTN =By.xpath("//button[@class='btn pull-right btn-default btn-sm']");
	public static final By CONVERTTOTASK_POSTATASK =By.xpath("//button[@class='btn pull-right btn-primary btn-sm']");
	public static final By CALENDERFLAG =By.xpath("//h4[@class='modal-title']");
	public static final By UNFLAGICON =By.xpath("(//span[text()='Unflag'])[position()=1]");
	public static final By CONVERTTOTASKICON =By.xpath("//i[@class='fa fa-check']");
	public static final By RESOLVEDBTN =By.xpath("(//button[@class='pull-right btn btn-success'])[position()='1']");
	public static final By TEXT =By.xpath("//div[@class='row pull-left show']/span/span[2]");
    public static final By MSGICON_VERIFICATION =By.xpath("(//span[text()='Mark as read'])[position()=1]");
	public static final By COMMENT_VERIFICATION =By.xpath("//span[@class='inner-text comment-description']");
	public static final By CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN=By.xpath("//button[contains(.,'OK')]");
	public static final By DEPTANDLOCATEXT =By.xpath("//label[@class='label contenteditable'])[position()='1']");
	public static final By COPYTOTEXT =By.xpath("//label[@class='label contenteditable'])[position()='2']");
	public static final By ASSIGNTOTEXT =By.xpath("//select[@role='button']");
	public static final By CONVERTTOTASK_ASSIGNEDTOBTN=By.xpath("(//section[@class='col col-4']/label/select)[position()='2']");
	// Constructor
	public WebAdminBoardsPage(WebDriver driver) {
		this.driver = driver;
	}
	// Method to click flag icon in popup
	public void clkFlaginPopup(WebDriver driver) {
		try {
			// waitForExpectedElement(driver, CALENDERFLAG);
			driver.findElement(CALENDERFLAG).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click unflag button
	public void clkUnflagBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UNFLAGICON);
			driver.findElement(UNFLAGICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click cancel button in edit
	public void clkCancelBtninEdit(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT__CANCELBTN);
			driver.findElement(EDIT__CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click save button in edit
	public void clkSaveBtnInEdit(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT__SAVEBTN);
			driver.findElement(EDIT__SAVEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click alex button
	public void clkAlexbtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, ALEXBTN);
			// Select select = new
			// Select(driver.findElement(By.xpath("//select[@role='button']")));
			// select.selectByVisibleText("Alex ");
			driver.findElement(ALEXBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Message icon
	public void clkMessageUnread(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_MESSAGEBTNUNREAD);
			driver.findElement(BOARDS_ALEX_MESSAGEBTNUNREAD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Message icon
	public void clkMsgread(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_MESSAGEBTNREAD);
			driver.findElement(BOARDS_ALEX_MESSAGEBTNREAD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Flag Button
	public void clkFlagicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_FLAGBTN);
			driver.findElement(BOARDS_ALEX_FLAGBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Comments Btn
	public void clkCommentsicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_COMMENTBTN);
			driver.findElement(BOARDS_ALEX_COMMENTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on edit icon
	public void clkEditicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, BOARDS_ALEX_EDITICON);
			driver.findElement(BOARDS_ALEX_EDITICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
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
	// method to click on cancel button in comment popup
	public void clkCancelBtninComment(WebDriver driver) {
		try {
			waitForExpectedElement(driver, COMMENTS_CANCELBTN);
			driver.findElement(COMMENTS_CANCELBTN).click();
		} catch (Exception e) {

			e.getMessage();
		}

	}
	// method to click on Comment button in comment popup
	public void clkCommentBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, COMMENTS_COMMENTBTN);
			driver.findElement(COMMENTS_COMMENTBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on tags icon in comment popup
	public void clktagsicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, COMMENTS_ADDTAGSICON);
			driver.findElement(COMMENTS_ADDTAGSICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on users icon in comment popup
	public void clkUsersicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, COMMENTS_ADDUSERSICON);
			driver.findElement(COMMENTS_ADDUSERSICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on close symbol in comment popup
	public void clkCloseSym(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FLAG_FLAGPOPUP_CLOSESYM);
			driver.findElement(FLAG_FLAGPOPUP_CLOSESYM).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click cancel button in flagpopup
	public void clkFlagCancel(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FLAG_FLAGPOPUP_CANCELBTN);
			driver.findElement(FLAG_FLAGPOPUP_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click save button in flagpopup
	public void clkFlagSave(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FLAG_FLAGPOPUP_SAVEBTN);
			driver.findElement(FLAG_FLAGPOPUP_SAVEBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click Flag Expiry field
	public void clkFlagExpiryFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FLAG_FLAGEXPIRYDATEFLD);
			driver.findElement(FLAG_FLAGEXPIRYDATEFLD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click next arrow in cancel popup
	public void clkNextArrowinFlag(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FLAG_FLAGEXPIRYDATEFLD_NEXTARROW);
			driver.findElement(FLAG_FLAGEXPIRYDATEFLD_NEXTARROW).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to select date
	public void selectDate(WebDriver driver) {
		try {
			waitForExpectedElement(driver, FLAG_FLAGEXPIRYDATEFLD_DATE);
			driver.findElement(FLAG_FLAGEXPIRYDATEFLD_DATE).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to get alert when flag is in unflag
	public void getAlertinUnflag(WebDriver driver) {
		try {
			waitForExpectedElement(driver, UNFLAG_ALERTTEXT);
			driver.findElement(UNFLAG_ALERTTEXT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click Assignto
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
	// method to clk duedate field
	public void clkDueDateFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_DUEDATEFLD);
			driver.findElement(EDIT_DUEDATEFLD).click();
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
	// method to click Calender OK
	public void clkCalenderOk(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN);
			driver.findElement(CONVERTTOTASK_DUEDATEFLD_CALENDER_OKBTN).click();
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	// method to clk nextArrow in Calender
	public void clkNextArrow(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_CALENDER_NEXTARROW);
			driver.findElement(EDIT_CALENDER_NEXTARROW).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to select date in calender
	public void clkCalenderDate(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_CALENDER_DATE);
			driver.findElement(EDIT_CALENDER_DATE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to clk cancel button in calender
	public void clkCancelBtnInCalender(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_CALENDER_CANCELBTN);
			driver.findElement(EDIT_CALENDER_CANCELBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click save btn in calender
	public void clkSaveBtnInCalender(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_CALENDER_SAVEBTN);
			driver.findElement(EDIT_CALENDER_SAVEBTN).click();
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
	// method to get alert message
	public void getAlertMsgInCalender(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EDIT_CALENDER_ALERTMSG);
			driver.findElement(EDIT_CALENDER_ALERTMSG).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click save btn in calender
	public void clkUnresolvedButton(WebDriver driver) {
		// boolean verify=false;
		try {
			waitForExpectedElement(driver, UNRESOLVEDBTN);
			driver.findElement(UNRESOLVEDBTN).click();
		} catch (Exception e) {
			e.getMessage();
		}
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
	// method to click on departments&locations
	public void clkDeptandLocationtags(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAG);
			driver.findElement(DEPARTMENTANDLOCATIONTAG).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Departments tab
	public void clkDepartmentsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENT_TAB);
			driver.findElement(DEPARTMENT_TAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Housekeeping in Departments
	public void clkHouseKeeping(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENT_HOUSEKEEPING);
			driver.findElement(DEPARTMENT_HOUSEKEEPING).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on bathcounter in housekeeping tab
	public void clkBathcounterChkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENT_HOUSEKEEPING_BATHCOUNTERCHKBOX);
			driver.findElement(DEPARTMENT_HOUSEKEEPING_BATHCOUNTERCHKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Locations Tab
	public void clkLocationsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Exterior Tab
	public void clkExteriorTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB_EXTERIOR);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB_EXTERIOR).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on driveaway check box
	public void clkDriveawayChkbox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHKBOX);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_LOCATIONTAB_EXTERIOR_DRIVEAWAYCHKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on First Group tab
	public void clkFirstGroupTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_FIRSTGROUP);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_FIRSTGROUP).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Equipments tab
	public void clkEquipmentsTab(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_EQUIPMENTTAB);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_EQUIPMENTTAB).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to Click on Equipments tab
	public void clkTest3ChkBox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_FIRSTGROUP_TEST3CHKBOX);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_EQUITMENT_FIRSTGROUP_TEST3CHKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on cancelbtn
	public void clkCancelBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, DEPARTMENTANDLOCATIONTAGSPOPUP_CANCELBUTTON);
			driver.findElement(DEPARTMENTANDLOCATIONTAGSPOPUP_CANCELBUTTON).click();
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
	// method to click assignto in convert to task
    public void clkAssignTo(WebDriver driver) {
        try {
            waitForExpectedElement(driver, CONVERTTOTASK_ASSIGNEDTOBTN);
            driver.findElement(CONVERTTOTASK_ASSIGNEDTOBTN).click();
            driver.findElement(CONVERTTOTASK_ASSIGNEDTOBTN).sendKeys(Keys.DOWN);
            driver.findElement(CONVERTTOTASK_ASSIGNEDTOBTN).sendKeys(Keys.DOWN);
            driver.findElement(CONVERTTOTASK_ASSIGNEDTOBTN).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.getMessage();
        }
    }
	// method to click on CopyTO
	public void clkCopyTo(WebDriver driver) {
		try {
			waitForExpectedElement(driver, COPYTO);
			driver.findElement(COPYTO).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on Bernand Bendict Checkbox
	public void clkChkBox(WebDriver driver) {
		try {
			waitForExpectedElement(driver, COPYTO_USERSPOPUP_CHECKBOX);
			driver.findElement(COPYTO_USERSPOPUP_CHECKBOX).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click convert to task
	public boolean clkConverttotaskicon(WebDriver driver) {
		boolean strverify = false;
		try {
			if (waitForExpectedElement(driver, CONVERTTOTASKICON).isDisplayed() == true) {
				driver.findElement(CONVERTTOTASKICON).click();
				strverify = true;
			} else {
				strverify = false;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// method to fill data in text feild
	public void fillSubjectFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, SUBJECTFLD);
			driver.findElement(SUBJECTFLD).sendKeys("Entering text in to subject field");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to fill data in text feild
	public void fillTextFld(WebDriver driver) {
		try {
			waitForExpectedElement(driver, TEXTAREAFLD);
			driver.findElement(TEXTAREAFLD).clear();
			driver.findElement(TEXTAREAFLD).sendKeys("Entering text in to text field");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click post a task
	public void clkPostaTask(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CONVERTTOTASK_POSTATASK);
			driver.findElement(CONVERTTOTASK_POSTATASK).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// method to click on resolved button
	public void clkResolvedBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, RESOLVEDBTN);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
					driver.findElement(RESOLVEDBTN));
			driver.findElement(RESOLVEDBTN).click();
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
	// method to verify assign to in boards
	public String verifications(WebDriver driver) {
		String strval = null;
		try {
			waitForExpectedElement(driver, EDIT_ASSIGNEDTOBTN);
			strval = "pass";
		} catch (Exception e) {
			e.getMessage();
			strval = "fail";
		}
		return strval;
	}
	// Method to verify Unresolved Functionality
	public boolean unresolvedVerification(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, TEXT);
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
}
