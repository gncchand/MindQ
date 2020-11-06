package demo_pack_sel;

public class P72_DerivedDatatypes_JavaEx {
	public static void main(String[] args) {
		String x="Testing";
		x="Automation";
		System.out.println("String is.."+x);
		
		int y=x.length();
		System.out.println("lenght is .."+y);
		
		int a[] =new int[4];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		int b=a.length;
		
		for (int i=0;i<b;i++)
		{
			System.out.println(a[i]);
		}
		System.out.print("length of array is ..."+b);
	}
}
