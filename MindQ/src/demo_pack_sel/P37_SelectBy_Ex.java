package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P37_SelectBy_Ex
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		
		WebElement e=driver.findElement(By.name("country"));
		
		Select s=new Select(e);
				
		s.selectByIndex(3); //Andorra is 4th option
		Thread.sleep(3000);
		s.selectByValue("32");//Canada value is 32 in source code
		Thread.sleep(3000);
		s.selectByVisibleText("INDIA");

	}

}
