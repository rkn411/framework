package tekion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebCheckin {
	public static final By EMAIL =By.name("username");
	public static final By PASSWORD=By.name("");
	public static final By SIGNIN=By.name("");
	
	WebDriver driver;
	@BeforeClass
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/tekion/Downloads/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://uat-cacargroup.tekion.xyz/cdms/");
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider="dataProvider")
public void webcheckin(String userid,String Pwd) throws InterruptedException {
		//enter usename
		driver.findElement(EMAIL).sendKeys(userid);
		//enter password
		driver.findElement(PASSWORD).sendKeys(Pwd);
		//click on sign in
		driver.findElement(SIGNIN).click();
		
		
	
}
	@AfterClass
	public void closbrowser() {
		driver.quit();
	}
	
	@DataProvider
public Object[][] dataProvider(){
	String[][] s=new String[2][2];
	s[0][0]="serviceadvisor1@tekion.com";
	s[1][1]="Tekion123";
	return s;
}
}
