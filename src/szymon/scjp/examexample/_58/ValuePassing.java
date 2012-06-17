package szymon.scjp.examexample._58;

public class ValuePassing {

	void go(int grop) {
		if(++grop > 7) grop++;
		System.out.print(grop);
	}
	
	public static void main(String[] args) {
		int grop = 7;
		new ValuePassing().go(grop);
		System.out.print(grop);

	}

}
