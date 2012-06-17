package szymon.scjp.examexample._09;

class Tack {
	static short s = 17;
	public Tack(short ss) {
		System.out.println("Param constructor runs!");
		new Tack();
		s *= ss;
	}
	public Tack() { 
		System.out.println("No param constructor runs!"); }
}

class Bridle extends Tack {
	public Bridle (int a) { super((short)a); System.out.println(s+1); }
}


public class InheritanceStaticNamesCovering {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bridle b = new Bridle(3);

	}

}
