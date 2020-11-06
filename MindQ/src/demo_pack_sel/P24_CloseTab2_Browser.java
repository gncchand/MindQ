package demo_pack_sel;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P24_CloseTab2_Browser
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://sentia.in");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id='go']/div[4]")).click();
			Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[contains(@href,'payumoney')])[2]")).click();
	ArrayList <String> x=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(x.get(1));//close 2nd window
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(x.get(0));//close 1st window
	Thread.sleep(5000);
	driver.close();
	}
}
