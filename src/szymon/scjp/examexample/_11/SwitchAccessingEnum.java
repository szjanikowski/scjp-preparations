package szymon.scjp.examexample._11;

enum Days { MONDAY, TUESDAY, WEDNESDAY, THURSDAY }

public class SwitchAccessingEnum {

	public static void main (String... args) {
		int x = 0 ;
		Days d = Days.TUESDAY;
		
		// switch integrates with enums !
		// because the d is of the type enum 
		// the switch has automatic access to its values
		switch(d) {
			case MONDAY: x++;
			case TUESDAY: x = x + 10;
			case WEDNESDAY: x = x + 100;
			case THURSDAY: x = x + 1000;
		}
		System.out.println("x=" + x);
	}
}
