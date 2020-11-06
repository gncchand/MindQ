package demo_pack_sel;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class P05_Launch_Opera 
{
public static void main(String args[])
{
	System.setProperty("webdriver.opera.driver","F:\\Selenium\\operadriver_win64\\operadriver_win64\\operadriver.exe");
	
	OperaOptions oo = new OperaOptions();
	oo.setBinary("C:\\Users\\tanvi\\AppData\\Local\\Programs\\Opera\\65.0.3467.78\\opera.exe");
	OperaDriver driver= new OperaDriver(oo);
	
	driver.get("https://www.gmail.com");
	
}
}
