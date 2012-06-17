package szymon.scjp.examexample._35;

public class DeadLock {
	public static void main(String[] args) {
	Runnable bad = new Lock();
		
		new Thread(bad).start();
		new Thread(bad).start();
	}
}

class Lock implements Runnable {

	boolean flag = false;
	public synchronized void run() {
		if(flag) {
			flag = false;
			System.out.print("1 ");
			try {this.wait();} 		// locks here - waits endlessly for another thread of the same time 
			catch(Exception e){}	// to call notify. That doesn't happen casue run is synchronized;
			System.out.print("2 ");
		} else {
			flag = true;
			System.out.print("3 ");
			try { Thread.sleep(1000); } catch(Exception e) {}
			System.out.print("4 ");
			notify();
		}
	}
}

