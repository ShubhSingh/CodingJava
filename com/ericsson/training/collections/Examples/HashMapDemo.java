package collections.Examples;

import java.util.*;

class HashMapDemo 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String str : args)
		{
			Integer i = str.length();
			map.put(str , i);
		}
		System.out.println(map.size()+" distinct words");
		System.out.println(map);
	}
}
