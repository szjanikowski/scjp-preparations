package szymon.scjp.examexample._56;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class HashingFunctionTrick {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put("a", "aa");
		h.put("b", "aa");
		h.put("c", "aa");
		Set ks = h.keySet();
		Object [] ka1 = ks.toArray();
		ks = new TreeSet(ks);
		Object [] ka2 = ks.toArray();
		
		System.out.println("ka1: ");
		for(Object k : ka1) {
			System.out.println(k);
		}
		
		System.out.println("ka2: ");
		for(Object k : ka2) {
			System.out.println(k);
		}
		
		System.out.println(Arrays.equals(ka1, ka2));

	}

}
