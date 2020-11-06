package demo_pack_sel;

import org.openqa.selenium.firefox.FirefoxDriver;

public class P03_Launch_FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		

	}

}
