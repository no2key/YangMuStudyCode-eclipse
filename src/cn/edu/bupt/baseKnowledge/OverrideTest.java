package cn.edu.bupt.baseKnowledge;

public class OverrideTest {
	public static void main(String[] args) {
		SuperClass sc = (SuperClass)new DerivedClass();
		sc.print();		//打印 "in the super class /n in the derived class"
	}
}

class SuperClass {
	public void print() {
		System.out.println("in the super class");
	}
}

class DerivedClass extends SuperClass {
	public void print() {
		super.print();
		System.out.println("in the derived class");
	}
}