package demo_pack_sel;

public class P85_Interface_Runner {
	public static void main(String[] args) {
		 P83_InterfaceEx_Sample obj1=new  P84_Implement_Sample();
		 int result1=obj1.addition(40, 2);
		 System.out.println(result1);
		 
		 P84_Implement_Sample obj2=new P84_Implement_Sample();
		 int result2=obj2.addition(80, 4);
		 System.out.println(result2);
	}
 }
