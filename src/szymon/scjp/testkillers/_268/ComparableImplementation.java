/**
 * 
 */
package szymon.scjp.testkillers._268;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sjanikowski
 *
 */
public class ComparableImplementation implements Comparable{

	private int i; 
	
	public int getI() {
		return i;
	}

	public ComparableImplementation(int i) {
		super();
		this.i = i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<ComparableImplementation> list = new ArrayList<ComparableImplementation>();
		list.add(new ComparableImplementation(1));
		list.add(new ComparableImplementation(2));
		Collections.sort(list);
		System.out.println(list);
	}

	@Override
	public int compareTo(Object arg0) {
		ComparableImplementation c = (ComparableImplementation)arg0;
		return i - c.i;
	}
	
	@Override
	public String toString() {
		return Integer.toString(i);
	}

}
