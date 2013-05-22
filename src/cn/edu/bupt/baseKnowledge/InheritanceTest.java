package cn.edu.bupt.baseKnowledge;

public class InheritanceTest {
	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		String name = dog.getName();
		System.out.println(name);
		System.out.println(dog.name);
	}
	
}

class Animal1 {
	public String name = "Animal";
}

class Dog1 extends Animal1 {
	String name = "dog";

	public String getName() {
		return super.name;
	}
	
}