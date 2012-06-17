package szymon.scjp.examexample._30;

import static java.lang.System.out;

class NameRunnable implements Runnable {
	public void run() {
		for(int i = 0; i < 10; i++) {
			out.println(Thread.currentThread().getName() + " is running...");
		}
	}
}


public class ThreadsHell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		startNewThread("Anna");
		startNewThread("Basia");
		startNewThread("Celina");

	}
	
	private static void startNewThread(String name) {
		Runnable r1 = new NameRunnable();
		Thread t1 = new Thread(r1);
		t1.setName(name);
		t1.start();
	}

}
