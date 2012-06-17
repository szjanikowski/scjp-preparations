package szymon.scjp.examexample._08;


class FWD {
	int doMud(int x) { return 1; } // this one is chosen cause it's inherited and the constant (7) is always int in the first place
}

class Subaru extends FWD {
	 int doMud(int... y) { return 2; }
	 int doMud(long z) { return 3; }
}

public class WideningVarargsInheritance {	

	
	public static void main(String[] args) {
		FWD f = new Subaru() ;
		System.out.println(f.doMud(7));

	}

}
