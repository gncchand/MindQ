package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P30_isEnabled_Ex
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		if(driver.findElement(By.name("q")).isDisplayed())
		{
			if(driver.findElement(By.name("q")).isEnabled())
			{
				System.out.println("search field is displayed and enabled");
			}
			else
			{
				System.out.println("search box is displayed but not enabled");
			}
		}
		else
		{
			System.out.println("Search box is not displayed");
		}
	}
}
