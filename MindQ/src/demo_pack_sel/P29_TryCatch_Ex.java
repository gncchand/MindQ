package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P29_TryCatch_Ex
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		try
		{
			
			if(driver.findElement(By.name("hiddenlPassword")).isDisplayed())
				//hiddenlPassword is invalid name , hence exception will be thrown and handled in Catch
			{
				System.out.print("\n password field is displayed");
			}
			else
			{
				System.out.print("\n password field is not displayed");
			}
		}
		catch(Exception e)
		{
			System.out.print("\n Exception handled successfully\n"+e);
		}
	}
}
