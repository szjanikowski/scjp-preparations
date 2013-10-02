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

class B {
	public static void b (Integer a1, Integer a2) {
		out.println("Integer,Integer");
	}
	
	//public static void b (long...a) { - INTRODUCES TOTAL AMBIGUITY!!
	//	out.println("0 or more longs");
	//}
	
	public static void b (int... a) {
		out.println("0 or more int");
	}
	
	public static void b (byte... b) {
		out.println("0 or more byte");
	}
}


public class VarargsPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte x = 5;
		short s = 1;
		A.b(x,x);
		int y = 4;
		B.b(y,y,x);
		//B.b(x,x,x); ILLEGAL - java doesn't know which method to call!
		B.b(s,s,s); // UNBELIEVABLE - uses INT method!!

	}

}
