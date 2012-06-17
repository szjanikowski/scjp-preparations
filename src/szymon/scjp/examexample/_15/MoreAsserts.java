package szymon.scjp.examexample._15;

public class MoreAsserts {
	
	static int x = 5;
	
	public static boolean doStuff(int arg) {
		assert (arg < x++);
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		assert(doStuff(42));
		if(x < 40) ;
		else assert(false);

	}

}
