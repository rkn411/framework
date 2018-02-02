package pageclasses;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import utilities.BaseClass;

public class IosEmpToDoPage extends BaseClass {
	AppiumDriver driver;
	public IOSElement element;
	Logger logger = Logger.getLogger(IosEmpToDoPage.class);
	public static final By ADDBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]");
	public static final By TODOBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
	public static final By EMPTODO_NEWTASK_CONVERTTASKBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]");
	public static final By EMPTODO_SAVEBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_NEWTASK_TASKFROM = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_NEWTASK_TASKFROM_DEPTS_QADEPTTOGGLESWTCH = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_DPTLCTNTAGSBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	public static final By EMPTODO_NEWTASK_TAGS_DEPTSTAB_FRONTDESKBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_NEWTASK_TAGS_DEPTSTAB_FRONTDESK_ADAROOMTOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_TAGS_DEPTSTAB_FRONTDESK_AGODATOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_TAGS_LCTNSTAB = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	public static final By EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOMSBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM2TOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM3TOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM4TOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_TAGS_EQPMNTSTAB = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]");
	public static final By EMPTODO_NEWTASK_TAGS_EQPMNTSTAB_GROUPEQPMNTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_NEWTASK_TAGS_EQPMNTSTAB_GROUPEQPMNT_EQ_TOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_COPYTOBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]");
	public static final String EMPTODO_NEWTASK_COPYTO_ASSIGNTO_DEPTSBTN = " Departments";
	public static final By EMPTODO_NEWTASK_ASSIGNTOBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]");
	public static final By EMPTODO_NEWTASK_COPYTO_ASSIGNTO_DEPTS_QADEPTTOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeSwitch[1]");
	public static final By EMPTODO_NEWTASK_SUBJECTFLD = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final String EMPTODO_NEWTASK_DUETXT = "Due";
	public static final By EMPTODO_NEWTASK_TASKDESCRIPTION = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_NETASK_POSTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
	public static final By EMPTODO_NEWTASK_ALERTMSG = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
	public static final By EMPTODO_NEWTASK_ALERTMSG_OKBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	public static final By EMPTODO_TODO_DEPTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_TODO_DEPT_OVERDUELISTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_TODO_DEPT_TODAYLISTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_TODO_DEPT_FUTURELISTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By EMPTODO_TODO_DEPT_CREATEDTASKSLIST = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");

	public IosEmpToDoPage(AppiumDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	// Click on Add Button
	public void clkAddBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADDBTN);
		driver.findElement(ADDBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on ToDo Button
	public void clkToDoBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, TODOBTN);
		driver.findElement(TODOBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Convert To Task Button
	public void clkConvertTask(AppiumDriver driver, String direction) throws Exception {
		do {
			try {
				driver.findElement(EMPTODO_NEWTASK_CONVERTTASKBTN).click();
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	}
// Click on Task From Button
	public void clkTaskFromBtn(AppiumDriver driver, String direction) throws Exception {
		do {
			try {
				driver.findElement(EMPTODO_NEWTASK_TASKFROM).click();
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	}
	// Click on Qa Dept Toggle
	public void clkTaskFrom_QADeptToggle(AppiumDriver driver, String direction) throws Exception {
		do {
			try {
				driver.findElement(EMPTODO_NEWTASK_TASKFROM_DEPTS_QADEPTTOGGLESWTCH).click();
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	}
	// Click on Dept&Loctns Button
	public void clkTask_DeptLctnsBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_DPTLCTNTAGSBTN);
		driver.findElement(EMPTODO_NEWTASK_DPTLCTNTAGSBTN).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	// Click on FrontDesk Button under Depts Tab
	public void clkTask_DeptLctns_FrontDeskBtn(AppiumDriver driver) throws Exception {
	   try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_DEPTSTAB_FRONTDESKBTN);
		driver.findElement(EMPTODO_NEWTASK_TAGS_DEPTSTAB_FRONTDESKBTN).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
}
	// Click on Adaroom Toggle Button under FrontDesk Tab
	public void clkTask_DeptLctns_FrontDesk_ADARoomToggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_DEPTSTAB_FRONTDESK_ADAROOMTOGGLE);
		driver.findElement(EMPTODO_NEWTASK_TAGS_DEPTSTAB_FRONTDESK_ADAROOMTOGGLE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Save Button
	public void clkSaveBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_SAVEBTN);
		driver.findElement(EMPTODO_SAVEBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on locations tab
	public void clkTask_LocationsTab(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_LCTNSTAB);
		driver.findElement(EMPTODO_NEWTASK_TAGS_LCTNSTAB).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on locations tab
	public void clkTask_LocationsTab_RoomsBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOMSBTN);
		driver.findElement(EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOMSBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on locations tab room2
	public void clkTask_LocationsTab_Room2Toggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM2TOGGLE);
		driver.findElement(EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM2TOGGLE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on locationstabroom3
	public void clkTask_Locationstab_Room3Toggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM3TOGGLE);
		driver.findElement(EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM3TOGGLE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on locationstabroom4
	public void clkTask_LocationsTab_Room4Toggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM4TOGGLE);
		driver.findElement(EMPTODO_NEWTASK_TAGS_LCTNSTAB_ROOM4TOGGLE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	} 
	// Click on eqpmtstab
	public void clkTask_Eqpmntstab(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_EQPMNTSTAB);
		driver.findElement(EMPTODO_NEWTASK_TAGS_EQPMNTSTAB).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on groupequipment
	public void clkTask_Eqpmtstab_GroupeqpmntToggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_EQPMNTSTAB_GROUPEQPMNTBTN);
		driver.findElement(EMPTODO_NEWTASK_TAGS_EQPMNTSTAB_GROUPEQPMNTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
   //Click on EQ Toggle
	public void clkTask_Eqpmtstab_Groupeqpmnt_EQtoggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TAGS_EQPMNTSTAB_GROUPEQPMNT_EQ_TOGGLE);
		driver.findElement(EMPTODO_NEWTASK_TAGS_EQPMNTSTAB_GROUPEQPMNT_EQ_TOGGLE).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	// Click on copytobutton
	public void clkTask_CopyToBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_COPYTOBTN);
		driver.findElement(EMPTODO_NEWTASK_COPYTOBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// Click on Assign to button
	public void clkTask_AssignToBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_ASSIGNTOBTN);
		driver.findElement(EMPTODO_NEWTASK_ASSIGNTOBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Scroll to Depertments
	public void scrollTask_DownToDeaprtments(AppiumDriver driver, String direction) throws Exception {

		do {
			try {
				driver.findElement(EMPTODO_NEWTASK_COPYTO_ASSIGNTO_DEPTS_QADEPTTOGGLE).click();
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	}
	// Click on department toggle
	public void clkTask_Depttoggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_COPYTO_ASSIGNTO_DEPTS_QADEPTTOGGLE);
		driver.findElement(EMPTODO_NEWTASK_COPYTO_ASSIGNTO_DEPTS_QADEPTTOGGLE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// enter the text in to subject field
	public void fillTask_SubjectFld(AppiumDriver driver, String subjectFldValue) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_SUBJECTFLD);
		driver.findElement(EMPTODO_NEWTASK_SUBJECTFLD).click();
		((IOSDriver) driver).getKeyboard().pressKey(subjectFldValue);
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
		}
	// Click on due text
	public void datepicker(AppiumDriver driver, String direction) throws Exception {
		do {
			try {
				Point p1 = driver
						.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAPicker[1]"))
						.getLocation();
				Dimension d1 = driver
						.findElement(By
								.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAPicker[1]/UIAPickerWheel[2]"))
						.getSize();
				driver.tap(1, p1.getX() + d1.getWidth(), p1.getY() + d1.getHeight() - 100, 500);
				break;
			} catch (Exception e) {
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			}
		} while (true);
	
	}
// Fill the task description field
	public void fillTask_TaskDecriptionFld(AppiumDriver driver, String taskDescription) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NEWTASK_TASKDESCRIPTION);
		driver.findElement(EMPTODO_NEWTASK_TASKDESCRIPTION).click();
		((IOSDriver) driver).getKeyboard().pressKey(taskDescription);
		driver.hideKeyboard();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	// Click on post button
	public void clkTask_PostBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_NETASK_POSTBTN);
		driver.findElement(EMPTODO_NETASK_POSTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Todo button
	public void clkTodoBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, TODOBTN);
		driver.findElement(TODOBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Dept button
	public void clkDeptBtn(AppiumDriver driver) throws Exception {
		try{
			waitForExpectedElement(driver, EMPTODO_TODO_DEPTBTN);
			driver.findElement(EMPTODO_TODO_DEPTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on OverDue button
	public void clkOverDueBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_TODO_DEPT_OVERDUELISTBTN);
		driver.findElement(EMPTODO_TODO_DEPT_OVERDUELISTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Today button
	public void clkTodayBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_TODO_DEPT_TODAYLISTBTN);
		driver.findElement(EMPTODO_TODO_DEPT_TODAYLISTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Future button
	public void clkFutureBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EMPTODO_TODO_DEPT_FUTURELISTBTN);
		driver.findElement(EMPTODO_TODO_DEPT_FUTURELISTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
   // Getting the text from alert pop up
	public String gettingSuccessMsgText(AppiumDriver driver) throws Exception {
		waitForExpectedElement(driver, EMPTODO_NEWTASK_ALERTMSG);
		return driver.findElement(EMPTODO_NEWTASK_ALERTMSG).getText();

	}
   // Click on ok button in alert pop up
	public void clkAlertOkBtn(AppiumDriver driver) throws Exception {
		try{
			waitForExpectedElement(driver, EMPTODO_NEWTASK_ALERTMSG_OKBTN);
			driver.findElement(EMPTODO_NEWTASK_ALERTMSG_OKBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
// getting the text from overdue in to do page
	public String gettingTextFromOverDueToDo(AppiumDriver driver) throws Exception {
		waitForExpectedElement(driver, EMPTODO_TODO_DEPT_OVERDUELISTBTN);
		return driver.findElement(EMPTODO_TODO_DEPT_OVERDUELISTBTN).getText();
	}
  // Getting the text from Today in to do page 
	public String gettingTextFromTodayToDo(AppiumDriver driver) throws Exception {
		waitForExpectedElement(driver, EMPTODO_TODO_DEPT_TODAYLISTBTN);
		return driver.findElement(EMPTODO_TODO_DEPT_TODAYLISTBTN).getText();
	}
  // Getting the text from future to do page 
	public String gettingTextFromFutureToDo(AppiumDriver driver) throws Exception {
		waitForExpectedElement(driver, EMPTODO_TODO_DEPT_FUTURELISTBTN);
		return driver.findElement(EMPTODO_TODO_DEPT_FUTURELISTBTN).getText();
	}
  // method to verify the created tasks
	public void verifyCreatedTasks(AppiumDriver driver, String taskSubject, String taskProgressMessage) throws Exception { 
	  try{
        waitForExpectedElement(driver, EMPTODO_TODO_DEPT_CREATEDTASKSLIST);
		List<IOSElement> elements = driver.findElements(EMPTODO_TODO_DEPT_CREATEDTASKSLIST);
		for (IOSElement element : elements) {
			if (element.getText().toString().contains(taskSubject)) {
				System.out.println(taskProgressMessage);
				continue;
			}
		}		
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
}
