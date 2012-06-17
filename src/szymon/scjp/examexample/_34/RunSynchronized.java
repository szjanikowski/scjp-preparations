package szymon.scjp.examexample._34;

public class RunSynchronized implements Runnable {

	private static int i;
	
	public synchronized void run() {  // synchronized here doesn't change anything
		if (i%10 != 0) { i++; };
		for (int x=0; x <1000000 ; x++) {
			  	 if (x % 100000 == 0) i++;	
			if (x == 4) Thread.yield(); 
		}
	}
	

	public static void main(String[] args) {
		RunSynchronized n = new RunSynchronized();
		for (int x =0; x <101; x++) {
			new Thread(n).start();
			System.out.println(i + " ");
		}

	}

}
