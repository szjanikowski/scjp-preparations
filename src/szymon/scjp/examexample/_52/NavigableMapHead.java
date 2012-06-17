package szymon.scjp.examexample._52;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapHead {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
		myMap.put("ak", 50); myMap.put("co", 50);
		myMap.put("ca", 50); myMap.put("ar", 50);
		NavigableMap<String,Integer> myMap2 = myMap.headMap("d",true);
		myMap.put("fl", 90); //change to myMap2 to see an interesting exception
		myMap2.put("al", 110);
		System.out.println(myMap.size() + " " + myMap2.size());
	}

}
