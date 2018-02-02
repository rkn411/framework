package tekion;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class AddressDetails extends TekionLogin {
	public  static final By STREETADDRESS1=By.name("Street Address1");
	public static final By ZIPCODE=By.xpath("Zip Code *");
	public static final By EDITCITYSTATE =By.id("Edit City + State");
	public static final By STATE=By.xpath("");
	public static final By COUNTY=By.xpath("");
	public static final By COUNTRY =By.xpath("");
	public static final By SAVECITYSTATE=By.xpath("");
	public static final By CONTINUE=By.xpath("Continue");
	
	Utilis util =new Utilis();
	Tekionmethods method =new Tekionmethods();
	//address fill hardcoded
	public void Addressfill(AppiumDriver driver) throws InterruptedException {
		StreetAddress1(driver);
		Thread.sleep(6000);
		if(!util.verifyfieldText(STREETADDRESS1)) {
			driver.findElement(STREETADDRESS1).clear();
			driver.findElement(STREETADDRESS1).sendKeys("12698");
		 	}
		//Zipcode(driver);
		if(!util.verifyfieldText(ZIPCODE)) {
			driver.findElement(ZIPCODE).sendKeys("16298");
			method.DONEBTN(driver);
		 	}
		
		//select address from suggestion
		Selectresult(driver);
		//editcity state
		//EIDTCITYSTATE(driver);
	
	}
	//enter street 1 address
	public  void StreetAddress1(AppiumDriver driver) {
		try{
			HashMap<String, String> scrollObject = new HashMap<String, String>();
			scrollObject.put("direction", "down");
			driver.executeScript("mobile: scroll", scrollObject);
				waitForExpectedElement(driver,STREETADDRESS1);
				driver.findElement(STREETADDRESS1).clear();
				driver.findElement(STREETADDRESS1).sendKeys("12698");
				//driver.findElement(STREETADDRESS1).sendKeys(Keys.RETURN);
			}catch(Exception e){
				System.out.println("unable to locate street address");
			}
			
     }
	//search result selection
	public  void Selectresult(AppiumDriver driver) {
		try{
			//click on first checkin to start in appointments screen
			TouchAction a9 = new TouchAction(driver);
			a9.tap (160,240).perform();
			Thread.sleep(6000);
				
			}catch(Exception e){
				System.out.println("no able to tap on coridntes result");
			}
	}
	//zipcode
	public  void Zipcode(AppiumDriver driver) {
		try{
				waitForExpectedElement(driver,ZIPCODE);
				driver.findElement(ZIPCODE).sendKeys("");
				driver.findElement(ZIPCODE).sendKeys(Keys.RETURN);
				}catch(Exception e){
					System.out.println("unable to locate ZIPCODE");
				}
		}
	
	//click on edit city state
	public  void EIDTCITYSTATE(AppiumDriver driver) {
		try{
				waitForExpectedElement(driver,EDITCITYSTATE);
				driver.findElement(EDITCITYSTATE).click();
			}catch(Exception e){
				System.out.println("unable to locate edit citystate");
			}
	}
	//enter county address
	public  void County(AppiumDriver driver) {
		try{
				HashMap<String, String> scrollObject = new HashMap<String, String>();
				scrollObject.put("direction", "down");
				driver.executeScript("mobile: scroll", scrollObject);
					waitForExpectedElement(driver,COUNTY);
					driver.findElement(COUNTY).sendKeys("asdfghjkl");
					driver.findElement(COUNTY).sendKeys(Keys.RETURN);
				}catch(Exception e){
					System.out.println("unable to locate street address");
				}
	}
	
}
