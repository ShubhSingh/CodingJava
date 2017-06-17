package concurrency;

public class ConsumerThreadWithLocks extends Thread {
	
	private BufferWithLocks buffer;

	public ConsumerThreadWithLocks(BufferWithLocks buffer) {
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
