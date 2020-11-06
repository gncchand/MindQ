package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class P62_SikuliX_righClick
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		Screen s=new Screen();
		s.rightClick("F:\\Selenium\\Sikuli Screens\\Google_Image.PNG");
	}
}
