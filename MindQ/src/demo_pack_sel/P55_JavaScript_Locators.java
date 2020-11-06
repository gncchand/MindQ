package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P55_JavaScript_Locators 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//getElementByTagName()[index]
		js.executeScript("document.getElementsByTagName('input')[3].value='Manual'");
		Thread.sleep(4000);
				
		//getElementByName()[index]
		js.executeScript("document.getElementsByName('q')[0].value='Selenium'");
				
		Thread.sleep(4000);
		
		//getElementById
		js.executeScript("document.getElementById('gb_70').click()");
				
		//getElementByClassName()[index]
		js.executeScript("document.getElementsByClassName('whsOnd zHQkBf')[0].value='testscriptdesigner@gmail.com'");
		
		

	}

}
