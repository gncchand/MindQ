package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P27_Alert_Ex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		String x=driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		System.out.print("alert text is..."+x);
		driver.close();

	}
}
