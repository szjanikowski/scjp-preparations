package szymon.scjp.examexample._07;

class SuperFoo {
	SuperFoo doStuff(int x) {
		return new SuperFoo();
	}
}

class Foo extends SuperFoo {
	int doStuff() {return 42;}
	//int doStuff(int x) {return 42;} // wrong return type
	Foo doStuff(int x) {return new Foo(); }
	//Object doStuff(int x) {return new Object(); } // incorrect - return type can't be more general
	//SuperFoo doStuff(int x) {return new Foo(); } // duplicate but correct
}

public class OverridingAndInheritance {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
