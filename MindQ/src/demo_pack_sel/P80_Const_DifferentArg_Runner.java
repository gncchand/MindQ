package demo_pack_sel;

public class P80_Const_DifferentArg_Runner {

	public static void main(String[] args) {
		P79_Const_DifferentArg_Sample obj1=new P79_Const_DifferentArg_Sample(1000,'$');
		P79_Const_DifferentArg_Sample obj2=new P79_Const_DifferentArg_Sample(2000,"Kunal");
		P79_Const_DifferentArg_Sample obj3=new P79_Const_DifferentArg_Sample(3000,'@',"Subbu");
		obj1.display();
		obj2.display();
		obj3.display();
	}}
