package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.Screen;

public class P65_SiquiliX_KeyBoardOperations 
{

	public static void main(String[] args) throws Exception 
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.co.in");
			
			Thread.sleep(4000);
			
			Screen s=new Screen();
			
			s.keyDown(Keys.ALT);
			s.keyDown(Keys.F4);
			s.keyUp(Keys.ALT);
			s.keyUp(Keys.F4);
	}

}
