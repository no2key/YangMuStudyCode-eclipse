package cn.edu.bupt.baseKnowledge;

public class PolyTest4 {
	public static void main(String[] args) throws Exception {
		Class<?> c = Class.forName(args[0]);
		Object o = c.newInstance();		//这里的o指向的是一个B对象实例
		A a = (A)o;						//可强制转换为Object 与 B类型的中间类型 A
		a.method();
	}
}

class A {
	public void method() {
		System.out.println("A");
	}
}

class B extends A {
	public void method() {
		System.out.println("B");
	}
}

class C extends A {
	public void method() {
		System.out.println("C");
	}
}

class D extends A {
	public void method() {
		System.out.println("D");
	}
}