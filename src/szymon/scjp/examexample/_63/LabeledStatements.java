package szymon.scjp.examexample._63;

public class LabeledStatements {

	public static void main(String[] args) {
		def:
			for(short s =1; s< 7; s++) {
				if (s == 5) break def;
				if (s == 2) continue;
				System.out.print(s + ".");
			}

	}
}
