package demo_pack_sel;

public class P93_Overloading_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P92_Overloading_Sample obj=new P92_Overloading_Sample();
		System.out.println(obj.add());//30
		System.out.println(obj.add(500));//530
		System.out.println(obj.add(200, 300.9f));//500
		System.out.println(obj.add(55, 500));//555
	}

}
