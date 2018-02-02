package tekion;

import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class Utilis {
	static WebDriver d;
	static AppiumDriver driver;
	public void scroll(AppiumDriver driver) throws IOException {
            Dimension dimensions = driver.manage().window().getSize();
              System.out.println("Size of screen= " +dimensions);
              int Startpoint = (int) (dimensions.getHeight() * 0.5);
              System.out.println("Size of scrollStart= " +Startpoint );
              int scrollEnd = (int) (dimensions.getHeight() * 0.4);
              System.out.println("Size of cscrollEnd= " + scrollEnd);             
              driver.swipe(0, Startpoint,0,scrollEnd,1000);    
    }
	//scroll method
	//selct check box iagree by scrolling down
	public void SCROLL(AppiumDriver driver,String direction) throws Exception {
				
					HashMap<String, String> scrollObject = new HashMap<String, String>();
					scrollObject.put("direction", direction);
					driver.executeScript("mobile: scroll", scrollObject);
					try{
						
					}catch(Exception e){
						System.out.println("uanble to locate checkbox");
					}
				
			}
			
		//generate rndom number
		public static String generateRandomNumber(int length){
				 return RandomStringUtils.randomNumeric(length);
				 }
		//string
		 public String generateRandomString(int length){
		  return RandomStringUtils.randomAlphabetic(length);
		 }
		 
		
		 //alphanumeric
		 public String generateRandomAlphaNumeric(int length){
		  return RandomStringUtils.randomAlphanumeric(length);
		 }
		 
		 public String generateStringWithAllobedSplChars(int length,String allowdSplChrs){
		  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    allowdSplChrs;
		  return RandomStringUtils.random(length, allowedChars);
		 }
		 
		 public String generateEmail(int length) {
		  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    "_-.";   //special characters
		  String email="";
		  String temp=RandomStringUtils.random(length,allowedChars);
		  email=temp.substring(0,temp.length()-9)+"@tekion.com";
		  return email;
		 }
		 
		 public String generateUrl(int length) {
		  String allowedChars="abcdefghijklmnopqrstuvwxyz" +   //alphabets
		    "1234567890" +   //numbers
		    "_-.";   //special characters
		  String url="";
		  String temp=RandomStringUtils.random(length,allowedChars);
		  url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
		  return url;
		 }
		 /**
			 * @param locator - Provide locator to which assertion need to be don
			 * @return
			 */
		 public static boolean verifyfieldText(By locator) {
				String actualText;
				try {
					actualText = driver.findElement(locator).getText();
					if(actualText.equalsIgnoreCase(""))
					{
						actualText = driver.findElement(locator).getAttribute("value");
						if(actualText.equalsIgnoreCase(""))
						{
							return true;				
						}
						else{
							return false;
						}
					}
					else {
						return false;
					}
				} catch (Exception e) {
					e.getMessage();
					return true;
				}
				
			}
		}
		 

