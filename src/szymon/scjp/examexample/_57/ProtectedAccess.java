package szymon.scjp.examexample._57;

class X {
	protected static void doX() {
		
	}
}


public class ProtectedAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		X myX = new X();
		myX.doX(); // package access is not changed by the protected modifier

	}

}
