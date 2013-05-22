package cn.edu.bupt.reflect;

import java.lang.reflect.Constructor;

public class ClassConstructor {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName("java.lang.String");
		Constructor<?> constructor = c.getConstructor(new Class<?>[]{String.class});
		Object obj = constructor.newInstance(new Object[]{"Hello, World"});
		System.out.println(obj);
	}
}
