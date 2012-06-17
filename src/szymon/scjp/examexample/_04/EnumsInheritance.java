package szymon.scjp.examexample._04;

enum Animals {
	DOG,
	BIRD {public int getLegs() {return 2; } }, 
	HORSE;
	public int getLegs() { return 4; }
}

public class EnumsInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Animals.DOG.getLegs() + " " + Animals.BIRD.getLegs());

	}

}
