package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_Get_Title 
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		String title=driver.getTitle();
		System.out.println("Title of window is..."+title);
		
		Thread.sleep(3000);
		
		String page_src=driver.getPageSource();
		System.out.println("Page Source is ..."+page_src);//This will print Source code
	
		driver.close();
	}

}
