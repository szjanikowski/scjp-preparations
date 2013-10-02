/**
 * 
 */
package szymon.scjp.examexample._51;

import java.util.ArrayList;

/**
 * @author sjanikowski
 *
 */
public class GenericWithExtends {
	
	ArrayList<? extends Beta> l1 = new ArrayList<Gamma>(); ArrayList<? extends Alpha> l2 = l1;

}


class Alpha {}
class Beta extends Alpha {}
class Gamma extends Beta {}