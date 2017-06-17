package concurrency;

public class ProducerConsumerDemo2 {

	public static void main(String[] args) {
		BufferWithLocks buffer = new BufferWithLocks();
		ProducerThreadWithLocks p = new ProducerThreadWithLocks(buffer);
		ConsumerThreadWithLocks c = new ConsumerThreadWithLocks(buffer);
		p.start();
		c.start();

	}

}
