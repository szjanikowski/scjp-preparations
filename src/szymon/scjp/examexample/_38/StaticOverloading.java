package szymon.scjp.examexample._38;

class Slug {
	static void crawl() { System.out.print("crawling "); }
}

class BananaSlug extends Slug {
	public static void slugsMain() {
		Slug[] sa = { new Slug(), new BananaSlug() };
		for (Slug s: sa) 
			crawl();
	}
	static void crawl() { System.out.print("shuffling ");}
}

public class StaticOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BananaSlug.slugsMain();
	}

}
