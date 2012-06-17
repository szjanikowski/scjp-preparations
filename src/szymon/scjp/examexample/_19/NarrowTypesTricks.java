package szymon.scjp.examexample._19;

public class NarrowTypesTricks {

	static Short s1, s2, s3;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x ;
		s1 = 4; 		// Legal
		//s2 = 4 + 4;	// Legal
		//s1++;			// Legal
		//s3 = ++s2;	// Legal
		//s1 += 4;		// Legal - Paradoxaly += handles types automatically0
		//s3 = s1 % 2		// Illegal - % operator also results in an int
		//s1 = s1 + 4; 	// Illegal summing with a variable involved always results in an int
		//s3 = s1 + s2; // Illegal - even adding two shorts results in an int
		x = s1 + s2;	// Legal
		System.out.print(x);
	}

}
