package pageclasses;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;
public class WebEmpNavigationsPage extends BaseClass {
	WebDriver driver;
	public static final By EMP_SIDEMENU_QADEPARTMENT =By.xpath("//span[contains(text(),'qa department1')]");
	public static final By EMP_SIDEMENU_FRONTDESK =By.xpath("(//a[@href ='/boards/departments/958'])[position()=1]");
	public static final By EMP_SIDEMENU_EMP =By.xpath("//i[@ class='fa fa-lg fa-fw fa fa-home']");
	public static final By EMP_SIDEMENU_RECOVERY =By.xpath("//span[contains(text(),'Service Recovery')]");
	public static final By CHECKLIST =By.xpath("//a[@href='/checklists']");
	public static final By CHECKLIST_PLUSICON =By.xpath("//a[@ href='/checklists/new']/i");
	public static final By CHECKLIST_PLUSICON_NAMETXT =By.xpath("//input[@placeholder ='Checklist name ...']");
	public static final By CHECKLIST_PLUSICON_DESCRIPTION =By.xpath("//label/textarea[@placeholder ='Description']");
	public static final By CHECKLIST_PLUSICON_SAVEBUTTON =By.xpath("//button[text() = 'Save']");
	public static final By CHECKLIST_EDITICON =By.xpath("//a[@class='fa fa-edit']");
	public static final By CHECKLIST_DELETEICON =By.xpath("(//span[@class ='fa fa-trash deleteConfirm'])[position()='1']");
	public static final By CHECKLIST_EDIT_DESCRIPTION =By.xpath("//label/textarea[@placeholder ='Description']");
	public static final By CHECKLIST_EDIT_ASSIGNEDTOBTN =By.xpath("(//label[@class='select'])[position()='1']");
	public static final By CHECKLIST_EDIT_DATESFORFIRSTCHKLIST_START =By.xpath("(//input[@class='react-date-field__input'])[position()='1']");
	public static final By CHECKLIST_EDIT_DATESFORFIRSTCHKLIST_DUE =By.xpath("(//input[@class='react-date-field__input'])[position()='2']");
	public static final By CHECKLIST_EDIT_REPEAT_REPEATFLD =By.xpath("(//label[@class='select'])[position()='2']");
	public static final By CHECKLIST_EDIT_NEVERRADIOBTN =By.xpath("//input[@value='never']");
	public static final By CHECKLIST_EDIT_ONRADIOBTN =By.xpath("//input[@value='on']");
	public static final By CHECKLIST_EDIT_REPEAT_FUTURETODO_CHKLST =By.xpath("//input[@type='checkbox']");
	public static final By DELETEPOPUP_YESBTN =By.xpath("//button[@class='btn btn-sm btn-primary']");
	public static final By DELETEPOPUP_NOBTN =By.xpath("//button[@class='btn btn-sm btn-default']");
	public static final By PREVENTIVEMAINTENANCE =By.xpath("//a[@href='/pm']");
	public static final By PREVENTIVEMAINTAINANCE_EDIT =By.xpath("//a[@ href='/pm/new']/i");
	public static final By PREVENTIVEMAINTAINANCE_EDIT_TEXTFEILD2 =By.xpath("//textarea[@placeholder='Description']");
	public static final By PREVENTIVEMAINTAINANCE_EDIT_DROPDOWN =By.xpath("//label[@class='select']");
	public static final By EMP_SIDEMENU_INSPECTIONS =By.xpath("//a[@href='/inspections']");
	public static final By EMP_SIDEMENU_INSPECTIONS_ICON =By.xpath("//a[@href='/inspections/new']/i");
	public static final By EMP_SIDEMENU_DASHBOARD =By.xpath("//a[@href='/dashboard']");
	public static final By EMP_SIDEMENU_REPORTS =By.xpath("//a[@href='/reports']");
	public static final By EMP_SIDEMENU_DOCUMENTS =By.xpath("//span[@class='docss']");
	public static final By EMP_SIDEMENU_CREATINGNOTESANDTASKS =By.xpath("//a[@href ='/help']");
	public static final By EMP_GETTINGTEXT =By.xpath("//div[@class='col-md-8 marbot10']");
	public static final By EMP_GETTINGTITLETEXT =By.xpath("//h1[@class='page-title txt-color-blueDark']");
	public WebEmpNavigationsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	// Method to click on Checklists in side menu
	public void clkQaDepartment(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_QADEPARTMENT);
			driver.findElement(EMP_SIDEMENU_QADEPARTMENT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Checklists in side menu
	public void clkFrontDesk(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_FRONTDESK);
			driver.findElement(EMP_SIDEMENU_FRONTDESK).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Checklists in side menu
	public void clkEmp(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_EMP);
			driver.findElement(EMP_SIDEMENU_EMP).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Checklists in side menu
	public void clkRecovery(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_RECOVERY);
			driver.findElement(EMP_SIDEMENU_RECOVERY).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on Checklists in side menu
	public void clkChecklists(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHECKLIST);
			driver.findElement(CHECKLIST).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click on plus icon
	public void clkPlusicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHECKLIST_PLUSICON);
			driver.findElement(CHECKLIST_PLUSICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Edit icon
	public void clkEditicon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHECKLIST_EDITICON);
			driver.findElement(CHECKLIST_EDITICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Delete icon
	public void clkDeleteicon(WebDriver driver) {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-250)", "");
			waitForExpectedElement(driver, CHECKLIST_DELETEICON);
			driver.findElement(CHECKLIST_DELETEICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click Save button
	public void clkSaveBtn(WebDriver driver) {
		try {
			waitForExpectedElement(driver, CHECKLIST_PLUSICON_SAVEBUTTON);
			driver.findElement(CHECKLIST_PLUSICON_SAVEBUTTON).click();
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
	// Method to click preventive maintainance tab
	public void clkPreventiveMaintenance(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PREVENTIVEMAINTENANCE);
			driver.findElement(PREVENTIVEMAINTENANCE).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method to click preventive maintainance plus icon
	public void clkPMPlusIcon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, PREVENTIVEMAINTAINANCE_EDIT);
			driver.findElement(PREVENTIVEMAINTAINANCE_EDIT).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method for click on Inspection
	public void clkInspection(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_INSPECTIONS);
			driver.findElement(EMP_SIDEMENU_INSPECTIONS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method for click on Inspectionpluicon
	public void clkInspectionPlusIcon(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_INSPECTIONS_ICON);
			driver.findElement(EMP_SIDEMENU_INSPECTIONS_ICON).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method for click on Dashboards
	public void clkDashboards(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_DASHBOARD);
			driver.findElement(EMP_SIDEMENU_DASHBOARD).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method for click on Inspection
	public void clkReports(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_REPORTS);
			driver.findElement(EMP_SIDEMENU_REPORTS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method for click on createNoteAndTasks
	public void createNoteAndTasks(WebDriver driver) {
		try {
			waitForExpectedElement(driver, EMP_SIDEMENU_CREATINGNOTESANDTASKS);
			driver.findElement(EMP_SIDEMENU_CREATINGNOTESANDTASKS).click();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	// Method for verify qadepartmnet
	public Boolean verifyQaDepartment(WebDriver driver) {
		boolean strverify = false;
		try {
			waitForExpectedElement(driver, EMP_GETTINGTEXT);
			String strtext = driver.findElement(EMP_GETTINGTEXT).getText();
			if (strtext.contains("qa department1")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify frontdesk
	public Boolean verifyFrontDesk(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(3000);
			waitForExpectedElement(driver, EMP_GETTINGTEXT);
			String strtext = driver.findElement(EMP_GETTINGTEXT).getText();
			if (strtext.contains("Front Desk")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify emp
	public Boolean verifyEmp(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTEXT);
			String strtext = driver.findElement(EMP_GETTINGTEXT).getText();
			if (strtext.contains("emp1")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify Recovery
	public Boolean verifyRecovery(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTITLETEXT);
			String strtext = driver.findElement(EMP_GETTINGTITLETEXT).getText();
			if (strtext.contains("emp1")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify Checklist
	public Boolean verifyCheckList(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTITLETEXT);
			String strtext = driver.findElement(EMP_GETTINGTITLETEXT).getText();
			if (strtext.contains("Checklists")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify Preventive Maintence
	public Boolean verifyPM(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTITLETEXT);
			String strtext = driver.findElement(EMP_GETTINGTITLETEXT).getText();
			if (strtext.contains("Preventive Maintenance")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify Inspection
	public Boolean verifyInspection(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTITLETEXT);
			String strtext = driver.findElement(EMP_GETTINGTITLETEXT).getText();
			if (strtext.contains("Inspections")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify dashboards
	public Boolean verifyDashBoards(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTITLETEXT);
			String strtext = driver.findElement(EMP_GETTINGTITLETEXT).getText();
			if (strtext.contains("Dashboard")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify Reports
	public Boolean verifyReports(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTITLETEXT);
			String strtext = driver.findElement(EMP_GETTINGTITLETEXT).getText();
			if (strtext.contains("Reports")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
	// Method for verify Reports
	public Boolean verifyCreateNoteAndTask(WebDriver driver) {
		boolean strverify = false;
		try {
			Thread.sleep(5000);
			waitForExpectedElement(driver, EMP_GETTINGTITLETEXT);
			String strtext = driver.findElement(EMP_GETTINGTITLETEXT).getText();
			if (strtext.contains("Creating Notes and Tasks")) {
				strverify = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return strverify;
	}
}
