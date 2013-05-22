package cn.edu.bupt.reflect;

import java.lang.reflect.Array;

public class ArrayTester {
	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName("java.lang.String"); 
		
		//返回的数组类型是一个Object类型的数据
		Object array = Array.newInstance(classType, 1);
		//通过反射机制向数组中设置值
		Array.set(array, 0, "Hello");
		//通过反射机制按照索引值取回数组中的值
		String element0 = (String)Array.get(array, 0);
		
		System.out.println(element0);
	}
}
