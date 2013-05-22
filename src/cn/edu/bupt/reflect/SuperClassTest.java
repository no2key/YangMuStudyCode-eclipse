package cn.edu.bupt.reflect;

public class SuperClassTest {

	public static void main(String[] args) {
		Class<?> classType = Child.class;
		System.out.println(classType.toString());
		
		classType = classType.getSuperclass();
		System.out.println(classType.toString());
		
		classType = classType.getSuperclass();
		System.out.println(classType.toString());
		
		classType = classType.getSuperclass();
		System.out.println(classType.toString());
	}
}

class Parent {
	
}

class Child extends Parent {
	
}
