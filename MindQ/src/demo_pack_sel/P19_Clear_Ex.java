package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19_Clear_Ex
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		WebElement x=driver.findElement(By.name("q"));
		x.sendKeys("Manual");
		x.clear();
		x.sendKeys("Automation");
		}
}
