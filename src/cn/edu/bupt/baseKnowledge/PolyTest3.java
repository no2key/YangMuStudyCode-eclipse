package cn.edu.bupt.baseKnowledge;

public class PolyTest3 {
	public static void main(String[] args) {
		Fruit f = new Pear();
		Pear p = (Pear)f;
		p.grow();
	}
}

class Fruit {
	public void run() {
		System.out.println("fruit is running");
	}
}

class Pear extends Fruit {
	public void run() {
		System.out.println("pear is running");
	}
	public void grow() {
		System.out.println("pear is growing");
	}
}