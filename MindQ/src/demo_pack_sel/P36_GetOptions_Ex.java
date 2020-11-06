package demo_pack_sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P36_GetOptions_Ex
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
		
		List <WebElement> l=s.getOptions();
		int k=l.size();
		
		for (int i=0;i<k;i++)
		{
			System.out.println("Value of Option "+(i+1)+" in drop down is .."+l.get(i).getText());
		}

	}

}
