package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_KeyOperations_Select 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		WebElement x=driver.findElement(By.name("q"));
		x.sendKeys("Automation",Keys.CONTROL,"a");
	}

}
