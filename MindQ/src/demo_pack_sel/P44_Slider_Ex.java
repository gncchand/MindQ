package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P44_Slider_Ex 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://jqueryui.com/slider/#multiple-vertical");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(By.xpath("//*[@id='master']/span"));
	
		//move from left to right
		a.dragAndDropBy(e1, 100, 0).build().perform();
		Thread.sleep(2000);
		
		//move from right to left
		a.dragAndDropBy(e1, -200, 0).build().perform();
		Thread.sleep(3000);
		
		//switch to default frame to scroll down to element
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,400)");
				
		//switch back to inner frame now to perform slide operation
		driver.switchTo().frame(0);
		
		WebElement e2=driver.findElement(By.xpath("//*[@id='eq']/span[7]/span"));
		Thread.sleep(3000);
		
		//scroll from bottom to top
		a.dragAndDropBy(e2, 0, -50).build().perform();
		Thread.sleep(3000);
		
		//scroll from top to bottom
		a.dragAndDropBy(e2, 0, 100).build().perform();
	}
}


