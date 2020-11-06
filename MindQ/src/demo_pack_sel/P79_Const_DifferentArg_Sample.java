package demo_pack_sel;

public class P79_Const_DifferentArg_Sample {
	public int x;
	public float y;
	public char z;
	public boolean w;
	public String s;
	
	public P79_Const_DifferentArg_Sample(int a, char b)
	{
		x=a;
		z=b;
	}
	
	public P79_Const_DifferentArg_Sample(int a, String b)
	{
		x=a;
		s=b;
	}
	
	public P79_Const_DifferentArg_Sample(int a, char b, String c)
	{
		x=a;
		z=b;
		s=c;
	}
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		System.out.println(s);
	}
}
