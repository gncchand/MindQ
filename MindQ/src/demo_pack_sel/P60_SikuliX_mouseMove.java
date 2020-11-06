package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class P60_SikuliX_mouseMove 
{
	public static void main(String arr[]) throws SikuliException
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://google.com");
	
	driver.manage().window().maximize();
	Screen s=new Screen();
	
	s.mouseMove("F:\\Selenium\\Sikuli Screens\\mic.PNG");
	}
}
