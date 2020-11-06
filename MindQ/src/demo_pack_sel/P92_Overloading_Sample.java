package demo_pack_sel;

public class P92_Overloading_Sample
{

		public int x;
		public int y;
		
		public int add()
		{
			x=10;
			y=20;
			
			int z;
			z=x+y;
			return(z);
		}
		public int add(int a)
		{
			x=a;
			y=30;
			int z;
			z=x+y;
			return(z);
		}
		public int add(int a,int b)
		{
			x=a;
			y=b;
			int z=a+b;
			return(z);
		}
		public int add(int a,float b)
		{
			x=a;
			y=(int)b;
			int z=x+y;
			return(z);		
		}
}
