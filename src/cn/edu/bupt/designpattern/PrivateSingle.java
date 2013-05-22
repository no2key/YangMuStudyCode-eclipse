package cn.edu.bupt.designpattern;

public class PrivateSingle {
	private PrivateSingle() {
		System.out.println("private constructor invoked");
	}
	
	public static void main(String[] args) {
		Object o = new PrivateSingle();
	}
}
