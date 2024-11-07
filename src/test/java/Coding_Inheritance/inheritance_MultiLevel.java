package Coding_Inheritance;

public class inheritance_MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model m = new model();
		inheritance_MultiLevel im = new inheritance_MultiLevel();
		im.single();
		m.single();
	}
	
	public void single() {
		System.out.println("this is a single method");
		int get  =39;
		String get1 = "happy";
		System.out.println(get+get1);
	}
	
	public void doble() {
		System.out.println("This is a double method");
		int set = 90;
		String set1= "Sad";
		System.out.println(set+set1);
	}
}


class model extends inheritance_MultiLevel{
	
	public void getset() {
		System.out.println("displaying getset method");
		int  a =99;
		int b = 100;
		System.out.println(a==b);
		
	}
	
	
	
}
