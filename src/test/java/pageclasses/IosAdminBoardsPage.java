package pageclasses;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import utilities.BaseClass;

public class IosAdminBoardsPage extends BaseClass{
	AppiumDriver driver;
	public String alertMessageText;
	Logger logger = Logger.getLogger(IosAdminBoardsPage.class);
	public static final By ADMIN_BOARDSBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By ADMIN_BOARDS_ALEXBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_NOTE_COMMENTSTXTMSGBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_COMMENTSTXTMSG_MESSAGEBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_COMMENTSTXTMSG_COMMENTBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_NOTE_COMMENTSTXTMSG_FLAGBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_NOTE_COMMENTSTXTMSG_CONVERTTASKBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_MESSAGEBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_COMMENTSBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_NOTEFLAGBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_CONVERTTASKBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_TASKFLAGBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_TASKEDITGBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_BOARDTXTFLD=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGSBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESKBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESK_AMSHIFTTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESK_BOOKINGTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeSwitch[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LOCATIONSTAB=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BARTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BOARDTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BEDROOMTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSwitch[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB_FRSTGRPBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB_FRSTGRP_TESTBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
    public static final By ADMIN_SAVEBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
    public static final By ADMIN_CANCELBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_POSTBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COPYTOBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
	public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COPYTO_ADMINTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/");
	public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COPYTO_MANAGERTOGGLE=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
    public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_ENTERNOTETXTBOX=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]");
    public static final By ADMIN_VERIFY=By.id("");
  	public static final By ALERTOKBTN = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
  	public static final By MESSAGE_ALERT = By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]");
  	public static final By ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COVERTTASK_ASSIGNTOBTN=By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
  	public String elementText;
    
