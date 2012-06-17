package szymon.scjp.examexample._31;

public class YieldTest implements Runnable{
	static String s = "" ;
	public void run() {
		for (int j = 0; j< 900000000; j++) {
			if((j % 100000000) == 0) {
				//Thread.yield(); - yield has almost no impact in this situation
				s += "2";
			}
		}
	}
	public static void main(String[] args) {
		Thread t = new Thread(new YieldTest()); t.start();
		for (int j = 0; j< 900000000; j++) {
			if((j % 100000000) == 0) {
				s += "1";
			}
		}
		try {t.join();} catch (Exception e) {}
		System.out.println(s);
	}
}
