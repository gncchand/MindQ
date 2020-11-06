package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class P63_SikuliX_find 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https:google.co.in");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Screen s=new Screen();
		Match e=s.find("F:\\Selenium\\Sikuli Screens\\SignIn.PNG");
		e.click();

	}

}
