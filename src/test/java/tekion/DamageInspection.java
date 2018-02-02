package tekion;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class DamageInspection extends TekionLogin{
	public static final By ModelCAR =By.name("Tekion 3d model");
	public static final By SCRATCH =By.name("Scratch");
	public static final By CANCELDAMAGETYPE=By.xpath("(//XCUIElementTypeOther[@name='Select Damage Type'][1]/XCUIElementTypeOther[1]");
	
	
	AddNewCustomer NewCustomer =new AddNewCustomer();
	AddressDetails FillAddress =new AddressDetails();
	Tekionmethods checkin =new Tekionmethods();
	Vehicleinfo Fillvehicleinfo =new Vehicleinfo();
	@Test(priority=1,dataProvider="dataProvider")
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
		Thread.sleep(12000);

}
	@Test(priority = 2,invocationCount=100)
	public void checkdamage() throws InterruptedException {
		Thread.sleep(8000);
		//tap on car
		taponcar(driver);
		Thread.sleep(8000);
		//tap on camera take pics
		taponcamera(driver);
		//usephoto
		USEPHOTO(driver);
		Thread.sleep(8000);
		//seelct damge type
		//DamageType(driver);
		driver.findElement(CANCELDAMAGETYPE).click();
		Thread.sleep(9400);
		
	}
	
	
	//3d car tapping
	public  void taponcar(AppiumDriver driver) {
		try{
			TouchAction a12 = new TouchAction(driver);
			a12.tap (200,320).perform();
			Thread.sleep(6000);
					
			}catch(Exception e){
			System.out.println("not able to tap on car coridntes");
				}
		}
	public  void taponcamera(AppiumDriver driver) {
		try{
				//click on first checkin to start in appointments screen
			TouchAction a10 = new TouchAction(driver);
			a10.tap (175,628).perform();
			Thread.sleep(6000);
					
			}catch(Exception e){
			System.out.println("no able to tap on coridntes camera");
				}
		}
	//tap om usephto button
	public  void USEPHOTO(AppiumDriver driver) {
		try{
			//click on first checkin to start in appointments screen
		TouchAction a11 = new TouchAction(driver);
		a11.tap (319,627).perform();
		Thread.sleep(6000);
				
		}catch(Exception e){
		System.out.println("no able to tap on coridntes result");
			}
		}
	//seelct damage type
	public  void DamageType(AppiumDriver driver) {
		try{
			driver.findElement(SCRATCH).click();
			Thread.sleep(6000);	
			}catch(Exception e){
			System.out.println("no able to tap on Scratch car");
				}
		}
	@DataProvider
	public Object[][] dataProvider(){
		String[][] s=new String[1][1];
		s[0][0]="JN1CV7AP5GM201336";
		return s;
	}
}
