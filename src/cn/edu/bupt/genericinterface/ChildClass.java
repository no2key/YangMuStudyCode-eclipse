package cn.edu.bupt.genericinterface;

public class ChildClass<T1> implements ParentInterface<T1, String> {

	private T1 foo1 = null;
	private String foo2 = null;
	
	@Override
	public void setFoo1(T1 foo1) {
		// TODO Auto-generated method stub
		this.foo1 = foo1;
	}

	@Override
	public void setFoo2(String foo2) {
		// TODO Auto-generated method stub
		this.foo2 = foo2;
	}

	@Override
	public T1 getFoo1() {
		// TODO Auto-generated method stub
		return this.foo1;
	}

	@Override
	public String getFoo2() {
		// TODO Auto-generated method stub
		return this.foo2;
	}
}
