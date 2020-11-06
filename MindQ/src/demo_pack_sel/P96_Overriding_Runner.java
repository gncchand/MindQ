package demo_pack_sel;

public class P96_Overriding_Runner {

	public static void main(String[] args) {
		P94_Overriding_Parent obj=new P95_Overriding_Child();
		obj.display();
		
		P95_Overriding_Child obj2=new P95_Overriding_Child();
		obj2.display();

	}

}
