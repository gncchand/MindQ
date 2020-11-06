package demo_pack_sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P54_Get_Invisible_Items_JavaScript 
{
	public static void main(String[] args) throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List <WebElement> l=driver.findElements(By.xpath("//*[@class='ui search dropdown selection']/div/div"));
		
		for(int i=0;i<l.size();i++)
		{
			driver.executeScript("var x=arguments[0].textContent;window.alert(x)",l.get(i));
			String y=driver.switchTo().alert().getText();
			System.out.println("Element"+i+" is : "+y);
			//Thread.sleep(4000);
			driver.switchTo().alert().dismiss();
		}
	}

}
