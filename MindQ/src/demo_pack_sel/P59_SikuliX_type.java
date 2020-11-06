package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class P59_SikuliX_type 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Screen s=new Screen();
		s.type("F:\\Selenium\\Sikuli Screens\\Google_Search_Textfield.PNG","Sikuli Examples");

	}

}
