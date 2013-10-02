package szymon.scjp.examexample._42;

class Gadget {
	Gadget openStuff() { s = s + "g "; return this;}
	static String s = "";
	int a;
}


class Opener extends Gadget {
	static String s ="cos";
	int a = 5;
	Opener openStuff() {
		s = s + "o "; return this;
	}
}

public class StaticAndPolimorphysm {
	public static void main(String[] args) {
		Gadget g1 = new Gadget();
		Gadget g2 = new Opener();
		g1.openStuff();
		g2.openStuff();
		System.out.println(Gadget.s);
		System.out.println(Opener.s);
	}
	
}
