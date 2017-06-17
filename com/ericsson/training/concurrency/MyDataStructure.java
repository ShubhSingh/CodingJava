package concurrency;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyDataStructure {
	Object[] contents = new Object[100];
	ReadWriteLock rwLock = new ReentrantReadWriteLock();
	
	public Object read(int index){
		rwLock.readLock().lock();
		try{
			return contents[index];
		}finally{
			rwLock.readLock().unlock();
		}
	}
	
	public void write(int index,Object value){
		rwLock.writeLock().lock();
		try{
		//shift elements to the right of index and then 
		contents[index] = value;
		}finally{
			rwLock.writeLock().unlock();
		}
	}

}
