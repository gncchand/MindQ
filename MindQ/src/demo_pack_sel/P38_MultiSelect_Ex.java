package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class P38_MultiSelect_Ex 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		
		WebElement e=driver.findElement(By.name("cars"));
		Select s=new Select(e);
		Actions a=new Actions(driver);
		
		a.keyDown(Keys.CONTROL)
		.click(s.getOptions().get(1))
		.click(s.getOptions().get(3))
		.keyUp(Keys.CONTROL).build().perform();

	}
}
