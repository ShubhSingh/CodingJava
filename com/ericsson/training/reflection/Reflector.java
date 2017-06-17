package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Reflector {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Class name: ");
		String className = s.nextLine();
		Class clazz = Class.forName(className);
		int mod = clazz.getModifiers();
		printMods(mod);
		System.out.print(" class ");
		System.out.print(clazz.getSimpleName()+"{\n");
		Field[] fields  = clazz.getDeclaredFields();
		for(Field f : fields){
			printMods(f.getModifiers());
			Class fieldType = f.getType();
			System.out.print(fieldType.getSimpleName()+" "+f.getName()+";\n");
		}
		Constructor[] cons  = clazz.getDeclaredConstructors();
		for(Constructor c : cons){
			System.out.println(c);
		}
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m  : methods){
			
			System.out.println(m);
		}
		System.out.println("}");
		Object o = clazz.newInstance();
		System.out.println("Object = "+o);
		Method ts = clazz.getMethod("toString", new Class[0]);
		
		Object ret = ts.invoke(o, new Object[0]);
		System.out.println("return = "+ret);
	}

	private static void printMods(int modifiers) {
		if(Modifier.isStatic(modifiers)){
			System.out.print(" static ");
		}
		if(Modifier.isPublic(modifiers)){
			System.out.print(" public ");
		}
		if(Modifier.isPrivate(modifiers)){
			System.out.print(" private ");
		}
		if(Modifier.isFinal(modifiers)){
			System.out.print(" final ");
		}
		if(Modifier.isProtected(modifiers)){
			System.out.print(" protected ");
		}
		
	}

}
