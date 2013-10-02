package szymon.scjp.testkillers._77;

import java.util.Arrays;

/**
 * @author sjanikowski
 *
 */
public class TreeMapSubMap {

	public static void main(String[] args) {
		String[] colors = {"blue", "red", "green", "yellow", "orange"}; 
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violet");
		System.out.println(s2 + " " + s3);
		Object ob = new Object();
	}
}

