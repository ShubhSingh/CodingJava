package concurrency;

public class ProducerThreadWithLocks extends Thread {
	
	private BufferWithLocks buffer;

	public ProducerThreadWithLocks(BufferWithLocks buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i=0;i<25;i++){
			buffer.produce(i);
			System.out.println("Producer produced : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
