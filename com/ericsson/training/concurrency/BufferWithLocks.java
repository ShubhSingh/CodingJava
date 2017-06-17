package concurrency;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BufferWithLocks {

	private int data;
	volatile boolean available = false;
	
	Lock lock = new ReentrantLock();
	Condition notFull = lock.newCondition();
	Condition notEmpty = lock.newCondition();

	public void produce(int data) {
		lock.lock();
		
		while (available) {
			try {
				notFull.await();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		this.data = data;
		available = true;
		notEmpty.signal();
		lock.unlock();
	}

	public int consume() {
		lock.lock();
		try {
			while (!available) {
				try {
					notEmpty.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			available = false;
			notFull.signal();
			return this.data;
		} finally {
			lock.unlock();
		}
	}

}
