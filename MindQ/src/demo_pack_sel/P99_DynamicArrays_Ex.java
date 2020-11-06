package demo_pack_sel;

import java.util.ArrayList;
import java.util.Scanner;

public class P99_DynamicArrays_Ex {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter data");
		
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextLine());
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a.get(i));
		}
	}

}
