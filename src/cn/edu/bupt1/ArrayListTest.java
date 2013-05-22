package cn.edu.bupt1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//List和ArrayList也是泛型
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String e: list) {
			System.out.println(e);
		}
		//Iterator变成泛型
		for(Iterator<String> itr = list.iterator();itr.hasNext();) {
			String value = itr.next();
			System.out.println(value);
		}
	}
}
