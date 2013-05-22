package cn.edu.bupt;

import java.util.Vector;

public class VectorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		vector.add("hello");
		vector.add("world");
		vector.add("hello,world");
		
		for(Object a: vector) {
			System.out.println(a);
		}
	}

}
