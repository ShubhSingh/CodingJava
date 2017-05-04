import java.util.*;
import java.io.*;


public class TimerJob extends Thread
{
	
	private Integer interval;
	
	private static boolean isAlive = true;

	public TimerJob (Integer interval)
	{
		this.interval					= interval;		
	}

	public void init()
	{
		
	}
	
    public void run ()
	{
		try {
		
		Writer writer = new BufferedWriter(new OutputStreamWriter(
			new FileOutputStream("OutputFile.txt"), "utf-8"));
		
		System.out.println("Before writing one statement");
		
		writer.write(" Start Yay we are writing in File. ");
		
		System.out.println("After writing one statement");
		while (isAlive) {
		
			//	writer.write(" Yay we are writing in File. ");
		System.out.println("Before Sleep");
		sleep(interval.intValue() * 1000);
		System.out.println("After Sleep");
		}
		}
		catch(Exception e)
		{}
		
	}  

	public void destroy ()
	{
	}

}
