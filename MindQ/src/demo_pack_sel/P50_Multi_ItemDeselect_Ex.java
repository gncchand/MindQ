package demo_pack_sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P50_Multi_ItemDeselect_Ex 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List <WebElement> l1=driver.findElements(By.xpath("//*[contains(@class,'selection multiple')]/div[2]/div"));
		
		driver.findElement(By.xpath("//*[contains(@class,\"ui fluid dropdown selection\")]")).click();
		
		Thread.sleep(3000);
		l1.get(1).click();
		
		Thread.sleep(3000);
		l1.get(3).click();
		
		Thread.sleep(3000);
		l1.get(5).click();
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ESCAPE).build().perform();

		List <WebElement> l2=driver.findElements(By.xpath("//*[contains(@class,'selection multiple')]/a/i"));
		
		for (int i=0;i<l2.size();i++)
		{
			l2.get(i).click();
			Thread.sleep(200);
		}
		a.sendKeys(Keys.ESCAPE).build().perform();
		
	}

}
