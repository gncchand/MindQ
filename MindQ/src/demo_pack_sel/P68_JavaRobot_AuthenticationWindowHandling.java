package demo_pack_sel;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class P68_JavaRobot_AuthenticationWindowHandling extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(14000);
			Robot r=new Robot();
			
			StringSelection uid=new StringSelection("testuser");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uid, null);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);//these 4 keys will paste clipboard content which has testuser
			Thread.sleep(3000);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);//these 2 keys will tab to next password field
			Thread.sleep(6000);
			
			StringSelection pwd=new StringSelection("Pass@1234");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);//these 4 keys will paste clipboard content which has password
			Thread.sleep(3000);
			
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);//press tab thrice to move focus to cancel
			Thread.sleep(3000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);	
			
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_F4);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_F4);
		}
		catch(Exception e)
		{
		System.out.print("Exception"+e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		P68_JavaRobot_AuthenticationWindowHandling windw=new P68_JavaRobot_AuthenticationWindowHandling ();
		Thread.sleep(7000);
		windw.start(); //to start this function , please write extends Thread for class
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://eforms.agility.com/");
		driver.close();
	}

}
