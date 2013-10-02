package szymon.scjp.examexample._41;

class Bird {
	String s = "A";
	protected void talk() {System.out.println("hello1 " + s); }
}

class Macaw extends Bird {
	String s = "B";
	// remove protected to see the problem
	//protected void talk() { System.out.println("hello2 " + s); }
	
}

public class OverrideProtectedToDefault {

	/**
	 * @param args
	 */
	public static void main (String [] args ) {
		Bird [] birds = { new Bird(), new Macaw() };
		for( Bird b : birds)
			b.talk();
	}
}
