package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_Relative_Ex
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("testscript.designer");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Selenium@1234");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("testscript.designer@gmail.com");
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Selenium - Dec Weekend Batch");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("Dec 21st - Start Date");
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		
		driver.close();
		driver.quit();
	}

}
