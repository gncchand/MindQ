package demo_pack_sel;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class P20_GetAttr_Ex
{

	public static void main(String[] args) throws InterruptedException
	{
			InternetExplorerOptions ieOptions = new InternetExplorerOptions();
			ieOptions.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
						
			WebDriver driver= new InternetExplorerDriver(ieOptions);
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.name("q")).sendKeys("Selenium");
			String x=driver.findElement(By.name("q")).getAttribute("maxlength");
			System.out.println("length of text field..."+x);
	}

}
