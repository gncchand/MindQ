package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P26_ActiveElement_Ex
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Manual");
		
		driver.switchTo().activeElement().sendKeys("Automation");
	}
}
