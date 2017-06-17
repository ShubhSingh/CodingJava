package collections.Examples;

import java.util.*;

class HashSetDemo 
{
	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		for(String str : args)
		{
			if(!set.add(str))
				System.out.println("Duplicate detected :"+str);
		}
		System.out.println(set.size()+" distinct words :"+ set);
	}
}
