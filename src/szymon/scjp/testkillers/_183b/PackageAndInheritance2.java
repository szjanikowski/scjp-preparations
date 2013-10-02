package szymon.scjp.testkillers._183b;

public class PackageAndInheritance2 extends szymon.scjp.testkillers._183a.PackageAndInheritance {

	String getText() {
		return "<msg>text2</msg>";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(new PackageAndInheritance2().getText());

	}

}
