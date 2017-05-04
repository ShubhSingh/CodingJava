class CountRunnable implements Runnable {
	public void run() {
		for(int i=1;i<=100;i++) {
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
}