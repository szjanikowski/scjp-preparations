package szymon.scjp.examexample._26;

import java.text.NumberFormat;

public class NumberFormatQuestion {
	public static void main(String[] args) {
		//NumberFormat n = new NumberFormat(); NO SUCH CONSTRUCTOR 
		NumberFormat n = NumberFormat.getInstance(); 
		n.setMaximumFractionDigits(2);
		System.out.println((String) n.format(765.4321));
	}
}
