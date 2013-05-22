package cn.edu.bupt.decorator;

public class Decorator2 extends BaseDecorator {
	public Decorator2(Component component) {
		super(component);
	}
	
	@Override
	public void doSomething() {
		super.doSomething();
		this.doAnother();
	}
	
	private void doAnother() {
		System.out.println("do another thing in Decorator2");
	}
}
