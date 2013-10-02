/**
 * 
 */
package szymon.scjp.testkillers._252;

interface DeclareStuff {
	public static final int EASY = 3;
	void doStuff(int t); 
}

/**
 * @author sjanikowski
 *
 */
public class ImplementingAndDefault  implements DeclareStuff { 
	public static void main(String [] args) {
		int x = 5;
	 	new ImplementingAndDefault().doStuff(++x); 
	 }
	public // THAT LINE WAS NOT THERE
	 void doStuff(int s) {
		 s += EASY + ++s;
		 System.out.println("s " + s); 
	}

}
