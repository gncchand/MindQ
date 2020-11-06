package demo_pack_sel;

public class P81_StaticEx_Runner {

	public static void main(String[] args) {
		P82_StaticEx_Sample.display();
		
		P82_StaticEx_Sample.x=123;
		P82_StaticEx_Sample.y=45.6f;
		
		P82_StaticEx_Sample.display();
		
		P82_StaticEx_Sample obj1=new P82_StaticEx_Sample();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		obj1.x=456;
		obj1.y=78.9f;
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		P82_StaticEx_Sample obj2=new P82_StaticEx_Sample();
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		System.out.println(P82_StaticEx_Sample.x);
		System.out.println(P82_StaticEx_Sample.y);
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		
		
		
		
		
		
		
		

	}

}
