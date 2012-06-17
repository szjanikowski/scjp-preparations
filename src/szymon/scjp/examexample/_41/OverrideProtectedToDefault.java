package szymon.scjp.examexample._41;

class Bird {
	protected void talk() {}
}

class Macaw extends Bird {
	// remove protected to see the problem
	protected void talk() { System.out.print("hello "); }
	
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
