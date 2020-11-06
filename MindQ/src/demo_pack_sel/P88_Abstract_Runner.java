package demo_pack_sel;

public class P88_Abstract_Runner {

	public static void main(String[] args) {
		P86_Abstract_Sample obj1=new P87_Abstract_ImplementedMethods();
		System.out.println(obj1.addition(10, 2));
		System.out.println(obj1.subraction(20, 2));
		System.out.println(obj1.division(16, 4));
		System.out.println(obj1.multiplication(20, 5));
		
		P87_Abstract_ImplementedMethods obj2=new P87_Abstract_ImplementedMethods();
		System.out.println(obj2.addition(10, 30));
		System.out.println(obj2.subraction(20, 10));
		System.out.println(obj2.multiplication(20,20));
		System.out.println(obj2.division(30, 5));
		System.out.println(obj2.modulus(20, 3));
		
	}
}
