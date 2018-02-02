package tekion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Retry;

public class AddNewCustomerTest extends TekionLogin {
	public static final By CONTINUE =By.name("Continue");
	
	AddNewCustomer NewCustomer =new AddNewCustomer();
	AddressDetails FillAddress =new AddressDetails();
	Tekionmethods checkin =new Tekionmethods();
	Vehicleinfo Fillvehicleinfo =new Vehicleinfo();
	@Test(dataProvider="dataProvider")
	public void startcheckin(String data) throws Exception
	{
		NewCustomer.ADDNEWCUSTOMER(driver);
		//vehicle info fill
		Fillvehicleinfo.fillvehicleinfo(driver,data);
		//tap on skip rfid scann
				checkin.SKIPRFIDSCAN(driver);
				System.out.println("verified for rfid scan skip");
				//tap on continue in vehicle info screen
				checkin.CONTINUEBTNVEHICLEINFO(driver);
				System.out.println("rfid scan skipped");
				//TAP ON WHEELS AND TIRES IN INSPECTION
				checkin.WHEELSTIRESBTN(driver);
				System.out.println("navigated inspection screen");
				//tap on skip in wheels and tires
				checkin.WHEELSTIRESSKIPBTN(driver);
				//tap on recalls in wipers&light screen
				checkin.WIPERSRECALLSBTN(driver);
				//tap on service history button in RECALLS SCREEN
				checkin.SERVICEHSITORYBTN(driver);
				//TAP yes for defercalls
				checkin.RECALLSYESBTN(driver);
				//TAP ON WARRANTIES IN SERVICE HISTORY SCREEN
				checkin.WARRANTIESBTN(driver);
				//tap on add button in warranties
				//checkin.ADDBTN(driver);
				//checkin.WARRANTIESADDBTN(driver);
				//tap on cart button
				checkin.CARTBTN(driver);
				System.out.println("navigated to cart screen");
				//tap on delivery
				checkin.DELIVERYBTN(driver) ;
				//tap on confirm estimate
				checkin.CONFIRMESTIMATE(driver);
				//tap on confirmation in confirm estimate screen
				checkin.CONFIRMATIONBTN(driver);
				//add address 
				FillAddress.Addressfill(driver);
				checkin.NEXTBTN(driver);
				checkin.NEXTBTN(driver);
				checkin.DONEBTN(driver);
				//tap on continue in billing info screen 
				driver.findElement(CONTINUE).click();
				System.out.println("naviagted to justfor you screen");
				driver.findElement(CONTINUE).click();
				//select i agree checkbox
				checkin.CHECKBOX(driver,"down"); 
				//do the digital signature
				checkin.DIGITALSIGN(driver);
				//TAp on approve button
				checkin.APPROVEBTN(driver);
				//thankyou screen continue
				driver.findElement(CONTINUE).click();
				//Done button in Confirmtion
				checkin.DONEBTN(driver);
				driver.closeApp();
				
			   /* //click on profile btn
				checkin.PROFILEBTN(driver);
				//signout
				checkin.LOGOUT(driver);
				System.out.println("Automated one new checkin");*/
			}
	@DataProvider
	public Object[][] dataProvider(){
		String[][] s=new String[8][1];
		s[0][0]="JN1BJ0RP8GM232003";
		s[1][0]="JN1BJ0RR2HM416601";
		s[2][0]="JN1BJ0RP8GM232003";
		
		return s;
	}
		
}

