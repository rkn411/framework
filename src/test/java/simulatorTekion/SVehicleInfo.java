package simulatorTekion;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.AppiumDriver;
import tekion.TekionLogin;
import tekion.Tekionmethods;
import tekion.Utilis;

public class SVehicleInfo extends STekionLogin{
	public class Vehicleinfo extends TekionLogin{
		public final By TAG=By.xpath("//XCUIElementTypeOther[@name='Tag *']/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField");
		public final By VINNO=By.xpath("//XCUIElementTypeOther[@name='VIN *']/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField");
		public final By MILES=By.xpath("//XCUIElementTypeOther[@name='Miles In *']/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField");
		public final By PREVIOUSMILES=By.xpath("//XCUIElementTypeStaticText[contains(@name,'Last Mileage')]");
		
		public final By USECAMERA=By.name("");
		public final By CONNECTOBD =By.xpath("");
		public final By SCANRFID =By.xpath("");
		public final By PRODUCTIONDATE=By.name("Production Date * November 16, 2013");
		public final By CONTINUE =By.name("Continue");
		Utilis Random =new Utilis();
		Tekionmethods util =new Tekionmethods();
		public void fillvehicleinfo(AppiumDriver driver,String data) throws InterruptedException {
			//enter tag
			entertagrandom(driver);
			//enter vin
			//enterVIN(driver,data);
			Thread.sleep(10000);
			//enter miles
			MILES(driver);
			//enter produciton date
			//ProductionDate(driver);
			//click on continue
			util.CONTINUEBTNVEHICLEINFO(driver);
		}
		public  void entertagrandom(AppiumDriver driver) {
			try {
				//enter tag
				//Utilis.generateRandomNumber(4);
				driver.findElement(TAG).clear();
				driver.findElement(TAG).sendKeys("red",Utilis.generateRandomNumber(4));
				driver.findElement(TAG).sendKeys(Keys.RETURN);
			}catch(Exception e) {
				System.out.println("no random tag");
			}
		}
		public void enterVIN(AppiumDriver driver,String data) {
			try {
				
				driver.findElement(VINNO).clear();
				waitForExpectedElement(driver,VINNO);
				driver.findElement(VINNO).sendKeys(data);
				driver.findElement(VINNO).sendKeys(Keys.RETURN);
			}catch(Exception e) {
				e.getMessage();
				System.out.println("not Entered VIN");
			}
		}
		
			//enter miles
		public void MILES(AppiumDriver driver){
			//enter miles 
			String  miles =driver.findElement(PREVIOUSMILES).getText();
			System.out.println(miles);
			String s= miles;
			//int i=10;
			String s1=s.replaceAll("[^0-9]", "");
			int result = Integer.parseInt(s1);
			int increment =result+1;
			Integer io = new Integer(increment);
			String mile=io.toString();
			driver.findElement(MILES).clear();
		    driver.findElement(MILES).sendKeys(mile);
		    System.out.println(mile);
		    util.DONEBTN(driver);
		}

		//select production date
	public void ProductionDate(AppiumDriver driver) {
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		driver.executeScript("mobile: scroll", scrollObject);
		try{
			waitForExpectedElement(driver,CONTINUE);
			driver.findElement(CONTINUE).click();
			
		}catch(Exception e){
			System.out.println("uanble to select production date");
		}
	}
	}


}
