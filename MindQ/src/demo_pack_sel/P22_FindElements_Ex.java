package demo_pack_sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P22_FindElements_Ex 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		List <WebElement> l1=driver.findElements(By.xpath("//*"));
		System.out.println("No of elements in page..."+l1.size());
		
		List <WebElement> l2=driver.findElements(By.xpath("//a"));
		System.out.println("No of links in the page..."+l2.size());

	}
}
