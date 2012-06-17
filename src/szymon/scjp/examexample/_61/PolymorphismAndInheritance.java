package szymon.scjp.examexample._61;

class SuperFoo {
	SuperFoo doStuff(int x) {
		return new SuperFoo();
	}
}

class Foo extends SuperFoo {
	Foo doStuff(int x) {
		//return new SuperFoo(); - uncomment to see the problem
		return new Foo();
	}
}

public class PolymorphismAndInheritance {
	

}
