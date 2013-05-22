package cn.edu.bupt;

public class SuperTest {
	public static void main(String[] args) {
		Parent p = new Child();
		p.sing("everybody");
	}
}

class Parent {
	public void sing(String song) {
		System.out.println("Parent sing " + song);
	}
}

class Child extends Parent {
	public void sing(String song) {
		super.sing(song);
		System.out.println("Child sing " + song);
	}
}
