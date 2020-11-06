package demo_pack_sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P53_Scroll_using_JavaScript 
{
	public static void main(String[] args) throws Exception 
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://semantic-ui.com/modules/dropdown.html");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(4000);
			
			//scroll from top to bottom
			driver.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(4000);
			
			//scroll from bottom to top
			driver.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			
			Thread.sleep(4000);
			WebElement e=driver.findElement(By.xpath("(//*[text()='Save'])[1]"));
			driver.executeScript("arguments[0].scrollIntoView()",e);
	}

}
