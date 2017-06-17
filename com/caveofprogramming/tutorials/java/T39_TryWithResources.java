package java;
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
	}
	
}

public class T39_TryWithResources {

	public static void main(String[] args) {
		
		// This will automatically close the object.
		try(Temp temp = new Temp()) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
