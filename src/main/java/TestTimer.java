package main.java;

	public class TestTimer
	{
	
	public static void main (String[] args){
	try
		{
			String interval = "1";

			TimerJob timerJob = new TimerJob(new Integer(interval));
			timerJob.init();
			timerJob.start();
		}
		catch (Exception e)
		{
		}
	}
	}