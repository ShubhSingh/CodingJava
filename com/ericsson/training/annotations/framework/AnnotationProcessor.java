package annotations.framework;

import java.util.Scanner;

public class AnnotationProcessor {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter class to be analyzed : ");
		String className = s.nextLine();
		Class c = Class.forName(className);
		Entity entityAnnotation = (Entity) c.getAnnotation(Entity.class);
		if(entityAnnotation == null){
			System.out.println(className+" is not mapped to anything!!");
		}else{
			System.out.println(className+" is mapped to "+entityAnnotation.table());
		}

	}

}
