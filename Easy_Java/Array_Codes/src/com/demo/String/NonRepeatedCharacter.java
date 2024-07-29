package com.demo.String;
//import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
public class NonRepeatedCharacter
{
	public static void main(String[] args)
	{
		char c = getfirstNonrepeatedChar("aabbddef");
		System.out.println("Non Repeated Character= "+c);
	}

	private static char getfirstNonrepeatedChar(String str)
	{
		Map<Character , Integer> countMap = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray())
		{
			countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
		}
		
		for (java.util.Map.Entry<Character, Integer> entry : countMap.entrySet())
		{
			if(entry.getValue()==1)
			{
				return entry.getKey();
			}
		}
		throw new RuntimeException("did not find any non repeated character");
	}
	
}
