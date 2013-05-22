package cn.edu.bupt.reflect;

import java.lang.reflect.Field;

public class TestField {
	public double d;
	
	public static void main(String[] args) throws Exception{
		Class<?> c = Class.forName("cn.edu.bupt.reflect.TestField");
		Object obj = c.newInstance();
		Field f = c.getField("d");
		f.set(obj, new Double(3.14));
		Double get = (Double)f.get(obj);
		System.out.println(get);
	}
}
