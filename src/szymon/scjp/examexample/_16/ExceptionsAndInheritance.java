package szymon.scjp.examexample._16;

public class ExceptionsAndInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.print(new Parser().getInt("42"));
		} catch (Exception e) {
			System.out.println("Exc");
		}

	}

}

class Parser extends Utils {
	int getInt (String arg) {
		return Integer.parseInt(arg);
	}
}

class Utils {
	int getInt (String arg)	throws Exception { return 42; }
}
