package demo_pack_sel;

public class P87_Abstract_ImplementedMethods extends P86_Abstract_Sample
{
	//implementation of unimplemeted methods
	
	public int subraction(int x,int y)
	{
		int z;
		z=x-y;
		return(z);
	}
	public int multiplication(int x,int y)
	{
		int z;
		z=x*y;
		return(z);
	}
	public int division(int x,int y)
	{
		int z;
		z=x/y;
		return(z);
	}
	
	//new method of this class
	public int modulus(int x,int y)
	{
		int z;
		z=x%y;
		return(z);
	}
}
