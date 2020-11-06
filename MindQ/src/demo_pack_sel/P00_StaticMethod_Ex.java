package demo_pack_sel;

public class P00_StaticMethod_Ex
{
	static int i = 10;
	static String s = "Beginnersbook";
    // This is a static method
    static void myMethod()
    {
    	  System.out.println("i:"+i);
    	  System.out.println("s:"+s);
    }
    void funcn()
    {
        //Static method called in non-static method
    	myMethod();
    }
 
    public static void main(String[] args)
    {
       	   //You need to have object to call this non-static method
           P00_StaticMethod_Ex obj=new P00_StaticMethod_Ex();
           obj.funcn();
           // we are calling this method without creating any object
           myMethod();
    }
}