package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class P58_SikuliX_Click 
{
	public static void main(String[] args) throws SikuliException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		
		driver.manage().window().maximize();
		
		Screen s=new Screen();
		s.click("F:\\Selenium\\Sikuli Screens\\SignIn.PNG");
			}

}
