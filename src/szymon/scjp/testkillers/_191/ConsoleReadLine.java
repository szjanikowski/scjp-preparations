/**
 * 
 */
package szymon.scjp.testkillers._191;

import java.io.Console;

/**
 * @author sjanikowski
 *
 */
public class ConsoleReadLine {
	
	public static void main(String[] args) {
		Console c = System.console();
		
		String a = c.readLine("%s ", "name ");
		System.out.println("Input was " + a );
	}

}
