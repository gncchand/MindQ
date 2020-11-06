package demo_pack_sel;

public class P00_NestedStaticClassEx 
{		  
	   static class Nested_Demo 
	   {
	      public void my_method() 
	      {
	         System.out.println("This is my nested static class");
		   }
	   }
	   public static void main(String args[])
	   {
	   P00_NestedStaticClassEx.Nested_Demo nested = new P00_NestedStaticClassEx.Nested_Demo();
	    nested.my_method();
	   }
}