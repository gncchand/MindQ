package demo_pack_sel;

public abstract class P86_Abstract_Sample {

	//implemented method
		public int addition(int x,int y)
		{
			int z;
			z=x+y;
			return(z);
		}
		
	// unimplemented methods
		public abstract int subraction(int x,int y);
		public abstract int multiplication(int x, int y);
		public abstract int division(int x,int y);
}