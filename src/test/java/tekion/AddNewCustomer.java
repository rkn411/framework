package tekion;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class AddNewCustomer extends TekionLogin{
	public static final By PLUSBTN =By.name("");
	public static final By ADDNEWCUSTOMERBTN=By.name("+ Add New Customer");
	//public static final By FIRSTNAMEFOCUS=By.xpath("//XCUIElementTypeOther[@name='First Name *'][2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");
	public static final By FIRSTNAME=By.name("First Name *");
	public static final By LASTNAME =By.name("Last Name *");
	public static final By PHONENO =By.name("Phone Number *");
	public static final By EMAIL =By.name("Email Address *");
	//public static final By EMAILNOTAVAILABLE=By.name("Email not available");
	public static final By EMAILNOTAVAILABLE=By.xpath("//XCUIElementTypeOther[@name='Email not available']");
	public static final By NEXTBTN =By.name("Next");
	public static final By DONEBTN =By.name("Done");
	public static final By CALLBTN=By.name("Call");
	public static final By TEXTBTN=By.name("Text");
	public static final By EMAILBTN=By.name("Email");
	public static final By ADDASNEWCUSTOMER=By.xpath("//XCUIElementTypeOther[@name='+ Add as a New Customer']");
	public static final By PERSONAL= By.name("Personal");
	
	Utilis filldata = new Utilis();
	Tekionmethods util =new Tekionmethods();
	
public void ADDNEWCUSTOMER(AppiumDriver driver) throws Exception {
	//click on plus button
	PLUSBTN(driver);
	// click on add new customer
	AddNewCustomer(driver);
	//scroll up
	SCROLLBUSINESS(driver,"up");
	//enter first name
	Firstname(driver);
	//enter last name
	 LASTNAME(driver);
	//enter phone no.
	 PHONENUMBER(driver);
	//enter email
	EnterEMAIL(driver);
	 DoneBTN(driver);
	 //EMAILNOTAVAILABLE(driver);
	//click on continue
	 util.CONTINUEBTNVEHICLEINFO(driver);
	 //add as new customer
	 ADDASNEWCUSTOMER(driver);
}

public void PLUSBTN(AppiumDriver driver) {
	try{
		TouchAction a1 = new TouchAction(driver);
		a1.tap (190, 566).perform();
	}catch(Exception e){
		System.out.println("uanble to locate plus ");
		}
}
//tap APprove button in estimate screen
public void AddNewCustomer(AppiumDriver driver) {
	try{
		waitForExpectedElement(driver,ADDNEWCUSTOMERBTN);
		driver.findElement(ADDNEWCUSTOMERBTN).click();
	}catch(Exception e){
		System.out.println("unable to locate add new customer ");
		}
		
}
//next button 
public void NextBTN(AppiumDriver driver) {
	try{
		waitForExpectedElement(driver,NEXTBTN);
		driver.findElement(NEXTBTN).click();
	}catch(Exception e){
		System.out.println("unable to nextbutton ");
		}
		
}
//done button
public void DoneBTN(AppiumDriver driver) {
	try{
		waitForExpectedElement(driver,DONEBTN);
		driver.findElement(DONEBTN).click();
	}catch(Exception e){
		System.out.println("unable to locate DONEBTN ");
		}
		
}
//enter first name
public void Firstname(AppiumDriver driver) {
	try {
		waitForExpectedElement(driver,FIRSTNAME);
		//driver.findElement(FIRSTNAMEFOCUS).click();
		driver.findElement(FIRSTNAME).sendKeys("UAT",filldata.generateRandomString(3));
		NextBTN(driver);
	} catch (Exception e) {
		System.out.println("no first name ");
	}
}
//enter last name
public void LASTNAME(AppiumDriver driver) {
	try {
		waitForExpectedElement(driver,LASTNAME);
		driver.findElement(LASTNAME).click();
		driver.findElement(LASTNAME).sendKeys("TST",filldata.generateRandomString(3));
		NextBTN(driver);
	} catch (Exception e) {
		System.out.println("no last name ");
	}
}
//phone no
public void PHONENUMBER(AppiumDriver driver) {
	try {
		waitForExpectedElement(driver,PHONENO);
		driver.findElement(PHONENO).click();
		driver.findElement(PHONENO).sendKeys(filldata.generateRandomNumber(10));
		NextBTN(driver);
	} catch (Exception e) {
		System.out.println("no phone no ");
	}
}
public void EnterEMAIL(AppiumDriver driver) {
	try {
		waitForExpectedElement(driver,EMAIL);
		//driver.findElement(EMAIL).clear();
		//driver.findElement(EMAIL).click();
		driver.findElement(EMAIL).sendKeys("Dectst",filldata.generateEmail(6));
		DoneBTN(driver);
	} catch (Exception e) {
		driver.findElement(EMAILNOTAVAILABLE);
		System.out.println("unable to locate email ");
	}
}

//select on call
public void CALLBTN(AppiumDriver driver) {
	try{
		waitForExpectedElement(driver,CALLBTN);
		driver.findElement(CALLBTN).click();
	}catch(Exception e){
		System.out.println("unable to locate CALLBTN ");
		}	
}
//select text
public void TEXTBTN(AppiumDriver driver) {
	try{
		waitForExpectedElement(driver,TEXTBTN);
		driver.findElement(TEXTBTN).click();
	}catch(Exception e){
		System.out.println("unable to locate TEXTBTN ");
		}	
}
//select Email
public void EMAILBTN(AppiumDriver driver) {
	try{
		waitForExpectedElement(driver,EMAILBTN);
		driver.findElement(EMAILBTN).click();
	}catch(Exception e){
		System.out.println("unable to locate EMAILBTN ");
		}
		
}
public void ADDASNEWCUSTOMER(AppiumDriver driver) {
	try {
		waitForExpectedElement(driver,ADDASNEWCUSTOMER);
		driver.findElement(ADDASNEWCUSTOMER).click();
	} catch (Exception e) {
		e.getMessage();
		System.out.println("no records ");
	}
}
public void SCROLLBUSINESS(AppiumDriver driver,String direction) throws Exception {
	
	HashMap<String, String> scrollObject = new HashMap<String, String>();
	scrollObject.put("direction", direction);
	driver.executeScript("mobile: scroll", scrollObject);
	try{
		waitForExpectedElement(driver,PERSONAL);
		driver.findElement(PERSONAL).click();
		
	}catch(Exception e){
		System.out.println("uanble to select business");
	}

}
//email not available
public void EMAILNOTAVAILABLE(AppiumDriver driver) {
	try {
		waitForExpectedElement(driver,EMAILNOTAVAILABLE);
		driver.findElement(EMAILNOTAVAILABLE).click();
	} catch (Exception e) {
		e.getMessage();
		System.out.println("unable to select check box ");
	}
}
}


