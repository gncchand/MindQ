package demo_pack_sel;

public class P100_For_loop_ex {

	public static void main(String[] args) {
		int x[]=new int[] {10,20,30,40,50};
		
		System.out.println("the data is :\n");
		
		for(int i=0;i<x.length;i++)
		{
			int data=x[i];
			System.out.println(data);
		}
		
		System.out.println("\n");
		
		for(int data:x)
		{
			System.out.println(data);
		}

	}

}
