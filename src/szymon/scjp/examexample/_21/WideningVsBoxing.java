package szymon.scjp.examexample._21;

public class WideningVsBoxing {

	void doIt(Float f) {
		System.out.println("Float");
	
	}
	
	void doIt(double d) {
		System.out.println("double");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float f = 3.14f;
		new WideningVsBoxing().doIt(f);
	}

}
