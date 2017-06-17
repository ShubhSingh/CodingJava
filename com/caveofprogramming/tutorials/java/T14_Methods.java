package java;

class NewPerson {
	
	//Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	
	//1. Data
	//2. Subroutines (methods)
	
	void speak() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
	
	void sayHello() {
		System.out.println("Hello!");
	}
}


public class T14_Methods {
	public static void main(String[] args) {

		NewPerson person1 = new NewPerson();
		
		person1.name = "Elena Garrone";
		person1.age = 26;
		person1.speak();
		person1.sayHello();
		
		NewPerson person2 = new NewPerson();
		
		person2.name = "Peter Juhasz";
		person2.age = 32;
		person2.speak();
		person2.sayHello();
		
	}
}
