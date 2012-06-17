package szymon.scjp.examexample._40;

public class NonStaticField {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(x + " ");
		new NonStaticField().go(x);
		System.out.println(x);		
	}
	
	private void go(int x) {
		x += 5;
	}
	// remove static to see the problem
	static int x = 7;
}
