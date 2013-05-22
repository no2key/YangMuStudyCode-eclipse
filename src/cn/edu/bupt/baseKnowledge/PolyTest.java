package cn.edu.bupt.baseKnowledge;

public class PolyTest {
	public static void main(String[] args) {
//		Animal a = new Dog();
//		Dog dog = (Dog)a;
//		dog.sing();
		
		/*Animal b = new Cat();
		Dog d = (Dog)b;		//Runtime error throws classCastException
		d.sing();*/	
		
		//Animal a1 = new Cat();
		//Animal a2 = new Animal();
		
		//a2 = a1;
		//a2.sing();	//cat is singing
		
		//a1 = a2;
		//a1.sing();	//animal is singing
		
		//向上类型转换
//		Cat cat = new Cat();
//		Animal a = cat;
//		a.sing();		//cat is singing\
		
		//向下类型转换
		Animal animal = new Animal();
		Cat cat = (Cat)animal;	//throws ClassCastException
		cat.sing();
		
		
	}
}

class Animal {
	public void sing() {
		System.out.println("animal is singing");
	}
}

class Dog extends Animal {
	public void sing() {
		System.out.println("dog is singsing");
	}
}

class Cat extends Animal {
	public void sing() {
		System.out.println("cat is singing");
	}
}