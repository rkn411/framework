package utilities;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.tools.zip.ZipEntry;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Utilities {
	public ExtentTest test;
	public ExtentReports reports;
	public String pth = System.getProperty("user.dir");
	public String ipaPath;
	public String testDataFilePath = pth + "/TestData/";
	public String reportFilePath;
	public Date date;
	static Date dt = new Date();
	static String reportDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(dt);
	static String reportFileName = "Testing_" + reportDateFormat;
	public String screenShotFilePath=pth+"/ScreenShots/";
	public String chromedriverpath=pth+"/Drivers/";
	public ExtentTest reportsFile(String testCaseName) {
		reportFilePath = pth + "/Reports/Report.html";
		reports = new ExtentReports(reportFilePath, false);
		test = reports.startTest(testCaseName);
		return test;
	}
	public ExtentTest reportsTestFile(String testCaseName) {
		reportFilePath = pth + "/Reports/" + reportFileName + ".html";
		reports = new ExtentReports(reportFilePath, false);
		test = reports.startTest(testCaseName);
		return test;
	}
	public void endReport() {
		reports.endTest(test);
		reports.flush();
	}
	public String ipaPath() {
		String folderPath = pth +"/Resources/";
		return ipaPath = folderPath +"tekion_cdms_mobile.ipa";
	}
	// Capture Screen Shot and save in the location
	public String captureScreenshot(WebDriver driver, String screenshotname) {
		String scrfilename=null;
        try {
            // Current Date and Time
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
            Date dt = new Date();
            System.out.println(dateFormat.format(dt));
            scrfilename= screenshotname + "_"+ dateFormat.format(dt) + ".png";

            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source,
                    new File(screenShotFilePath + dateFormat.format(dt) + "_" + screenshotname + ".png"));
            System.out.println("screenshot taken");
        } catch (Exception e) {
            System.out.println("exception while taking screenshot" + e.getMessage());
        }
        return scrfilename;
    }
	public static void scrollingToBottomofAPage(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public static void scrolltoTopofpage(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
	}
		// make zip of reports
	public static void zip(String filepath) {
		try {
			File inFolder = new File(filepath);
			File outFolder = new File("Reports.zip");
			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
			BufferedInputStream in = null;
			byte[] data = new byte[1000];
			String files[] = inFolder.list();
			for (int i = 0; i < files.length; i++) {
				in = new BufferedInputStream(new FileInputStream(inFolder.getPath() + "/" + files[i]), 1000);
				out.putNextEntry(new ZipEntry(files[i]));
				int count;
				while ((count = in.read(data, 0, 1000)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry();
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
