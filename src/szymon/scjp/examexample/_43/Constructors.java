package szymon.scjp.examexample._43;

class Cat {
	Cat(int c) {
		System.out.print("cat" + c + " ");
	}
}

class SubCat extends Cat{
	SubCat(int c) {
		super(5);
		System.out.print("cable ");
	}
	
	SubCat() {
		this(4);
	}
}

public class Constructors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubCat sc = new SubCat();

	}

}
