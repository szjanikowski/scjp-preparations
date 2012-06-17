package szymon.scjp.examexample._10;

public class EvaluatingExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		short z = 42; 
		
		if ((z++ == 42) && (y = true)) z++;
		if ((x = false) || (++z == 45)) z++;
		
		System.out.println("z = " + z);

	}

}
