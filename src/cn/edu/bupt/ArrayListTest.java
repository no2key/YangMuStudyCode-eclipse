package cn.edu.bupt;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		list.add("String");
		list.add(new Integer(2));
		list.add(new Boolean(false));
		System.out.println("hello world");
		String s = (String)list.get(0);
		Integer in = (Integer)list.get(1);
		String b = (String)list.get(2);
	}

}
