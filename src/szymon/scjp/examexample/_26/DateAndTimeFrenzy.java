package szymon.scjp.examexample._26;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;




public class DateAndTimeFrenzy {

	public static void main(String[] args) {
		simpleGetDateAndTime();
		dateCalculations();
		localCalendar();
		dateFormatDemo();
		dateParsingDemo();
		localDateFormatting();
		numberFormatDemo();
		
		// The real test
		//NumberFormat n = new NumberFormat(); // INCORRECT - only Date and Locale can be accessed by new - the rest has static access
		NumberFormat n = NumberFormat.getInstance();
		n.setMaximumFractionDigits(2);
		System.out.println("\nReal test: " + (String) n.format(756.43221));
		
		
				
	}
	
	private static void simpleGetDateAndTime(){
		System.out.println("\nSimple get date and time:");

		Date d = new Date();
		System.out.println(d.toString());
	}
	
	private static void dateCalculations() {
		System.out.println("\nDate calculations with calendar:");
		
		Calendar c = Calendar.getInstance();
		System.out.println("Current time:     " + c.getTime().toString() );
		c.add(Calendar.DAY_OF_WEEK, -10);
		System.out.println("Add -10 weekdays: " + c.getTime().toString());
	}
	
	private static void localCalendar() {
		System.out.println("\nDate calculations in locale: ");
		Locale[] locales = Calendar.getAvailableLocales();
		System.out.println("Available locales: ");
		for (Locale l : locales) {
			System.out.print("(" + l.getLanguage() + ", " + l.getCountry() + ")");
		}
		System.out.println();
		showTheFirstDayOfWeek(new Locale("fi","FI"));
		showTheFirstDayOfWeek(new Locale("en","US"));
		
			
	}
	
	private static void showTheFirstDayOfWeek(Locale loc) {
		Calendar c = Calendar.getInstance(loc);
		String firstDay = null;
		switch(c.getFirstDayOfWeek()) {
			case (Calendar.MONDAY) : firstDay = "MONDAY"; break;
			case (Calendar.SUNDAY) : firstDay = "SUNDAY"; break;
		}
		Locale locPl = new Locale("pl");
		System.out.println("First day of week in " + loc.getDisplayCountry() + " - " + loc.getDisplayCountry(locPl) + " (" + loc.getLanguage() + "," + loc.getCountry()+") - " + firstDay);
	}
	
	private static void dateFormatDemo() {
		System.out.println("\nDateFormat demo: ");
		Date d1 = new Date();
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for(DateFormat df : dfa)
			System.out.println(df.format(d1));
		
	}
	
	private static void dateParsingDemo() {
		System.out.println("\nDate parsing demo: ");
		
		Date d1 = new Date();
		System.out.println("d1 = " + d1.toString());
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s = df.format(d1);
		System.out.println(s);
		doParse(s,df);
		doParse("FAKE WRONG BAD",df);
		
	}
	
	private static void doParse(String s, DateFormat df) {
		try {
			Date d2 = df.parse(s);
			System.out.println("parsed = " + d2.toString());
		} catch (ParseException pe) {
			System.out.println("!!ParseExceptionThrown!! for " + s); 
		}
	}
	
	private static void localDateFormatting() {
		System.out.println("\nLocal date formatting: ");
		
		Calendar c = Calendar.getInstance();
		c.set(2010, 11, 14); // December 14, 2010
		// (month is 0-based
		Date d2 = c.getTime();
		Locale locIT = new Locale("it", "IT"); // Italy
		Locale locPT = new Locale("pt"); // Portugal
		Locale locBR = new Locale("pt", "BR"); // Brazil
		Locale locIN = new Locale("hi", "IN"); // India
		Locale locJA = new Locale("ja"); // Japan
		DateFormat dfUS = DateFormat.getInstance();
		System.out.println("US " + dfUS.format(d2));
		DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("US full " + dfUSfull.format(d2));
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy " + dfIT.format(d2));
		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
		System.out.println("Portugal " + dfPT.format(d2));
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
		System.out.println("Brazil " + dfBR.format(d2));
		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
		System.out.println("India " + dfIN.format(d2));
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
		System.out.println("Japan " + dfJA.format(d2));
	}
	
	private static void numberFormatDemo() {
		System.out.println("\nNumberFormat demo: ");
		
		float f1 = 123.4567f;
		Locale locFR = new Locale("fr"); // France
		
		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFR);
		for(NumberFormat nf : nfa)
			System.out.println(nf.format(f1));
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Max fraction dig: "  + nf.getMaximumFractionDigits() + " ");
		System.out.println(nf.format(f1) + " ");
		
		System.out.println("Changing max fr. digit to 5");
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(f1) + " ");
		try {
			System.out.println(nf.parse("1234.567"));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse("1234.567"));
			System.out.println(nf.parse("Bad boy"));
		} catch (ParseException pe) {
			System.out.println("!!Parse Exception!!");
		}
	}
	
}

