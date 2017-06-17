package concurrency;

public class ConsumerThread extends Thread {
	
	private Buffer buffer;

	public ConsumerThread(Buffer buffer) {
		super();
		this.buffer = buffer;
	};
	
	@Override
	public void run() {
		for(int i=0;i<25;i++){
			int data = buffer.consume();
			System.out.println("Consumer consumed : "+data);
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
