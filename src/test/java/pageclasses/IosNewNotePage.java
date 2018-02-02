package pageclasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import utilities.BaseClass;

public class IosNewNotePage extends BaseClass {
	AppiumDriver driver;
	Logger logger = Logger.getLogger(IosNewNotePage.class);
	public static final By NEWNOTE_ADDBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]");
	public static final By NEWNOTE_CANCELBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By NEWNOTE_POSTBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By NEWNOTE_NOTEFROM = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By NEWNOTE_ALEXEMP = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By NEWNOTE_DPTFRONTDESK = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By BTN_SAVE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By NEWNOTE_PRIVATE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By NEWNOTE_PRIVATESWITCH = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeSwitch[1]");
	public static final By NEWNOTE_DPTLCTNTAGS = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	public static final By NEWNOTE_COPYTO = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]");
	public static final By NEWNOTE_COPYTOVALUE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By NEWNOTE_GUESTCOMPLAINT = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By NEWNOTE_GUESTCOMPLAINTSWITCH = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch[1]");
	public static final By NEWNOTE_ENTERNOTE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther[1]");
	public static final By NEWNOTE_NOTE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	public static final By NEWNOTE_CONVERTTOTASK = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]");
	public static final By DPTSTAB = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By FRONTENDDESK = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By VALUETOGGLE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By ADDAROOM = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
	public static final By LOCATIONTAB = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	public static final By LOCATION_VALUE = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By LOCATION_VALUE2 = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By LOCATION_VALUE3 = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
	public static final By LOCATION_VALUE4 = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSwitch[1]");
	public static final By EQUIPMENTTAB = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]");
	public static final By NEWNOTE_FIRSTGROUP = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By DONEBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
	public static final By ALERTOKBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	public static final By MESSAGE_ALERT = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");

	public IosNewNotePage(AppiumDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	// Click on the ADD Button to navigate New Note Screen
	public void clkADDSymbol(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_ADDBTN);
		driver.findElement(NEWNOTE_ADDBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
  // getting message from alert pop up
	public String alertMessage(AppiumDriver driver) {
		waitForExpectedElement(driver, MESSAGE_ALERT);
		return driver.findElement(MESSAGE_ALERT).getText();
	}
// click on ok button in alert pop up
	public void alertOkBtn(AppiumDriver driver) {
		try{
		waitForExpectedElement(driver, ALERTOKBTN);
		driver.findElement(ALERTOKBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
  //click on cancel button
	public void clkCancelBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_CANCELBTN);
		driver.findElement(NEWNOTE_CANCELBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Note From.
	public void clkNoteFromBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_NOTEFROM);
		driver.findElement(NEWNOTE_NOTEFROM).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Select the Value
	public void clkDptEmpValueToggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_ALEXEMP);
		driver.findElement(NEWNOTE_ALEXEMP).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Select the Value
	public void clkDptDptValueToggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_DPTFRONTDESK);
		driver.findElement(NEWNOTE_DPTFRONTDESK).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
 //Click on save button
	public void clkSaveBtn(AppiumDriver driver) throws Exception {
	   try{
		waitForExpectedElement(driver, BTN_SAVE);
		driver.findElement(BTN_SAVE).click();
	   }catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	//Need to change the method (locaotr value)
	// Select the Value
	public void clkDptValueToggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_DPTLCTNTAGS);
		driver.findElement(NEWNOTE_DPTLCTNTAGS).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Private Toggle.
	public void enablePrivateToggle(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_PRIVATESWITCH);
		driver.findElement(NEWNOTE_PRIVATESWITCH).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Department and Location Tags.
	public void clkDptLctnBTN(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, DPTSTAB);
		driver.findElement(DPTSTAB).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// click on departments tab
	public void clkDptTab(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, FRONTENDDESK);
		driver.findElement(FRONTENDDESK).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// click on front desk 
	public void clkFrontEndDesk(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, VALUETOGGLE);
		driver.findElement(VALUETOGGLE).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
// Click on adda toggle
	public void clkADDATOGGLE(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, ADDAROOM);
		driver.findElement(ADDAROOM).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
  //Click on locations tab
	public void locationTab(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, LOCATIONTAB);
		driver.findElement(LOCATIONTAB).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
 	public void clkLocation(AppiumDriver driver) throws Exception {
		try{
 		waitForExpectedElement(driver, LOCATION_VALUE);
		driver.findElement(LOCATION_VALUE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkLocation_Und(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, LOCATION_VALUE2);
		driver.findElement(LOCATION_VALUE2).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkLocation_under(AppiumDriver driver) throws Exception {
		try{
			waitForExpectedElement(driver, LOCATION_VALUE3);
			driver.findElement(LOCATION_VALUE3).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkEquipmnetTab(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EQUIPMENTTAB);
		driver.findElement(EQUIPMENTTAB).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkEquipmnetTabFirstGrp(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_FIRSTGROUP);
		driver.findElement(NEWNOTE_FIRSTGROUP).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkEquipmnetTabFirstGrpVal(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, EQUIPMENTTAB);
		driver.findElement(EQUIPMENTTAB).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkDoneBtn(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, DONEBTN);
		driver.findElement(DONEBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Copy To.
	public void clkCopyTo(AppiumDriver driver) throws Exception {
		try{
			waitForExpectedElement(driver, NEWNOTE_COPYTO);
			driver.findElement(NEWNOTE_COPYTO).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Guest Complaint.
	public void clkGuestComplaint(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_GUESTCOMPLAINTSWITCH);
		driver.findElement(NEWNOTE_GUESTCOMPLAINTSWITCH).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	// Enter the value to Note.
	public void fillEnterNoteFld(String enterNoteValue, AppiumDriver driver) throws Exception {
		try{
		if (enterNoteValue != null) {
			waitForExpectedElement(driver, NEWNOTE_ENTERNOTE);
			driver.findElement(NEWNOTE_ENTERNOTE).click();
			((IOSDriver) driver).getKeyboard().pressKey(enterNoteValue);

		} else {
			waitForExpectedElement(driver, NEWNOTE_ENTERNOTE);
			driver.findElement(NEWNOTE_ENTERNOTE).click();
			((IOSDriver) driver).getKeyboard().pressKey(enterNoteValue);
		}
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkNote(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_NOTE);
		driver.findElement(NEWNOTE_NOTE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Click on Post.
	public void clkPost(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_POSTBTN);
		driver.findElement(NEWNOTE_POSTBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	public void clkCpoyToValue(AppiumDriver driver) throws Exception {
		try{
		waitForExpectedElement(driver, NEWNOTE_COPYTOVALUE);
		driver.findElement(NEWNOTE_COPYTOVALUE).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
}
