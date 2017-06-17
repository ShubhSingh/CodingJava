package concurrency;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileSearchApp {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("File name : ");
		String fileName = s.nextLine();
		System.out.println("STarting location : ");
		String startingPath = s.nextLine();
		List<File> results = Collections
				.synchronizedList(new ArrayList<File>());
		Queue<File> fileQueue = new ConcurrentLinkedQueue<>();
		File startingFolder = new File(startingPath);
		File[] contents = startingFolder.listFiles();
		fileQueue.addAll(Arrays.asList(contents));

		ExecutorService pool = Executors.newFixedThreadPool(4);
		CountDownLatch latch = new CountDownLatch(4);
		SearchWorker w1 = new SearchWorker(fileName, fileQueue, results,latch);
		SearchWorker w2 = new SearchWorker(fileName, fileQueue, results,latch);
		SearchWorker w3 = new SearchWorker(fileName, fileQueue, results,latch);
		SearchWorker w4 = new SearchWorker(fileName, fileQueue, results,latch);

		pool.execute(w1);
		pool.execute(w2);
		pool.execute(w3);
		pool.execute(w4);

		latch.await();
			System.out.println("Search complete. There were " + results.size()
					+ " matches.");
			for (File aResult : results) {
				System.out.println(aResult.getAbsolutePath());
			}
		pool.shutdown();
	}

}
