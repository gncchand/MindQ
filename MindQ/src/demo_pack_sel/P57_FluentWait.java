package demo_pack_sel;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class P57_FluentWait
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		
		FluentWait w=new FluentWait(driver);
		
		Duration d1=Duration.of(2, ChronoUnit.SECONDS);
		w.pollingEvery(d1);// this will check success or failure every 2 seconds
		
		//Duration d2=Duration.of(20, ChronoUnit.SECONDS);
		//w.withTimeout(d2);//maximum amount of time to wait for checking condtion
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("naveengaddipatis");

	}

}
