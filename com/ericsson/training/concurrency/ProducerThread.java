package concurrency;

public class ProducerThread extends Thread {
	
	private Buffer buffer;

	public ProducerThread(Buffer buffer) {
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
