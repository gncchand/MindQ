package demo_pack_sel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class P97_ExtentReports_Ex {

	public static void main(String[] args) throws IOException 
	{
		//create extent reports
		ExtentReports er=new ExtentReports("googleresults.html",false);
		
		ExtentTest et=er.startTest("google title verification");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String gt=driver.getTitle();
		System.out.print(gt);
		
		if(gt.equals("Google"))
		{
			et.log(LogStatus.PASS, "google title test passed");
		}
		else
		{
			String fname=myScreenshot(driver);
			et.log(LogStatus.FAIL, "google title test failed"+et.addScreenCapture(fname));
		}
		driver.close();
		er.endTest(et);
		er.flush();
	}

	public static String myScreenshot(ChromeDriver driver) throws IOException
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		Date d=new Date();
		String fname=sf.format(d)+".png";
		System.out.print(fname);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(fname);
		FileHandler.copy(src, dest);
		return(fname);
	}

}
