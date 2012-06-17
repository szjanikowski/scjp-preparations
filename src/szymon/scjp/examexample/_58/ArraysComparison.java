package szymon.scjp.examexample._58;

import java.util.Arrays;

public class ArraysComparison {
	static String[] wow = { "Bamm", "Biff" };
	public static void main(String[] args) {
		if (Arrays.equals(wow, args))
			System.out.println("Equals works");
		if (wow != args) 
			System.out.println("Reference doesn't, of course");
	}

}
