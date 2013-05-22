package cn.edu.bupt.designpattern;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		System.out.println(st1 == st2);		//output "true"
	}
}

class Singleton {
	private static Singleton singleton = null;
	
	private Singleton(){
	}
	
	public synchronized static Singleton getInstance() {
		if(singleton == null) {		//add judgement
			singleton = new Singleton();
		}
		return singleton;
	}
}