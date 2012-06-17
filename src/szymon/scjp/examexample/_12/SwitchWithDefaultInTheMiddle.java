package szymon.scjp.examexample._12;

public class SwitchWithDefaultInTheMiddle {
	public static void main (String... args) {
		int x = 7;
		switch (x) {
			case 8: System.out.print("8");
			case 7: System.out.print("7");
			case 6: System.out.print("6");
			default: System.out.print("def");
			case 9: System.out.print("9");
		}
	}

}
