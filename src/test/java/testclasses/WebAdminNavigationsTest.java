package testclasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageclasses.WebAdminLoginPage;
import pageclasses.WebAdminNavigationsPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;
import utilities.Retry;
import utilities.Singleton;
import utilities.Utilities;

public class WebAdminNavigationsTest extends BaseClass {
	// creating object logger logger class
	Logger logger = Logger.getLogger(WebAdminNavigationsTest.class);
	ConfigFileUtility configfile = new ConfigFileUtility();
	WebAdminNavigationsPage navigations = new WebAdminNavigationsPage(webDriver);
	WebAdminLoginPage adminlogin = new WebAdminLoginPage(webDriver);
	ExtentTest test;
	public String alertMessage = null;
	Utilities utilities = new Utilities();
	static Date dte = new Date();
	static String dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(dte);
	static final String Checklist_name = "Checklist " + dateFormat;
	static final String PreventiveMaintainance_name = "Preventive Maintainance " + dateFormat;
	static final String Inspections_name = "Inspection Name " + dateFormat;
	static final String Editchecklist_name = "Editchecklist " + dateFormat;
	static final String EditPM_name = "EditPM " + dateFormat;
	static final String EditInspections_name = "EditInspection_Name " + dateFormat;
	// constructor
	WebAdminNavigationsTest() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		configfile.loadPropertyFile();
	}
	@Parameters({ "browser" })
	@BeforeClass
	public void launchApplication(String browserName) throws Exception {
		if (browserName.equalsIgnoreCase("firefox")) {
			webDriver = Singleton.getInstanceFirefox(utilities.chromedriverpath + "Chromedriver");
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
		} else if (browserName.equalsIgnoreCase("chrome")) {
			webDriver = Singleton.getInstanceFirefox(utilities.chromedriverpath + "Chromedriver");
			logger.info("Browser started ");
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.get(configfile.getProperty("URL"));
			webDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		}
	}

	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void verifyChecklistFunctionality() {
		test = utilities.reportsFile("Admin_Verify Checklists Functionality");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		adminlogin.login(webDriver);
		navigations.clkAlex(webDriver);
		navigations.clkChecklists(webDriver);
		logger.info("Clicked on CheckLists Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on CheckLists Tab in left pane");
		navigations.clkPlusicon(webDriver);
		logger.info("Clicked on Plus Icon");
		test.log(LogStatus.INFO, "Clicked on Plus Icon");
		navigations.fillChecklistName(webDriver, Checklist_name);
		logger.info("Checklist Name is Filled");
		test.log(LogStatus.INFO, "Filled CheckList Name With : " + Checklist_name);
		navigations.fillChecklistDescription(webDriver);
		logger.info("Filled Checklist Description Field");
		test.log(LogStatus.INFO, "Filled Checklist Description Field");
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		String screenshot = utilities.captureScreenshot(webDriver, "New Checklist");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		navigations.clkAssignToBtn(webDriver);
		logger.info("Clicked on AssignTo Field");
		test.log(LogStatus.INFO, "Clicked on AssignTo Field");
		navigations.fillDataInEditTaskTextField(webDriver);
		logger.info("Add Task Field Is Filled With Task Name");
		test.log(LogStatus.INFO, "Add Task Field Is Filled With Task Name");
		navigations.clkStartDateFld(webDriver);
		logger.info("Selected Start Date Value");
		test.log(LogStatus.INFO, "Selected Start Date Value");
		navigations.clkCalenderOk(webDriver);
		logger.info("Clicked on 'Ok' Button");
		test.log(LogStatus.INFO, "Clicked on 'Ok' Button");
		navigations.clkDueDateFld(webDriver);
		logger.info("Selected Due Date Value");
		test.log(LogStatus.INFO, "Selected Due Date Value");
		navigations.clkCalenderOk(webDriver);
		logger.info("Clicked on 'Ok' Button");
		test.log(LogStatus.INFO, "Clicked on 'Ok' Button");
		navigations.clkRepeatFld(webDriver);
		logger.info("Clicked on Repeat Field dropdown");
		test.log(LogStatus.INFO, "Clicked on Repeat Field dropdown");
		navigations.clkNeverRadioBtn(webDriver);
		logger.info("Clicked on Never Radio Button");
		test.log(LogStatus.INFO, "Clicked on Never Radio Button");
		navigations.clkFutureTodoChklst(webDriver);
		logger.info(" Clicked on Future Todo Checklist");
		test.log(LogStatus.INFO, " Clicked on Future Todo Checklist");
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		navigations.clkChecklists(webDriver);
		logger.info("Clicked on CheckLists Tab");
		test.log(LogStatus.INFO, "Clicked on CheckLists Tab");
		boolean checklistcreated = navigations.checklistVerification(webDriver, Checklist_name);
		if (checklistcreated == true) {
			test.log(LogStatus.PASS, "Newly Created Checklist is Displayed");
			String checklist = utilities.captureScreenshot(webDriver, "checklist");
			test.log(LogStatus.INFO, "Screen Shot is taken " + checklist);
		} else {
			test.log(LogStatus.FAIL, "Newly Created Checklist is Not Displayed");
		}
		navigations.clkEditicon(webDriver, Checklist_name);
		logger.info(" Clicked on Edit icon ");
		test.log(LogStatus.INFO, "Clicked on Edit icon");
		navigations.editChecklistName(webDriver, Editchecklist_name);
		logger.info("Checklist Name Edited");
		test.log(LogStatus.INFO, "Checklist Name Edited With : " + Editchecklist_name);
		navigations.clkAssignToBtn(webDriver);
		logger.info("Clicked on AssignTo Field ");
		test.log(LogStatus.INFO, "Clicked on AssignTo Field ");
		navigations.clkStartDateFld(webDriver);
		logger.info("Selected Start Date Value");
		test.log(LogStatus.INFO, "Selected Start Date Value");
		navigations.clkCalenderOk(webDriver);
		logger.info("Clicked on 'Ok' Button");
		test.log(LogStatus.INFO, "Clicked on 'Ok' Button");
		navigations.clkDueDateFld(webDriver);
		logger.info("Selected Due Date Value");
		test.log(LogStatus.INFO, "Selected Due Date Value");
		navigations.clkCalenderOk(webDriver);
		logger.info("Clicked on 'Ok' Button");
		test.log(LogStatus.INFO, "Clicked on 'Ok' Button");
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		navigations.clkChecklists(webDriver);
		boolean editchecklist = navigations.editChecklistVerification(webDriver, Editchecklist_name);
		if (editchecklist == true) {
			test.log(LogStatus.PASS, "Newly Created Checklist Name Is Edited");
			String checklist = utilities.captureScreenshot(webDriver, "checklist");
			test.log(LogStatus.INFO, "Screen Shot is taken " + checklist);
		} else {
			test.log(LogStatus.FAIL, "Newly Created Checklist Name Is not Updated");
		}
		navigations.clkDeleteicon(webDriver, Editchecklist_name);
		logger.info("Clicked on Delete Icon");
		test.log(LogStatus.INFO, "Clicked on Delete Icon");
		navigations.fillDeleteField(webDriver);
		logger.info("Filled Delete Field with'DELETE' in Delete Popup");
		test.log(LogStatus.INFO, "Filled Delete Field with 'DELETE' in Delete Popup");
		navigations.clkYesBtn(webDriver);
		logger.info("Clicked on 'Yes'  Button");
		test.log(LogStatus.INFO, "Clicked on 'Yes'  Button");
		navigations.clkChecklists(webDriver);
		logger.info("Clicked on CheckLists Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on CheckLists Tab in left pane");
		boolean deletechecklist = navigations.deleteChecklistVerification(webDriver, Editchecklist_name);
		if (deletechecklist == true) {
			test.log(LogStatus.PASS, "Newly Created Checklist is Deleted");
			String deletedchecklist = utilities.captureScreenshot(webDriver, "checklist");
			test.log(LogStatus.INFO, "Screen Shot is taken " + deletedchecklist);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Newly Created Checklist is Not Deleted");
		}

		utilities.endReport();
	}

	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void preventivemaintainancefunctionality() {
		test = utilities.reportsFile("Admin_Verify Preventive maintainance functionality");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		navigations.clkPreventiveMaintainance(webDriver);
		logger.info("Clicked on Preventive Maintainance Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Preventive Maintainance Tab in left pane");
		String screenshot = utilities.captureScreenshot(webDriver, "homepage");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshot);
		navigations.clkPlusicon(webDriver);
		logger.info("Clicked on Plus Icon");
		test.log(LogStatus.INFO, "Clicked on Plus Icon");
		navigations.fillPmNameFld(webDriver, PreventiveMaintainance_name);
		logger.info("Pm Name Field is Filled");
		test.log(LogStatus.INFO, "Pm Name Field Filled with : " + PreventiveMaintainance_name);
		navigations.fillDescriptionFld(webDriver);
		logger.info("Description Field Is Filled");
		test.log(LogStatus.INFO, "Description Field Is Filled");
		navigations.clkDropdown(webDriver);
		logger.info("Clicked on Dropdown");
		test.log(LogStatus.INFO, "Clicked  On Dropdown");
		String screenshotpreventive = utilities.captureScreenshot(webDriver, "screenshotpreventive");
		test.log(LogStatus.INFO, "Screenshot Taken : " + screenshotpreventive);
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		navigations.clkAssignToBtn(webDriver);
		logger.info("Clicked on AssignTo Field ");
		test.log(LogStatus.INFO, "Clicked on AssignTo Field ");
		navigations.fillDataInEditTaskTextField(webDriver);
		logger.info("Text filled in Add task field");
		test.log(LogStatus.INFO, "Text filled in Add task field");
		utilities.scrollingToBottomofAPage(webDriver);
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		navigations.clkPreventiveMaintainance(webDriver);
		logger.info("Clicked on Preventive Maintainance Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Preventive Maintainance Tab in left pane");
		boolean PM_maintainance = navigations.pmListVerification(webDriver, PreventiveMaintainance_name);
		if (PM_maintainance == true) {
			test.log(LogStatus.PASS, "Newly Created Preventive Maintainance List is Displayed");
			String Pmlist = utilities.captureScreenshot(webDriver, "checklist");
			test.log(LogStatus.INFO, "Screen Shot is taken " + Pmlist);
		} else {
			test.log(LogStatus.FAIL, "Newly Created Preventive Maintainance List is Not Displayed");
		}
		navigations.clkPreventiveMaintainance(webDriver);
		navigations.clkEditicon(webDriver, PreventiveMaintainance_name);
		logger.info("Clicked on Edit Icon");
		test.log(LogStatus.INFO, "Clicked on Edit Icon");
		navigations.EditPmNameFld(webDriver, EditPM_name);
		logger.info("Pm Name is Edited");
		test.log(LogStatus.INFO, "Pm Name is Edited With : " + EditPM_name);
		navigations.clkAssignToBtn(webDriver);
		logger.info("Clicked on AssignTo Field");
		test.log(LogStatus.INFO, "Clicked on AssignTo Field");
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		utilities.scrolltoTopofpage(webDriver);
		navigations.clkPreventiveMaintainance(webDriver);
		boolean editpmname = navigations.editPMnameVerification(webDriver, EditPM_name);
		if (editpmname == true) {
			test.log(LogStatus.PASS, "Newly Created Preventive Maintaince Name is Edited");
			String PMname = utilities.captureScreenshot(webDriver, "PMname");
			test.log(LogStatus.INFO, "Screen Shot is taken " + PMname);
		} else {
			test.log(LogStatus.FAIL, "Newly Created Preventive Maintaince Name is not Edited ");
		}
		navigations.clkPreventiveMaintainance(webDriver);
		navigations.clkDeleteicon(webDriver, EditPM_name);
		logger.info("Clicked on Delete Icon");
		test.log(LogStatus.INFO, "Clicked on Delete Icon");
		navigations.fillDeleteField(webDriver);
		logger.info("Filled Delete Field with'DELETE' in Delete Popup");
		test.log(LogStatus.INFO, "Filled Delete Field with 'DELETE' in Delete Popup");
		navigations.clkYesBtn(webDriver);
		logger.info("Clicked on 'Yes'  Button");
		test.log(LogStatus.INFO, "Clicked on 'Yes'  Button");
		navigations.clkPreventiveMaintainance(webDriver);
		boolean deletechecklist = navigations.deletePMlistVerification(webDriver, EditPM_name);
		if (deletechecklist == true) {
			test.log(LogStatus.PASS, "Newly Created Preventive Maintaince list is Deleted");
			String deletedchecklist = utilities.captureScreenshot(webDriver, "checklist");
			test.log(LogStatus.INFO, "Screen Shot is taken " + deletedchecklist);
			test.log(LogStatus.PASS, "Testcase is Passed");

		} else {
			test.log(LogStatus.FAIL, "Newly Created Preventive Maintaince list is not Deleted");
		}

		utilities.endReport();
	}

	@Test(priority = 3, retryAnalyzer = Retry.class)
	public void verifyInspectionsFunctionality() {
		test = utilities.reportsFile("Admin_Verify Inspection Functionality");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		navigations.clkInspectionsTab(webDriver);
		logger.info("Clicked on Inspections Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Inspections Tab in left pane");
		navigations.clkPlusicon(webDriver);
		logger.info("Clicked on Plus Symbol");
		test.log(LogStatus.INFO, "Clicked on Plus Symbol");
		navigations.fillInspectionnameFld(webDriver, Inspections_name);
		logger.info("Filled Inspection Name  Field ");
		test.log(LogStatus.INFO, "Filled Inspection Name Field with : " + Inspections_name);
		navigations.fillInspectionDescFld(webDriver);
		logger.info("Description Field Filled");
		test.log(LogStatus.INFO, "Description Field Filled");
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		navigations.fillDataInEditTaskTextField(webDriver);
		logger.info("Text filled in Add task field");
		test.log(LogStatus.INFO, "Text filled in Add task field");
		navigations.clkInspectionsTab(webDriver);

		boolean inspections = navigations.inspectionListVerification(webDriver, Inspections_name);
		if (inspections == true) {
			test.log(LogStatus.PASS, "Newly Created Inspections List is Displayed");
			String screenshotinspections = utilities.captureScreenshot(webDriver, "inspections");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshotinspections);
		} else {
			test.log(LogStatus.FAIL, "Newly Created Inspections List is Displayed is Not Displayed");
		}
		navigations.clkEditicon(webDriver, Inspections_name);
		logger.info("Clicked on Edit Icon");
		test.log(LogStatus.INFO, "Clicked on Edit Icon");
		navigations.editInspectionnameFld(webDriver, EditInspections_name);
		logger.info("Inspection Name Edited");
		test.log(LogStatus.INFO, "Inspection Name Edited");
		navigations.clkSaveBtn(webDriver);
		logger.info("Clicked on 'Save' Button");
		test.log(LogStatus.INFO, "Clicked on 'Save' Button");
		navigations.clkInspectionsTab(webDriver);
		boolean edit = navigations.editInspectionVerification(webDriver, EditInspections_name);
		if (edit == true) {
			test.log(LogStatus.PASS, "Newly Created Inspection List Name is Edited");
			String screenshotinspections = utilities.captureScreenshot(webDriver, "inspections");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshotinspections);
		} else {
			test.log(LogStatus.FAIL, "Newly Created Inspection List Name is Not Edited");
		}
		navigations.clkDeleteicon(webDriver, EditInspections_name);
		logger.info("Clicked on Delete Icon");
		test.log(LogStatus.INFO, "Clicked on Delete Icon");
		navigations.fillDeleteField(webDriver);
		logger.info("Filled Delete Field with'DELETE' in Delete Popup");
		test.log(LogStatus.INFO, "Filled Delete Field with 'DELETE' in Delete Popup");
		navigations.clkYesBtn(webDriver);
		logger.info("Clicked on 'Yes'  Button");
		test.log(LogStatus.INFO, "Clicked on 'Yes'  Button");
		navigations.clkInspectionsTab(webDriver);
		boolean deletechecklist = navigations.deleteInspectionVerification(webDriver, EditInspections_name);
		if (deletechecklist == true) {
			test.log(LogStatus.PASS, "Newly Created Inspection List is Deleted");
			String deletedchecklist = utilities.captureScreenshot(webDriver, "checklist");
			test.log(LogStatus.INFO, "Screen Shot is taken " + deletedchecklist);
			test.log(LogStatus.PASS, "Testcase is Passed");
		} else {
			test.log(LogStatus.FAIL, "Newly Created Inspection List is not Deleted");
		}
		utilities.endReport();
	}

	@Test(priority = 4, retryAnalyzer = Retry.class)
	public void verifyMenuListsNavigations() {
		test = utilities.reportsFile("Admin_Verify Menu lists Navigations");
		// test.log(LogStatus.INFO, "Application Is Opened In Chrome Browser");
		test.log(LogStatus.INFO, "Application URL is : " + configfile.getProperty("URL"));
		navigations.clkFrontDesKTab(webDriver);
		logger.info(" Clicked on FrontDesk Tab in left pane");
		test.log(LogStatus.INFO, " Clicked on FrontDesk Tab in left pane");
		boolean frontdesk = navigations.verification(webDriver);
		if (frontdesk == true) {
			test.log(LogStatus.PASS, "Application is Navigated to  Frontdesk Page");
			String frontdeskPage = utilities.captureScreenshot(webDriver, "frontdeskPage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + frontdeskPage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated toFrontdesk Page");
		}
		navigations.clkHouseKeepingTab(webDriver);
		logger.info("Clicked on Housekeeping Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Housekeeping Tab in left pane");
		boolean housekeeping = navigations.verification(webDriver);
		if (housekeeping == true) {
			test.log(LogStatus.PASS, "Application is Navigated to  HouseKeeping Page");
			String HousekeepingPage = utilities.captureScreenshot(webDriver, "HousekeepingPage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + HousekeepingPage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to HouseKeeping Page");
		}
		navigations.clkMaintainanceTab(webDriver);
		logger.info("Clicked on Maintainance Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Maintainance Tab ");
		boolean maintainance = navigations.verification(webDriver);
		if (maintainance == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Maintainance Page in left pane");
			String MaintainancePage = utilities.captureScreenshot(webDriver, "Maintainance Page");
			test.log(LogStatus.INFO, "Screen Shot is taken " + MaintainancePage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to HouseKeeping Page");
		}
		navigations.clkLostandFoundTab(webDriver);
		logger.info(" Clicked on Lost&Found Tab in left pane");
		test.log(LogStatus.INFO, " Clicked on Lost&Found Tab in left pane");
		boolean lostandfound = navigations.verification(webDriver);
		if (lostandfound == true) {
			test.log(LogStatus.PASS, "Application is Navigated to lost&Found Page");
			String lostandfoundPage = utilities.captureScreenshot(webDriver, "lost&foundPage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + lostandfoundPage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to lost&Found Page");
		}
		navigations.clkHotelTab(webDriver);
		logger.info("Clicked on Hotel Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Hotel Tab in left pane");
		boolean hotel = navigations.verification(webDriver);
		if (hotel == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Hotel Page");
			String hotelpage = utilities.captureScreenshot(webDriver, "HotelPage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + hotelpage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Hotel Page");
		}
		navigations.clkSalesTab(webDriver);
		logger.info("Clicked on Sales Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Sales Tab in left pane");
		boolean sales = navigations.verification(webDriver);
		if (sales == true) {
			test.log(LogStatus.PASS, "Application is Navigated to sales Page");
			String salespage = utilities.captureScreenshot(webDriver, "salesPage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + salespage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to sales Page");
		}
		navigations.clkSecurityTab(webDriver);
		logger.info("Clicked on Security Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Security Tab in left pane");
		boolean security = navigations.verification(webDriver);
		if (security == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Security Page");
			String securitypage = utilities.captureScreenshot(webDriver, "securityPage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + securitypage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to security Page");
		}
		navigations.verify(webDriver);
		logger.info("Clicked on Service Recovery tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Service Recovery tab in left pane");
		boolean service = navigations.verify(webDriver);
		if (service == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Service Recovery Page");
			String servicepage = utilities.captureScreenshot(webDriver, "servicePage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + servicepage);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Service  Recovery Page");
		}

		navigations.clkDashBoardTab(webDriver);
		logger.info("Clicked on DashBoard Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on DashBoard Tab in left pane");
		navigations.clkTasks(webDriver);
		logger.info(" Clicked on Tasks menu in Dashboard Page ");
		test.log(LogStatus.INFO, "Clicked on Tasks menu in Dashboard Page ");
		boolean tasks = navigations.verify(webDriver);
		if (tasks == true) {
			test.log(LogStatus.PASS, "Application is Navigated to Task Page");
			String screenshottasks = utilities.captureScreenshot(webDriver, "dashboardtask");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshottasks);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Tasks Page");
		}
		navigations.clkMaintainance(webDriver);
		logger.info("Clicked on Maintainance menu in Dashboard Page ");
		test.log(LogStatus.INFO, "Clicked on Maintainance menu in Dashboard Page ");
		boolean maintainanceanalytics = navigations.verify(webDriver);
		if (maintainanceanalytics == true) {
			test.log(LogStatus.PASS, "Application is Navigated Maintainance Analytics Page");
			String screenshotanalytics = utilities.captureScreenshot(webDriver, "dashboardAnalytics");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshotanalytics);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Maintainance Analytics Page");
		}
		navigations.clkComplaints(webDriver);
		logger.info(" Clicked on Complaints menu in Dashboard Page ");
		test.log(LogStatus.INFO, "Clicked on Complaints menu in Dashboard Page ");
		boolean complaints = navigations.verify(webDriver);
		if (complaints == true) {
			test.log(LogStatus.PASS, "Application is Navigated Complaints Page");
			String screenshotcomplaints = utilities.captureScreenshot(webDriver, "dashboardcomplaints");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshotcomplaints);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to Complaints Page");
		}
		navigations.clkRoomlogs(webDriver);
		logger.info(" Clicked on PM-room Logs  menu in Dashboard Page");
		test.log(LogStatus.INFO, "Clicked on PM-room Logs  menu in Dashboard Page");
		boolean roomlogs = navigations.verify(webDriver);
		if (roomlogs == true) {
			test.log(LogStatus.PASS, "Application is Navigated PM-Room logs Page");
			String screenshotroomlogs = utilities.captureScreenshot(webDriver, "dashboardroomlogs");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshotroomlogs);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated to PM-Room logs Page");
		}
		navigations.clkReports(webDriver);
		logger.info("Clicked on Reports Tab in left pane");
		test.log(LogStatus.INFO, "Clicked on Reports Tab in left pane");
		boolean reports = navigations.verify(webDriver);
		if (reports == true) {
			test.log(LogStatus.PASS, "Application is Navigated Reports Page");
			String screenshotreports = utilities.captureScreenshot(webDriver, "reportspage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshotreports);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated Reports Page");
		}
		navigations.clkCreatingNoteandTask(webDriver);
		logger.info("Clicked on Creating Notes and tasks Tab Clicked in left pane");
		test.log(LogStatus.INFO, "Clicked on Creating Notes and tasks Tab Clicked in left pane");
		boolean notesandtasks = navigations.verify(webDriver);
		if (notesandtasks == true) {
			test.log(LogStatus.PASS, "Application is Navigated Creating Notes and Tasks Page");
			String screenshot = utilities.captureScreenshot(webDriver, "Notesandtaskspage");
			test.log(LogStatus.INFO, "Screen Shot is taken " + screenshot);
		} else {
			test.log(LogStatus.FAIL, "Application is not Navigated Creating Notes and Tasks Page");
		}
		test.log(LogStatus.PASS, "Testcase is Passed");
		utilities.endReport();

	}

	@AfterMethod
	public void result(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test failed");
		}
		utilities.endReport();
	}

	@AfterClass
	public void tearDown() {
		webDriver.quit();
		utilities.endReport();
	}
}
