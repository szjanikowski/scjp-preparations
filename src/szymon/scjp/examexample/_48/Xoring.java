package szymon.scjp.examexample._48;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Xoring {
	public static void main(String[] args) {
		String s = "";
		int x = 2;
		if((7 > (4*2)) ^(5 != 4)) s += "1st ";
		if((5 < 7) ^(7 > 5)) s += "2nd";
		if(((4 * x++) < 9) ^(x >3)) s += "3rd";
		System.out.println(s);
	}
}

