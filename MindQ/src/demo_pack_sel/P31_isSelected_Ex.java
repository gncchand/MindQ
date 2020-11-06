package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P31_isSelected_Ex 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		WebElement e=driver.findElement(By.xpath("(//*[@name=\"ctl00$mainContent$rbtnl_Trip\"])[1]"));
		
		if(e.isDisplayed())
		{
				if (e.isEnabled())
				{
					if(e.isSelected())
					{
					System.out.print("radio button one way is displayed ,enabled and selected");
					}
					else
					{
					System.out.println("radio button one way is displayed,enabled but not selected");
					}
				}
				else
				{
					System.out.println("radio button one way is displayed but not enabled");
				}
		}
		else
		{
			System.out.println("radio button is not displayed");	
		
		}

	}

}
