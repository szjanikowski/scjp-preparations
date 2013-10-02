package szymon.scjp;

interface X {}

class Y implements X {} 

interface SuperInterface {
	X doSomething();
}

abstract class ImplementingAbstractClass implements SuperInterface{
	Integer a;
	public abstract Y doSomething();
}


final class  ExtendingFinalClass extends ImplementingAbstractClass implements SuperInterface {
	String a;
	@Override
	public Y doSomething() {
		// TODO Auto-generated method stub
		int x = super.a + 10;
		return null;
	}
	
}

public class InheritanceRedefiningAndCovariantReturns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
