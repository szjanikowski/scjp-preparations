package szymon.scjp;

import static java.lang.System.out;	

class A {
	public static void b (int a1, int a2) {
		out.println("int,int");
	}
	
	public static void b (byte... a) {
		out.println("0 or more byte");
	}
}

class  B extends A{
	public static void b (Integer a1, Integer a2) {
		out.println("Integer,Integer");
	}
	
	public static void b (int... a) {
		out.println("0 or more int");
	}
}


public class VarargsPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte x = 5;
		A.b(x,x);
		int y = 4;
		B.b(y,y);

	}

}
