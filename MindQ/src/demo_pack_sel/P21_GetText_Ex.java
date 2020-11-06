package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class P21_GetText_Ex 
{
	public static void main(String[] args) 
	{
		// this will remove timeout messages of Chrome latest version
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	     
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		String k=driver.findElement(By.xpath("(//*[@class=\"gb_g\"])[1]")).getText();
		System.out.print("value of element..."+k);	
	}
}
