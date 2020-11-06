package demo_pack_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P23_Location_Ex
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.name("q"));
		
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		int width=e.getSize().getWidth();
		int height=e.getSize().getHeight();
		
		System.out.println("Text field Cordinates are : \n X cordinates - "+x+"\n Y Cordinates - "+y+"\nDimensions of text field are :\n Width of field - "+width+"\n Height of field - "+height);
		}
}
