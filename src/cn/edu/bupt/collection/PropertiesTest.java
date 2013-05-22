package cn.edu.bupt.collection;

import java.util.Properties;
import java.util.Set;

public class PropertiesTest
{
	public static void main(String[] args)
	{
		Properties p = System.getProperties();
		
		Set<Object> set = p.keySet();
		
		for (Object key : set)
		{
			Object value = p.get(key);
			System.out.println(key + " = " + value);
		}
	}
}
