package Problem3.user;

import java.util.ArrayList;
import java.util.List;

import Problem3.decorator.AdditionCountingCollection;

public class DecoratorUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> original = new ArrayList<String>();
		AdditionCountingCollection<String> decorator = new AdditionCountingCollection<String>(original);
		
		decorator.add("one");
		decorator.add("two");
		decorator.add("three");
		System.out.println(decorator.getCount());
		decorator.remove("three");
		System.out.println(decorator.getCount());

	}

}
