package Problem7.v1;

import java.util.Date;
import java.util.*;

public class TimedDoor extends Door {
	
	
	
	public TimedDoor(){
		Timer t = new Timer();
		
		t.schedule(new TimerTaskToTimedDoorAdapter(this), new Date(), 100);
	}
	
	public void makeSound(){
		while(isOpen())
			java.awt.Toolkit.getDefaultToolkit().beep();
	}
	

}
