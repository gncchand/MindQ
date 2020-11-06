package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_Close_Browser
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.sentia.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@href,'pay-online')]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='PAY ONLINE'])[3]")).click();
		Thread.sleep(5000);
		
		driver.close();//close active (first) browser which driver points
		
	}
}
