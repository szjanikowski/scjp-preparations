package szymon.scjp.book.ch3;

public class ArraysInitialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String[] a;
		a = new String[10];
		
		//a[1] = (String)(new Integer(10));
		a[0] = new Integer(10).toString();
		a[1] = new Long(10L).toString();
		
		for (String s : a){
			System.out.println(s);
		}
		

	}

}
