package main.java;
class CountRunnable implements Runnable {
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.print(i + " ");
			if(i%10==0)
			System.out.println();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {}
		}
	}
}
public class CountingThread {
	public static void main(String[] args) {
		CountRunnable r = new CountRunnable();
		Thread t = new Thread(r);
		t.start();
	}
	/*  Output is:
		1 2 3 4 5 6 7 8 9 10 
		11 12 13 14 15 16 17 18 19 20 
		21 22 23 24 25 26 27 28 29 30
	*/ 
}