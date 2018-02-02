package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton {
	private static WebDriver firefoxdriver;
	private static WebDriver chromedriver;


	public static int browser;

	// singleton class constructor
	private Singleton() {
	}

	// Passing the driverpath (String argument)
	/*public static WebDriver getInstance(String driverpath) throws AWTException, InterruptedException {
		
		if (driver==null) {
		{
			System.setProperty("webdriver.gecko.driver",driverpath);
			   driver=new FirefoxDriver();
			}
		else
		{
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
		}
			 Robot r=new Robot();
		     r.keyPress(KeyEvent.VK_ALT);
		     r.keyPress(KeyEvent.VK_SPACE);
		     r.keyRelease(KeyEvent.VK_ALT);
		     Thread.sleep(1000);
		     r.keyPress(KeyEvent.VK_X);
		//}

		return driver;
	}*/
	public static WebDriver getInstanceFirefox(String driverpath) {
      if(firefoxdriver==null){
       
        	System.setProperty("webdriver.gecko.driver",driverpath);
        	firefoxdriver = new FirefoxDriver();
        }
        	return firefoxdriver;
	}
	public static WebDriver getInstanceChrome(String driverpath) {
		if(chromedriver==null) {
        	System.setProperty("webdriver.chrome.driver", driverpath);
        	chromedriver = new ChromeDriver();
        }
        return chromedriver;
	}
}



