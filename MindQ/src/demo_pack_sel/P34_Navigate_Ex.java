package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P34_Navigate_Ex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		driver.navigate().back();//move to book my show
		Thread.sleep(5000);
		
		driver.navigate().forward();//move to spicejet
		Thread.sleep(5000);
		
		driver.navigate().refresh();//refresh spicejet
	}

}
