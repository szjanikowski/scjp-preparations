package szymon.scjp.book.ch6_q3;

public class IntegerEqualsAndBoxing {

	/**
	 * From the doc of Integer: 
	 *  Compares this object to the specified object.
	 *  The result is true if and only if the argument is not null and
	 *  is an Integer object that contains the same int value as this object.
	 */
	public static void main(String[] args) {
		String s = "-";
		Integer x = 343;
		long L343 = 343L;
		Long Long343 = 343L;
		if(x.equals(L343)) s += ".e1 ";
		if(x.equals(343)) s += ".e2 ";
		if(x.equals(Long343)) s+= ".e3";
		Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
		if(s1 == 7) s += "=s ";
		if(s1 < new Integer(7+1)) s += "fly ";
		System.out.println(s);

	}

}
