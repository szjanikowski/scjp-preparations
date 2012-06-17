package szymon.scjp.book.ch4;

class MyRuntimeException extends RuntimeException {}

public class ExceptionsTricks {

	
	int doStuff() {
		if("00" == "AA")
			throw new MyRuntimeException();
		return 0;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
