package tekion;

import java.util.HashMap;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class Tekionmethods extends TekionLogin{
	public static final By STARTEDBTN=By.name("STARTED");
	public static final By OVERVIEWCHECKIN=By.xpath("//XCUIElementTypeOther[@name='CHECK-IN'][2]");
	public static final By VINMILEAGE = By.xpath("//XCUIElementTypeOther[@name='VIN & Mileage'][1]");
	public static final By CONTINUE =By.name("Continue");
	
	public static final By WHEELSTIRESBTN =By.xpath("//XCUIElementTypeOther[@name='Wheels & Tires'][1]");
	public static final By SKIP =By.name("Skip");
	public static final By WIPERSRECALLSBTN =By.name("Recalls");
	public static final By RECALLSSERVICEHISTORYBTN =By.name("Service History");
	public static final By YESDEFERRECALL =By.name("Yes");
	public static final By WARRANTIESBTN =By.name("Warranties");
	public static final By ADDBTN =By.xpath("//XCUIElementTypeOther[@name='+ Add'][1]");
	//addwarannty
	public static final By WARRANTYNAME= By.xpath("//XCUIElementTypeOther[@name=‘Warranty Name *’][3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");
	public static final By WARRANTYPROVIDER =By.xpath("");
	public static final By POLICYNUMBER=By.xpath("");
	//done
	public static final By DONEBTN=By.name("Done");
	//next button
	public static final By NEXTBTN=By.name("Next");
	//carty button in warranties
	public static final By CARTBTN=By.name("Cart");
	//DELIVERYBUTTON
	public static final By DELIVERYBTN =By.name("Delivery");
	//tap on confirm estimate in delivery screen
	public static final By CONFIRMESTIMATEBTN=By.name("Confirm Estimate");
	//tap on confirmation in confirmestimate screen
	public static final By CONFIRMATIONBTN=By.name("Confirmation");
	//taon continue button billing info screen
	public static final By CONTINUEBTNBILLINGINFO=By.xpath("//XCUIElementTypeOther[@name='Continue'][7]");
	public static final By PERSONALBTN=By.name("Personal");
	//checkbox in estimate screen
	public static final By CHECKBOXESTIMATE=By.xpath("//XCUIElementTypeOther[@name='I agree to']");
	//APPROve button
	public static final By APPROVEBUTTON =By.name("Approve");
	//right menu for save cancel 
	
	
	public  void selectcheckin(AppiumDriver driver) throws InterruptedException
	{
		try{
		//click on first checkin to start in appointments screen
		TouchAction a1 = new TouchAction(driver);
		a1.tap (308, 171).perform();
		}catch(Exception e){
			System.out.println("unable to click cordinates changed in appoinetments");
		}
		Thread.sleep(7500);
		//OVERVIEWCHECKINBUTTON(driver);
		try{
		//click on started in overview screen.
		TouchAction a2 = new TouchAction(driver);
		a2.tap (315, 425).perform();
		}catch(Exception e){
			OVERVIEWCHECKINBUTTON(driver);
			System.out.println("unable to click sated cordinates changed in overview");
		}
		// Click on the Admin Button
	}
	//overview checkin button
	public void OVERVIEWCHECKINBUTTON(AppiumDriver driver) {
		try{
			waitForExpectedElement(driver, OVERVIEWCHECKIN);
			driver.findElement(OVERVIEWCHECKIN).click();
			}catch(Exception e){
			System.out.println("it is not in started status ");
			}
	}

	public void STARTEDBUTTON(AppiumDriver driver) {
		try{
			waitForExpectedElement(driver, STARTEDBTN);
			driver.findElement(STARTEDBTN).click();
			}catch(Exception e){
			System.out.println("it is not in started status ");
			}
	}
		public void VINMILEAGEBTN(AppiumDriver driver) throws Exception {
			try{
			waitForExpectedElement(driver, VINMILEAGE);
			driver.findElement(VINMILEAGE).click();
			}catch(Exception e){
			System.out.println("vin mileage not found");
			}
		}
		public void CONTINUEBTNVEHICLEINFO(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver, CONTINUE);
				driver.findElement(CONTINUE).click();
			}catch(Exception e){
				System.out.println("continue not found");
			}
		}
		//tap on click in vehicle info
		public void SKIPRFIDSCAN(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver, SKIP);
				driver.findElement(SKIP).click();
				
			}catch(Exception e){
				System.out.println("skiprfidscan not found");
			}
		}
		//tap on wheels&tires
		public void WHEELSTIRESBTN(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver, WHEELSTIRESBTN);
				driver.findElement(WHEELSTIRESBTN).click();
			}catch(Exception e){
				System.out.println("wheelstires btn found");
			}
		}
		//TAP ON SKIP IN WHEELS AND TIRES
		//tap on wheels&tires
		public void WHEELSTIRESSKIPBTN(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver, SKIP);
				driver.findElement(SKIP).click();
				}catch(Exception e){
				System.out.println("Element not found");
				}
		}
		//TAP ON continue in wheels and tires
		public void CONTINUEBTNWHEELSTIRES(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver,CONTINUE);
				driver.findElement(CONTINUE).click();
			}catch(Exception e){
				System.out.println("continue button not found");
			}
		}
		public void WIPERSRECALLSBTN(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver,WIPERSRECALLSBTN);
				driver.findElement(WIPERSRECALLSBTN).click();
			}catch(Exception e){
				System.out.println("Recalls element not found");
			}
		}
		public void SERVICEHSITORYBTN(AppiumDriver driver) {
		try{
			waitForExpectedElement(driver,RECALLSSERVICEHISTORYBTN);
			driver.findElement(RECALLSSERVICEHISTORYBTN).click();
		}catch(Exception e){
			System.out.println("service history button not found");
			}
		}
		public void RECALLSYESBTN(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver, YESDEFERRECALL);
				driver.findElement(YESDEFERRECALL).click();
			}catch(Exception e){
				System.out.println("NO DEFER RECALLS");
				}
		}
		//warranties  button
		public void WARRANTIESBTN(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver, WARRANTIESBTN);
				driver.findElement(WARRANTIESBTN).click();
			}catch(Exception e){
				System.out.println("unable to locate warranties button");
				}
		}
		//add button b y xy cordinates 
		public void ADDBTN(AppiumDriver driver) {
			try {
				TouchAction a3 = new TouchAction(driver);
				a3.tap (340, 114).perform();
				
			}catch(Exception e) {
				System.out.println("cordinates changed for add button");
			}
		}
		//add button
		public void WARRANTIESADDBTN(AppiumDriver driver) {
			 try {
				 waitForExpectedElement(driver,ADDBTN);
				 driver.findElement(ADDBTN).click();
			 }catch(Exception e) {
				 System.out.println("Unable to locate add button");
			 }
		}
		
		//next button
		public void NEXTBTN(AppiumDriver driver) {
			try {
				waitForExpectedElement(driver,NEXTBTN);
				driver.findElement(NEXTBTN).click();
			}catch(Exception e) {
				System.out.println("Unable to locate next button");
			}
		}
		//done button
		public void DONEBTN(AppiumDriver driver) {
			try {
				waitForExpectedElement(driver,DONEBTN);
				driver.findElement(DONEBTN).click();
			}catch(Exception e) {
				System.out.println("Theres no done button");
			}
		}
		//tap cart button in warranties screen
		public void CARTBTN(AppiumDriver driver) {
			try {
				waitForExpectedElement(driver,CARTBTN);
				driver.findElement(CARTBTN).click();
			}catch(Exception e) {
				System.out.println("Theres no cart button");
			}
		}
		//tap delviery button in cartscreen
		public void DELIVERYBTN(AppiumDriver driver) {
			try {
				waitForExpectedElement(driver,DELIVERYBTN);
				driver.findElement(DELIVERYBTN).click();
			}catch(Exception e) {
				System.out.println("Theres no cart button");
			}
		}
		//tap on confirm estimate in delivery screen
		public void CONFIRMESTIMATE(AppiumDriver driver) {
			try {
				waitForExpectedElement(driver,CONFIRMESTIMATEBTN);
				driver.findElement(CONFIRMESTIMATEBTN).click();
			}catch(Exception e) {
				System.out.println("unable to tqp on confirmestimate button");
			}
		}
		//tap on confirmation in CONFIRM estiamte screen
		public void CONFIRMATIONBTN(AppiumDriver driver) {
			try {
				waitForExpectedElement(driver,CONFIRMATIONBTN);
				driver.findElement(CONFIRMATIONBTN).click();
			}catch(Exception e) {
				System.out.println("unable to tqp on CONFIRMATION button");
			}
		}//tap on continue buton in billinginfo
		public void CONTINUEBTNBILLINGINFO(AppiumDriver driver) {
			
				waitForExpectedElement(driver,CONTINUEBTNBILLINGINFO);
				driver.findElement(CONTINUEBTNBILLINGINFO).click();
			
		}
		//tap on continue button in just for you screen
		public void CONTINUEBTNJUSTFORYOU(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver,CONTINUE);
				driver.findElement(CONTINUE).click();
			}catch(Exception e){
				System.out.println("continue not found in just for you");
			}
		}
		//selct check box iagree by scrolling down
		public void CHECKBOX(AppiumDriver driver,String direction) throws Exception {
			
			try
			{
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", direction);
				driver.executeScript("mobile: scroll", scrollObject);
			TouchAction a5 = new TouchAction(driver);
				a5.tap (130, 358).perform();
			}
			catch(Exception e)
			{
				System.out.println("Not able to select checkbox");
			}
					
		}
		//digital signature 
		public void DIGITALSIGN(AppiumDriver driver) {
			try{
				TouchAction a4 = new TouchAction(driver);
				a4.tap (175, 565).perform();
			}catch(Exception e){
				System.out.println("uanble to digital sign");
			}
		}
		
		//tap APprove button in estimate screen
		public void APPROVEBTN(AppiumDriver driver) {
			try{
				waitForExpectedElement(driver,APPROVEBUTTON);
				driver.findElement(APPROVEBUTTON).click();
			}catch(Exception e){
				System.out.println("continue not found in just for you");
			}
		}
		//signout
		public void PROFILEBTN(AppiumDriver driver) {
			try{
				TouchAction a5 = new TouchAction(driver);
				a5.tap (353, 41).perform();
				
			}catch(Exception e){
				System.out.println("uanble locate profile menu");
			}
		}
		//logout in home screen
		public void LOGOUT(AppiumDriver driver) {
			try{
			TouchAction a6 = new TouchAction(driver);
			a6.tap (111,631).perform();
			}catch(Exception e){
				System.out.println("unable to locate Signout ");
			}
		}
}		
		


