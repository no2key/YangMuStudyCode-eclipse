package cn.edu.bupt.reflect;

import java.lang.reflect.Method;
import java.util.Hashtable;

public class TestMethod {
	public String func(String s, Hashtable<String, String> ht) {
		System.out.println("func invoked");
		return s;
	}
	
	public static void main(String[] args) throws Exception{
		Class<?> c = Class.forName("cn.edu.bupt.reflect.TestMethod");
		Class<?>[] ptypes = new Class<?>[2];	//注意这里的理解
		ptypes[0] = String.class;
		ptypes[1] = Hashtable.class;
		Method m = c.getMethod("func", ptypes);
		
		Object obj = c.newInstance();
		Object[] args0 = new Object[2];			//注意这里的理解
		args0[0] = "Hello, World";
		args0[1] = null;
		Object obj2 = m.invoke(obj, args0);
		
		String str = (String)obj2;
		System.out.println(str);
	}
}
