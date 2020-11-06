package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P28_isDisplayed_Ex 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		
		if(driver.findElement(By.name("identifier")).isDisplayed())
		{
			System.out.print("\n username is displayed");
		}
		else
		{
			System.out.print("\n username is not displayed");
		}
		
		if(driver.findElement(By.name("hiddenPassword")).isDisplayed())
		{
			System.out.print("\n password field is displayed");
		}
		else
		{
			System.out.print("\n password field is not displayed");
		}
		
	}

}
