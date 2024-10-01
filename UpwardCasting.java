package module5;

public class UpwardCasting {

	public static void main(String[] args) {
		int a=100;
		double d=a;
		System.out.println(d);//implicit automatic
		//upwardcasting
		
		double d1=66.99;
		int i = (int)d1;
		System.out.println(i);//explicit
		//downwardcasting
	}

}
