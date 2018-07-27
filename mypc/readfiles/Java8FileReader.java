package readfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * * Java Program to demonstrate how to read a file line by line in Java 8
 */

public class Java8FileReader {

	private final static String path = "C:/Java Dev Workspace/projects/CodingJava/mypc/readfiles/Rough.log";

	public static void main(String args[]) throws IOException {

		// reading a file line by line before Java 8
		FileReader fr = new FileReader(path);
		BufferedReader bufr = new BufferedReader(fr);
		int count = 1;
		String line = bufr.readLine();
		System.out.println("Old way of reading file line by line in Java : ");
		while (line != null) {
			System.out.println(count + " : " + line);
			line = bufr.readLine();
			count++;
		}
		bufr.close();

		System.out.println("Reading file line by line using Files.lines() in Java 8");
		Files.lines(Paths.get(path)).forEach(System.out::println);

		// You can do even better, you can read all lines
		// trim them and filter out all empty lines before printing as shown in following example
		System.out.println("Doing more things than just reading file using Java 8 Streams");
		Files.lines(new File(path).toPath()).map(s -> s.trim()).filter(s -> !s.isEmpty()).forEach(System.out::println);
		
		// You can also filter line using String methods e.g. print only lines which starts with "
		System.out.println("Printing lines which starts with");

		Files.lines(Paths.get(path)).map(s -> s.trim()).filter(s -> s.startsWith("\"")).forEach(System.out::println);
	}
}
