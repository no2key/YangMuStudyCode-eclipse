package cn.edu.bupt1;

import java.util.ArrayList;
import java.util.Collection;

public class Arrayxiebian {
	
	public static void main(String[] args) {
		Collection<?> c = new ArrayList<String>();
		//c.add(new Object());		//compile error
	}
	
	void printCollection(Collection<?> c) {
		for(Object o : c) {
			System.out.println(o);
		}
	}
}
