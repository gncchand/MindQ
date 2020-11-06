package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P35_Select_Ex 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		
		WebElement e=driver.findElement(By.name("country"));
		
		Select s=new Select(e);
		
		if(s.isMultiple())
		{
			System.out.println("drop down is multiselect...");
		}
		else
		{
			System.out.println("dropdown is singleselect...");
		}
	
	}
}
