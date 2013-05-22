package cn.edu.bupt.baseKnowledge;

public class Press {

	public static void main(String[] args) {
		Grandparent gp = new Child();
		Parent p = (Parent)gp;
		Child c = (Child)gp;
	}
}

class Grandparent {
	public void sing() {
		System.out.println("Grandparent");
	}
}

class Parent extends Grandparent {
	public void sing() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	public void sing() {
		System.out.println("Child");
	}
}
