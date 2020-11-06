package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P51_ClickElement_Using_JavaScript 
{

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		Thread.sleep(4000);
		//locate and operate using JavaScript (Example 2)
		//driver.executeScript("document.getElementById('gb_70').click()");
		
		//fill an element with data
		WebElement e1=driver.findElementByName("q");
		driver.executeScript("arguments[0].value='Testing'", e1);
		
		Thread.sleep(4000);
		
		//locate using webdriver and click using Java script (example 2)
		WebElement e2=driver.findElement(By.className("gb_g"));
		driver.executeScript("arguments[0].click()", e2);
		
		Thread.sleep(4000);
		
		//highlight Sign in
		WebElement e3=driver.findElement(By.linkText("Sign in"));
		driver.executeScript("arguments[0].style.border='solid 16px red'", e3);
		
		Thread.sleep(4000);
		//unhighlight Sign in
		driver.executeScript("arguments[0].style.border='0px'", e3);
		
		}

}

