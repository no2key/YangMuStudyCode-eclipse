package cn.edu.bupt.reflect;

import java.lang.reflect.Method;


public class InvokeTester {
	public int add(int param1, int param2) {
		return param1 + param2;
	}
	
	public String echo(String message) {
		return "Hello: " + message;
	}
	
	public static void main(String[] args) throws Exception{
		//编译时调用成员方法
		InvokeTester it = new InvokeTester();
		System.out.println(it.add(1, 2));
		System.out.println(it.echo("world"));
		
		System.out.println("===========================");
		
		//通过反射的方式调用成员方法
		Class<?> classType = InvokeTester.class;
		
		Object invokeTester = classType.newInstance();
		
		System.out.println(invokeTester instanceof InvokeTester);
		Method addMethod = classType.getMethod("add", new Class<?>[]{int.class, int.class});
		int result = (Integer) addMethod.invoke(invokeTester, 1, 2);
		System.out.println(result);
		
		System.out.println("===========================");
		
		Class<InvokeTester> classType1 = InvokeTester.class;
		
		InvokeTester invokeTester1 = classType1.newInstance();
		
		Method addMethod1 = classType1.getMethod("add", int.class, int.class);
		
		int result1 = (Integer)addMethod1.invoke(invokeTester1, 1, 4);
		
		System.out.println(result1);
	}
}
 