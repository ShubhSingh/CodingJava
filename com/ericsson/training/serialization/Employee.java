package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String password;
	int count;
	public Employee() {
		
	}

	public Employee(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password="
				+ password + ", count=" + count + "]";
	}

	private void writeObject(ObjectOutputStream oos)throws IOException{
		String temp = this.password;
		this.password = this.password+";"+this.password;
		oos.defaultWriteObject();
		this.password = temp;
	}
	private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
		ois.defaultReadObject();
		this.password = this.password.split(";")[0];
	}
	

}
