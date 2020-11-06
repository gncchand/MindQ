package demo_pack_sel;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P66_JavaRobot_WinMenu
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement e=driver.findElement(By.xpath("(//*[text()='Downloads'])[2]"));
		
		Actions a=new Actions(driver);
		a.contextClick(e).build().perform();
		
		Thread.sleep(4000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		
	}

}
