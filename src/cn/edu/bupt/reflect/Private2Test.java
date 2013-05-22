package cn.edu.bupt.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Private2Test {

	public static void main(String[] args) throws Exception{
		Class<?> private2ClassType = Private2.class;
		Object private2Object = private2ClassType.newInstance();
		
		Field field = private2ClassType.getDeclaredField("name");
		
		field.setAccessible(true);
		
		field.set(private2Object, "lisi");
		
		//=======================================
		Method method = private2ClassType.getMethod("getName", new Class<?>[]{});
		Object getName = method.invoke(private2Object, new Object[]{});
		System.out.println((String)getName);
	}
}
