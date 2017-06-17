package concurrency;

public class ProducerConsumerDemo1 {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		ProducerThread p = new ProducerThread(buffer);
		ConsumerThread c = new ConsumerThread(buffer);
		p.start();
		c.start();

	}

}
