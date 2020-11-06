package demo_pack_sel;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class P11_CrossBrowser_Launch_from_Kybrd 
{

	public static void main(String[] args)
	{
		System.out.println("Enter Browser name....");
		Scanner scn=new Scanner(System.in);
		String x=scn.nextLine();
		
		WebDriver driver=null;
		
		if(x.equals("Chrome"))
		{
			//Launch Chrome
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("Launching <"+x+">...");
		}
		else if(x.equals("Firefox"))
		{//Launch Firefox
			System.setProperty("webdriver.gecko.driver","F:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Launching <"+x+">...");
			
		}
		else if(x.equals("IE"))
		{//Launch Internet Explorer
			System.setProperty("webdriver.ie.driver","F:\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			System.out.println("Launching <"+x+">...");
		}
		else if(x.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","F:\\Selenium\\MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
			System.out.println("Launching <"+x+">...");
		}
		else if(x.equals("Opera"))
		{
			OperaOptions oo=new OperaOptions();
			oo.setBinary("C:\\Users\\tanvi\\AppData\\Local\\Programs\\Opera\\65.0.3467.78\\opera.exe");
			System.setProperty("webdriver.opera.driver","F:\\Selenium\\operadriver_win64\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver(oo);
			System.out.println("Launching <"+x+">...");
		}
		else
		{
			System.out.println("Invalid Browser Name...");
			System.exit(0);
		}
		driver.get("https://www.google.co.in");
		scn.close();
	}//end of main
}//end of class
