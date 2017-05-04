class Mosey implements Runnable {
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print(Thread.currentThread().getId() + "-" + i + " ");
		}
	}
	
}
public class Stroll {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Mosey());
		//t1.setPriority(9);
		//new Mosey().run();
		//t1.start();
		t1.setPriority(8);
		t1.start();
		new Mosey().run();
	}
}