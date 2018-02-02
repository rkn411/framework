package simulatorTekion;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tekion.TekionLogin;
import tekion.Tekionmethods;
import tekion.Vehicleinfo;

public class SVehicleInfoTest extends STekionLogin {
	
		public final By CONTINUE =By.name("Continue");
		Tekionmethods checkin =new Tekionmethods();
		Vehicleinfo Fillvehicleinfo =new Vehicleinfo();
		@Test(dataProvider="dataProvider")
		public void startcheckin(String data) throws Exception
		{
			//SELECT CHEKIN 
			checkin.selectcheckin(driver);
			System.out.println("started chekcin");
			//tap on vinmileage
			checkin.VINMILEAGEBTN(driver);
			System.out.println("navigated to appoinmant info");
			//tap on continue IN VEHICLE INFO screen
			Fillvehicleinfo.fillvehicleinfo(driver,data);

		}
		@DataProvider
		public Object[][] dataProvider(){
			String[][] s=new String[0][0];
			s[0][0]="JN1CV6AR8BM410767";
			
			return s;
		}
	}

