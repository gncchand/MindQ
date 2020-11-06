package demo_pack_sel;

import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Launch_chrome
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in");
	}
}