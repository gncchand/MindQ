package demo_pack_sel;

public class P89_Singleton_Sample {

		public int x;
		
		private P89_Singleton_Sample()
		{
			x=1089;
		}
		
		//static method
		public static P89_Singleton_Sample createObject()
		{
			P89_Singleton_Sample obj=new P89_Singleton_Sample();
			return(obj);
		}
		
		//non static method
		public void display()
		{
		System.out.println(x);
		}
}
