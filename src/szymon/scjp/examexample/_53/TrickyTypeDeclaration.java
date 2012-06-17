package szymon.scjp.examexample._53;

class Alpha {}
class Beta extends Alpha {}
class Marjoram {
	<A extends Alpha> Alpha go(int i) {
		if (i == 1) return new Alpha();
		else return new Beta();
	}
}

public class TrickyTypeDeclaration {
	public static void main(String[] args) {
		Marjoram g = new Marjoram();
		g.go(1);
	}

}
