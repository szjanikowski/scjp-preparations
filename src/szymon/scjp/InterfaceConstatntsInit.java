package szymon.scjp;

class WithStatic {
	public static String initializer() {
		System.out.println("initializing");
		return "INIT_VALUE";
	}
}

interface InterfaceWithConstant {
	String INTERFACE_CONST = WithStatic.initializer();
}

public class InterfaceConstatntsInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("Hello %2$s %1$s %3$10.5f", "Boy", "Little ", 10.0 );
		System.out.println();
		System.out.println("The interface field value is: " + InterfaceWithConstant.INTERFACE_CONST);
		System.out.println("Asking one more time: " + InterfaceWithConstant.INTERFACE_CONST);

	}

}
