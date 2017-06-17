package t42.innerclasses;

public class T42_InnerClasses {

	public static void main(String[] args) {
		
		Robot robot = new Robot(7);
		robot.start();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}
	
}
