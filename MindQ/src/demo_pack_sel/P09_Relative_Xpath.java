package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_Relative_Xpath
{
	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");
	Thread.sleep(5000);

	driver.quit();
	driver.close();
	}

}
