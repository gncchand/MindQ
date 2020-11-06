package demo_pack_sel;

import java.util.Iterator;

import org.sikuli.script.Match;
import org.sikuli.script.Screen;


public class P64_SiquiliX_findAll
{
	public static void main(String[] args) throws Exception 
	{
		Thread.sleep(5000);
		Screen s=new Screen();
		
		//Iterator - import from java.util
		Iterator<Match> l=s.findAll("F:\\Selenium\\Sikuli Screens\\zip_seleniu_zar.PNG");
		
		int i=0;
		
		while (l.hasNext())
		{
			i++;
			l.next();
		}
		
		System.out.print("Total number of items in zip file"+i);	

	}

}
