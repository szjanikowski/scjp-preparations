package szymon.scjp.book.ch2;

class Zwierz {
	protected String _imie;
	Zwierz(String imie) {
		_imie = imie;
	}
	public String toString() {
		return _imie;
	}
}

class Kot extends Zwierz {
	Kot(String imie){
		super(imie);
		imie += "Kot";
	}
}
class Ala {
	public String ma(Zwierz a) {
		return(a.toString() + " base");
	}
}

class KoAla extends Ala {
	public String ma(Kot a) {			// THIS IS NOT AN OVERRIDE - the argumetn list has to be EXACTLY the same
										// IT'S AN OVERLOAD
		return(a.toString() + " sub");
	}
}


public class OverridingTricks {


	public static void main(String[] args) {
		Zwierz z2 = new Zwierz("Igor");
		Zwierz z1 = new Kot("Stefan");
		Kot k1 = (Kot)z1;
		
		Ala a1 = new Ala();
		Ala a2 = new KoAla();
		KoAla ka1 = new KoAla();
		
		System.out.println(a1.ma(z1));
		System.out.println(a1.ma(z2));
		System.out.println(a2.ma(z1));
		System.out.println(a2.ma(z2));
		System.out.println(a1.ma(k1));
		System.out.println(a2.ma(k1));
		
		System.out.println(ka1.ma(z1));
		System.out.println(ka1.ma(z2));
		System.out.println(ka1.ma(k1));
	
	
	}

}
