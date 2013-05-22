package cn.edu.bupt.decorator;

public abstract class BaseDecorator implements Component {

	private Component component;
	public BaseDecorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void doSomething() {
		this.component.doSomething();
	}
}
