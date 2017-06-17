package Problem7.v1;

import java.util.TimerTask;

public class TimerTaskToTimedDoorAdapter extends TimerTask{
	
	TimedDoor timedDoor;

	public TimerTaskToTimedDoorAdapter(TimedDoor timedDoor) {
		super();
		this.timedDoor = timedDoor;
	}

	@Override
	public void run() {
		timedDoor.makeSound();
		
	}
	
	

}
