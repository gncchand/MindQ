package demo_pack_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_GetCurrentURL 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.in");
	
	String g_cu=driver.getCurrentUrl();
	
	if(g_cu.contains("https"))
	{
		System.out.println("It is a secured site...");
	}
	else
	{
		System.out.println("not a secured site...");
	}

	}

}
