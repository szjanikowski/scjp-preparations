package szymon.scjp.examexample._28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAndStuff {

	private static void findMatches(String pattern, String source) {
		System.out.println("Pattern, Matcher");
		System.out.println("\nP: " + pattern + " S: " + source);
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		while (m.find()) {
			System.out.println(m.start() + " " + m.end() + " " + m.group());
		}
	}
	
	private static void useScanner(String pattern, String source) {
		System.out.println("Scanner");
		System.out.println("\nP: " + pattern + " S: " + source);
		try {
			Scanner s = new Scanner(source);
			String token;
			do {
					token = s.findInLine(pattern);
					System.out.println("found " + token);
			} while (token != null);
		} catch (Exception e) {
			System.out.println("Scanner exception");
		}
		
	}
	
	private static void tokenizeWithScanner(String source, String delim) {
		System.out.println("\nTokenize \"" + source + "\" with \"" + delim + "\"");
		
		boolean b2, b;
		int i;
		String s, hits = " ";
		
		Scanner s2 = new Scanner(source);
		s2.useDelimiter(delim);
	
		while(b = s2.hasNext()) {
			if (s2.hasNextInt()) {
				i = s2.nextInt(); hits += "int ";
			} else if (s2.hasNextBoolean()) {
				b2 = s2.nextBoolean(); hits += "boolean ";
			} else {
				s2.next(); hits += "String ";
			}
		}
		System.out.println("hits " + hits);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Characters are not reused by default - NO aba in the middle
		findMatches("aba","abababa");
		
		
		// Quantifiers
		findMatches("proj1([^,])*","proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
	
		findMatches(".*xx","yyxxxyxx"); 	// greedy quantifier
		findMatches(".*?xx","yyxxxyxx"); 	// reluctant quantifier
		
		// Zero-length match!!
		findMatches("a?","aba");
		
		useScanner("\\d\\d","1b2c335f456");
		
		tokenizeWithScanner("1 true 34 hi", "\\s");
	}

}
