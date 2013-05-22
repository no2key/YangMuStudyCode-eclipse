package cn.edu.bupt.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DumpMethod {
	public static void main(String[] args) {
		try {
			Class<?> classType = Class.forName(args[0]);
			Field[] fields = classType.getFields();		//获取运行时传入的类中的成员字段的Field类的对象数组
			System.out.println(fields.length);
			for(Field field : fields) {
				System.out.println(field);
			}
			System.out.println("-----------------");
			
			Method[] methods = classType.getDeclaredMethods();		//获取运行时传入的类中的成员方法的Method类的对象数组
			System.out.println(methods.length);
			for(Method method : methods) {
				System.out.println(method);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
