package szymon.scjp.examexample._34;

public class RunSynchronized implements Runnable {

	private static int i;
	
	public synchronized void run() {  // synchronized makes the threads goes one by one -
									  // However it doesn't affect when the main accesses i
		if (i%10 != 0) { i++; };
		for (int x=0; x <10 ; x++, i++) {	
			if (x == 4) Thread.yield(); 
			//System.out.println(Thread.currentThread().getId() + " " + i);
		}
	}
	

	public static void main(String[] args) {
		RunSynchronized n = new RunSynchronized();
		for (int x =0; x <101; x++) {
			Thread t = new Thread(n); 
			t.start();
			System.out.println(i + " ");
		}
		

	}

}
