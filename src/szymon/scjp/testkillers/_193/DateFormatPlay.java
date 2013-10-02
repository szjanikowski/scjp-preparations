package szymon.scjp.testkillers._193;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = new Date();
		
		DateFormat df = DateFormat.getDateInstance();
		String ds = df.format(d);
		System.out.println(ds);
		try {
			d = df.parse(ds);
		} catch (ParseException p) {
			System.out.println("failed");
		}
		d.setTime(d.getTime() + 1000 * 60 * 60 * 24);
		System.out.println(d);
		
		

	}

}
