package szymon.scjp.examexample._02;

import static java.lang.System.out;

import szymon.scjp.examexample._02a.Season;
import static szymon.scjp.examexample._02a.Season.FALL;

enum CoffeSize {
	BIG(200), 
	HUGE(300) {
		public String getCode() {
			return "B";
		}
		
	}, OVERWHELMING(500);

	private int milis;
	
	public String getCode() {
		return "A";
	}
	
	public int getMilis() {
		return milis;
	}
	
	CoffeSize(int newMilis) {
		milis = newMilis;
	}
	
	public String toString() {
		return "Milis: " + this.getMilis() + " Code: " + this.getCode();
	}
}


public class EnumsTricks {

	public static void main(String[] args) {
		CoffeSize size = CoffeSize.BIG;
		out.println("First coffe - " + size);
		size = CoffeSize.HUGE;
		out.println("Next coffe - " + size);
		Season s = FALL;
		out.println("And the season is: " + s);
	}

}
