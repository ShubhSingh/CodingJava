package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	
	public static void main(String[] args) throws Exception {
//		Employee e1 = new Employee(1, "name of emp","secret!");
//		System.out.println("e1 = "+e1);
//		store(e1);
		Employee e2 = retrieve();
		System.out.println("e2 = "+e2);
		//System.out.println("e1 == e2? "+(e1 == e2));

	}

	private static Employee retrieve() throws Exception {
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		return (Employee) ois.readObject();
	}

	private static void store(Employee e1) throws Exception {
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
	}

}
