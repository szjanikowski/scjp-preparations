package szymon.scjp.book.ch4;

class SuperFoo {}
class Foo extends SuperFoo {}


public class ArraysAndInstanceof {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ints = {1,2,3,4,};
		long[] longs = {10,20,30,40};
		String[] strings = {"aa","bb","cc",};
		Foo[] foos = {new Foo(), new Foo()};
		SuperFoo[] sfoos = {new SuperFoo(), new Foo()};
		Foo foo = new Foo();
		
		//if (!(strings instanceof int[])) System.out.println("String's array can be compared to int array"); // impossible
		//if(ints instanceof long[]) ; // impossible
		//if(foos instanceof Foo); // illegal
		if (foos instanceof Foo[])
			System.out.println("Foo is always foo");
		
		if (foos instanceof SuperFoo[]); 
			System.out.println("Foo is always foo");
			
		// Instanceof works exactly like assignment assignment to a array of subclass is possible
		// The arrays of primitives have to be exactly the same
		
		
		

	}

}
