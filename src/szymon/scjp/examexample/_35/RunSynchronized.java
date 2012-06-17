package szymon.scjp.examexample._35;

public class RunSynchronized implements Runnable {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable n = new RunSynchronized();
		for(int i=0; i<5; i++)
			new Thread(n).start();
		
	
		

	}

	@Override
	public synchronized void run() {
		for(int i=1; i<=5; i++)
			System.out.println("ID: " + Thread.currentThread().getId() + 
					" i: " + i);
		
	}

}
