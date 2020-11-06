package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P42_Action_Class_Methods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		
		driver.manage().window().maximize();
		
		Actions a =new Actions(driver);
		
		
		//Situation 2 - Fill the element
		WebElement e2=driver.findElement(By.name("q"));
		a.sendKeys(e2,"Selenium").build().perform();
		Thread.sleep(3000);
				
		//Situation 4 - double click on element
		WebElement e4=driver.findElement(By.xpath("//*[text()='India']"));
		a.doubleClick(e4).build().perform();
		Thread.sleep(3000);
		
		//Situation 3 - move the cursor to element
		WebElement e3=driver.findElement(By.xpath("//*[text()='Images']"));
		a.moveToElement(e3).build().perform();
		Thread.sleep(3000);
		
		//Rightclick on element
		WebElement e5=driver.findElement(By.xpath("(//*[@value='Google Search'])[2]"));
		a.contextClick(e5).build().perform();
		Thread.sleep(3000);
		
		//Situation 1 - click on element
		WebElement e1=driver.findElement(By.xpath("//*[text()='Sign in']"));
		a.click(e1).build().perform();
		Thread.sleep(3000);
	}

}
