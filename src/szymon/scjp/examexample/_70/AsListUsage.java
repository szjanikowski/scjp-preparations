package szymon.scjp.examexample._70;

import java.util.Arrays;
import java.util.List;

public class AsListUsage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] dogs = {"fido", "clover", "gus", "aiko" };
		List dogList = Arrays.asList(dogs);
		
		dogList.add("spot"); // An Exception is thrown! The list returned has FIXED size - its size cannot be changed
		dogs[0] = "fluffy";
		System.out.println(dogList);
		for(String s: dogs) System.out.print(s + ", ");
	}

}
