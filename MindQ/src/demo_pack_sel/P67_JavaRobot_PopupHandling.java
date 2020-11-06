package demo_pack_sel;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P67_JavaRobot_PopupHandling 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		
		driver.manage().window().maximize();
		
		//login to application
		
		driver.findElement(By.name("identifier")).sendKeys("naveengaddipatis");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.name("password")).sendKeys("thisischoudary");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(7000);
		
		//click Compose
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.name("to")).sendKeys("naveengaddipatis@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("JavaRobot Popup Handling");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("wassup??? \n Thanks,\n Naveen");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//*[@class='bAK']/div/div/div/div)[1]")).click();
		
		StringSelection s=new StringSelection("C:\\Users\\tanvi\\JavaRobot_attachment.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//this will copy above path to clip board
		
		Thread.sleep(3000);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);//these 4 keys will paste clipboard content which has file path
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);//it will hit enter and atachment pasted here to mail
		
		Thread.sleep(7000);
		
		//Click on send
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(7000);
		
		//logout
		driver.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]/span")).click();//Click on Icon
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();//click Sign out
		
		driver.close();	

	}

}
