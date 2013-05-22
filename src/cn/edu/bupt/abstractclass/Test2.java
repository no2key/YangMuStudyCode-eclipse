package cn.edu.bupt.abstractclass;

public class Test2 {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		System.out.println(shape.computeArea());
		
		shape = new Rectangle(10, 10);
		System.out.println(shape.computeArea());
	}
}

abstract class Shape {
	public abstract int computeArea();
}

class Triangle extends Shape {
	private int width;
	private int height;
	
	public Triangle(){}
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int computeArea() {
		return (this.height * this.width) / 2;
	}
}

class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public int computeArea() {
		return this.width * this.height;
	}
}