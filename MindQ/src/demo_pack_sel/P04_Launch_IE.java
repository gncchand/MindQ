package demo_pack_sel;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class P04_Launch_IE {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver","F:\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		InternetExplorerDriver ie= new InternetExplorerDriver();
		ie.get("https://yahoomail.com");
	}
}
