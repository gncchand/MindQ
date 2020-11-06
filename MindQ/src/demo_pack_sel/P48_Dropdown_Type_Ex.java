package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P48_Dropdown_Type_Ex
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String s=driver.findElement(By.xpath("//*[contains(@class,'selection multiple')]")).getAttribute("class");
				
		if(s.contains("multiple"))
		{
			System.out.print("Multi selection drop down");	
		}
		else
		{
			System.out.print("Single selection drop down");
		}
		

	}

}
