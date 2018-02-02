package tekion;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class BillingInfo extends TekionLogin{
	//personal
	public static final By PERSONALBTN=By.name("Personal");
	//tbusiness button
	public static final By BUSINESSBTN=By.name("Business");
	//call preferred contact
	public static final By CALLBTN=By.name("Call");
	// text prefered contact
	public static final By TEXTBTN=By.name("Text");
	// email preferrred contact
	
	public static final By EMAILTN=By.name("Email");
    //click right menu
	
public void Addressfill(AppiumDriver driver) {
	
}
	String street1="140 E State";
	String street2=driver.findElement(PERSONALBTN).getAttribute("");
}




	