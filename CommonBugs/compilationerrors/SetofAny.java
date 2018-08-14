package compilationerrors;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetofAny {

	void message() {

		Set setOfRawType = new HashSet<String>();
		setOfRawType = new HashSet<Integer>();
		
		Set<Object> setOfAnyType = new HashSet<Object>();
		setOfAnyType.add("abc");					//legal
		setOfAnyType.add(new Float(3.0f)); 			//legal
		Set<Object> set = new HashSet<String>()		// Illegal
				
		Set<?> setOfUnknownType = new LinkedHashSet<String>();
		setOfUnknownType = new LinkedHashSet<Integer>();
		
		

	}
}
