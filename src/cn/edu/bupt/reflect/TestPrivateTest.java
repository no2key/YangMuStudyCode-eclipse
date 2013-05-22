package cn.edu.bupt.reflect;

import java.lang.reflect.Method;

public class TestPrivateTest {

	public static void main(String[] args) throws Exception {
		Class<?> classType = PrivateTest.class;
		Method privateMethod = classType.getDeclaredMethod("sayHello", new Class<?>[]{String.class});
		Object privateObject = classType.newInstance();
		//在通过反射机制调用目标对象的私有方法之前要使用AccessibleObject.setAccessible方法设置私有方法可以被外界访问
		privateMethod.setAccessible(true);		//该语句抑制Java的访问控制检查
		//设置完成后可以通过普通的反射方法invoke调用私有方法
		Object sayHello = privateMethod.invoke(privateObject, new Object[]{"Tony"});
		System.out.println(sayHello);
	}
}
