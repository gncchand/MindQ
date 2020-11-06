package demo_pack_sel;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class P102_PhoneAppTest {

	public static void main(String[] args) throws Exception 
	{
	//enter phone number
		
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter phone number");
		String mbno=scnr.nextLine();
		Thread.sleep(3000);
		//provide desired capabilities
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName", "RZ8M60G4EBX");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("appPackage", "com.samsung.android.dialer");
		dc.setCapability("appActivity", "com.samsung.android.dialer.DialtactsActivity");
		
		
		//start Appium Server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver driver;
		
		while(true)
		{
			try {
				driver=new AndroidDriver(u,dc);
				break;
			}
			catch(Exception ex)
			{
				
			}
		}
		
		//Operate Phone
		
		try {
			for(int i=0;i<mbno.length();i++)
			{
			char d=mbno.charAt(i);
			System.out.print(d);
			driver.findElement(By.xpath("//*[@text='"+d+"']")).click();
			}//for end
			driver.findElement(By.xpath("//*[@content-desc='Call button']")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//*[@content-desc='End call']")).click();
			Thread.sleep(3000);
			//close app
			driver.closeApp();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//stop Appium Server
		Runtime.getRuntime().exec("taskkill /f /im node.exe");
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		
	}//end main

}//end class
