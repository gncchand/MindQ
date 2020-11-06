package demo_pack_sel;

import org.openqa.selenium.edge.EdgeDriver;

public class P06_Launch_Edge
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","F:\\Selenium\\MicrosoftWebDriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Users\\tanvi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.yahoo.co.in");
	}
}
