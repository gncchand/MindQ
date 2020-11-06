package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P07_Register_User 
{
public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
				
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Naveen");
		driver.findElement(By.name("lastName")).sendKeys("Chand");
		driver.findElement(By.name("phone")).sendKeys("9806369890");
		driver.findElement(By.name("userName")).sendKeys("gnc_kunal@yahoo.com");
		driver.findElement(By.name("address1")).sendKeys("MG Road");
		driver.findElement(By.name("address2")).sendKeys("Koti");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500087");
		
		WebElement e = driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("naveen.gnc");
		driver.findElement(By.name("password")).sendKeys("sel1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("sel1234");
		
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
