package concurrency;

import java.io.File;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;

public class SearchWorker implements Runnable {
	
	String fileName;
	Queue<File> fileQueue;
	List<File> results;
	CountDownLatch latch;
	public SearchWorker(String fileName, Queue<File> fileQueue,
			List<File> results,CountDownLatch latch) {
		this.fileName = fileName;
		this.fileQueue = fileQueue;
		this.results = results;
		this.latch = latch;
	}
	
	@Override
	public void run() {
		while(true){
			File aFileOrFolder = fileQueue.poll();
			if(aFileOrFolder == null){
				break;
			}
			if(aFileOrFolder.isFile() && aFileOrFolder.getName().equalsIgnoreCase(fileName)){
				results.add(aFileOrFolder);
			}else if(aFileOrFolder.isDirectory() && aFileOrFolder.canRead()){
				File[] contents = aFileOrFolder.listFiles();
				if(contents != null){
					for(File f : contents){
						fileQueue.add(f);
					}
				}
			}
		}
		latch.countDown();
	}

}
