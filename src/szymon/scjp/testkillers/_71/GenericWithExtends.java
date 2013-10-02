package szymon.scjp.testkillers._71;

import java.util.*;
class G1 {
public void takeList(List<? extends String> list) {
//list.add("lala"); //ILLEGAL - adding is forbiden when you use extends
}
}


public class GenericWithExtends {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
