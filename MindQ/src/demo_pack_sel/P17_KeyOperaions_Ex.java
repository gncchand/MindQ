package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17_KeyOperaions_Ex 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement x=driver.findElement(By.name("q"));
		/*x.sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);*/
		x.sendKeys("Selenium",Keys.ENTER);
	}
}
