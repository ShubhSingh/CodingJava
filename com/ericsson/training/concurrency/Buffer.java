package concurrency;

public class Buffer {
	
	private int data;
	volatile boolean  available = false;

	public synchronized void produce(int data){
		while(available){
			try {
				this.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.data = data;
		available = true;
		this.notifyAll();
	}
	
	public synchronized int consume(){
		while(!available){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;
		this.notifyAll();
		return this.data;
	}
	
	
}
