package demo_pack_sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class P32_ScreenshotEx 
{
	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("ticket.jpg");
		
		FileHandler.copy(src,dest);
						
	}

}
