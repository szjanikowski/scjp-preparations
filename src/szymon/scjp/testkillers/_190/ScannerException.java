package szymon.scjp.testkillers._190;

import java.util.Scanner;

public class ScannerException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String csv = "Sue,5,true,3";
		Scanner scanner = new Scanner( csv ); 
		scanner.useDelimiter(",");
		int age = scanner.nextInt();
		System.out.println(age);

	}

}
