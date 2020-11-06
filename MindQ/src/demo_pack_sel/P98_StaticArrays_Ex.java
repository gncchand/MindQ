package demo_pack_sel;

import java.util.Scanner;

public class P98_StaticArrays_Ex {

	public static void main(String[] args) {
		String x[]=new String[4];
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter the data and press enter");
		
		for(int i=0;i<4;i++)
		{
			x[i]=sc.nextLine();
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(x[i]);
		}
		sc.close();
	}

}