    // Constructor
	public IosAdminBoardsPage(AppiumDriver driver){
		this.driver=driver;
		PropertyConfigurator.configure("log4j.properties");
	}
	//Click on Boards Button
	public void clkAdmin_BoardsBtn(AppiumDriver driver)throws Exception {
		try{
			waitForExpectedElement(driver,ADMIN_BOARDSBTN);
		     driver.findElement(ADMIN_BOARDSBTN).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Method to click on convert task button in boards page 
	public void clkAdmin_ConvertTask(AppiumDriver driver)throws Exception {
		try{
			waitForExpectedElement(driver,ADMIN_VERIFY);
	     driver.findElement(ADMIN_VERIFY).click();
		}catch(Exception e){
			logger.info("unable to locate the elemnet");
		}
	}
	// Method to Click on Alex Hotel Button
	public void clkAdmin_Boards_AlexHotelBtn(AppiumDriver driver)throws Exception {
	try{
		waitForExpectedElement(driver,ADMIN_BOARDS_ALEXBTN);
	    driver.findElement(ADMIN_BOARDS_ALEXBTN).click();
	}catch(Exception e){
		logger.info("unable to locate the elemnet");
	}
	}
	//Method to Click on Message button in boards page
	public void clkAdmin_ALexHotel_MessageBtn(AppiumDriver driver, String direction)throws Exception {
	try{
			waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_MESSAGEBTN);
			driver.findElement(ADMIN_BOARDS_ALEXHOTEL_MESSAGEBTN).click();
			logger.info("Okay");
		}catch(Exception e){
		waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_MESSAGEBTN);
		driver.findElement(ADMIN_BOARDS_ALEXHOTEL_MESSAGEBTN).click();
		logger.info("Okay");
	}
	}
	// Method to Getting the text from alert popup
	public String alertMessage(AppiumDriver driver) {
		   try{
		   waitForExpectedElement(driver,MESSAGE_ALERT);
		    alertMessageText=driver.findElement(MESSAGE_ALERT).getText();
		   }catch(Exception e){
			   waitForExpectedElement(driver,MESSAGE_ALERT);
			   alertMessageText=driver.findElement(MESSAGE_ALERT).getText(); 
			   }
		   return alertMessageText;
	}
	// Method to click on ok button in alert
	public void alertOkBtn(AppiumDriver driver) {
		waitForExpectedElement(driver,ALERTOKBTN);
		driver.findElement(ALERTOKBTN).click();
	}
	// Method to Click on write comment button
	// Need to change the method 
		public void clkAdmin_ALexHotel_WriteCommentBtn(AppiumDriver driver)throws Exception {
			try{
			waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_COMMENTSBTN);
			driver.findElement(ADMIN_BOARDS_ALEXHOTEL_COMMENTSBTN).click();
			logger.info("Okay");
			waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_COMMENTSBTN);
			driver.findElement(ADMIN_BOARDS_ALEXHOTEL_COMMENTSBTN).click();
			logger.info("Okay");
		}catch(Exception e){
			logger.info("Unable to locate the elemnt");
			
		}
	}
		//Method to Click on Department Location TagsButton
        public void clkAdmin_DeptLctnTagsBtn(AppiumDriver driver)throws Exception {
            try{
            	waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGSBTN);
                driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGSBTN).click(); 
            }catch(Exception e){
    			logger.info("unable to locate the elemnet");
    		}
        } 
      //Method to Click on Front Desk Button
        public void clkAdmin_DeptLctnTagsFrntDeskBtn(AppiumDriver driver)throws Exception {
            try{
            	waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESKBTN);
                driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESKBTN).click(); 
            }catch(Exception e){
    			logger.info("unable to locate the elemnet");
    		}
        } 
      //Method to Click on Am Shift Button
        public void clkAdmin_AmShiftToggle(AppiumDriver driver)throws Exception {
             try{
        	 waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESK_AMSHIFTTOGGLE);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESK_AMSHIFTTOGGLE).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        }  
        //Method to Click on Booking Toggle
        public void clkAdmin_BookingToggle(AppiumDriver driver)throws Exception {
            try{ 
        	waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESK_BOOKINGTOGGLE);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_DEPTLCTNTAGS_FRONTDESK_BOOKINGTOGGLE).click(); 
            }catch(Exception e){
    			logger.info("unable to locate the elemnet");
    		}
        } 
        //Method to Click on Locations tab
        public void clkAdmin_LocationsTab(AppiumDriver driver)throws Exception {
             try {
             waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LOCATIONSTAB);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LOCATIONSTAB).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        } 
        //Method to Click on Locations tab Guest Area
        public void clkAdmin_LocationsTabGuestArea(AppiumDriver driver)throws Exception {
            try{
        	waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        }
        //Method to Click on BoardTextField
        public void clkAdmin_LocationsTabGuestAreasBarToggle(AppiumDriver driver)throws Exception {
            try{ 
        	 waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BARTOGGLE);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BARTOGGLE).click(); 
            }catch(Exception e){
    			logger.info("unable to locate the elemnet");
    		}
        }
        //Method to  Click on Locations tab Guest Area Board Toggle
        public void clkAdmin_LocationsTabGuestAreasBoardToggle(AppiumDriver driver)throws Exception {
             try{
             waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BOARDTOGGLE);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BOARDTOGGLE).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        }
        //Method to Click on Locations tab Guest Area BedRoomToggle
        public void clkAdmin_LocationsTabGuestAreasBedRoomToggle(AppiumDriver driver)throws Exception {
            waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BEDROOMTOGGLE);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_LCTNSTAB_GUESTAREAS_BEDROOMTOGGLE).click(); 
        }
        //Method to Click on Equipment tab
        public void clkAdmin_EquipmentTab(AppiumDriver driver)throws Exception {
             try{
             waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        }
        //Method to Click on Equipment tab First Group Button
        public void clkAdmin_EquipmentTabFrstGrpBtn(AppiumDriver driver)throws Exception {
            try{
        	 waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB_FRSTGRPBTN);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB_FRSTGRPBTN).click(); 
            }catch(Exception e){
    			logger.info("unable to locate the elemnet");
    		}
        }
        //Method to Click on Equipment tab First Group TestButton
        public void clkAdmin_EquipmentTabFrstGrpTestBtn(AppiumDriver driver)throws Exception {
             try{
        	 waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB_FRSTGRP_TESTBTN);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_EQUIPMENTTAB_FRSTGRP_TESTBTN).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        }
        //Method to Click on Save Button
        public void clkAdmin_SaveBtn(AppiumDriver driver)throws Exception {
             try{
             waitForExpectedElement(driver,ADMIN_SAVEBTN);
             driver.findElement(ADMIN_SAVEBTN).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        }
        //Method to Click on Cancel Button
        public void clkAdmin_CancelBtn(AppiumDriver driver)throws Exception {
            try{
            	waitForExpectedElement(driver,ADMIN_CANCELBTN);
                driver.findElement(ADMIN_CANCELBTN).click();
            }catch(Exception e){
    			logger.info("unable to locate the elemnet");
    		}
        }
        //Method to Click on Post Button
        public void clkAdmin_PostBtn(AppiumDriver driver)throws Exception {
            try{
        	waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_POSTBTN);
            driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_POSTBTN).click(); 
            }catch(Exception e){
    			logger.info("unable to locate the elemnet");
    		}
        } 
        //Method to Click on  Copy Button
        public void clkAdmin_CopyBtn(AppiumDriver driver)throws Exception {
             try{
        	 waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COPYTOBTN);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COPYTOBTN).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        } 
      //Method to Click on CopyToAdminToggle
        public void clkAdmin_CopyToAdminToggle(AppiumDriver driver)throws Exception {
             try{
             waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COPYTO_ADMINTOGGLE);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COPYTO_ADMINTOGGLE).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        } 
      //Method to Click on CopyToManagerToggle
        public void clkAdmin_CopyToManagerToggle(AppiumDriver driver)throws Exception {
             try{
             waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COPYTO_MANAGERTOGGLE);
             driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COPYTO_MANAGERTOGGLE).click(); 
             }catch(Exception e){
     			logger.info("unable to locate the elemnet");
     		}
        } 
        //Need to change the method
      //Method to fill the comment text box
        public void fillFldEnterCommentTxtBox(AppiumDriver driver, String enterComment)throws Exception {
          try{
        	  if (enterComment != null) {
         			waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_ENTERNOTETXTBOX);
					driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_ENTERNOTETXTBOX).click();
					((IOSDriver)driver).getKeyboard().pressKey(enterComment);

				} else {
					waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_ENTERNOTETXTBOX);
					driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_ENTERNOTETXTBOX).click();
					((IOSDriver)driver).getKeyboard().pressKey(enterComment);
				}
        	  }
          catch(Exception e){
        	  logger.info("unable to locate the elemnet");
				}
				}
           //Method to fill the subject text box
            /* public void fillFldEnterSubjectTxtBox(AppiumDriver driver, String enterSubject)throws Exception {
                try {
                 if (enterSubject != null) {
     					waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_SUBJECTTXTBOX);
     					driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_SUBJECTTXTBOX).click();
     					((IOSDriver)driver).getKeyboard().pressKey(enterSubject);

     				} else {
     					waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_SUBJECTTXTBOX);
     					driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_SUBJECTTXTBOX).click();
     					((IOSDriver)driver).getKeyboard().pressKey(enterSubject);
     				}
                }catch(Exception e){
        			logger.info("unable to locate the elemnet");
        		}
        } */
           //Method to Click on Assign to button
             public void clkAdmin_AssignToBtn(AppiumDriver driver)throws Exception {
                 try {
            	  waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COVERTTASK_ASSIGNTOBTN);
                  driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COVERTTASK_ASSIGNTOBTN).click();
                 }catch(Exception e){
         			logger.info("unable to locate the elemnet");
         		}
             }
           //Method to Click on Assign to_Emp Admin toggle
            /* public void clkAdmin_AssignTo_EmpAdminToggle(AppiumDriver driver)throws Exception {
                  try{
                  waitForExpectedElement(driver,ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COVERTTASK_ASSIGNTO_EMPADMINHOTELTOGGLE);
                  driver.findElement(ADMIN_BOARDS_ALEXHOTEL_WRITECOMMENT_COMMENT_COVERTTASK_ASSIGNTO_EMPADMINHOTELTOGGLE).click(); 
                  }catch(Exception e){
          			logger.info("unable to locate the elemnet");
          		}
             }*/
}
