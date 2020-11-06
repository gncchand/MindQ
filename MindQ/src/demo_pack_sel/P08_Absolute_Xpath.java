package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_Absolute_Xpath
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div/input")).sendKeys("9898989899");
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}

}
