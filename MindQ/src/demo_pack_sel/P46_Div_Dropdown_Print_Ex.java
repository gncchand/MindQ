package demo_pack_sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P46_Div_Dropdown_Print_Ex 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List <WebElement> l=driver.findElements(By.xpath("(//*[@class='ui selection dropdown'])[1]/div[2]/div"));
		
		driver.findElement(By.xpath("//*[@class='ui selection dropdown']")).click();;
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println("Item no "+i+" "+l.get(i).getText());			
		}

	}

}
