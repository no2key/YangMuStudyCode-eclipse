package cn.edu.bupt;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		
		Set keySet = p.keySet();
		for(Iterator itr = keySet.iterator(); itr.hasNext();) {
			String key = (String)itr.next();
			String value = (String)p.get(key);
			System.out.println(key + " = " + value);
		}
	}
}
