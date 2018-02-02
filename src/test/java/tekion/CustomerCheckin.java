package tekion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class CustomerCheckin extends TekionLogin {
	
	public static final By CONTINUE =By.name("Continue");
	Tekionmethods checkin =new Tekionmethods();
	AddressDetails FillAddress =new AddressDetails();
	Vehicleinfo vehicle =new Vehicleinfo();
	//@Test
	@Test(dataProvider="dataProvider")
	public void startcheckin(String data) throws Exception
	{
		//SELECT CHEKIN 
		checkin.selectcheckin(driver);
		System.out.println("started chekcin");
		//tap on vinmileage
		checkin.VINMILEAGEBTN(driver);
		System.out.println("navigated to vehicle info");
		//enter v3ehicle info details 
		vehicle.fillvehicleinfo(driver,data);
		System.out.println("vehicle info details entered");
		//tap on continue IN VEHICLE INFO screen
		//checkin.CONTINUEBTNVEHICLEINFO(driver);
		//System.out.println("naviagted to scan rfidscreen ");
		//tap on skip rfid scann
		checkin.SKIPRFIDSCAN(driver);
		System.out.println("verified for rfid scan skip");
		//tap on continue in vehicle info screen
		checkin.CONTINUEBTNVEHICLEINFO(driver);
		//System.out.println("rfid scan skipped");
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
		System.out.println("ndone digital sign");
		//TAp on approve button
		checkin.APPROVEBTN(driver);
		//thankyou screen continue
		driver.findElement(CONTINUE).click();
		//Done button in Confirmtion
		checkin.DONEBTN(driver);
		 //click on profile btn
		checkin.PROFILEBTN(driver);
		System.out.println("tapped on profile menu");
		//signout
		checkin.LOGOUT(driver);
		System.out.println("Done logout");
		System.out.println("Automated one schecdelue checkin");
		driver.closeApp();
	}
	@DataProvider
	public Object[][] dataProvider(){
		String[][] s=new String[15][1];
		s[0][0]="JN1CV6AR8BM410767";
		s[1][0]="JN1CV6AR8BM410767";
		return s;
	}
}

		
		
		
		
	


