package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class P52_Create_Alert_JavaScript 
{
	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.executeScript("window.alert('Google Search')");
		Thread.sleep(4000);
		
		driver.switchTo().alert().dismiss();		

	}

}
