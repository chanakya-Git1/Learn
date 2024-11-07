package Coding_Inheritance;

public class inheritance_Single {
	public int v= 90;
	public void start() {
		System.out.println("Car has started");
	}
	
	public void stop() {
		System.out.println("Car has stopped");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub

		doubt db = new doubt();
		db.start();
		System.out.println(db.v);
	}
}


	class doubt extends inheritance_Single{
	public void engine() {
	System.out.println("This is the main engine");
	}


		
}