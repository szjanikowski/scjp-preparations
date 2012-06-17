package szymon.scjp.examexample._29;

import java.util.Scanner;

public class FormatAndPrintf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i1 = -123;
		int i2 = 12345;
		System.out.printf(">%1$-(+7d< \n", i1);
		System.out.printf(">%0,10d< \n", i2);
		System.out.format(">%+-7d< \n", i2);
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
		
		String s = " x,yy,123";
		Scanner sc = new Scanner(s);
		while ( sc.hasNext()) {
			System.out.print(sc.next() + " ");
		}
	}

}
