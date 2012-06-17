package szymon.scjp.examexample._05;

class Buckets {
	static void go (int[] a, int[]... b) {
		System.out.println(a[1] + " ");
	}
}

public class ArraysVarargsConversion {

	public static void main(String... args) {
		int[] x = {1,2,3};
		int[] y = {4,5,6};
		int[] z = {7,8,9};
		
		Buckets.go(x,y,z);
		Buckets.go(y, z);
		Buckets.go(z);
	}
}
